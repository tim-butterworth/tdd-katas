const destructuring = () => {
// Object destructuring
  const objectMap = {
    key1: "value",
    numberList: [1, 2, 3],
    key2: ["a", "b", "c"],
  };

  const {
    key1,
    numberList,
    key2,
    // nameThatDoesNotExist,
  } = objectMap;

  console.log("key1", key1);
  console.log("key2", key2);
  console.log("numberList", numberList);

// The key order does not matter, it is used the do an object lookup, it is named parameters

// List destructuring (order matters)
  const numbers = [1, 2, 3];

  const [a, b, c, tooFar] = numbers;

  console.log("a", a);
  console.log("b", b);
  console.log("tooFar", tooFar);

  function doesDestructuring({ k1, k2 }: { k1: string, k2: string }): string {
    return k1 + " and " + k2;
  }

  console.log("Call to destructuring function", doesDestructuring({ k1: "value1", k2: "value2" }));
};

destructuring();
