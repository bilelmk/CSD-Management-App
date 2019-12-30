import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminLayoutRoutes } from './admin-layout.routing';
import { UserProfileComponent } from '../../user-profile/user-profile.component';
import { IconsComponent } from '../../icons/icons.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
import { ChartsModule } from 'ng2-charts';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ToastrModule } from 'ngx-toastr';


import { EtudiantsComponent } from '../../etudiants/etudiants.component';
import { EnseignantsComponent } from '../../enseignants/enseignants.component';
import { ClassesComponent } from '../../classes/classes.component';
import { CadresComponent } from '../../cadres/cadres.component';
import { StatistiquesComponent } from '../../statistiques/statistiques.component';
import { ModulesComponent } from '../../modules/modules.component';


@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(AdminLayoutRoutes),
    FormsModule,
    ChartsModule,
    NgbModule,
    ToastrModule.forRoot()
  ],
  declarations: [
    UserProfileComponent,
    IconsComponent,
    NotificationsComponent,

    EtudiantsComponent,
    EnseignantsComponent,
    ClassesComponent,
    CadresComponent,
    StatistiquesComponent,
    ModulesComponent
  ]
})

export class AdminLayoutModule {}
