package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPost;


public interface SysPostMapper
{

    public List<SysPost> selectPostList(SysPost post);


    public List<SysPost> selectPostAll();


    public List<SysPost> selectPostsByUserId(Long userId);


    public SysPost selectPostById(Long postId);


    public int deletePostByIds(Long[] ids);


    public int updatePost(SysPost post);


    public int insertPost(SysPost post);


    public SysPost checkPostNameUnique(String postName);


    public SysPost checkPostCodeUnique(String postCode);
}
