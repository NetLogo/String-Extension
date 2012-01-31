package org.nlogo.extensions.string;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;

import java.io.BufferedReader;
import java.io.FileReader;

public class FromFile extends DefaultReporter
{
    // take one string (filename) as input, report a string containing the file contents
    
    public Syntax getSyntax()
    {
        return Syntax.reporterSyntax(
            new int[] {Syntax.StringType()}, Syntax.StringType()
        ) ;
    }

    public Object report(Argument args[], Context context)
        throws ExtensionException, LogoException
    { String filename = args[0].getString() ;
      String result = null ;
      try
      {
          result = readFileAsString(filename) ;
      }
      catch (java.io.IOException e)
      { throw new ExtensionException(e) ;
      }
      return result ;
    }
    
    private static String readFileAsString(String filePath)
        throws java.io.IOException
    {
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1)
        {   fileData.append(buf, 0, numRead);
        }
        reader.close();
        return fileData.toString();
    }
}
