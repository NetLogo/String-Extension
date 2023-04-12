package org.nlogo.extensions.string

import java.lang.Integer
import java.security.{ MessageDigest, NoSuchAlgorithmException }

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class MessageDigest5 extends Reporter {

  def getSyntax: Syntax =
    Syntax.reporterSyntax(
      right = List (Syntax.StringType),
      ret   = Syntax.StringType)

  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
    val mdtype = "MD5"
    val input  = args(0).getString
    val defaultBytes: Array[Byte] = input.getBytes
    var result = ""

    try {
      val algorithm: MessageDigest = MessageDigest.getInstance(mdtype)
      algorithm.reset()
      algorithm.update(defaultBytes)
      val messageDigest: Array[Byte] = algorithm.digest()
      val hexString = new StringBuffer()
      for (i <- 0 until messageDigest.length) {
        val iVal = 0xFF & messageDigest(i)
        if (iVal < 0x10) {
          hexString.append(s"0${Integer.toHexString(iVal)}")
        } else {
          hexString.append(Integer.toHexString(iVal))
        }
      }
      result = hexString.toString
    } catch {
      case nsae: NoSuchAlgorithmException => {}
    }
    result
  }
}
