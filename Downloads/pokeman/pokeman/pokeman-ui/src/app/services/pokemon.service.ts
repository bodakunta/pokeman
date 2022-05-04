import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pokemon } from '../models/pokemon';
import { CommonService } from './common.service';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {
  private apiUrl = 'http://localhost:8090';

  constructor(
    private readonly commonService: CommonService) {
  }

  getData(): Observable<Pokemon[]> {
    return this.commonService.getAll<Pokemon[]>(`${this.apiUrl}/pokemans`);
}
}
