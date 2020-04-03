package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysLogininfor;


public interface SysLogininforMapper
{

    public void insertLogininfor(SysLogininfor logininfor);


    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor);


    public int deleteLogininforByIds(String[] ids);


    public int cleanLogininfor();
}
