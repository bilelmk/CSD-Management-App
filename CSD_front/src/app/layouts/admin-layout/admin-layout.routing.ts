import { Routes } from '@angular/router';

import { IconsComponent } from '../../icons/icons.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
import { EtudiantsComponent } from '../../etudiants/etudiants.component';
import { EnseignantsComponent } from '../../enseignants/enseignants.component';
import { ClassesComponent } from '../../classes/classes.component';
import { CadresComponent } from '../../cadres/cadres.component';
import { StatistiquesComponent } from '../../statistiques/statistiques.component';
import { ModulesComponent } from '../../modules/modules.component';
import { AuthGuard } from '../../services/auth/auth.guard';
import {EspaceEtudiantComponent} from '../../espace-etudiant/espace-etudiant.component';
import {EspaceEnseignantComponent} from '../../espace-enseignant/espace-enseignant.component';
import {EspaceCadreComponent} from '../../espace-cadre/espace-cadre.component';
import {SeanceComponent} from '../../seance/seance.component';

export const AdminLayoutRoutes: Routes = [
    {path: '', redirectTo: 'etudiants', pathMatch: 'full',},

    { path: 'espace_et',      component: EspaceEtudiantComponent , canActivate: [AuthGuard]  },
    { path: 'espace_en',    component: EspaceEnseignantComponent  , canActivate: [AuthGuard]  },
    { path: 'espace_c',         component: EspaceCadreComponent , canActivate: [AuthGuard] },

    { path: 'etudiants',      component: EtudiantsComponent , canActivate: [AuthGuard]  },
    { path: 'enseignants',    component:EnseignantsComponent  , canActivate: [AuthGuard]  },
    { path: 'cadres',         component: CadresComponent , canActivate: [AuthGuard] },
    { path: 'classes',        component: ClassesComponent , canActivate: [AuthGuard]  },
    { path: 'modules',        component:ModulesComponent , canActivate: [AuthGuard]  },
    { path: 'staistiques',    component: StatistiquesComponent , canActivate: [AuthGuard]  },
    { path: 'seances',          component: SeanceComponent , canActivate: [AuthGuard] },

    { path: 'icons',          component: IconsComponent , canActivate: [AuthGuard] },
    { path: 'notifications',  component: NotificationsComponent , canActivate: [AuthGuard] },
];
