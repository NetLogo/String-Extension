package org.nlogo.extensions.string

import org.nlogo.api.Argument

import org.nlogo.api.Context

import org.nlogo.api.Reporter

import org.nlogo.api.ExtensionException

import org.nlogo.api.LogoException

import org.nlogo.core.Syntax

import java.security._

//remove if not needed
import scala.collection.JavaConversions._

class MessageDigest5 extends Reporter {

  def getSyntax(): Syntax =
    Syntax.reporterSyntax(
      right = List (Syntax.StringType),
      ret   = Syntax.StringType)
  //    Syntax.reporterSyntax(Array(Syntax.StringType()), Syntax.StringType())


  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
// org.nlogo.api.Argument to access argument
    val mdtype: String = "MD5"
    val input: String = args(0).getString
    var result: String = ""
    val defaultBytes: Array[Byte] = input.getBytes
    try {
      val algorithm: MessageDigest = MessageDigest.getInstance(mdtype)
      algorithm.reset()
      algorithm.update(defaultBytes)
      val messageDigest: Array[Byte] = algorithm.digest()
      val hexString: StringBuffer = new StringBuffer()
      for (i <- 0 until messageDigest.length) {
        hexString.append(
          java.lang.Integer.toHexString(0xFF & messageDigest(i)))
      }
      result = hexString.toString
    } catch {
      case nsae: NoSuchAlgorithmException => {}
    }
    result
  }
// use typesafe helper method from
// use typesafe helper method from

}
