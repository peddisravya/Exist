import {Component} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import 'rxjs/add/operator/map';

@Component({
    selector:'app-pathrouting',
    templateUrl:'pathrouting.component.html'
})

export class PathRoutingComponent{
subscriptions;
pathname;
constructor(private ddd:ActivatedRoute){
this.subscriptions=this.ddd.params.subscribe(dat=>this.pathname=dat["username"]);
}
}