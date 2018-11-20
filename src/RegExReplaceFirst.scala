package org.nlogo.extensions.string

import org.nlogo.api.Argument

import org.nlogo.api.Context

import org.nlogo.api.Reporter

import org.nlogo.api.ExtensionException

import org.nlogo.api.LogoException

import org.nlogo.core.Syntax

//remove if not needed
import scala.collection.JavaConversions._

class RegExReplaceFirst extends Reporter {

  def getSyntax(): Syntax =
    Syntax.reporterSyntax(
      ret   = Syntax.StringType,
      right = List (Syntax.StringType, Syntax.StringType, Syntax.StringType),
      precedence = Syntax.NormalPrecedence )

  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
    val regexNeedle: String = args(0).getString
    val hayStack: String = args(1).getString
    val replacement: String = args(2).getString
    args(1).getString.replaceFirst(args(0).getString, args(2).getString)
  }
// use typesafe helper method from
// org.nlogo.api.Argument to access argument
// use typesafe helper method from
// org.nlogo.api.Argument to access argument

}
