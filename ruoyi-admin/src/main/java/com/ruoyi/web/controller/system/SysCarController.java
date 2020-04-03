package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysCar;
import com.ruoyi.system.service.ISysCarService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆信息Controller
 * 
 * @author ruoyi
 * @date 2020-03-18
 */
@Controller
@RequestMapping("/system/car")
public class SysCarController extends BaseController
{
    private String prefix = "system/car";

    @Autowired
    private ISysCarService sysCarService;

    @RequiresPermissions("system:car:view")
    @GetMapping()
    public String car()
    {
        return prefix + "/car";
    }

    /**
     * 查询车辆信息列表
     */
    @RequiresPermissions("system:car:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysCar sysCar)
    {
        startPage();
        List<SysCar> list = sysCarService.selectSysCarList(sysCar);
        return getDataTable(list);
    }

    /**
     * 导出车辆信息列表
     */
    @RequiresPermissions("system:car:export")
    @Log(title = "车辆信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysCar sysCar)
    {
        List<SysCar> list = sysCarService.selectSysCarList(sysCar);
        ExcelUtil<SysCar> util = new ExcelUtil<SysCar>(SysCar.class);
        return util.exportExcel(list, "car");
    }

    /**
     * 新增车辆信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存车辆信息
     */
    @RequiresPermissions("system:car:add")
    @Log(title = "车辆信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysCar sysCar)
    {
        return toAjax(sysCarService.insertSysCar(sysCar));
    }

    /**
     * 修改车辆信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysCar sysCar = sysCarService.selectSysCarById(id);
        mmap.put("sysCar", sysCar);
        return prefix + "/edit";
    }

    /**
     * 修改保存车辆信息
     */
    @RequiresPermissions("system:car:edit")
    @Log(title = "车辆信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysCar sysCar)
    {
        return toAjax(sysCarService.updateSysCar(sysCar));
    }

    /**
     * 删除车辆信息
     */
    @RequiresPermissions("system:car:remove")
    @Log(title = "车辆信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysCarService.deleteSysCarByIds(ids));
    }
}
