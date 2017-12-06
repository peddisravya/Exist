import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';

import {CreateCustomerComponent} from './customer/create-customer.component';
import {CustomerComponent} from './customer/customer.component';
import {SearchCustomersComponent} from './customer/search-customer.component';
import {CustomerDetailsComponent} from './customer/customer-details.component';
import {AppRoutingModule} from './app-routing.module';
import {DataService} from './service/data.service';
@NgModule({
  declarations: [
    AppComponent,
    CustomerDetailsComponent,
    CustomerComponent,
    CreateCustomerComponent,
    SearchCustomersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
 
export class AppModule {}