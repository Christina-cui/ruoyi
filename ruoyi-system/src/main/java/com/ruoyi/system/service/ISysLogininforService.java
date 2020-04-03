package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysLogininfor;


public interface ISysLogininforService
{

    public void insertLogininfor(SysLogininfor logininfor);


    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor);


    public int deleteLogininforByIds(String ids);


    public void cleanLogininfor();
}
