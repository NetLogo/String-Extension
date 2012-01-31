package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;

public class HashCode extends DefaultReporter
{
    // take one string as input, reports the integer hash code
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            new int[] {Syntax.StringType()}, Syntax.NumberType()
        ) ;
    }
    
    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    {
             
        // use typesafe helper method from 
        // org.nlogo.api.Argument to access argument
        // get string from args 0, get hashcode from that, convert
        String s = args[0].getString() ;
        Double n = new Double( s.hashCode() ) ;
        String s2 = n.toString() ;
        
        
        return n  ;

    }
}
