package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.api.LogoListBuilder
import org.nlogo.core.Syntax

class Explode extends Reporter
{
  // take one string as input, report a list
    def getSyntax(): Syntax = {
      Syntax.reporterSyntax(
        right = List (Syntax.StringType), // list of arguments
        ret   = Syntax.ListType)          // return type
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object = {
      val s: String = args(0).getString
      val list: List[String] = s
        .foldRight(List[String]()) { (elt, accum) => elt.toString :: accum }
      val logolist = new LogoListBuilder()

      logolist.addAll(list)
      logolist.toLogoList
    }
}
