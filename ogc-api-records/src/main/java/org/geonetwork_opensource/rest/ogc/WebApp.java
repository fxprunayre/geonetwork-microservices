package org.geonetwork_opensource.rest.ogc;

import org.geonetwork_opensource.rest.ogc.api.impl.CapabilitiesApiImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({CapabilitiesApiImpl.class})
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
