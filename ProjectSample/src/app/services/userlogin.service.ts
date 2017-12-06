import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions, Response } from '@angular/http';

import {User} from '../models/index';
import {Employee} from '../models/index';

@Injectable()
export class UserService{

constructor(private http:Http){}

// getAll()
// {
//     return this.http.get('http://localhost:8016/employees');
// }
// getById(sapId:Number){
// return this.http.get('http://localhost:8016/employees'+sapId)
// }

// create(employee:Employee){
//     return this.http.post('http://localhost:8016/employees')

// }
}