package com.example.demosoap.mapper;

import com.example.demosoap.soapclient.model.client.Client;
import com.example.demosoap.soapclient.model.client.ClientList;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import si.gbkr.leonus.Clients;

import java.util.ArrayList;

/**
 * @author Nermin Pasalic
 */
@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    /**
     * Maps response from soap to client list
     *
     * @param clientByIdResponse model
     * @return response clientList model
     */
  /*  default ClientList toClientList(GetClientByIdResponse clientByIdResponse) {
        var response = new ClientList();
        var clientArrayList = new ArrayList<Client>();
        var clients = (Clients) clientByIdResponse.getClients();
        clients.getClient().forEach(client -> {
                    var clientResponse = toClientResponse((Client) client);
                    clientArrayList.add(clientResponse);
                }
        );
        response.setClients(clientArrayList);
        return response;
    }*/
  /*  default ClientList toClientList(GetClientByIdResponse clientByIdResponse) {
        var response = new ClientList();
        var clientArrayList = new ArrayList<Client>();
        var clients = (Clients) clientByIdResponse.getClients();
        clients.getClient().forEach(client -> {
                    var clientResponse = toClientResponse((com.example.demosoap.wsdl.Client) client);
                    clientArrayList.add(clientResponse);
                }
        );
        response.setClients(clientArrayList);
        return response;
    }

    default Client toClientResponse(com.example.demosoap.wsdl.Client client) {
        var response = new Client();
        response.setName(client.getName());
        //TODO change clientId in Long from soap client
        response.setClientId(Long.valueOf(client.getClientId()));
        return response;
    }*/


    /**
     * Maps response from soap to client list
     *
     * @param client soap model
     * @return response client model
     */
   /* default Client toClientResponse(com.example.demosoap.soapclient.model.client.Client client) {
        var response = new Client();
        response.setName(client.getName());
        //TODO change clientId in Long from soap client
        response.setClientId(Long.valueOf(client.getClientId()));
        return response;
    }*/
}
