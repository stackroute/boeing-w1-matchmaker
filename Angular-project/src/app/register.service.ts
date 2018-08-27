import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Register } from './register';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  constructor(private http: HttpClient) {}

  addNewUser(newUser: Register): Observable<any> {
    const httpHeaders = new HttpHeaders({
      'Content-Type': 'application/json',
      'Cache-Control': 'no-cache'
    });
    const options = {
      headers: httpHeaders
    };
    return this.http.post(
      'http://172.23.238.198:8082/api/v1/register',
      JSON.stringify(newUser),
      options
    );
  }
  checkUserName(userName: String): Observable<any> {
    return this.http.get(
      `http://172.23.238.198:8082/api/v1/register/check/userName/${userName}`
    );
  }

  checkEmail(email: String): Observable<any> {
    return this.http.get(
      `http://172.23.238.198:8082/api/v1/register/check/email/${email}`
    );
  }
}
