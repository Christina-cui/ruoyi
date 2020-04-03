package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysUser;


public interface ISysUserService
{

    public List<SysUser> selectUserList(SysUser user);


    public List<SysUser> selectAllocatedList(SysUser user);


    public List<SysUser> selectUnallocatedList(SysUser user);


    public SysUser selectUserByLoginName(String userName);


    public SysUser selectUserByPhoneNumber(String phoneNumber);


    public SysUser selectUserByEmail(String email);


    public SysUser selectUserById(Long userId);


    public int deleteUserById(Long userId);


    public int deleteUserByIds(String ids) throws Exception;


    public int insertUser(SysUser user);


    public int updateUser(SysUser user);


    public int updateUserInfo(SysUser user);


    public int resetUserPwd(SysUser user);


    public String checkLoginNameUnique(String loginName);


    public String checkPhoneUnique(SysUser user);


    public String checkEmailUnique(SysUser user);


    public void checkUserAllowed(SysUser user);


    public String selectUserRoleGroup(Long userId);


    public String selectUserPostGroup(Long userId);


    public String importUser(List<SysUser> userList, Boolean isUpdateSupport, String operName);


    public int changeStatus(SysUser user);
}
