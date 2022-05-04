import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(
    private http: HttpClient) {

  }

getApiRequestOptions(): object {
        return {
          headers: new HttpHeaders(
            {
              'Content-Type': 'application/json; charset=utf-8',
            }
          )
        };
  }

  getAll<T>(apiUrl: string): Observable<T> {
    const headers = this.getApiRequestOptions();
    return this.http.get<T>(apiUrl, headers);
    //return this.http.get<T>(apiUrl);
  }
}
