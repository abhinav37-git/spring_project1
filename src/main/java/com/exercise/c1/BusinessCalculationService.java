package com.exercise.c1;

import java.util.Arrays;

public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    public int findmax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
