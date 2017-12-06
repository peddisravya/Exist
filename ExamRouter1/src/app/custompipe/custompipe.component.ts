import {Component} from '@angular/core';
import {CustompipeService} from '../custompipe/custompipe.service';


@Component({
    selector:'app-custompipe',
    templateUrl:'custompipe.component.html',
    styleUrls:['custompipe.component.css']


})

export class CustompipeComponent{
   teacher;
    constructor(private sss:CustompipeService){
        this.sss.getPipeDetails().subscribe(ress=>this.teacher=ress);
    }
}