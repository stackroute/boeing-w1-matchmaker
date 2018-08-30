import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SocketConnectionComponent } from './socket-connection.component';

describe('SocketConnectionComponent', () => {
  let component: SocketConnectionComponent;
  let fixture: ComponentFixture<SocketConnectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SocketConnectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SocketConnectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
