import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserPI } from './userPI';
import { UserSkill } from './userSkill';
import { UserExp } from './userExp';
import { UserLocation } from './userLocation';
import { UserProject } from './userProject';
import { UserCertificates } from './userCertificates';
import { UserAcademy } from './userAcademy';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  addPost_PI(user_PI: UserPI): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
         });
         const options = {
      headers: httpHeaders
         };
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);
    }

  addPost_Skill(user_Skill: UserSkill): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
          });
          const options = {
      headers: httpHeaders
          };
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/skills/publish', JSON.stringify(user_Skill), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);   
    }

  addPost_Exp(user_Exp: UserExp): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
          });
          const options = {
      headers: httpHeaders
          };
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/experience/publish', JSON.stringify(user_Exp), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);    
    }

  addPost_Location(user_Loc: UserLocation): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
          });
          const options = {
      headers: httpHeaders
          };
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/location/publish', JSON.stringify(user_Loc), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);    
    }
  addPost_Project(user_Pro: UserProject): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
          });
          const options = {
      headers: httpHeaders
          };
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/projects/publish', JSON.stringify(user_Pro), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);    
    }
  addPost_Certificates(user_Cer: UserCertificates): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
          });
          const options = {
      headers: httpHeaders
          };
    
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/certificates/publish', JSON.stringify(user_Cer), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);    
    }

  addPost_Academy(user_aca: UserAcademy): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Cache-Control': 'no-cache'
          });
          const options = {
      headers: httpHeaders
          };
    return this.http.post('http://13.232.19.29:8092/matchmaker/api/v1/qualification/publish', JSON.stringify(user_aca), options);
    // return this.http.post('http://172.23.238.198:8081/api/v1/personalInfo/publish', JSON.stringify(user_PI), options);
    
    }
}
