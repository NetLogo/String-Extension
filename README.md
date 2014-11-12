# NetLogo string extension

This package contains the NetLogo string extension.

## Download

see https://github.com/NetLogo/String-Extension/releases

## Using

The following reporters are provided:

 * `upper-case`, `lower-case` -- alter the letter case of strings
 * `starts-with?`, `ends-with?` -- match a string against the start or end of another string
 * `contains-rex?` -- search in strings using standard regular expressions, returns a boolean if the regex is found
 * `rex-replace-first`, `rex-replace-all` -- replaces instances of a regex with a string
 * `rex-split` -- splits the string into a list by a regex
 * `from-file` -- read an entire file into a string with one command
 * `message-digest-5` -- generate the MD5 hash for a string
 * `hash-code` -- generate the MD5 hash for a string
 * `from-list` -- turns a list into a string
 * `to-list` turns a string into a list, so it can be iterated over with `foreach`
 * `trim` replaces preceding and trailing spaces.

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
