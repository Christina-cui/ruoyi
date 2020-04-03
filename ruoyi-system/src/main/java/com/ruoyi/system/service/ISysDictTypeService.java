package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.SysDictType;


public interface ISysDictTypeService
{

    public List<SysDictType> selectDictTypeList(SysDictType dictType);


    public List<SysDictType> selectDictTypeAll();


    public SysDictType selectDictTypeById(Long dictId);


    public SysDictType selectDictTypeByType(String dictType);


    public int deleteDictTypeById(Long dictId);


    public int deleteDictTypeByIds(String ids) throws Exception;


    public int insertDictType(SysDictType dictType);


    public int updateDictType(SysDictType dictType);


    public String checkDictTypeUnique(SysDictType dictType);


    public List<Ztree> selectDictTree(SysDictType dictType);
}
