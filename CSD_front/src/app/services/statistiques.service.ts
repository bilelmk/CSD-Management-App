import { Injectable } from '@angular/core';
import {HttpClient ,HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Cadre_administratif} from '../models/Cadre_administratif';


let headers = new HttpHeaders({
  'Content-Type': 'text/xml'});
let options = { headers: headers };

@Injectable({
  providedIn: 'root'
})
export class StatistiquesService {

  URL = "/stat";

  constructor(private http: HttpClient) {
  }

  body = "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
    "    <Body>\n" +
    "        <GetEtudiantsHistoriqueRequest xmlns=\"http://GestionDepartement.com\"/>\n" +
    "    </Body>\n" +
    "</Envelope>"


  getHostorique(): Observable<any> {
    return this.http.post(this.URL ,  this.body , options);
  }


}
