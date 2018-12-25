import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { ChildComponent } from './child-component/child.component'

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent,
        ChildComponent
      ],
    }).compileComponents();
  }));

  it(`should have as title 'basics'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;

    expect(app.title).toEqual('basics');
  });

});
