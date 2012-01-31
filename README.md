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

## Credits

The string extension was written by James Steiner.

## Terms of Use

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

The NetLogo string extension is in the public domain.  To the extent possible under law, James Steiner has waived all copyright and related or neighboring rights.
