package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.Reporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.core.Syntax;

class LowerCase extends Reporter
{
    def getSyntax: Syntax =
    {
      Syntax.reporterSyntax(
        right = List (Syntax.StringType),
        ret   = Syntax.BooleanType)
    }

    // take one string as input, report a string
    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object = args(0).getString.toLowerCase
}
