package com.mxFoodApi.service;

import com.mxFoodApi.model.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    public List<Menu> getMenu(){
        List<Menu> menuList = new ArrayList<>();
        menuList.add(1,new Menu(1, "rice",70));
        menuList.add(2,new Menu(2, "rice",70));
        menuList.add(3,new Menu(3, "rice",70));
        menuList.add(4,new Menu(3, "rice",70));
        return menuList;
    }
}
