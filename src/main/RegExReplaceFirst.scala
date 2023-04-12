package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class RegExReplaceFirst extends Reporter {

  def getSyntax: Syntax =
    Syntax.reporterSyntax(
      ret   = Syntax.StringType,
      right = List (Syntax.StringType, Syntax.StringType, Syntax.StringType),
      precedence = Syntax.NormalPrecedence )

  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
    args(1).getString.replaceFirst(args(0).getString, args(2).getString)
  }
}
