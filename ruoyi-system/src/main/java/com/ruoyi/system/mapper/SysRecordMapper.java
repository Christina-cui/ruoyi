package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRecord;


public interface SysRecordMapper 
{

    public SysRecord selectSysRecordById(Long id);


    public List<SysRecord> selectSysRecordList(SysRecord sysRecord);


    public int insertSysRecord(SysRecord sysRecord);


    public int updateSysRecord(SysRecord sysRecord);


    public int deleteSysRecordById(Long id);


    public int deleteSysRecordByIds(String[] ids);
}
