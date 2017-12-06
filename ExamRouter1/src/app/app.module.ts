import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import {AppComponent } from './app.component';
import {RoutingpathComponent} from './routingpath.component';
import {hhomeComponent} from './hhome.component';
import { ServiceaComponent } from './servicea.component';
import { ServicebComponent } from './serviceb/serviceb.component';
import {routing} from './app.routing';
import {AppService} from './app.service';

import {App1Component} from './app1.service';
import {ValidationComponent} from './validation.component';
import { ReactiveFormsModule } from '@angular/forms';
import {ServicebService} from './serviceb/serviceb.service';
import {PathRoutingComponent} from './pathrouting/pathrouting.component';
import {CustompipeService} from './custompipe/custompipe.service';
import {CustompipeComponent} from './custompipe/custompipe.component';

// used to create fake backend
import { fakeBackendProvider } from './_helpers/index';
import { MockBackend, MockConnection } from '@angular/http/testing';
import { BaseRequestOptions } from '@angular/http';



import { AlertComponent } from './_directives/index';
import { AuthGuard } from './_guards/index';
import { AlertService, AuthenticationService, UserService } from './_services/index';
import { HomeComponent } from './home/index';
import { LoginComponent } from './login/index';
import { RegisterComponent } from './register/index';
import {aboutusComponent} from './aboutus.component';
import {contactusComponent} from './contactus.component';



@NgModule({
  declarations: [
    AppComponent,
    RoutingpathComponent,
    hhomeComponent,
    ServiceaComponent,
        AlertComponent,
        HomeComponent,
        LoginComponent,
        RegisterComponent
,aboutusComponent,contactusComponent,
    
ValidationComponent,
ServicebComponent,
PathRoutingComponent,
CustompipeComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing,
    ReactiveFormsModule
      ],
  providers: [ AppService,App1Component,ServicebService,CustompipeService,
        AuthGuard,
        AlertService,
        AuthenticationService,
        UserService,

        // providers used to create fake backend
        fakeBackendProvider,
        MockBackend,
        BaseRequestOptions
],
  bootstrap: [AppComponent]
})
export class AppModule { }
