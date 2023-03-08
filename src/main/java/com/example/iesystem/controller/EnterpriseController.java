package com.example.iesystem.controller;

import com.example.iesystem.pojo.Enterprise;
import com.example.iesystem.pojo.JSONResult;
import com.example.iesystem.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;
    /**
     *查询所有公司
     */
    @RequestMapping("/list")
    @ResponseBody
    public JSONResult EnterpriseList(){
        List<Enterprise> enterpriseList = enterpriseService.getEnterpriseList();
        return new JSONResult(true,"查询公司信息成功",enterpriseList);
    }
    /**
     * 根据公司id查询信息
     */
    @RequestMapping("/{id}")
    @ResponseBody
    public JSONResult EnterpriseListById(@PathVariable("id")Long id){
        Enterprise enterprise = enterpriseService.getEnterpriseListById(id);
        return new JSONResult(true,"查询公司信息成功",enterprise);
    }
    /**
     * 根据公司姓名查询信息
     */
    @RequestMapping("/{enterprise_name}")
    @ResponseBody
    public JSONResult EnterpriseListByName(@PathVariable("enterprise_name") String name){
        Enterprise enterprise = enterpriseService.getEnterpriseListByName(name);
        return new JSONResult(true,"查询公司信息成功",enterprise);
    }

    /**
     * 添加公司信息
     */
    @PostMapping("/add")
    @ResponseBody
    public JSONResult addEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.addEnterprise(enterprise);
        return new JSONResult(true,"添加公司信息成功",enterprise);

    }

}
