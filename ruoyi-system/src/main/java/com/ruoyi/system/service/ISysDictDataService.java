package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysDictData;


public interface ISysDictDataService
{

    public List<SysDictData> selectDictDataList(SysDictData dictData);


    public List<SysDictData> selectDictDataByType(String dictType);


    public String selectDictLabel(String dictType, String dictValue);


    public SysDictData selectDictDataById(Long dictCode);


    public int deleteDictDataById(Long dictCode);


    public int deleteDictDataByIds(String ids);


    public int insertDictData(SysDictData dictData);


    public int updateDictData(SysDictData dictData);
}
