package com.kibberpunk.spring.boot.starter.jsonrpc.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kibberpunk
 */
@Getter
@Setter
@Builder
public class TyrantCommandResponse {

    private Status status;
    private String description;
}
