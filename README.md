# NetLogo string extension

An unofficial extension for providing handy string-related primitives in NetLogo.

## Download

see https://github.com/NetLogo/String-Extension/releases

## Using

The following reporters are provided:

 * `to-list` -- turns a string into a list (of one-character strings)
 * `from-list` -- turns a list into a string (works with all NetLogo datatypes)
 * `from-file` -- read an entire file into a string with one command
 * `from-list` -- turns a list into a string
 * `hash-code`
 * `md5` -- generate the MD5 hash for a string
 * `rex-match?` -- search in strings using standard regular expressions and returns a boolean if a match is found.
 * `rex-replace-first`, `rex-replace-all` returns a string in which the rex has been replaced
 * `rex-split` returns a list split by the rex.
 * `starts-with?`, `ends-with?` -- match a string against the start or end of another string
 * `trim` -- removes initial and trailing whitespace
 * `upper-case`, `lower-case` -- alter the letter case of strings

## Building

Run `make`.

If compilation succeeds, `string.jar` will be created.

To run the tests in `tests.txt`, run `make test`.

To build a release package, run `make string.zip`.

## Wish list

Ideas for possible additional primitives:

 * `ascii-code <character>` -- returns the ASCII index of the given character (the first character of the string), or 0 for non-ASCII characters
 * `from-ascii <integer>` -- returns the ASCII character corresponding to the given small integer index
 * `last-index-of <needle> <haystack>` -- reports the index of the last occurrence of needle in haystack, or false, if needle does not occur
 * `split-on-character <string> <single-char-delimiter>` -- reports a list by splitting string using the given single character`
 * `split-on-string <string> <string-delimiter>` -- reports a list formed by splitting string using the string-delimiter
 * `position-regex <regex-needle> <haystack>`

## Credits

The string extension was written by James Steiner of [turtleZERO.com](http://turtlezero.com/).

## Terms of Use

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

The NetLogo string extension is in the public domain.  To the extent possible under law, James Steiner has waived all copyright and related or neighboring rights.
