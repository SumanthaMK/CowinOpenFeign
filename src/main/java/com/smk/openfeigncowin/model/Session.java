package com.smk.openfeigncowin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {

    public String session_id;
    public String date;
    public int available_capacity;
    public int min_age_limit;
    public String vaccine;
    public List<String> slots;
    public int available_capacity_dose1;
    public int available_capacity_dose2;

}
