package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax

class HashCode extends Reporter
{
    // take one string as input, reports the integer hash code

    def getSyntax(): Syntax =
    {
      Syntax.reporterSyntax(
        right = List(Syntax.StringType),
        ret   = Syntax.NumberType)
    }

    @throws(classOf[ExtensionException])
    @throws(classOf[LogoException])
    def report(args: Array[Argument], context: Context): Object =
    {
        val ds: Double = args(0).getString.hashCode
        ds.asInstanceOf[AnyRef]
    }
}
