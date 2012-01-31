package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.LogoListBuilder;
import org.nlogo.api.Syntax;

public class RegExSplit extends DefaultReporter
{
    // rex-split haystack (at) regex-needle
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            new int[] {Syntax.StringType(), Syntax.StringType()}, Syntax.ListType()
        ) ;
    }

    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    {

        // use typesafe helper method from
        // org.nlogo.api.Argument to access argument
        String hayStack = args[0].getString() ;
        String regexNeedle = args[1].getString() ;

        String[] resultArray = hayStack.split(regexNeedle) ;
        LogoListBuilder resultList  = new LogoListBuilder() ;

        int len = resultArray.length ;

        for ( int i = 0 ; i < len ; ++i )
        {
            resultList.add( resultArray[i] );
        }

        return resultList.toLogoList();
    }
}
