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
import com.ruoyi.system.domain.SysRecord;
import com.ruoyi.system.service.ISysRecordService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 共享单车记录Controller
 * 
 * @author ruoyi
 * @date 2020-03-18
 */
@Controller
@RequestMapping("/system/record")
public class SysRecordController extends BaseController
{
    private String prefix = "system/record";

    @Autowired
    private ISysRecordService sysRecordService;

    @RequiresPermissions("system:record:view")
    @GetMapping()
    public String record()
    {
        return prefix + "/record";
    }

    /**
     * 查询共享单车记录列表
     */
    @RequiresPermissions("system:record:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysRecord sysRecord)
    {
        startPage();
        List<SysRecord> list = sysRecordService.selectSysRecordList(sysRecord);
        return getDataTable(list);
    }

    /**
     * 导出共享单车记录列表
     */
    @RequiresPermissions("system:record:export")
    @Log(title = "共享单车记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysRecord sysRecord)
    {
        List<SysRecord> list = sysRecordService.selectSysRecordList(sysRecord);
        ExcelUtil<SysRecord> util = new ExcelUtil<SysRecord>(SysRecord.class);
        return util.exportExcel(list, "record");
    }

    /**
     * 新增共享单车记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存共享单车记录
     */
    @RequiresPermissions("system:record:add")
    @Log(title = "共享单车记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysRecord sysRecord)
    {
        return toAjax(sysRecordService.insertSysRecord(sysRecord));
    }

    /**
     * 修改共享单车记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysRecord sysRecord = sysRecordService.selectSysRecordById(id);
        mmap.put("sysRecord", sysRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存共享单车记录
     */
    @RequiresPermissions("system:record:edit")
    @Log(title = "共享单车记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysRecord sysRecord)
    {
        return toAjax(sysRecordService.updateSysRecord(sysRecord));
    }

    /**
     * 删除共享单车记录
     */
    @RequiresPermissions("system:record:remove")
    @Log(title = "共享单车记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysRecordService.deleteSysRecordByIds(ids));
    }
}
