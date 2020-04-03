package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysNotice;


public interface ISysNoticeService
{

    public SysNotice selectNoticeById(Long noticeId);


    public List<SysNotice> selectNoticeList(SysNotice notice);


    public int insertNotice(SysNotice notice);


    public int updateNotice(SysNotice notice);


    public int deleteNoticeByIds(String ids);
}
