import {Component} from '@angular/core';
import {ServicebService} from '../serviceb/serviceb.service';

@Component({
    selector:'app-github',
    templateUrl:'./serviceb.component.html',

})
export class ServicebComponent{
    sa;
constructor(private ccc:ServicebService){
    this.ccc.getStudent().subscribe(ress=>this.sa=ress);
}


}