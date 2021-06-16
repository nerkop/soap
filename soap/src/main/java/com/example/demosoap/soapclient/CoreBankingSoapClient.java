package com.example.demosoap.soapclient;

import com.example.demosoap.client.SoapConnector;
import com.example.demosoap.mapper.ClientMapper;
import com.example.demosoap.soapclient.model.client.ClientList;
import com.example.demosoap.wsdl.NumberToWordsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

/**
 * @author Nermin Pasalic
 */
@Component
@RequiredArgsConstructor
public class CoreBankingSoapClient {

    private final SoapConnector soapConnector;

  /*  public ClientList getClients(Long userCode) {
       // var response = soapConnector.getClientById(userCode);
        var response = soapConnector.getClientByIdResponse(userCode);
        return ClientMapper.INSTANCE.toClientList(response);
    }
    public GetClientByIdResponse getClientByIdResponse (Long userCode){
        return soapConnector.getClientByIdResponse(userCode);
    }

    public GetAccountsByClientIdResponse getAccountsByClientIdResponse(String clientId){
        return soapConnector.getAccountsByClientIdResponse(clientId);
    }*/

    public NumberToWordsResponse getResponse (BigInteger integer){
        return soapConnector.getResponse(integer);
    }

}
