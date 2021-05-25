package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class RegExMatch extends Reporter
{
    // rex-match  needle  haystack // reports true if the regular expression matches the string
    def getSyntax(): Syntax =
    {
      Syntax.reporterSyntax(
        right = List(Syntax.StringType, Syntax.StringType),
        ret   = Syntax.BooleanType)
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object =
    {
      val regexNeedle: String = args(0).getString
      val hayStack: String = args(1).getString
      val result = hayStack.matches(regexNeedle)

      result.asInstanceOf[AnyRef]
    }
}
