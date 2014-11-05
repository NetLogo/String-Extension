package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;
import org.nlogo.api.LogoListBuilder;
import org.nlogo.api.LogoList;

public class ToList extends DefaultReporter{

    @Override
    public Syntax getSyntax(){
        return Syntax.reporterSyntax(
                    // we take in a string
                    new int[] { Syntax.StringType() },
                    // and return a list
                    Syntax.ListType());
    }

    @Override
    public Object report(Argument[] arg0, Context arg1)
          throws ExtensionException, LogoException {
        String input = arg0[0].getString();
        LogoListBuilder myLLB = new LogoListBuilder();
        for (char c : input.toCharArray()){
            myLLB.add(String.valueOf(c));
        }
        return myLLB.toLogoList();
    }

}

