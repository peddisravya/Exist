import { Http, Response, Headers } from '@angular/http';
import { Injectable } from "@angular/core";
// import { GeneralService } from './general.service';
import { Observable } from "rxjs/Observable";
import 'rxjs/Rx';
import {GeneralService} from './generalservice';
@Injectable()
export class AuthService {
    public token: string;
    isAuthenticated: Boolean = false;
    modulePath: string = "authentication";

    constructor(private http: Http) {
        var currentUser = JSON.parse(localStorage.getItem('currentUser'));
        this.token = currentUser && currentUser.token;
    }

    login(username: string, password: string) {
        console.log("login: " + username + " - " + password);
          let header: Headers = new Headers();
          header.append("Authorization", "Basic " + btoa(username + ":" + password)); 
          header.append("Content-Type", "application/x-www-form-urlencoded");
          return this.http.post(this.serverPath + "/login")
          
          .map((response:Response) => {const data = response.json();
                      return data;
          } )
          .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
    }

    logout(): void {
        // clear token remove user from local storage to log user out
        this.token = null;
        localStorage.removeItem('currentUser');
    }

    isUserAuthenticated() {
        return this.isAuthenticated;
    }
}
