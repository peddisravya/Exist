import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-servers',
  // template: '  <app-server></app-server>   <app-server></app-server>',
  templateUrl:'./servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
allowNewServer:boolean=false;
serverCreationStatus="no server was created";
servername='testserver';
servercreated=false;
servers=['Testserver','myTestserver'];
  constructor() { 
    setTimeout(()=>{this.allowNewServer=true},2000);
  }

  ngOnInit() {
  }
onCreateServer(){
  this.servercreated=true;
  this.servers.push(this.servername);
  this.serverCreationStatus="server was created"+this.servername;
}
onUpdateServername(event:any){
  this.servername=(<HTMLInputElement>event.target).value;
}

}
