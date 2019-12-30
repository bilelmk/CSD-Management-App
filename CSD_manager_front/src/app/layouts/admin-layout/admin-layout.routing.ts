import { Routes } from '@angular/router';

import { UserProfileComponent } from '../../user-profile/user-profile.component';
import { IconsComponent } from '../../icons/icons.component';
import { NotificationsComponent } from '../../notifications/notifications.component';


import { EtudiantsComponent } from '../../etudiants/etudiants.component';
import { EnseignantsComponent } from '../../enseignants/enseignants.component';
import { ClassesComponent } from '../../classes/classes.component';
import { CadresComponent } from '../../cadres/cadres.component';
import { StatistiquesComponent } from '../../statistiques/statistiques.component';
import { ModulesComponent } from '../../modules/modules.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'etudiants',      component: EtudiantsComponent },
    { path: 'enseignants',    component:EnseignantsComponent  },
    { path: 'cadres',         component: ClassesComponent },
    { path: 'classes',        component:CadresComponent  },
    { path: 'modules',        component:ModulesComponent  },
    { path: 'staistiques',    component: StatistiquesComponent },

    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'notifications',  component: NotificationsComponent },
];
