package com.sb.service;

import com.sb.dto.Pokeman;

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
public interface PokemanService {

    List<Pokeman> getListOfPokeman();
    Pokeman getSelectedPokeman(int id);
}
