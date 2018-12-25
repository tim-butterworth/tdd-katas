import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from '../app.component';
import { By } from '@angular/platform-browser'
import { ChildComponent } from '../child-component/child.component'

describe('Child text', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent,
        ChildComponent
      ],
    }).compileComponents();
  }));

  it('display a static string', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const childTextElement = fixture.debugElement.query(By.css('.child-text'));

    expect(childTextElement.nativeElement.textContent).toBe('Hello from the child element!')
  });

});
