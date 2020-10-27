package com.dtone.ssm.service;

import com.dtone.ssm.entity.ExpertEntity;

import java.util.List;

public interface IExpertService {
    public void addExpert(ExpertEntity exp);
    public void delExpert(int id);
    public void searchExpert(String name,String expertise,String company);
    public List<ExpertEntity> selectAllExpert();
}
