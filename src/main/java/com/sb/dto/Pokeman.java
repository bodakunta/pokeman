package com.sb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * <p>Title: Pokeman</p>
 *
 * <p>Description: Details of the pokeman service that we required</p>
 *
 * <p>Copyright: copyright (c) 2022</p>
 * <p>Company: Perosnal</p>
 *
 * @author Shankar Bodakunta
 */
@Data
@JsonIgnoreProperties
public class Pokeman {

    private String id;
    private Sprites sprites;
    private String name;
}
