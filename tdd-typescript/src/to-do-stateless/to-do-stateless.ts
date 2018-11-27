import * as _ from "lodash";

interface ToDoListState {
    toDos: ToDo[];
}
interface ToDo { }

enum CommandType {
    UNDEFINED,
    INITIAL_STATE,
    ADD_TODO,
    REMOVE_TODO,
}

enum ErrorType {
    INVALID_ID,
}

interface UndefinedCommand {
    commandType: CommandType.UNDEFINED;
}
interface AddToDoCommand {
    commandType: CommandType.ADD_TODO;
    data: {
        description: string;
    };
}
interface RemoveToDoCommand {
    commandType: CommandType.REMOVE_TODO;
    data: {
        toDoId: number;
    }
}
interface Success<S> {
    kind: "SUCCESS";
    value: S;
}
interface Error<E> {
    kind: "ERROR";
    value: E;
}

type InvalidIdError = {
    errorType: ErrorType.INVALID_ID;
}

type ToDoListCommand = UndefinedCommand | AddToDoCommand;
type ToDoListErrors = InvalidIdError;
type Either<S, E> = Success<S> | Error<E>;

const initialState = (): ToDoListState => ({})
const updateToDoList = (toDoListState: ToDoListState, command: ToDoListCommand): Either<ToDoListState, ToDoListErrors> => ({ kind: "SUCCESS", value: toDoListState });

export {
    updateToDoList,
    initialState,
    ToDoListState,
    UndefinedCommand,
    AddToDoCommand,
    RemoveToDoCommand,
    CommandType,
    Success,
    Error,
    Either,
    ErrorType,
    ToDoListErrors,
}
