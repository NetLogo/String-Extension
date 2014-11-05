package org.nlogo.extensions.string;

import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.PrimitiveManager;

public class StringExtension extends DefaultClassManager
{
    public void load ( PrimitiveManager pM )
    {
        pM.addPrimitive ( "ends-with?",                new EndsWith () ) ;
        pM.addPrimitive ( "explode",                   new Explode () ) ;
        pM.addPrimitive ( "from-file",                 new FromFile () ) ;
        pM.addPrimitive ( "hash-code",                 new HashCode () ) ;
        pM.addPrimitive ( "lower-case",                new LowerCase () ) ;
        pM.addPrimitive ( "message-digest-5",          new MessageDigest5 () ) ;
        pM.addPrimitive ( "rex-match",                 new RegExMatch () ) ;
        pM.addPrimitive ( "rex-replace-all",           new RegExReplaceAll () ) ;
        pM.addPrimitive ( "rex-replace-first",         new RegExReplaceFirst () ) ;
        pM.addPrimitive ( "rex-split",                 new RegExSplit () ) ;
        pM.addPrimitive ( "starts-with?",              new StartsWith () ) ;
        pM.addPrimitive ( "trim",                      new Trim () ) ;
        pM.addPrimitive ( "upper-case",                new UpperCase () ) ;
        pM.addPrimitive ( "from-list",                 new FromList() ) ;
        pM.addPrimitive ( "to-list",                   new ToList() );
    }
}
