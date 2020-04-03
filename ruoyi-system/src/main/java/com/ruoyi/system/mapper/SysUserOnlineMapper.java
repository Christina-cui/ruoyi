package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysUserOnline;


public interface SysUserOnlineMapper
{

    public SysUserOnline selectOnlineById(String sessionId);


    public int deleteOnlineById(String sessionId);


    public int saveOnline(SysUserOnline online);


    public List<SysUserOnline> selectUserOnlineList(SysUserOnline userOnline);


    public List<SysUserOnline> selectOnlineByExpired(String lastAccessTime);
}
