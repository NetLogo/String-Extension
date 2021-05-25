package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class UpperCase extends Reporter
{
    // take one string as input, report a string
    def getSyntax(): Syntax =
    {
      Syntax.reporterSyntax(
        right = List (Syntax.StringType),
        ret   = Syntax.StringType)
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object = args(0).getString.toUpperCase
}
