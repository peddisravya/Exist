import {NgModule} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';

import {hhomeComponent} from './hhome.component';
import {RoutingpathComponent} from './routingpath.component';
import {ServiceaComponent} from './servicea.component';
import {ValidationComponent} from './validation.component';
import {ServicebComponent} from './serviceb/serviceb.component';
import {PathRoutingComponent} from './pathrouting/pathrouting.component';
import { HomeComponent } from './home/index';
import { LoginComponent } from './login/index';
import { RegisterComponent } from './register/index';
import { AuthGuard } from './_guards/index';
import {aboutusComponent} from './aboutus.component';
import {contactusComponent} from './contactus.component';
export const routing=RouterModule.forRoot([

{ path: '', component: HomeComponent, canActivate: [AuthGuard] },
 { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
{path:'aboutus', component:aboutusComponent},
{path:'contactus',component:contactusComponent},
{path:'github/:name',component:RoutingpathComponent},
{path:'servicea',component:ServiceaComponent},
{path:'valid',component:ValidationComponent},
{path:'serviceb',component:ServicebComponent},
{path:'pathrouting/:username',component:PathRoutingComponent},
{path:'home',component:hhomeComponent},
   
    // otherwise redirect to home
    { path: '**', redirectTo: '' }


])

