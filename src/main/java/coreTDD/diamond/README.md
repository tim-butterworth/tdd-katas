## Diamond

Diamonds are great and worth alot of money sometimes so it would be helpful to have a diamond factory.  If you want to have a really successful diamond factory you should be able to produce different size diamonds to order.

The contract of this diamond factory takes an integer from 1 - 9 and returns a beautiful text diamond.

For example:

```
INPUT: 1
OUTPUT:
[
"1"
]
```

```
INPUT: 2
OUTPUT:
[
" 1 ",
"121",
" 1 "
]
```

```
INPUT: 3
OUTPUT:
[
"  1  ",
" 121 ",
"12321",
" 121 ",
"  1  "
]
```

For an bonus challenge, double digit diamonds need a buffer for the single digit numbers so they continue to look like a diamond:

```
INPUT: 10
OUTPUT:
[
"                  1                  ",
"                1 2 1                ",
"              1 2 3 2 1              ",
"            1 2 3 4 3 2 1            ",
"          1 2 3 4 5 4 3 2 1          ",
"        1 2 3 4 5 6 5 4 3 2 1        ",
"      1 2 3 4 5 6 7 6 5 4 3 2 1      ",
"    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1    ",
"  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1  ",
"1 2 3 4 5 6 7 8 9 109 8 7 6 5 4 3 2 1",
"  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1  ",
"    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1    ",
"      1 2 3 4 5 6 7 6 5 4 3 2 1      ",
"        1 2 3 4 5 6 5 4 3 2 1        ",
"          1 2 3 4 5 4 3 2 1          ",
"            1 2 3 4 3 2 1            ",
"              1 2 3 2 1              ",
"                1 2 1                ",
"                  1                  "
]
```