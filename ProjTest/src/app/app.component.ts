import { Component } from '@angular/core';
import {Http,Response} from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';

  constructor(private http:Http){

  }
  cityname='';
  cityHumid='';
  searchcity(){
    this.http.get('http://api.openweathermap.org/data/2.5/weather?APPID=0ba5edf49a15a79cec569618c56215&q='+this.cityname).
    subscribe((res :Response)=> {const weatherCity=res.json;
          //  this.cityHumid=weatherCity.main.humidity;
      console.log(weatherCity);}
 
    
    )
  }
}
