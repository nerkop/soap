package com.example.demosoap.client;

import com.example.demosoap.wsdl.NumberToWords;
import com.example.demosoap.wsdl.NumberToWordsResponse;
import dto.request.TransactionFilterRequest;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import si.gbkr.leonus.*;

import java.math.BigInteger;

/**
 * @author Nermin Pasalic
 */

public class SoapConnector extends WebServiceGatewaySupport {


  /*  public GetClientByIdResponse getClientById(Long userCode) {
        GetClientById request = new GetClientById();
        request.setClientId(userCode);
        return (GetClientByIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }*/
/*
    public com.example.demosoap.wsdl.GetClientByIdResponse getClientByIdResponse(Long userCode){
        com.example.demosoap.wsdl.GetClientById request = new com.example.demosoap.wsdl.GetClientById();
        request.setClientId(userCode);
        return (com.example.demosoap.wsdl.GetClientByIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
    public com.example.demosoap.wsdl.GetAccountsByClientIdResponse getAccountsByClientIdResponse(String clientId){
        com.example.demosoap.wsdl.GetAccountsByClientId req = new com.example.demosoap.wsdl.GetAccountsByClientId();
        req.setClientID(clientId);
        return (com.example.demosoap.wsdl.GetAccountsByClientIdResponse) getWebServiceTemplate().marshalSendAndReceive(req);
    }


    public GetAccountsByClientIdResponse getAccountsByClientId(String clientId) {
        GetAccountsByClientId request = new GetAccountsByClientId();
        request.setClientID(clientId);

        return (GetAccountsByClientIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public GetAccountTransactionsResponse getAccountTransactions(String clientId, TransactionFilterRequest transactionFilterRequest) {
        GetAccountTransactions request = new GetAccountTransactions();
        Filter filter = new Filter();
        filter.setClientId(clientId);
        filter.setIban(transactionFilterRequest.getIban());
        filter.setCurrency(transactionFilterRequest.getCurrency());
        filter.setPaymentDateFrom(transactionFilterRequest.getPaymentDateFrom());
        filter.setPaymentDateTo(transactionFilterRequest.getPaymentDateTo());
        filter.setPaymentAmountFrom(transactionFilterRequest.getPaymentAmountFrom().toString());
        filter.setPaymentAmountTo(transactionFilterRequest.getPaymentAmountTo().toString());
        filter.setTransactionType(transactionFilterRequest.getTransactionType());
        filter.setPayer(transactionFilterRequest.getPayerPayee());
        filter.setPaymentDescription(transactionFilterRequest.getDescription());
        filter.setModelDebtor(transactionFilterRequest.getModelDebtor());
        filter.setDebtorReference(transactionFilterRequest.getCallDebtor());
        filter.setModelCreditor(transactionFilterRequest.getModelCreditor());
        filter.setCreditorReference(transactionFilterRequest.getCallCreditor());
        filter.setTransactionStatus(transactionFilterRequest.getTransactionStatus());
        filter.setCardTransaction(transactionFilterRequest.getCards().toString());
        filter.setOfficeTransaction(transactionFilterRequest.getOffice().toString());
        filter.setOnlinePaymentTransaction(transactionFilterRequest.getOnline().toString());

        request.setFilter(filter);

        return (GetAccountTransactionsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }*/

    public NumberToWordsResponse getResponse (BigInteger number){
        NumberToWords request = new NumberToWords();
        request.setUbiNum(number);
        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
