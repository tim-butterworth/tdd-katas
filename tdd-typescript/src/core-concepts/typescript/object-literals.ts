const objectLiterals = () => {
  /*
  Object literals
   */

// In Java List<Integer> numbers = Arrays.asList(1,2,3,4)

  const numbers: number[] = [1, 2, 3, 4];
  console.log("numbers", numbers);
  /*
  In Java

  Map<String, Object> objectMap = new HashMap<>();
  objectMap.put("key", "value");
  objectMap.put("list", numbers);

  objectMap.get("key");
   */

  const objectMap = {
    key1: "value",
    key2: ["a", "b"],
    numberList: numbers,
  };
  const mapValue = objectMap.key1;

  console.log("mapValue", mapValue);
  console.log("mapList", objectMap.numberList);

// Shorthand object assignment

  const key1 = "value";
  const key2 = ["a", "b"];
  const anotherObjectMap = { key1, key2, numberList: numbers };
};

objectLiterals();
