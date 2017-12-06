import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions, Response } from '@angular/http';

import {User} from '../models/index';
import {Employee} from '../models/index';
import{GeneralService} from './generalservice';

import {Observable} from 'rxjs/Observable';
import {EmpResponse} from '../models/Employees';
import 'rxjs/Rx';

import {HttpClient} from '@angular/common/http';
@Injectable()
export class EmployeeService{
employees:string[];
serverPath:string;
constructor(private http:HttpClient, private generalservice:GeneralService){
    this.serverPath=this.generalservice.getServerPath();
}
getall(){
    // Make the HTTP request:
    this.http.get<EmpResponse>(this.serverPath+"/employees").subscribe(data => {
      // Read the result field from the JSON response.
      this.employees = data.Employees;
    });

}




    getEmployeesForValidation() {
        return this.employees;
    }

    // getEmployee(employeesId: string) {
    //     return this.http.get(this.serverPath + "/" + employeesId)
    //         .map(
    //         (res: Response) => {
    //             const data = res.json();
    //             return data;
    //         })
    //         .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
    // };

    // saveProject(project) {
    //     return this.http.post(this.serverPath + this.modulePath + "/create", project)
    //         .map(
    //         (res: Response) => {
    //             const data = res.json();
    //             return data;
    //         })
    //         .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
    // };

    // deleteProject(project) {
    //     return this.http.post(this.serverPath + this.modulePath + "/delete", project)
    //         .map(
    //         (res: Response) => {
    //             const data = res.json();
    //             return data;
    //         })
    //         .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
    // };



}