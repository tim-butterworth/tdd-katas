const classes = () => {

  // classes can have constructors
  // public or private constructor arguments are automatically made into fields
  class MyClass {
    constructor(public name: string, private age: number) {
    }

    public getAgeInDogYears(): number {
      return this.age * 7;
    }
  }

  const myClass = new MyClass("some-name", 12);

  console.log(myClass.name);
  console.log(myClass.getAgeInDogYears());

  // Classes can implement interfaces
  interface MyInterface {
    attribute: string;
  }

  class Implementation implements MyInterface {
    public attribute: string = "";
  }

  // Default parameters
  class WithDefaultConstructorArguments implements MyInterface {
    constructor(
      public noDefaultAttribute: string,
      public attribute: string = "default-value",
      public attribute2: number = 7,
    ) {
    }
  }

  const withDefault = new WithDefaultConstructorArguments("not-defaulted");
  const withFirstDefaultReplaced = new WithDefaultConstructorArguments("not-default", "replace-default-value");
  const withSecondDefaultReplaced = new WithDefaultConstructorArguments("not-default", "replace-first-value", 9);

  console.log(withDefault);
  console.log(withFirstDefaultReplaced);
  console.log(withSecondDefaultReplaced);

  // Classes can extend other classes and inherit their constructor
  class MoreClassy extends WithDefaultConstructorArguments {
    public additionalAttribute: string = "additionalAttribute";
  }

  const moreClassy = new MoreClassy("required");

  console.log("moreClassy", moreClassy.additionalAttribute);
  console.log("moreClassy", moreClassy.attribute);
  console.log("moreClassy", moreClassy.attribute2);
  console.log("moreClassy", moreClassy.noDefaultAttribute);

  // Class can extend other classes and override their constructor
  class MuchMoreClassy extends WithDefaultConstructorArguments {
    constructor(public additionalAttribute: string = "nice additional attribute") {
      super("not a default");
    }
  }

  const muchMoreClassy = new MuchMoreClassy("required");

  console.log("muchMoreClassy", muchMoreClassy.additionalAttribute);
  console.log("muchMoreClassy", muchMoreClassy.attribute);
  console.log("muchMoreClassy", muchMoreClassy.attribute2);
  console.log("muchMoreClassy", muchMoreClassy.noDefaultAttribute);

  // more advanced, typescript can simulate named parameters with some work
  interface SimulatedNamedParametersParameters {
    noDefaultAttribute: string;
    attribute: string;
    attribute2: number;
    additionalAttribute: string;
  }

  class SimulateNamedParameters extends WithDefaultConstructorArguments {
    public additionalAttribute: string;

    constructor(partialParameters: Partial<SimulatedNamedParametersParameters>) {
      const defaultValues = {
        noDefaultAttribute: "not a default",
        attribute: "attribute",
        attribute2: 2,
        additionalAttribute: "additionalAttribute",
      };

      const parameters = Object.assign({}, defaultValues, partialParameters);

      super(parameters.noDefaultAttribute, parameters.attribute, parameters.attribute2);
      this.additionalAttribute = parameters.additionalAttribute;
    }
  }

  const simulatedNamedParameters = new SimulateNamedParameters({ attribute: "not-default-attribute" });
};

classes();
