package com.smk.openfeigncowin.feign;

import com.smk.openfeigncowin.model.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "CowinFeign" , url = "https://cdn-api.co-vin.in/")
public interface FeignClientService {

    @GetMapping("/api/v2/appointment/sessions/public/calendarByPin")
    public Root getCentreDetails(
            @RequestParam("pincode") Long pincode ,
            @RequestParam("date") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date
    );

}
