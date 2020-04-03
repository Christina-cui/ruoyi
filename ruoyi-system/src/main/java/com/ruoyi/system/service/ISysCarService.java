package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysCar;


public interface ISysCarService 
{

    public SysCar selectSysCarById(Long id);


    public List<SysCar> selectSysCarList(SysCar sysCar);


    public int insertSysCar(SysCar sysCar);


    public int updateSysCar(SysCar sysCar);


    public int deleteSysCarByIds(String ids);


    public int deleteSysCarById(Long id);
}
