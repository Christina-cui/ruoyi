package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCarMapper;
import com.ruoyi.system.domain.SysCar;
import com.ruoyi.system.service.ISysCarService;
import com.ruoyi.common.core.text.Convert;


@Service
public class SysCarServiceImpl implements ISysCarService 
{
    @Autowired
    private SysCarMapper sysCarMapper;


    @Override
    public SysCar selectSysCarById(Long id)
    {
        return sysCarMapper.selectSysCarById(id);
    }


    @Override
    public List<SysCar> selectSysCarList(SysCar sysCar)
    {
        return sysCarMapper.selectSysCarList(sysCar);
    }


    @Override
    public int insertSysCar(SysCar sysCar)
    {
        return sysCarMapper.insertSysCar(sysCar);
    }


    @Override
    public int updateSysCar(SysCar sysCar)
    {
        return sysCarMapper.updateSysCar(sysCar);
    }


    @Override
    public int deleteSysCarByIds(String ids)
    {
        return sysCarMapper.deleteSysCarByIds(Convert.toStrArray(ids));
    }


    @Override
    public int deleteSysCarById(Long id)
    {
        return sysCarMapper.deleteSysCarById(id);
    }
}
