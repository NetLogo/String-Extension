package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;
import java.security.*;

public class MessageDigest5 extends DefaultReporter
{
    // take as input the algorithm to use, and the string to encode, report the MessageDigest of that string as a string
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            new int[] {Syntax.StringType()}, Syntax.StringType()
        ) ;
    }

    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    {
        // use typesafe helper method from
        // org.nlogo.api.Argument to access argument
        String mdtype = "MD5" ;
        String input = args[0].getString() ;
        String result = "" ;

        byte[] defaultBytes = input.getBytes() ;
        try
        {
             MessageDigest algorithm = MessageDigest.getInstance( mdtype ) ;
             algorithm.reset() ;
             algorithm.update( defaultBytes ) ;

             byte messageDigest[] = algorithm.digest() ;

             StringBuffer hexString = new StringBuffer() ;

             for ( int i=0; i<messageDigest.length; i++ )
             {
                  hexString.append( Integer.toHexString( 0xFF & messageDigest[i] ) ) ;
             }

             result = hexString.toString() ;

        }catch( NoSuchAlgorithmException nsae )
        {
        }
        return result ;
    }
}
