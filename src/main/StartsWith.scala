package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class StartsWith extends Reporter {

  def getSyntax: Syntax =
    Syntax.reporterSyntax(
      left  = Syntax.StringType,
      ret   = Syntax.BooleanType,
      right = List(Syntax.StringType),
      precedence = Syntax.NormalPrecedence)

  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
    val hayStack: String = args(0).getString
    val needle: String = args(1).getString
    val result: Boolean = hayStack.startsWith(needle)
    result.asInstanceOf[AnyRef]
  }
}
