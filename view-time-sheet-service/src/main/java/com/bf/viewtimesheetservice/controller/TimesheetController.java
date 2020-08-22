package com.bf.viewtimesheetservice.controller;

import com.bf.viewtimesheetservice.entity.Timesheet;
import com.bf.viewtimesheetservice.service.TimesheetService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class TimesheetController {

    @Resource
    private TimesheetService service;

    @Resource
    private HttpServletRequest request;

    @RequestMapping("/timesheet/{userId}")
    public @ResponseBody
    List<Timesheet> findTimesheets(@PathVariable(value = "userId") String userId) {
        List<Timesheet> timesheets = service.findTimesheetByUserId(userId);
        return timesheets;
    }
}
