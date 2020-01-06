import { Component, OnInit } from '@angular/core';
import {Seance} from '../models/Seance';

@Component({
  selector: 'app-espace-etudiant',
  templateUrl: './espace-etudiant.component.html',
  styleUrls: ['./espace-etudiant.component.scss']
})
export class EspaceEtudiantComponent implements OnInit {


  emploi : any ;
  sc =[
    {
      "id_seance": 1,
      "jour": "Mardi",
      "heure": "12:00",
      "type": "TD",
      "enseignant": {
        "id_enseignant": 3,
        "nom": "Hlaoui ",
        "prenom": "Yosra",
        "cin": "01236547",
        "adresse": "aaaaaaaa",
        "tel": "50123456",
        "auth_id": 9,
        "resp_classe": null
      },
      "classe": {
        "id_classe": 1,
        "libelle": "IF",
        "niveau": "5",
        "groupe": "A",
        "responsable": null,
        "liste_modules": []
      },
      "module": {
        "id_module": 20,
        "nom": "C",
        "coefficient": 7.0,
        "cours": true,
        "tp": true,
        "td": true
      }
    },
    {
      "id_seance": 2,
      "jour": "Mercredi",
      "heure": "12:00",
      "type": "COURS",
      "enseignant": {
        "id_enseignant": 3,
        "nom": "Hlaoui ",
        "prenom": "Yosra",
        "cin": "01236547",
        "adresse": "aaaaaaaa",
        "tel": "50123456",
        "auth_id": 9,
        "resp_classe": null
      },
      "classe": {
        "id_classe": 3,
        "libelle": "IF",
        "niveau": "4",
        "groupe": "B",
        "responsable": null,
        "liste_modules": []
      },
      "module": {
        "id_module": 10,
        "nom": "Algorithmique et structres de donnees",
        "coefficient": 10.0,
        "cours": true,
        "tp": false,
        "td": true
      }
    }
  ]
  constructor() { }

  ngOnInit() {
    this.emploi = this.getEmploi()
}


  getEmploi(){
    let res = [[null,null,null,null,null,null],
              [null,null,null,null,null,null],
              [null,null,null,null,null,null],
              [null,null,null,null,null,null],
              [null,null,null,null,null,null],
              [null,null,null,null,null,null]];

    for(let s of this.sc){
      for(let i=0 ; i<6 ; i++){
        for(let j=0 ; j<6 ; j++) {

          if(this.getjour(s)==i && this.getheure(s)==j){
            res[i][j] = s ;
          }
        }
      }
    }
    return res ;
  }

  getjour(s){
    if(s.jour == "Lundi"){return 0}
    else if(s.jour == "Mardi"){return 1}
    else if(s.jour == "Mercredi"){return 2}
    else if(s.jour == "Jeudi"){return 3}
    else if(s.jour == "Vendredi"){return 4}
    else return 5
  }

  getheure(s){
    if(s.heure == "8:30"){return 0}
    else if(s.heure == "10:15"){return 1}
    else if(s.heure == "12:00"){return 2}
    else if(s.heure == "13:30"){return 3}
    else if(s.heure == "14:45"){return 4}
    else return "16:30"
  }

}
