package com.kibberpunk.spring.boot.starter.jsonrpc.example.controller;

import com.kibberpunk.spring.boot.starter.jsonrpc.annotation.JsonRpcController;
import com.kibberpunk.spring.boot.starter.jsonrpc.annotation.JsonRpcMethod;
import com.kibberpunk.spring.boot.starter.jsonrpc.annotation.JsonRpcRequestId;
import com.kibberpunk.spring.boot.starter.jsonrpc.annotation.JsonRpcRequestObject;
import com.kibberpunk.spring.boot.starter.jsonrpc.annotation.JsonRpcRequestObjectParameter;
import com.kibberpunk.spring.boot.starter.jsonrpc.example.dto.Coordinates;
import com.kibberpunk.spring.boot.starter.jsonrpc.example.dto.Status;
import com.kibberpunk.spring.boot.starter.jsonrpc.example.dto.Target;
import com.kibberpunk.spring.boot.starter.jsonrpc.example.dto.TyrantCommandResponse;
import com.kibberpunk.spring.boot.starter.jsonrpc.utils.JsonRpcUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.servlet.http.HttpServletRequest;

import java.security.Principal;
import java.util.UUID;

/**
 * 'Nemesis' (from Resident Evil) JSON-RPC controller
 *
 * @author kibberpunk
 */
@JsonRpcController
public class NemesisController {

    /**
     * 'Attack' JSON-RPC method
     */
    @JsonRpcMethod
    @Operation(
            summary = "Set the target of the tyrant's attack",
            description = """
                            The target coordinates and a brief description are passed to the method.
                    """,
            tags = {JsonRpcUtils.METHOD_TAG},
            requestBody = @RequestBody(
                    required = true,
                    content = @Content(examples = @ExampleObject(
                            name = "Set the target of the tyrant's attack",
                            value = """
                                    {
                                       "id": "68998eaf-dee3-4652-90fe-776a397ed1ab",
                                       "method": "nemesisController.attack",
                                       "params": {
                                         "coordinates": {
                                           "x": 10,
                                           "y": 20,
                                           "z": 30
                                         },
                                         "description": "goal - Alice project"
                                       },
                                       "jsonrpc": "2.0"
                                     }
                                    """))))
    public TyrantCommandResponse attack(
            final @JsonRpcRequestId UUID id,
            final @JsonRpcRequestObject Target target,
            final @JsonRpcRequestObjectParameter("coordinates") Coordinates coordinates,
            final HttpServletRequest httpServletRequest,
            final Principal principal
    ) {
        return TyrantCommandResponse.builder()
                .status(Status.ACCEPTED)
                .description("Target captured! by coordinates: " + coordinates.toString())
                .build();
    }

    /**
     * 'Sleep' NONE JSON-RPC method (because tyrant never sleep)
     */
    public String sleep() {
        return null;
    }
}
