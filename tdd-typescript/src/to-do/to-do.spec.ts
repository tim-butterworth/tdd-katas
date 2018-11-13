import {
    ToDoList,
    ToDo,
} from "./to-do";

describe("ToDoList", () => {
    it("is initially empty", () => {
        const toDoList = new ToDoList();

        expect(toDoList.getToDos()).toEqual([]);
    });
});
