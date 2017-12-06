import {Component} from '@angular/core';
import {App1Component} from './app1.service';

@Component({
    selector:'app-github',
    templateUrl:'./servicea.component.html',
    providers:[App1Component]
})
export class ServiceaComponent{
nms:any[];
constructor(App:App1Component){
this.nms=App.getData();
}
}