import { Component, OnInit } from '@angular/core';
import { RestService } from "./rest.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  appName = '';

  constructor(public rest:RestService) {}

  ngOnInit() {
    this.rest.getAppName().subscribe((data: '') => {
      console.log(data);
      this.appName = data;
    });
  }

}
