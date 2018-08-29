import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkillPortfolioComponent } from './skill-portfolio.component';

describe('SkillPortfolioComponent', () => {
  let component: SkillPortfolioComponent;
  let fixture: ComponentFixture<SkillPortfolioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkillPortfolioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkillPortfolioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
