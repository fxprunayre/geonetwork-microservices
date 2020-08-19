package org.geonetworkopensource.gnindexingservice.controller;

import lombok.val;
import org.geonetworkopensource.gnindexingservice.model.Index;
import org.geonetworkopensource.gnindexingservice.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping(value = "index")
public class IndexController {

    @Value("${gn.datadir}")
    String dataDirectory;

    @Autowired
    IndexService indexService;

    @Autowired
    MessageSource messages;

    public ResponseEntity<Index> getIndex() {
        return ResponseEntity.ok(indexService.getIndex());
    }
    @GetMapping(path = "/{indexIdentifier}")
    public ResponseEntity deleteIndex(
            @PathVariable
            String indexIdentifier,
            @RequestHeader(value = "Accept-Language", required = false)
            String locale
    ) {
        val indexFound = false;
        val message = messages.getMessage("index.status.available",null, Locale.forLanguageTag(locale));
        System.out.println(message + dataDirectory);
        if (indexFound) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
