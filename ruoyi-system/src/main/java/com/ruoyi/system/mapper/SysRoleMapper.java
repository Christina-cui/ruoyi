package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRole;


public interface SysRoleMapper
{

    public List<SysRole> selectRoleList(SysRole role);


    public List<SysRole> selectRolesByUserId(Long userId);


    public SysRole selectRoleById(Long roleId);


    public int deleteRoleById(Long roleId);


    public int deleteRoleByIds(Long[] ids);


    public int updateRole(SysRole role);


    public int insertRole(SysRole role);


    public SysRole checkRoleNameUnique(String roleName);
    

    public SysRole checkRoleKeyUnique(String roleKey);
}
