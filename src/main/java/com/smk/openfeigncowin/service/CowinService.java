package com.smk.openfeigncowin.service;

import com.smk.openfeigncowin.model.Root;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface CowinService {

    Root getCentreDetails(Long pincode , LocalDate date);

}
