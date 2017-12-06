import {Injectable} from '@angular/core';
import {Http,Response} from '@angular/http';
import {Observable} from 'rxjs/observable';
import 'rxjs/add/operator/map';
@Injectable()
export class CustompipeService{
    constructor(private rrr:Http){
    }
getPipeDetails():Observable<Array<any>>{
    return this.rrr.get('assets/custompipe.sample.json').map((res:Response)=>res.json());
}
}