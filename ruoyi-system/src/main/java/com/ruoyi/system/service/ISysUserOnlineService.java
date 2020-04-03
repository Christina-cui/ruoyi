package com.ruoyi.system.service;

import java.util.Date;
import java.util.List;
import com.ruoyi.system.domain.SysUserOnline;


public interface ISysUserOnlineService
{

    public SysUserOnline selectOnlineById(String sessionId);


    public void deleteOnlineById(String sessionId);


    public void batchDeleteOnline(List<String> sessions);


    public void saveOnline(SysUserOnline online);


    public List<SysUserOnline> selectUserOnlineList(SysUserOnline userOnline);


    public void forceLogout(String sessionId);


    public List<SysUserOnline> selectOnlineByExpired(Date expiredDate);
}
