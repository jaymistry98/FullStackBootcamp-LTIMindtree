import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { ServicesComponent } from './services.component';
import { SharedModule } from '../shared/shared.module';
import { LoggingService } from '../logging.service';

@NgModule({
  declarations: [
    ServicesComponent
  ],
  imports: [
    RouterModule.forChild([{ path: '', component: ServicesComponent}]),
    ReactiveFormsModule,
    SharedModule
  ]
})
export class ServicesModule {}
