package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRoleDept;


public interface SysRoleDeptMapper
{

    public int deleteRoleDeptByRoleId(Long roleId);


    public int deleteRoleDept(Long[] ids);


    public int selectCountRoleDeptByDeptId(Long deptId);


    public int batchRoleDept(List<SysRoleDept> roleDeptList);
}
