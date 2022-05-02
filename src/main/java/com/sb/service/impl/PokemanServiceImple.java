package com.sb.service.impl;

import com.sb.dto.Pokeman;
import com.sb.service.PokemanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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
@Service
@AllArgsConstructor
public class PokemanServiceImple implements PokemanService {
    //private PokemanApiClient pokemanApiClient;
    private RestTemplate restTemplate;

    @Override
    public List<Pokeman> getListOfPokeman() {
        List<Pokeman> pokemanList = new ArrayList<>();
        for(int i=1;i <= 100;i++) {
            String url = "https://pokeapi.co/api/v2/pokemon/"+i;
            pokemanList.add(restTemplate.getForObject(url, Pokeman.class));
        }
       return pokemanList;
    }

    @Override
    public Pokeman getSelectedPokeman(int id) {
        String url = "https://pokeapi.co/api/v2/pokemon/"+id;
        return restTemplate.getForObject(url, Pokeman.class);
    }
}
