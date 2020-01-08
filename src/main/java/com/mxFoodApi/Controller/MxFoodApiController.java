package com.mxFoodApi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MxFoodApiController {
    @RequestMapping("/getMenue")
    public String getMenue(){
        return "axsuaxsu";
    }

}
