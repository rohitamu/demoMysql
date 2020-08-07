package com.demo.omlc.controller;

import com.demo.omlc.modal.Shipment;
import com.demo.omlc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;
    @GetMapping("/omlc-data/{dateQuery}")
    public List<Shipment> getOMLCData(@PathVariable String dateQuery){

       return demoService.getOMLCData(dateQuery);

    }

}
