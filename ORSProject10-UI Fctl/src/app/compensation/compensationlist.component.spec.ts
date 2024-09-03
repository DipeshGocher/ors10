import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompensationlistComponent } from './compensationlist.component';

describe('CompensationlistComponent', () => {
  let component: CompensationlistComponent;
  let fixture: ComponentFixture<CompensationlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompensationlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompensationlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
