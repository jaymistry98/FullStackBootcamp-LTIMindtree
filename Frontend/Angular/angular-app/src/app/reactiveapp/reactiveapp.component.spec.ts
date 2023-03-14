import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveappComponent } from './reactiveapp.component';

describe('ReactiveappComponent', () => {
  let component: ReactiveappComponent;
  let fixture: ComponentFixture<ReactiveappComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReactiveappComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReactiveappComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
