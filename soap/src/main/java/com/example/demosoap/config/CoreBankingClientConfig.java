package com.example.demosoap.config;

import com.example.demosoap.client.SoapConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author Nermin Pasalic
 */
@Configuration
public class CoreBankingClientConfig {

    private static final String WSDL_URL = "http://10.153.254.50:9080/wss/SME";

    @Bean
    public Jaxb2Marshaller marshaller() {
        var marshaller = new Jaxb2Marshaller();
      //  marshaller.setContextPath("com.example.demosoap.wsdl");
       marshaller.setContextPath("com.example.demosoap.wsdl");
        return marshaller;
    }

    @Bean
    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
        var connector = new SoapConnector();
    // connector.setDefaultUri(WSDL_URL);
        connector.setDefaultUri("https://www.dataaccess.com/webservicesserver/numberconversion.wso");
        connector.setMarshaller(marshaller);
        connector.setUnmarshaller(marshaller);
        return connector;
    }
}
