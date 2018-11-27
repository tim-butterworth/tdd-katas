import {
    updateToDoList,
    initialState,
    ToDoListState,
    AddToDoCommand,
    CommandType,
    Success,
    Error,
    Either,
    ToDoListErrors,
} from "./to-do-stateless";

describe("initialState", () => {
    it("returns initial state for an initialState command", () => {
        const state: ToDoListState = initialState();

        expect(state).toEqual({ toDos: [] });
    });
});

describe("updateToDoList", () => {
    describe("AddToDoCommand", () => {
        it("adds a todo with a description", () => {
            const command: AddToDoCommand = {
                commandType: CommandType.ADD_TODO,
                data: {
                    description: "Great ToDo"
                }
            };
            const response: Either<ToDoListState, ToDoListErrors> = updateToDoList(initialState(), command);

            if (response.kind === "SUCCESS") {
                const updatedState: ToDoListState = response.value;

                expect(updatedState.toDos.length).toEqual(1);
                expect(updatedState.toDos[0].description).toEqual("Great ToDo");
            }
        });
    });
});
