import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { By } from '@angular/platform-browser';
import { Observable, of } from 'rxjs';

describe('AppComponent', () => {

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            imports: [
                RouterTestingModule
            ],
            declarations: [
                AppComponent,
                ChildComponent
            ],
        }).compileComponents();
    }));

    it('should create the app', () => {
        const fixture = TestBed.createComponent(AppComponent);
        const app = fixture.debugElement.componentInstance;

        expect(app).toBeTruthy();
    });

    it(`should have as title 'try-jest'`, () => {
        const fixture = TestBed.createComponent(AppComponent);
        const app = fixture.debugElement.componentInstance;

        expect(app.title).toEqual('try-jest');
    });

    it('should render title in a h1 tag', () => {
        const fixture = TestBed.createComponent(AppComponent);

        fixture.detectChanges();

        const compiled = fixture.debugElement.nativeElement;

        expect(compiled.querySelector('h1').textContent).toContain('Welcome to try-jest!');
    });

    it('should display child input', () => {
        const fixture = TestBed.createComponent(AppComponent);

        const app: AppComponent = fixture.debugElement.componentInstance;
        app.childText = 'neato!!';

        fixture.detectChanges();

        const debugElement = fixture.debugElement;

        expect(
            debugElement.query(
                By.css('.child-text')
            ).nativeElement.textContent
        ).toEqual('neato!!');
    });

    it('does stuff', () => {
        const fixture = TestBed.createComponent(AppComponent);

        const app: AppComponent = fixture.debugElement.componentInstance;
        const obj = { m: () => ({}) };

        spyOn(obj, 'm');
        app.obj = obj;

        fixture.detectChanges();

        app.doStuff();

        expect(obj.m).toHaveBeenCalled();
    });

});
