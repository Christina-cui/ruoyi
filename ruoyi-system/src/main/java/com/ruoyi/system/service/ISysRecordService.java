package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysRecord;


public interface ISysRecordService 
{

    public SysRecord selectSysRecordById(Long id);


    public List<SysRecord> selectSysRecordList(SysRecord sysRecord);


    public int insertSysRecord(SysRecord sysRecord);


    public int updateSysRecord(SysRecord sysRecord);


    public int deleteSysRecordByIds(String ids);


    public int deleteSysRecordById(Long id);
}
