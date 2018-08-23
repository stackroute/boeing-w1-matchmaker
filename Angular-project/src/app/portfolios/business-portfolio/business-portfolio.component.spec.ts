import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusinessPortfolioComponent } from './business-portfolio.component';

describe('BusinessPortfolioComponent', () => {
  let component: BusinessPortfolioComponent;
  let fixture: ComponentFixture<BusinessPortfolioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusinessPortfolioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusinessPortfolioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
