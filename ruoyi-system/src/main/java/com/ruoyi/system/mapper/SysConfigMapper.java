package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysConfig;


public interface SysConfigMapper
{

    public SysConfig selectConfig(SysConfig config);


    public List<SysConfig> selectConfigList(SysConfig config);


    public SysConfig checkConfigKeyUnique(String configKey);


    public int insertConfig(SysConfig config);


    public int updateConfig(SysConfig config);


    public int deleteConfigByIds(String[] configIds);
}