import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { LocationsComponent } from './locations.component';
import { SharedModule } from '../shared/shared.module';
import { LoggingService } from '../logging.service';

@NgModule({
  declarations: [
    LocationsComponent
  ],
  imports: [
    RouterModule.forChild([{ path: '', component: LocationsComponent}]),
    ReactiveFormsModule,
    SharedModule
  ]
})
export class LocationsModule {}
