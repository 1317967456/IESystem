package com.example.iesystem.dao;

import com.example.iesystem.pojo.Enterprise;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseDao {

    List<Enterprise> getEnterpriseList();
}
