package com.ruoyi.system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ruoyi.system.domain.SysDept;


public interface SysDeptMapper
{

    public int selectDeptCount(SysDept dept);


    public int checkDeptExistUser(Long deptId);


    public List<SysDept> selectDeptList(SysDept dept);


    public int deleteDeptById(Long deptId);


    public int insertDept(SysDept dept);


    public int updateDept(SysDept dept);


    public int updateDeptChildren(@Param("depts") List<SysDept> depts);


    public SysDept selectDeptById(Long deptId);


    public SysDept checkDeptNameUnique(@Param("deptName") String deptName, @Param("parentId") Long parentId);


    public List<String> selectRoleDeptTree(Long roleId);


    public void updateDeptStatus(SysDept dept);


    public List<SysDept> selectChildrenDeptById(Long deptId);
}
