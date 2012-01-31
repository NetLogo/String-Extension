package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;

public class RegExMatch  extends DefaultReporter
{   
    // rex-match  needle  haystack // reports true if the regular expression matches the string
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            new int[] { Syntax.StringType(), Syntax.StringType() }, Syntax.BooleanType()
        ) ;
    }
    
    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    {
        // use typesafe helper method from 
        // org.nlogo.api.Argument to access argument
        String regexNeedle = args[0].getString() ;
        String hayStack = args[1].getString() ;
        
        Boolean result = new Boolean (hayStack.matches(regexNeedle) ) ;
        
        return result ;

    }
}
