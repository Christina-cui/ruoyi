package com.ruoyi.system.service.impl;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysRecordMapper;
import com.ruoyi.system.domain.SysRecord;
import com.ruoyi.system.service.ISysRecordService;
import com.ruoyi.common.core.text.Convert;


@Service
public class SysRecordServiceImpl implements ISysRecordService 
{
    @Autowired
    private SysRecordMapper sysRecordMapper;


    @Override
    public SysRecord selectSysRecordById(Long id)
    {
        return sysRecordMapper.selectSysRecordById(id);
    }


    @Override
    public List<SysRecord> selectSysRecordList(SysRecord sysRecord)
    {
        return sysRecordMapper.selectSysRecordList(sysRecord);
    }


    @Override
    public int insertSysRecord(SysRecord sysRecord)
    {
        LocalDateTime now = LocalDateTime.now();
        sysRecord.setRendDate(Timestamp.valueOf(now));
        return sysRecordMapper.insertSysRecord(sysRecord);
    }


    @Override
    public int updateSysRecord(SysRecord sysRecord)
    {
        LocalDateTime now = LocalDateTime.now();
        sysRecord.setRendDate(Timestamp.valueOf(now));

        return sysRecordMapper.updateSysRecord(sysRecord);
    }


    @Override
    public int deleteSysRecordByIds(String ids)
    {
        return sysRecordMapper.deleteSysRecordByIds(Convert.toStrArray(ids));
    }


    @Override
    public int deleteSysRecordById(Long id)
    {
        return sysRecordMapper.deleteSysRecordById(id);
    }
}
