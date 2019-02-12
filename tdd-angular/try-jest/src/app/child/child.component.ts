import {
    Component,
    Input
} from '@angular/core';

@Component({
    templateUrl: 'child.component.html',
    selector: 'child-component',
})
class ChildComponent {
    @Input() text: string;
}

export { ChildComponent };
