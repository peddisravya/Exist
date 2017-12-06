import {Component} from '@angular/core';
import {Router} from    '@angular/router';


import{AlertService,AuthenticationService} from '../services/index';

@Component({
moduleId: module.id,
templateUrl: 'userlogin.component.html'
})


export class LoginComponent implements OnInit {
model:any = { };
loading=false;

constructor (private router: Router, private authenticationService : AuthenticationService, 
        private alertService: AlertService) { }
ngOnInit(){
    this.authenticationService.logout();
}


login()
{
    this.loading=true;
    this.authenticationService.login(this.model.username, this.model.password).subscribe(data=>{this.router.navigate(['/']);
},
error=>{this.alertService.error(error);
    this.loading=false;
});
}
}