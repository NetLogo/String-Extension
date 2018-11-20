package org.nlogo.extensions.string

import org.nlogo.api.Argument

import org.nlogo.api.Context

import org.nlogo.api.Reporter

import org.nlogo.api.ExtensionException

import org.nlogo.api.LogoException

import org.nlogo.core.Syntax

//remove if not needed
import scala.collection.JavaConversions._

class Trim extends Reporter {

  def getSyntax(): Syntax =
    Syntax.reporterSyntax(
      right = List (Syntax.StringType),
      ret   = Syntax.StringType)
//    Syntax.reporterSyntax(List(Syntax.StringType), Syntax.StringType)
  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
// trim and return trimmed result
    val s: String = args(0).getString.trim()
    s
  }
// use typesafe helper method from
// org.nlogo.api.Argument to access argument
// use typesafe helper method from
// org.nlogo.api.Argument to access argument

}

