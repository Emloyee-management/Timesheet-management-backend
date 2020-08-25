package com.bf.viewtimesheetservice.controller;

import com.bf.viewtimesheetservice.entity.Timesheet;
import com.bf.viewtimesheetservice.service.EditTimeSheetService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: Yang Yuan
 * @Time: 2020/8/22
 */

@RestController
public class EditTimeSheetController {
    @Resource
    EditTimeSheetService service;

    /**
     * @description: Sample request: /setTime with request body
     * @param: [timeSheet]
     * @return: com.bf.viewtimesheetservice.entity.Timesheet
     * @date: 2020/8/22
     */
    @RequestMapping("/setTime")
    Timesheet updateTimeSheet(@RequestBody Timesheet timeSheet) {
        return service.updateTimeSheetBySheetId(timeSheet);
    }

    @RequestMapping("/setApproved/{id}")
    Timesheet updateTimeSheetApproved(@PathVariable(value = "id") String timesheetId) {
        System.out.println(timesheetId);
        return service.updateApprovedSheetBySheetId(timesheetId);
    }
}
