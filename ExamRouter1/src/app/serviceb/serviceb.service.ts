import {Injectable} from '@angular/core';
import {Http,Response} from '@angular/http';
import {Observable} from 'rxjs/observable';
import 'rxjs/add/operator/map';
@Injectable()
export class ServicebService{
    constructor(private aaa:Http){
   
    }
    getStudent():Observable<Array<any>>{
    return this.aaa.get('assets/app2.sample.json').map((res:Response)=>res.json());
      
    }
}