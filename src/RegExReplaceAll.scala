package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class RegExReplaceAll extends Reporter {

  def getSyntax(): Syntax =
    Syntax.reporterSyntax(
      right = List (Syntax.StringType, Syntax.StringType, Syntax.StringType),
      ret   = Syntax.StringType)


  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
    val regexNeedle: String = args(0).getString
    val hayStack: String = args(1).getString
    val replacement: String = args(2).getString
    args(1).getString.replaceAll(args(0).getString, args(2).getString)
  }
}
