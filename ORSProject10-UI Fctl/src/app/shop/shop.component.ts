import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { HttpClient } from '@angular/common/http';
import { FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css']
})
export class ShopComponent extends BaseCtl implements OnInit {

  getKey = false;
  selected = null;
  userForm: FormGroup = null;
  uploadForm: FormGroup;

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {



    super(locator.endpoints.SHOP, locator, route);

  }
  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
  test() {

  }
  submit() {
    var _self = this;


    this.serviceLocator.httpService.post(this.api.save, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.inputerror = {};

      if (res.success) {
        _self.form.error = false;
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;
      } else {
        _self.form.error = true;
        if (res.result.inputerror) {
          _self.form.inputerror = res.result.inputerror;
        }
        _self.form.message = res.result.message;
      }
    });
  }
  onUpload(userform: FormData) {
    this.submit();
  }
  populateForm(form, data) {
    form.id = data.id;
    form.brand = data.brand
    form.price = data.price;
    form.catagory = data.catagory;
    form.mfd = data.mfd;
    form.size = data.size  
    //form.cityId = data.cityId;  
  }
  validateAlphabetInput(event: KeyboardEvent) {

    const str = event.key;
    console.log(str);
    if (!/^[a-zA-Z\s]*$/.test(str)) {
      event.preventDefault();
    }

  }
  validateMobileInput(event: KeyboardEvent) {
    const values = (event.target as HTMLInputElement).value + event.key;

    if (!/^[1-9][0-9]{0,9}$/.test(values)) {
      event.preventDefault();
    }

  }

}

