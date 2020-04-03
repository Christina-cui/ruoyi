package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRoleMenu;


public interface SysRoleMenuMapper
{

    public int deleteRoleMenuByRoleId(Long roleId);
    

    public int deleteRoleMenu(Long[] ids);
    

    public int selectCountRoleMenuByMenuId(Long menuId);
    

    public int batchRoleMenu(List<SysRoleMenu> roleMenuList);
}
