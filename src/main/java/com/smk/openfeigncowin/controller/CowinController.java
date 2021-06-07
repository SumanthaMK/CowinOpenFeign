package com.smk.openfeigncowin.controller;

import com.smk.openfeigncowin.model.Root;
import com.smk.openfeigncowin.service.CowinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CowinController {

    @Autowired
    private CowinService cowinService;

    @GetMapping("/getCentre")
    public Root getCentreDetails(
            @RequestParam Long pincode,
            @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date
    ) {

        return cowinService.getCentreDetails(pincode, date);
    }

}
