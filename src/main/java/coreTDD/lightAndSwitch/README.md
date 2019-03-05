There is a light (implementation not provided) a switch (implementation not provided) and perhaps other objects if you find them useful (implementations not provided).

## First pass

The switch and the light are supposed to be on the same circuit.
The switch can be open or closed, if it is open the light should be off, if it is closed, the light should be on.

Write some tests and implementations that allow the light to be turned off and on by flipping the switch.

## Second pass

A second light was added to the circuit, it should also turn off and on with the flip of the switch.

What class or classes do you have to change to add the second light?
Did you have to reach in and change one of the core classes?

If you have an idea in mind, refactor your code to support adding additional lights without having to change any of the core classes (light, switch).

## Third pass

A second switch is added.  Both switches need to be in the closed position for the light(s) to turn on (this is not the fancy setup in most homes where switches can be in either position and the lights can be on).

What class or classes do you have to change to support this new switch?
Any core classes change?

Can you refactor your solution to support adding another few switches without requiring and changes to core classes?

## Fourth pass

There are other things that can be turned on and off using a switch, the new things are: a blender, a computer, and a reverse-opposite-machine (which turns on when the circuit is open and off when it is closed).
One of each of the new devices should be added and work correctly.

What classes had to change to accommodate this new change?
Is there a way that dependency inversion could be applied to simplify the implementation?
Could interfaces be introduced to simplify things?
Are there some additional objects that could be added to simplify the implementation?