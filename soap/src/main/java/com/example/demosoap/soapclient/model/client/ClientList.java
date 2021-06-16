package com.example.demosoap.soapclient.model.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Nermin Pasalic
 */
@Data
public class ClientList {

    @JsonProperty("clientList")
    private List<Client> clients;
}
