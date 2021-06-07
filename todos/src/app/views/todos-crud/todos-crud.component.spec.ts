import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodosCrudComponent } from './todos-crud.component';

describe('TodosCrudComponent', () => {
  let component: TodosCrudComponent;
  let fixture: ComponentFixture<TodosCrudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodosCrudComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodosCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
