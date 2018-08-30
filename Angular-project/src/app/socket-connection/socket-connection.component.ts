import { Component, OnInit } from '@angular/core';
import * as $ from "jquery";
import * as socket from '../../assets/socket.js' ;

var jquery: any;
@Component({
  selector: 'app-socket-connection',
  templateUrl: './socket-connection.component.html',
  styleUrls: ['./socket-connection.component.css']
})
export class SocketConnectionComponent implements OnInit {
 
  constructor() { }

  ngOnInit() {
    (window as any).connect();
  }

}
