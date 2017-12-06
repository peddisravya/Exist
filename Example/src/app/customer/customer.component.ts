import {Component, OnInit} from '@angular/core';
import {Customer} from '../model/customer';

import {DataService} from '../service/data.service';

@Component({
selector:'customer-list',
templateUrl: './customer.component.html',
// styleUrls:['./customer.component.css'],
})

export class CustomerComponent implements OnInit{
    customers:Customer[];
    selectedCustomer:Customer;

    constructor(private dataService: DataService){}

    getCustomers()
    {
        this.dataService.getCustomers().then(customers=>this.customers=customers);
    }
    ngOnInit():void{
        this.getCustomers();
    }
    onSelect(cust:Customer): void{
            this.selectedCustomer=cust;
            }
}