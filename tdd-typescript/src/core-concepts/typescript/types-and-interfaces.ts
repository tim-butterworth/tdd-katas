const typesAndInterfaces = () => {
  interface Interface1 {
    key: string;
  }

  interface Interface2 {
    differentKey: string;
  }

  // interfaces anc be extended and implemented
  interface Interface3 extends Interface1, Interface2 {
    anotherKey: number;
  }

  class SuperClass implements Interface3 {
    constructor(
      public anotherKey: number,
      public differentKey: string,
      public key: string
      ) {
    }
  }

  const interface3: Interface3 = {
    key: "value",
    differentKey: "differentValue",
    anotherKey: 4,
  };

  // types can look just like interfaces, but the linter might get mad (interface-over-type-literal)
  type Type1 = {
    key: string;
  };
  type Interface1OrInterface2 = Interface1 | Interface2;

  const sumType1: Interface1OrInterface2 = { key: "value" };
  const sumType2: Interface1OrInterface2 = { differentKey: "value" };
  const sumType3: Interface1OrInterface2 = { key: "value", differentKey: "value" };

  type Interface1AndInterface2 = Interface1 & Interface2;

  const andType: Interface1AndInterface2 = { key: "value", differentKey: "value" };

  type PrimitiveSumType = number | string | boolean;

// type narrowing
  function SwitchOnPrimitive(argument: PrimitiveSumType): string {
    if (typeof argument === "number") {
      return "number";
    }
    if (
      argument === true ||
      argument === false
    ) {
      return "boolean";
    } else {
      return "" + argument.length;
    }
  }

  // what does being the same shape mean?
  interface MyFirstInterface {
    stringList: string[];
    id: number;
  }

  interface MySecondInterface {
    stringList: string[];
    id: number;
  }

  function takesAType(argument: MyFirstInterface): string {
    return argument.stringList.join("") + argument.id;
  }

  const myObj: MySecondInterface = {
    stringList: ["a"],
    id: 7,
  };
  takesAType(myObj);
  takesAType({
    stringList: [],
    id: 8,
    // somethingExtra: ""
  });
};

typesAndInterfaces();
