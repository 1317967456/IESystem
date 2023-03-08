package com.example.iesystem.service;

import com.example.iesystem.dao.EnterpriseDao;
import com.example.iesystem.pojo.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseDao enterpriseDao;

    @Override
    public List<Enterprise> getEnterpriseList() {
        return enterpriseDao.getEnterpriseList();
    }
}