package com.bf.viewtimesheetservice.controller;

import com.bf.viewtimesheetservice.entity.Timesheet;
import com.bf.viewtimesheetservice.service.EditTimeSheetService;
import com.bf.viewtimesheetservice.service.TimesheetService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Time;
import java.util.List;

@RestController
public class TimesheetController {

    @Resource
    private TimesheetService service;

    @Resource
    private EditTimeSheetService editTimeSheetService;

    @Resource
    private HttpServletRequest request;


    @RequestMapping("/timesheet/{userId}")
    public @ResponseBody
    List<Timesheet> findTimesheets(@PathVariable(value = "userId") String userId) {
        List<Timesheet> timesheets = service.findTimesheetByUserId(userId);
        return timesheets;
    }

    @RequestMapping("/getOneTimeSheet")
    Timesheet getOneTimeSheet(@RequestParam("id") String id) {
        return service.findTimeSheetBy_Id(id);
    }

    @RequestMapping("/getAllTimeSheet")
    List<Timesheet> getAllTimeSheet() {
        List<Timesheet> timesheets = service.findAllTimeSheet();
        return timesheets;
    }

    @RequestMapping("/editComment")
    boolean editComment(@RequestParam("id") String id, @RequestParam("comment") String comment) {
        try {
            editTimeSheetService.updateCommentSheetBySheetId(id, comment);
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @RequestMapping("/createTimeSheet")
    boolean createTimeSheet(@RequestBody Timesheet timeSheet) {
        try {
            service.createTimeSheet(timeSheet);
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

}
