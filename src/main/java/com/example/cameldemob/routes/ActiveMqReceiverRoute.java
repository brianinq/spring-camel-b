package com.example.cameldemob.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("activemq:active-queue")
                .to("log:Received Message");
    }
}
