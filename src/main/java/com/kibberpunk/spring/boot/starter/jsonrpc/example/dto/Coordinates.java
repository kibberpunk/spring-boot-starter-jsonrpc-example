package com.kibberpunk.spring.boot.starter.jsonrpc.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kibberpunk
 */
@Getter
@Setter
@ToString
public class Coordinates {

    private Integer x;
    private Integer y;
    private Integer z;
}
