package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;

public class EndsWith extends DefaultReporter
{
    // INFIX  haystack ends-with needle
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            Syntax.StringType(), new int[] { Syntax.StringType() }, Syntax.BooleanType(), Syntax.NormalPrecedence()
        ) ;
    }
    
    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    {
        // use typesafe helper method from 
        // org.nlogo.api.Argument to access argument
        String hayStack = args[0].getString() ;
        String needle = args[1].getString() ;
        
        Boolean result = new Boolean(hayStack.endsWith(needle) ) ;
        
        return result ;
        
    }
} 
