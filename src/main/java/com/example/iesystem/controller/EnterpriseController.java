package com.example.iesystem.controller;

import com.example.iesystem.pojo.Enterprise;
import com.example.iesystem.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public List<Enterprise> EnterpriseList(){
        List<Enterprise> enterpriseList = enterpriseService.getEnterpriseList();
        return enterpriseList;
    }
    /**
     * 根据公司id查询信息
     */
    @RequestMapping("/id/{id}")
    @ResponseBody
    public Enterprise EnterpriseListById(@PathVariable("id")Long id){
        Enterprise enterprise = enterpriseService.getEnterpriseListById(id);
        return enterprise;
    }
    /**
     * 根据公司姓名查询信息
     */
    @RequestMapping("/name/{enterprise_name}")
    @ResponseBody
    public Enterprise EnterpriseListByName(@PathVariable("enterprise_name") String name){
        Enterprise enterprise = enterpriseService.getEnterpriseListByName(name);
        return enterprise;
    }

    /**
     * 添加公司信息
     */
    @PostMapping("/add")
    @ResponseBody
    public void addEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.addEnterprise(enterprise);
    }
    /**
     * 删除公司信息
     */
    @PostMapping("/delete/{id}")
    @ResponseBody
    public void deleteBatch(@PathVariable("id")Long id){
        enterpriseService.deleteById(id);
    }
    /**
     * 批量删除公司信息
     */
    @PostMapping("/deleteBatch")
    @ResponseBody
    public void deleteBatch(@RequestBody Integer[] ids){
        enterpriseService.deleteBatch(ids);
    }
    /**
     * 修改公司信息
     */
    @PostMapping("/update")
    @ResponseBody
    public void updateEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.update(enterprise);
    }

}
