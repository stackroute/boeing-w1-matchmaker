import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AcademicQualificationsComponent } from './academic-qualifications.component';

describe('AcademicQualificationsComponent', () => {
  let component: AcademicQualificationsComponent;
  let fixture: ComponentFixture<AcademicQualificationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AcademicQualificationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AcademicQualificationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
