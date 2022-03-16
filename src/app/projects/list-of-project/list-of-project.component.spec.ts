import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfProjectComponent } from './list-of-project.component';

describe('ListOfProjectComponent', () => {
  let component: ListOfProjectComponent;
  let fixture: ComponentFixture<ListOfProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListOfProjectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOfProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
