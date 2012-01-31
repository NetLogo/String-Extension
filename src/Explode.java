package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.LogoListBuilder;
import org.nlogo.api.Syntax;

public class Explode extends DefaultReporter
{
    // take one string as input, report a list 
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            new int[] {Syntax.StringType()}, Syntax.ListType()
        ) ;
    }

    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    {
        // use typesafe helper method from
        // org.nlogo.api.Argument to access argument
        String s = args[0].getString();
        String c = "" ;
        
        int len = s.length() ;

        // make an empty list object to hold the new list
        LogoListBuilder list = new LogoListBuilder();
        // add the elements of the string, one at a time, to the list
        for ( int i = 0; i < len ; ++i )
        {   // use substring method to get one character from the string
            c = s.substring(i, i + 1) ;
            list.add(c);
        }
        return list.toLogoList();
    }
}
