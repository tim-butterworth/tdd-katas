## String Balancing

### Rules

There are pairs of symbols, an opening symbol and a closing symbol.

For a string to be balanced the following rules must be followed:

 - Every opening symbol must have a matching closing symbol
 - The closing symbol for a pair must come after the opening symbol (valid -> `()`, invalid `)(`)
 - Two different types of opening and closing symbols can not interleave but they can be nested (valid -> `([])`, invalid -> `([)]`)

### Steps to implement this kata

1 First implement functionality to support only parenthesis `()`
1 Next implement functionality to support parenthesis and square braces `()` and `[]`
1 Finally generalize the implementation to support all 4 symbol pairs:

`[  ]`
`{  }`
`<  >`
`(  )`

### Examples

#### Balanced strings

`` (empty string)
`hi there` (no opening or closing symbols)
`()`
`((()))`
`<{[()]}>`
`[][]`
`[]{}<>()`
`(some {text})`

#### Unbalanced strings

`[`
`]`
`())`
`(()`
`[(])`
`{}[(])`
`)(`