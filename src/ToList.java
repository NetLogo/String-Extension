package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.LogoListBuilder;
import org.nlogo.api.Syntax;

public class ToList extends DefaultReporter
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
        LogoListBuilder list = new LogoListBuilder();
        for (char c : s.toCharArray()){
            list.add(s);
        }
        return list.toLogoList();
    }
}
