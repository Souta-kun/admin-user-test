import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { UserModel } from '../models/user.model';

@Injectable({ providedIn: 'root' })
export class UserService {
  constructor(private http: HttpClient) {}

  addUser(user: UserModel) {
    return this.http.post<UserModel>(`${environment.API}customer/`, user);
  }

  getUsers(name: string) {
    if (name && name.trim().length > 0) {
      return this.http.get<UserModel[]>(
        `${environment.API}customer/getByName?name=${name}`
      );
    }

    return this.http.get<UserModel[]>(`${environment.API}customer/`);
  }
}
