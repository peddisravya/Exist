import {Component} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import 'rxjs/add/operator/map';
@Component({
    selector:'app-github',
    template:`<h1>Github
    {{Gitname}}
    </h1>`
})
export class RoutingpathComponent{
subscription;
Gitname;
constructor(private OBJActivatedRoute:ActivatedRoute){
this.subscription = this.OBJActivatedRoute.params.subscribe(dat => this.Gitname=dat["name"])
}
}