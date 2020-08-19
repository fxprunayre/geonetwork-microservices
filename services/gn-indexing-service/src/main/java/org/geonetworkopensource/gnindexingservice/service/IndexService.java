package org.geonetworkopensource.gnindexingservice.service;

import org.fao.geonet.domain.Metadata;
import org.fao.geonet.repository.MetadataRepository;
import org.geonetworkopensource.gnindexingservice.model.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    @Autowired
    MetadataRepository metadataRepository;

    public Index getIndex() {
        Index index = new Index();
        index.setUuid("1234");
        index.setDocumentCount(metadataRepository.count());
        index();
        return index;
    }

    public void index() {
        Metadata metadata = metadataRepository.findOneById(1);
    }
}
