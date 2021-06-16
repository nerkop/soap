package com.example.demosoap;

import com.example.demosoap.soapclient.CoreBankingSoapClient;
import com.example.demosoap.soapclient.model.client.ClientList;
import com.example.demosoap.wsdl.NumberToWordsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoSoapApplication implements CommandLineRunner {

    private final CoreBankingSoapClient client;

    public static void main(String[] args) {
        SpringApplication.run(DemoSoapApplication.class, args);
    }

    @Override
    public void run(String... args) {
        var userCode = Long.valueOf(4173901);
      /*  ClientList response = client.getClients(userCode);
        response.getClients().forEach(client1 -> {
            System.out.println("____RESPONSE_____ : ");
            System.out.println("Name : " + client1.getName());
            System.out.println("ClientID : " + client1.getClientId());
        });
        var clientId = "2007106";
        GetAccountsByClientIdResponse response = client.getAccountsByClientIdResponse(clientId);
        System.out.println("____RESPONSE_____ : ");
        System.out.println("Name : " + response.getAccounts().toString());*/
        var number = BigInteger.valueOf(190);
        NumberToWordsResponse response = client.getResponse(number);
        System.out.println("____RESPONSE_____ : ");
        System.out.println("Name : " + response.getNumberToWordsResult());

    }
}
