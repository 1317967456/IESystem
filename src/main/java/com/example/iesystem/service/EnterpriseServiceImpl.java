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

    @Override
    public Enterprise getEnterpriseListByName(String name) {
        return enterpriseDao.getEnterpriseListByName(name);
    }

    @Override
    public Enterprise getEnterpriseListById(Long id) {
        return enterpriseDao.getEnterpriseListById(id);
    }

    @Override
    public void addEnterprise(Enterprise enterprise) {
        enterpriseDao.addEnterprise(enterprise);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        enterpriseDao.deleteBatch(ids);
    }

    @Override
    public void update(Enterprise enterprise) {
        enterpriseDao.updateEnterprise(enterprise);
    }
}
