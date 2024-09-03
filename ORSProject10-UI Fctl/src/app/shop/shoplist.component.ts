import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-shoplist',
  templateUrl: './shoplist.component.html',
  styleUrls: ['./shoplist.component.css']
})
export class ShoplistComponent extends BaseListCtl {

  public form = {
    error: false,
    message: null,
    preload: {
      brand: [] 
     
    },
    data: { id: null },
   
    searchParams: {
   
      price: null,
      mfd: '',
     // cityId: null, 
      catagory:''
      
    },
    searchMessage: null,
    list: [],
    pageNo: 0
  };
 
  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.SHOP, locator, route);
  }

  ngOnInit() {
    super.ngOnInit();
  }


  validateMobileInput(event: KeyboardEvent) {
    const values = (event.target as HTMLInputElement).value + event.key;
    if (!/^[1-9][0-9]{0,9}$/.test(values)) {
        event.preventDefault();
    }

     }
  
  validateAlphabetInput(event: KeyboardEvent) {
    console.log(event);
    const str = event.key ;
    
    console.log(str);
    if (!/^[a-zA-Z\s]*$/.test(str)) {
      event.preventDefault();
    }
  }
 
  submit() {
   
    this.form.pageNo = 0;
    
    this.search();
  }


 
  search() {
   
    this.form.searchMessage = null;
    
    super.search();
  }

 

}
