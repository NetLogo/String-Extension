package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;
import org.nlogo.api.LogoListBuilder;
import org.nlogo.api.LogoList;

public class FromList extends DefaultReporter{

    @Override
    public Syntax getSyntax(){
        return Syntax.reporterSyntax(new int[] { Syntax.ListType() },
                                     Syntax.StringType());
    }

    @Override
    public Object report(Argument[] arg0, Context arg1)
             throws ExtensionException, LogoException {
        LogoList input = arg0[0].getList();
        String theString = "";
        for (Object o : input){
            theString = theString + String.valueOf(o);
        }
        return theString;
    }

}
