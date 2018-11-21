# NetLogo string extension

An unofficial extension for providing handy string-related primitives in NetLogo.

## Download

see https://github.com/NetLogo/String-Extension/releases

## Using

The following reporters are provided:

 * `explode` -- turns a string into a list (of one-character strings)
 * `from-file` -- read an entire file into a string with one command
 * `from-list` -- turns a list into a string
 * `hash-code`
 * `md5` -- generate the MD5 hash for a string
 * `rex-match?` -- search in strings using standard regular expressions
 * `rex-replace-first`, `rex-replace-all`, `rex-split`
 * `starts-with?`, `ends-with?` -- match a string against the start or end of another string
 * `trim` -- removes initial and trailing whitespace
 * `upper-case`, `lower-case` -- alter the letter case of strings
 * `split-on` -- reports a list formed by splitting string using the string-delimiter

## Building

To build the source code, run `sbt compile`.

To run the tests in `tests.txt`, add the extension, go to the NetLogo directory, and run `sbt 'te string'`.

To build a release package, run `sbt package`.

## Wish list

Ideas for possible additional primitives:

 * `ascii-code <character>` -- returns the ASCII index of the given character (the first character of the string), or 0 for non-ASCII characters
 * `from-ascii <integer>` -- returns the ASCII character corresponding to the given small integer index
 * `last-index-of <needle> <haystack>` -- reports the index of the last occurrence of needle in haystack, or false, if needle does not occur
 * `position-regex <regex-needle> <haystack>`

## Credits

The string extension was written by James Steiner of [turtleZERO.com](http://turtlezero.com/).

## Terms of Use

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

The NetLogo string extension is in the public domain.  To the extent possible under law, James Steiner has waived all copyright and related or neighboring rights.
