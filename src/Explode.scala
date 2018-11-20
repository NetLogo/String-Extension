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
        right = List (Syntax.StringType),
        ret   = Syntax.ListType)
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object = {
        // use typesafe helper method from
        // org.nlogo.api.Argument to access argument
        val s = args(0).getString
        val c = ""
        val len = s.length
        // val traversals = if(len > 0){len - 1} else {0}
        // make an empty list object to hold the new list
        val list: LogoListBuilder = new LogoListBuilder()
        // add the elements of the string, one at a time, to the list
        for ( i <- 0 to len - 1)
        {   // use substring method to get one character from the string
            val c = s.substring(i, i + 1)
            list.add(c)
        }
        list.toLogoList
    }
}
