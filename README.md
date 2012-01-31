# NetLogo string extension

This package contains the NetLogo string extension.

## Using

The following reporters are provided:

 * `upper-case`, `lower-case` -- alter the letter case of strings
 * `starts-with`, `ends-with` -- match a string against the start or end of another string
 * `rex-match` -- search in strings using standard regular expressions
 * `rex-replace-first`
 * `from-file` -- read an entire file into a string with one command
 * `md5` -- generate the MD5 hash for a string

## Building

Use the NETLOGO environment variable to tell the Makefile which NetLogo.jar to compile against.  For example:

    NETLOGO=/Applications/NetLogo\\\ 5.0 make

If compilation succeeds, `string.jar` will be created.

## Wish list

Ideas for possible additional primitives:

 * `ascii-code <character>` -- returns the ASCII index of the given character (the first character of the string), or 0 for non-ASCII characters
 * `from-ascii <integer>` -- returns the ASCII character corresponding to the given small integer index
 * `last-index-of <needle> <haystack>` -- reports the index of the last occurrence of needle in haystack, or false, if needle does not occur
 * `split-on-character <string> <single-char-delimiter>` -- reports a list by splitting string using the given single character`
 * `split-on-string <string> <string-delimiter>` -- reports a list formed by splitting string using the string-delimiter
 * `position-regex <regex-needle> <haystack>`

## Credits

The string extension was written by James Steiner.

## Terms of Use

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

The NetLogo string extension is in the public domain.  To the extent possible under law, James Steiner has waived all copyright and related or neighboring rights.
