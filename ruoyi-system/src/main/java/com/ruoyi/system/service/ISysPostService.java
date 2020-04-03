package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysPost;


public interface ISysPostService
{

    public List<SysPost> selectPostList(SysPost post);


    public List<SysPost> selectPostAll();


    public List<SysPost> selectPostsByUserId(Long userId);


    public SysPost selectPostById(Long postId);


    public int deletePostByIds(String ids) throws Exception;


    public int insertPost(SysPost post);


    public int updatePost(SysPost post);


    public int countUserPostById(Long postId);


    public String checkPostNameUnique(SysPost post);


    public String checkPostCodeUnique(SysPost post);
}
