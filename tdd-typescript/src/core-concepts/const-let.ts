const constLet = () => {
  /*
const and let
(don't use var)
*/

  let three: number = 3;

  three = 4;
  console.log("three", three);

  const four: number = 4;
// four = 3;

  const list: number[] = [];
// list = {};
  list.push(4);
  console.log("list", list);

// Never use var!!!
  const eight: number | string = "not-eight";
  const value: string = "some-value";

  function myFunction(): void {
    const seven: number = 7;
    const eight: number = 8;
    const value: string = "not-some-value";

    console.log("value in function scope", value);
  }

  myFunction();

  console.log("eight", eight);
  console.log("value", value);
};

constLet();
