import {Component} from '@angular/core';
import {AppService} from './app.service';

@Component({
    selector:'app-home',
    templateUrl:'hhome.component.html'
})
export class hhomeComponent{
    title='app works';
    names;
constructor(private samp: AppService){
this.samp.getNames().subscribe(resp=>this.names=resp);
}
}