import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { ClientlistComponent } from './clientlist.component';
import { SharedModule } from '../shared/shared.module';
import { LoggingService } from '../logging.service';

@NgModule({
  declarations: [
    ClientlistComponent
  ],
  imports: [
    RouterModule.forChild([{ path: '', component: ClientlistComponent}]),
    ReactiveFormsModule,
    SharedModule
  ]
})
export class ClientListModule {}
