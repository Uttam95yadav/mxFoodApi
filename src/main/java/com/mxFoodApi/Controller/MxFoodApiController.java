package com.mxFoodApi.Controller;

import com.mxFoodApi.model.Menu;
import com.mxFoodApi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MxFoodApiController {

    @Autowired
    MenuService menuService;

//    @RequestMapping("/getMenu")
//    public List<Menu> getMenu(){
//        List<Menu> menu =  menuService.getMenu();
//        return menu;
//    }
    @RequestMapping("/getMenu")
    public String getMenu(){
        return "uttam";
    }

}
