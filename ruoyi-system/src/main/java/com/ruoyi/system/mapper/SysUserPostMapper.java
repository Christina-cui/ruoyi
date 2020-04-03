package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysUserPost;


public interface SysUserPostMapper
{

    public int deleteUserPostByUserId(Long userId);
    

    public int countUserPostById(Long postId);
    

    public int deleteUserPost(Long[] ids);


    public int batchUserPost(List<SysUserPost> userPostList);
}
