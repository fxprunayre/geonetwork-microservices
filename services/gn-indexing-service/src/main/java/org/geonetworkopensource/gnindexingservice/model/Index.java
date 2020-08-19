package org.geonetworkopensource.gnindexingservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Index {
    private String uuid;
    private Long documentCount;
}
