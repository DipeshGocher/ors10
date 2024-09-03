import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-bank',
  templateUrl: './bank.component.html',
  styleUrls: ['./bank.component.css']
})
export class BankComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) { 

    super(locator.endpoints.BANK, locator, route)
  }

  validate() {
    return this.validateForm(this.form.data);
  }
 

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.name);
    flag = flag && validator.isNotNullObject(form.accountNumber);
    flag = flag && validator.isNotNullObject(form.pendingLoan);
    flag = flag && validator.isNotNullObject(form.creationDate);
    flag = flag && validator.isNotNullObject(form.balance);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.name = data.name;
    form.accountNumber = data.accountNumber;
    form.pendingLoan = data.pendingLoan;
    form.creationDate = data.creationDate;
    form.balance = data.balance;
    console.log('Populated Form', form);
  }
}


