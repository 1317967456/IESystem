package com.example.iesystem.controller;

import com.example.iesystem.pojo.Enterprise;
import com.example.iesystem.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;
    /*
     *查询所有顾客
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Enterprise> EnterpriseList(){
        return enterpriseService.getEnterpriseList();
    }


}
