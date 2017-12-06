import {Injectable} from '@angular/core';
import {Http,Response} from '@angular/http';
import {Observable} from 'rxjs/observable';
import 'rxjs/add/operator/map';
@Injectable()
export class AppService{
    constructor(private aaa:Http){    
    }
    getNames():Observable<Array<any>>{
        return this.aaa.get('assets/sample.json').map((res:Response)=>res.json());
    }
} 