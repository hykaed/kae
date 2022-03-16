import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfEmployerComponent } from './list-of-employer.component';

describe('ListOfEmployerComponent', () => {
  let component: ListOfEmployerComponent;
  let fixture: ComponentFixture<ListOfEmployerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListOfEmployerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOfEmployerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
