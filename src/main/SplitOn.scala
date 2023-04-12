package org.nlogo.extensions.string

import java.util.regex.Pattern

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.api.LogoListBuilder
import org.nlogo.core.Syntax

class SplitOn extends Reporter
{
    def getSyntax: Syntax =
    {
      Syntax.reporterSyntax(
        right = List(Syntax.StringType, Syntax.StringType),
        ret   = Syntax.ListType)
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object =
    {
      val pattern = Pattern.quote(args(0).getString)
      val search  = args(1).getString
      val list    = new LogoListBuilder()

      list.addAll(search.split(pattern, -1))
      list.toLogoList
    }
}
