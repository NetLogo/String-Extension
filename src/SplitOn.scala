package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.api.LogoListBuilder
import org.nlogo.core.Syntax

class SplitOn extends Reporter
{
    def getSyntax(): Syntax =
    {
      Syntax.reporterSyntax(
        right = List(Syntax.StringType, Syntax.StringType),
        ret   = Syntax.ListType)
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object =
    {
      val regexNeedle: String = args(0).getString
      val hayStack: String = args(1).getString
      var list: LogoListBuilder = new LogoListBuilder()

      list.addAll(hayStack.split(regexNeedle))
      list.toLogoList
    }
}
