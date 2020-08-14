package org.geonetwork_opensource.rest.ogc.api.impl;

import org.geonetwork_opensource.rest.ogc.api.CapabilitiesApi;
import org.geonetwork_opensource.rest.ogc.model.Link;
import org.geonetwork_opensource.rest.ogc.model.Root;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CapabilitiesApiImpl implements CapabilitiesApi {

    public ResponseEntity<Root> getLandingPage() {
        Root root = new Root();
        Link link = new Link();
        link.setHref("http://test");
        root.addLinksItem(link);
        return new ResponseEntity<>(root, HttpStatus.CREATED);
    }
}
