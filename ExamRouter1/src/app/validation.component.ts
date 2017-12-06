import { Component } from '@angular/core';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import { FormGroup,FormBuilder,FormControl,Validators } from '@angular/forms';
//import { ValidationService } from './validation.service';

@Component({
    selector:'app-validation',
    templateUrl: 'validation.component.html'
})
export class ValidationComponent  {
//using FormGroup and FormControl
  form=new FormGroup({
        username:new FormControl('',Validators.required),
        password:new FormControl('',Validators.required)
        
    });   

//using FormBuilder
   /*  form:FormGroup;
    constructor(fb:FormBuilder){
        this.form=fb.group({
            username:['',Validators.required],
            password:['',Validators.required]
        })
    }*/
}
