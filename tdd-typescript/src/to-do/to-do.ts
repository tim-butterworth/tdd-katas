import * as _ from "lodash";

type IdNotFound = "ID_NOT_FOUND";
type Success = "SUCCESS";

type RemoveResponse = Success | IdNotFound;
type MoveResponse = Success | IdNotFound | "INDEX_OUT_OF_BOUNDS";
type CompletionResponse = Success | IdNotFound;

enum ToDoItemStatus {
    NOT_DONE = "NOT_DONE",
    DONE = "DONE",
}

interface ToDoID {
    id: number;
}
interface ToDo {
}

class ToDoList {

    getToDos(): ToDo[] {
    }

    getCompleteToDos(): ToDo[] {
    }

    getIncompleteToDos(): ToDo[] {
    }

    addToDo(description: string): void {
    }

    removeToDo(id: ToDoID): RemoveResponse {
    }

    moveToDo(id: ToDoID, index: number): MoveResponse {
    }

    completeToDo(id: ToDoID): CompletionResponse {
    }
}

export {
    ToDoList,
    ToDo,
    ToDoItemStatus,
    CompletionResponse,
    MoveResponse,
    RemoveResponse
}
