## ToDo

For a very long time, it was considered the highest acheivement of any Javascript developer to create a ToDo application. At the heart of every ToDo app implementation is the sophisticated ToDo logic and the ToDoClass will play that role in this kata.

In order to have a successful ToDoClass the following features have to be supported:

1. The ToDo app should start out empty
1. ToDo items can be added to the ToDoList using `ToDoList -> addToDo`
  1. ToDo items should have a `description`
  1. ToDo items should have a `status`
  1. ToDo items should initially have a status of `ToDoItemStatus.NOT_DONE`
  1. ToDo items should have a unique id
1. ToDo items can be removed from the ToDoList by id
  1. When the ToDo is successfully removed, a success response should be returned
  1. When the ToDo id is not found, an error response should be returned
1. ToDo items can be reordered using `ToDoList -> moveToDo` with the ToDoID and desired index
  1. When the ToDo can be moved to the new index and all the other items are shifted down, a `SUCCESS` response should be returned
  1. When the ToDo id is not found, an `ID_NOT_FOUND` response should be returned 
  1. When the index is out of bounds, an `INDEX_OUT_OF_BOUNDS` response should be returned 
1. ToDo items can be completed by calling `ToDoList -> completeToDo` with the ToDoID
  1. When a ToDo is complete its status should change to `ToDoItemStatus.DONE` and a `SUCCESS` response should be returned
  1. If the ToDoID can not be found a `ID_NOT_FOUND` response should be returned
1. `ToDoList -> getCompleteToDos` should return all completed ToDos
1. `ToDoList -> getIncompleteToDos` should return all ToDos yet to be completed