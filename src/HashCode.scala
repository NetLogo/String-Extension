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

        // use typesafe helper method from
        // org.nlogo.api.Argument to access argument
        // get string from args 0, get hashcode from that, convert
        val s: String = args(0).getString
        val n: Double = s.hashCode
        val s2: String = n.toString
        n.asInstanceOf[AnyRef]
    }
}
