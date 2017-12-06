import {Component} from '@angular/core';
@Component({
selector:'app-server',
templateUrl:'./server.component.html',
})
export class ServerComponent{
serverId:number=10;
serverStatus:string='offline';
getServerStatus(){
    return this.serverStatus;
}

constructor(){
    this.serverStatus=Math.random()>0.5?'online':'offline';
}
getcolor(){
    return this.serverStatus==='online'?'green':'red';
}
}