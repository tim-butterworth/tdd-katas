# TodoList

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.0.5.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

# Stories

---
## Todos are displayed in a list

As a todo user, I want to be able to view a list of todos

Display a static list of todos, both the title and the description should be displayed

---
## Add a todo

As a todo user, I want to be able to add a todo

Given a user on the todo page
Then there should be empty title and description input fields and a button labeled add

When a user fills in the title and description fields then clicks the add button
Then the new title and description should be displayed as the last todo in the list of todos

---
## Remove a todo

As a todo user, I want to be able to remove todos

Given a user with a list of todos
Then each todo should have an `X` beside it

When a user clicks on the `X`
Then the todo should be removed from the list

---
## Todo title and description are required

As a todo user, I want to add valid todos

Given the title or description input field is empty
Then the add button should be disabled

When both the title and description input fields have text
Then the add button should be enabled

---
## Reorder todos V1 (need user testing, need product?)

As a todo user, I want to be able to reorder todos so that I can complete my todos in priority order

Given a list of todos
Then there should be a checkbox next to each todo

When a user checks a checkbox
Then up and down arrows should appear

When a user clicks on the up arrow
Then the todo should move up in the list

When a user clicks on the down arrow
Then the todo should move down in the list

When the selected todo is the last todo in the list
Then no down arrow should be displayed

When the selected todo is the first todo in the list
Then no up arrow should be displayed

When a todo is selected and a user selects a different todo
Then the originally selected todo should no longer be selected

`Notes`
A selected todo should be unselectable when a different todo is selected