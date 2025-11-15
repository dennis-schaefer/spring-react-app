package de.schaeferd.application;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;

import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@Configuration
public class GatewayConfiguration
{
    @Bean
    public RouterFunction<?> viteProxyRoute() {
        return GatewayRouterFunctions.route("vite-proxy")
                .route(path("/**").and(path("/api/**").negate()),
                        HandlerFunctions.http("http://127.0.0.1:5173"))
                .build();
    }
}
