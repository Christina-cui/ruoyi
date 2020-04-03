package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysOperLog;


public interface SysOperLogMapper
{

    public void insertOperlog(SysOperLog operLog);


    public List<SysOperLog> selectOperLogList(SysOperLog operLog);
    

    public int deleteOperLogByIds(String[] ids);
    

    public SysOperLog selectOperLogById(Long operId);
    

    public void cleanOperLog();
}
