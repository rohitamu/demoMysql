package com.demo.omlc.service;

import com.demo.omlc.repository.DemoRepository;
import com.demo.omlc.modal.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public List<Shipment> getOMLCData(String dateQuery) {

       return demoRepository.getOMLCData(dateQuery);

    }
}
