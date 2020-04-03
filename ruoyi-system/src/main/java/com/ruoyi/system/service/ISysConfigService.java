package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysConfig;


public interface ISysConfigService
{

    public SysConfig selectConfigById(Long configId);


    public String selectConfigByKey(String configKey);


    public List<SysConfig> selectConfigList(SysConfig config);


    public int insertConfig(SysConfig config);


    public int updateConfig(SysConfig config);


    public int deleteConfigByIds(String ids);


    public String checkConfigKeyUnique(SysConfig config);
}
