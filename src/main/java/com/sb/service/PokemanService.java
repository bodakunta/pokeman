package com.sb.service;

import com.sb.dto.Pokeman;

import java.util.List;

/**
 * <p>Title: PokemanService</p>
 *
 * <p>Description: This interface will use to get the all the pokeman details or selected pokmen details</p>
 *
 * <p>Copyright: copyright (c) 2022</p>
 * <p>Company: Standard bank</p>
 *
 * @author Shankar Bodakunta
 */
public interface PokemanService {

    List<Pokeman> getListOfPokeman();

    Pokeman getSelectedPokeman(int id);
}
