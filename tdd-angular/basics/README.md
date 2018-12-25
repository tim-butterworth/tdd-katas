# Basics

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.0.5.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).


## Tasks for the Kata:

start vanilla angular app

[
 component,
 component fields,
 component method,
 angular template syntax,
 interpolation ngif,
 ngfor,
 one way data binding
]

1. make a component named BasicChild that displays a static string [unit test]
1. update the component to display a string set in the component field (interpolation) [unit test]
1. update the component to display a string passed in from its parent (@Input) [integration test]
1. update the component with a `toggle case` button that toggles the case of the string (angular template syntax) [unit test]
1. update the component with a `show` button that makes the string and `toggle case` button on click (ngif) [unit test]
1. (OPTIONAL) hide the `show` button after it is clicked [unit test]
1. update the component with a `count` button that updates a click counter, display the click counter (field in a component, component method) [unit test]
1. display a list of strings from a field on the component (ngfor) [unit test]
1. update the component with a button and a text input when the button is clicked, add the input value to the list of strings (display the list) [unit test] 

[
 change detection,
 observables,
 pipe
]

1. update the component to use an observable to update a clock (the observable should be passed in from the parent) [integration test]
    1. do it once using a subscription
    1. do it once using async pipe (pipe)

[
 injection
]

1. extract the clock observable into a service and use dependency injection to provide the service to the component [integration test]

