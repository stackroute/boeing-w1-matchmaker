import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkillsPortfolioComponent } from './skills-portfolio.component';

describe('SkillsPortfolioComponent', () => {
  let component: SkillsPortfolioComponent;
  let fixture: ComponentFixture<SkillsPortfolioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkillsPortfolioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkillsPortfolioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
