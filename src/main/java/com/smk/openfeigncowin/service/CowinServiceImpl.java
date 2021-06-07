package com.smk.openfeigncowin.service;

import com.smk.openfeigncowin.feign.FeignClientService;
import com.smk.openfeigncowin.model.Root;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class CowinServiceImpl implements CowinService {

    @Autowired
    private FeignClientService feignClientService;

    @Override
    public Root getCentreDetails(Long pincode, @NotNull LocalDate date) {

        if (date.isBefore(LocalDate.now())) {
            return null;
        }
        return feignClientService.getCentreDetails(pincode, date);
    }
}
