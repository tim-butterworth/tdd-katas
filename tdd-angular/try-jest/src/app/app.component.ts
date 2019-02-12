import { Component } from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
})
export class AppComponent {
    title: string = 'try-jest';
    childText: string = '';
    obj: { m: () => {} };

    doStuff() {
        this.obj.m();
    }
}
