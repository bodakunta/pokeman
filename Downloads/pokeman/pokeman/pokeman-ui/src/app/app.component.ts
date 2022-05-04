import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import {MatTableModule} from '@angular/material/table';
import { Pokemon } from './models/pokemon';
import { PokemonService } from './services/pokemon.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'PokemonApp';

    constructor(
      private pokemonService: PokemonService
      ) { }

    pokemonList: Pokemon[] = [];

    dataSourcePokemon = new MatTableDataSource<Pokemon>(this.pokemonList);

    displayedColumns: string[] = [
      'id',
      'name'
    ];

    ngOnInit() {
      this.loadData();
    }

    loadData(): void {
      this.pokemonService.getData().subscribe(res => {
        this.pokemonList = res;
        this.dataSourcePokemon = new MatTableDataSource<Pokemon>(this.pokemonList);
      });
    }
}
