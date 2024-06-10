package com.example.cameldemob.routes;

import com.example.cameldemob.dto.CurrencyConverter;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRoute extends RouteBuilder {
    @Override
    public void configure() {
        // receive json from queue
        // map it to class (unmarshal)
        from("activemq:active-queue")
                .unmarshal().json(JsonLibrary.Jackson, CurrencyConverter.class)
                .to("log:Received Message");
    }
}
