package com.example.iesystem.dao;

import com.example.iesystem.pojo.Enterprise;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseDao {

    List<Enterprise> getEnterpriseList();

    Enterprise getEnterpriseListByName(String name);

    Enterprise getEnterpriseListById(Long id);

    void addEnterprise(Enterprise enterprise);

    void deleteBatch(@Param("ids") Integer[] ids);

    void updateEnterprise(Enterprise enterprise);

    void deleteEnterpriseById(Long id);
}
