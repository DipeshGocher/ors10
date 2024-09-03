import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-compensationlist',
  templateUrl: './compensationlist.component.html',
  styleUrls: ['./compensationlist.component.css']
})
export class CompensationlistComponent extends BaseListCtl implements OnInit{

  myKey = "";

  public form = {
    error: false,
    Message: null,
    preload: [],
    data: {id: null },
    inputerror: {},
    searchParams: {},
    searchMessage: null,
    list: [],
    pageNo: 0
  };

  base64Data: any;
  retrieveResonse: any;
  message: String;

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.COMPENSATION, locator, route);
   }


}
