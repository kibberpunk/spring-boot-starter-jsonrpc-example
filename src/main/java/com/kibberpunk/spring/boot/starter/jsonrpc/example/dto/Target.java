package com.kibberpunk.spring.boot.starter.jsonrpc.example.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Target to attack
 *
 * @author kibberpunk
 */
@Getter
@Setter
public class Target {
    
    private Coordinates coordinates;
    private String description;
}
