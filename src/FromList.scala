package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax
import org.nlogo.api.LogoListBuilder
import org.nlogo.core.LogoList

class FromList extends Reporter {

    override def getSyntax(): Syntax = {
      Syntax.reporterSyntax(
        right = List (Syntax.ListType),
        ret   = Syntax.StringType)
    }

   @throws(classOf[ExtensionException])
   @throws(classOf[LogoException])
    override def report(args: Array[Argument], context: Context): Object = {
      val input: LogoList = args(0).getList
      val sb: StringBuilder = new StringBuilder
      input.foreach(sb ++= org.nlogo.api.Dump.logoObject(_))
      sb.toString
    }

}
