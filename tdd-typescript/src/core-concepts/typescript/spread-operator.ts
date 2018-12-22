const spreadOperator = () => {
  const listA = [1, 2, 3];
  const listB = [...listA];

  console.log("listA", listA);
  console.log("listB", listB);

  const listC = [...listA, ...listB, 7, 8];

  console.log("listC", listC);

  const objA = { key: "value" };
  const objB = { ...objA };

  console.log("objA", objA);
  console.log("objB", objB);

  const objC = { key: "a-differentValue", ...objA };
  const objD = { ...objA, key: "a-differentValue", differentKey: "someDifferentValue" };

  console.log("objC", objC);
  console.log("objD", objD);
  console.log("objA did not get mutated!!", objA);

  // There is a similar but older way of copying objects
  // the almost but broken version
  const thisGetsMutated = {
    key: "value-that-should-not-get-mutated",
  };
  const objectAssignedResult = Object.assign(thisGetsMutated, { key: "this-means-mutation" });
  console.log("objectAssignedResult", objectAssignedResult);
  console.log("thisGetsMutated", thisGetsMutated);

  // the full version at least for objects
  const thisDoesNotGetMutated = {
    key: "value-that-should-not-get-mutated",
  };
  const objectAssignWithoutMutation = Object.assign(
    {},
    thisDoesNotGetMutated,
    { key: "this-means-mutation" },
  );
  console.log("objectAssignWithoutMutation", objectAssignWithoutMutation);
  console.log("thisDoesNotGetMutated", thisDoesNotGetMutated);

  // Advanced Spread operator
  // Spread is a copy
  const objASharedReference = objA;
  const objACopy = {...objA};

  objASharedReference.key = "changed-value";
  console.log("mutated objA", objA);
  console.log("not-mutated objACopy", objACopy);

  // Spread is a shallow copy so there is still danger!!
  const deapObject = { key: { childKey: "childValue"}};
  const shallowCoppy = {...deapObject};

  shallowCoppy.key.childKey = "mutatedChildValue";
  console.log("deapObject has been mutated", deapObject);
};

spreadOperator();
