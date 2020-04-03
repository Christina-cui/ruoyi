package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCar;


public interface SysCarMapper 
{

    public SysCar selectSysCarById(Long id);


    public List<SysCar> selectSysCarList(SysCar sysCar);


    public int insertSysCar(SysCar sysCar);


    public int updateSysCar(SysCar sysCar);


    public int deleteSysCarById(Long id);


    public int deleteSysCarByIds(String[] ids);
}
