const functionsAndArrowFunctions = () => {
  // functions are classic javascript
  // functions can be assigned to variables or named
  const myFunction = function(arg: string): string {
    return arg;
  };
  function anotherWayMyFunction(arg: string): string {
    return arg;
  }

  console.log("from myFunction", myFunction("hi"));
  console.log("from anotherWayMyFunction", anotherWayMyFunction("hi"));

  // arrow function are a more terse syntax for functions
  const arrowMyFunction = (arg: string): string => {
    return arg;
  };
  // arrow functions can be even more terse if there is only a return
  const immediateReturnMyFunction = (arg: string): string => arg;
};

functionsAndArrowFunctions();
