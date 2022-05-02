package com.sb.controller;

import com.sb.dto.Pokeman;
import com.sb.service.PokemanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>Title: $[Name]</p>
 *
 * <p>Description: TODO</p>
 *
 * <p>Copyright: copyright (c) 2021</p>
 * <p>Company: Perosnal</p>
 *
 * @author Shankar Bodakunta
 */

@RestController
@AllArgsConstructor
public class PokemanController {
    private PokemanService pokemanService;

    @GetMapping
    @RequestMapping("/pokemans")
    public List<Pokeman> getPokemans(){
         return pokemanService.getListOfPokeman();
    }

    @GetMapping
    @RequestMapping("/pokeman/{id}")
    public  Pokeman getSelected(@PathVariable("id") int id){
        return pokemanService.getSelectedPokeman(id);
    }
}
