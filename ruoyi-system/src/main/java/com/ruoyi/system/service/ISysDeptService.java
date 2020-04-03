package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.domain.SysRole;


public interface ISysDeptService
{

    public List<SysDept> selectDeptList(SysDept dept);


    public List<Ztree> selectDeptTree(SysDept dept);


    public List<Ztree> roleDeptTreeData(SysRole role);


    public int selectDeptCount(Long parentId);


    public boolean checkDeptExistUser(Long deptId);


    public int deleteDeptById(Long deptId);


    public int insertDept(SysDept dept);


    public int updateDept(SysDept dept);


    public SysDept selectDeptById(Long deptId);


    public String checkDeptNameUnique(SysDept dept);
}
