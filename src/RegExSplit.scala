package org.nlogo.extensions.string

import org.nlogo.api.Argument

import org.nlogo.api.Context

import org.nlogo.api.Reporter

import org.nlogo.api.ExtensionException

import org.nlogo.api.LogoException

import org.nlogo.api.LogoListBuilder

import org.nlogo.core.Syntax

//remove if not needed
import scala.collection.JavaConversions._

class RegExSplit extends Reporter {

  def getSyntax(): Syntax =
//    Syntax.reporterSyntax(Array(Syntax.StringType(), Syntax.StringType()),
//                          Syntax.ListType())
    Syntax.reporterSyntax(
      right = List (Syntax.StringType, Syntax.StringType),
      ret   = Syntax.ListType)

  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
// org.nlogo.api.Argument to access argument
    val hayStack: String = args(0).getString
    val regexNeedle: String = args(1).getString
    val resultArray: Array[String] = hayStack.split(regexNeedle)
    val resultList: LogoListBuilder = new LogoListBuilder
    val len: Int = resultArray.length
    for (i <- 0 until len) {
      resultList.add(resultArray(i))
    }
    resultList.toLogoList
  }
// use typesafe helper method from
// use typesafe helper method from

}
