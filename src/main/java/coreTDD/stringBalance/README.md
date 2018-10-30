## String Balancing

Some strings are balanced and some are not.  The rules for a balanced string are as follows:

There are opening symbols and corresponding closing symbols.  Every open symbol must have a matching closing symbol. These are the opening symbols and corresponding closing symbols:

`[  ]`
`{  }`
`<  >`
`(  )`

There are two more rules:

Opening and closing symbols can be nested but they can't interweave, for example this is valid:

`([{}])`

but this is not valid:

`{[}]`

because the square brace opens inside the curly braces but closes outside the curly braces.

Opening symbols must come before closing symbols, for example this is valid:

`()`

but this is not valid:

`)(`

### Here are some examples of balanced strings:

`` (empty string)
`hi there` (no opening or closing symbols)
`()`
`((()))`
`<{[()]}>`
`[][]`
`[]{}<>()`
`(some {text})`

### Here are some examples of unbalanced strings:

`[`
`]`
`())`
`(()`
`[(])`
`{}[(])`
`)(`