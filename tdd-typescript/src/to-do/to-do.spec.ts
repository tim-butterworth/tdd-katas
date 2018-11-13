import {
    ToDoList,
    ToDo,
    ToDoID,
    ToDoItemStatus,
    CompletionResponse,
    MoveResponse,
    RemoveResponse
} from "./to-do";

describe("ToDoList", () => {
    it("is initially empty", () => {
        const toDoList = new ToDoList();

        expect(toDoList.getToDos()).toEqual([]);
    });
});
