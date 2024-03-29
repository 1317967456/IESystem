package com.example.iesystem.service;

import com.example.iesystem.pojo.Enterprise;

import java.util.List;

public interface EnterpriseService {
    List<Enterprise> getEnterpriseList();

    Enterprise getEnterpriseListByName(String name);

    Enterprise getEnterpriseListById(Long id);

    void addEnterprise(Enterprise enterprise);

    void deleteBatch(Integer[] ids);

    void update(Enterprise enterprise);

    void deleteById(Long id);
}
