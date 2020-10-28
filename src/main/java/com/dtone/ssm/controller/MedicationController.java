/**
 * @program: safecity
 * @description: 药剂控制器
 * @author: TwinIsland
 * @create: 2020-10-28 11:47
 **/

package com.dtone.ssm.controller;

import com.dtone.ssm.entity.MedicamentEntity;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IMedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("html/")
public class MedicationController {
    @Autowired
    private IMedicamentService medicamentService;
    @Autowired
    private ILogService logService;

    @RequestMapping("info/medication")
    public List<MedicamentEntity> getMedications() {
        return medicamentService.findAllMedi();
    }

    @RequestMapping("info/searchedMedication.action")
    public List<MedicamentEntity> searchMedication(String name, String pType, String type) {
        return medicamentService.findMediBynameAndptypeAndtype(name, pType, type);
    }

    @RequestMapping("manage/addMedication.action")
    public String addMedication(MedicamentEntity medicamentEntity) {
        if (medicamentEntity.getMed_purpose().equals("") ||
                medicamentEntity.getMed_count() == 0 ||
                medicamentEntity.getMed_name().equals("")) {
            return "false";
        }
        try {
            medicamentService.addMedi(medicamentEntity);
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }

    @RequestMapping("manage/delMedication.action")
    public String delMedication(int id) {
        try {
            medicamentService.delMediByID(id);
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }
}

