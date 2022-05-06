package com.sb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * <p>Title:Sprites</p>
 *
 * <p>Description: Sprites</p>
 *
 * <p>Copyright: copyright (c) 2022</p>
 * <p>Company: Perosnal</p>
 *
 * @author Shankar Bodakunta
 */
@Data
@JsonIgnoreProperties
public class Sprites {
    private String front_default;
}
