package org.nlogo.extensions.string;

import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.PrimitiveManager;

public class StringExtension extends DefaultClassManager
{
    public void load ( PrimitiveManager pM )
    {
        pM.addPrimitive ( "ends-with",                 new EndsWith () ) ;
        pM.addPrimitive ( "explode",                   new Explode () ) ;
        pM.addPrimitive ( "from-file",                 new FromFile () ) ;
        pM.addPrimitive ( "hash-code",                 new HashCode () ) ;
        pM.addPrimitive ( "lower-case",                new LowerCase () ) ;
        pM.addPrimitive ( "message-digest-5",          new MessageDigest5 () ) ;
        pM.addPrimitive ( "rex-match",                 new RegExMatch () ) ;
        pM.addPrimitive ( "rex-replace-all",           new RegExReplaceAll () ) ;
        pM.addPrimitive ( "rex-replace-first",         new RegExReplaceFirst () ) ;
        pM.addPrimitive ( "rex-split",                 new RegExSplit () ) ;
        pM.addPrimitive ( "starts-with",               new StartsWith () ) ;
        pM.addPrimitive ( "trim",                      new Trim () ) ;
        pM.addPrimitive ( "upper-case",                new UpperCase () ) ;
    }
}
/*  // TODO / WISHLIST

        // STRING FUNCTIONS

          // ASCII-code <character> ;; returns the ascii index of the given character (the first character of the string) 
           // , or 0 for non-ascii characters
           // ASCII-character  <integer> ;; returns the ASCII character corresponding to the given small integer index

            // last-index-of <needle> <haystack> ;; reports the index of the last occurance of needle in haystack, or false, if needle does not occur
            // String y = x.lastIndexOf(hayStack) ;

            // split-on-character <string> <single-char-delimiter> ;; reports a list by spliting string using the single character (the first character of the single character
            
            // split-on-string <string> <string-delimiter> ;; reports a list formed by splitting string using the string-delimiter

            // position-regex <regex-needle> <haystack>

            // hexidecimal <integer> ;; reports the integer as a string in hexidecimal (base 16)

        // FILE I/O FUNCTIONS

            // url-read-all string-url ; reads the entire contents of the file at the given URL, reports the result

        // DATABASE FUNCTIONS

            // database-open string-database-url user-name password
            // database-query string-query ;; reports number of rows affected, dataset is available from data-query-results
            // database-query-results ;; reports a list of the current row of the results of the query -- each call should advance to the next tow
            // database-query-skip ;; reports nothing, just access the next record
            // database-query-more-rows? ;; reports true if there are more (or any) rows left
            // database-query-update field-name value ;; changes the value of the named field to the nameed value for the current row

        // BITWISE FUNCTONS

            // bitwise-and ;; bitwise  and
            // bitwise-or  ;; bitwise or
            // bitwise-not
            // bitwise-xor
            // bitwise-shift-left
            // bitwise-shit-right

        // LOGICAL FUNCTIONS
            // all-the-same <a> <b> <c> ... ;; reports true if all three arguments are the same (with parens, if ALL arguments are the same, or if only one argument!)

        // AGENTSET FUNCTIONS

            // union <A> <B> ;; a set of all agents that are members of set A or set B (or both)
            // intersection <A> <B> ;; a set of all agents that are members of both set A and set B
            // disjoint <A> <B> ;; a set of all agents that are members of A or B and not members of A and B
            // complement <A> <B> ;; a set of agents in B that are not also in A
            // difference <A> <B> ;; a set of agents in A that are not also in B

        // MATRIX FUNCTIONS
            // RETURN A MATRIX

            // matrix-identity <SIZE> ;; produces and identity matrix of the given size
            // matrix-product <A> <B> ;; muiltiplies to two matrices
            // matrix-sum <A> <B> ;; sums the two matrices
            // matrix-subtract <A> <B> ;; subtracts the two matrices
            // matrix-transpose <A> ;; transposes the matrix
            // matrix-inverse <A>  ;; inverts the matrix
            // matrix-increment <A> <s> ;; adds scalar <s> to every element of <A>
            // matrix-scale  <A> <s> ;; multiples matrix by a scalar <s>
            // matrix-direct-sum  <A> <B> ...<z> ;; constructs the Kronecker sum of the matrices ( a block diagonal matrix?)
            // matrix-direct-product <A> <B> ;; constructs the kronecker product

            // RETURN A SCALAR

            // matrix-dot-product <A> <B> ;; the dot-product of the two matrices
            // matrix-determinant <A> ;; the determinant of a matrix
            // matrix-trace <A> ;; returns the sum of the diagonal elements of a square matrix

            // PROPERTIES / TESTS OF A MATRIX

            // matrix-is-matrix? <A> ;; true if variable is a matrix
            // matrix-is-square? <A> ;; true if variable is a square matrix
            // matrix-is-anti-symmetric? <A>
            // matrix-is-symmetric? <A>
            // matrix-is-orthagonal? <A>
            // matrix-is-diagonal? <A>

            // OTHER MATRIX RELATED FUCTIONS

            // kronecker-delta ;; reports 1 if all arguments are equal, otherwise, reports 0
*/
