package com.dtone.ssm.service;

import com.dtone.ssm.entity.ExpertEntity;

import java.util.List;

public interface IExpertService {
    public void addExpert(ExpertEntity expertEntity);
    public void delExpert(int id);
    public List<ExpertEntity> searchExpert(String name, String expertise, String company);
    public List<ExpertEntity> selectAllExpert();
}
