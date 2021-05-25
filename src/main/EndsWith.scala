package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class EndsWith extends Reporter
{
    // INFIX  haystack ends-with needle
    def getSyntax(): Syntax =
    {
      Syntax.reporterSyntax(
        precedence = Syntax.NormalPrecedence,// Precedence
        left  = Syntax.StringType,           // left argument: for infixing
        right = List (Syntax.StringType),    // List of arguments
        ret   = Syntax.BooleanType)          // Return type
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): AnyRef =
    {
        val hayStack: String = args(0).getString
        val needle: String   = args(1).getString
        val result: Boolean = hayStack.endsWith(needle)

        result.asInstanceOf[AnyRef]
    }
}
