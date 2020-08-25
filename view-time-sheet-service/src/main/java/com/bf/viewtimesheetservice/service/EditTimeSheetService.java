package com.bf.viewtimesheetservice.service;

import com.bf.viewtimesheetservice.entity.Timesheet;
import com.bf.viewtimesheetservice.repository.EditTimeSheetRepository;
import com.bf.viewtimesheetservice.repository.TimesheetRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Yang Yuan
 * @Time: 2020/8/22
 */

@Service
public class EditTimeSheetService {
    @Resource
    EditTimeSheetRepository repository;
    @Resource
    TimesheetRepository timesheetRepository;

    @Resource
    TimesheetService service;

    /**
     * @description: Set all required info by time sheet id
     * @param: [timesheet]
     * @return: com.bf.viewtimesheetservice.entity.Timesheet
     * @date: 2020/8/22
     */
    public Timesheet updateTimeSheetBySheetId(Timesheet timesheet) {
//        Timesheet temp = timesheetRepository.findByUserId(timesheet.getUserId()).get(0);
//        temp.setDay1Starttime(timesheet.getDay1Starttime());
//        temp.setDay1Endtime(timesheet.getDay1Endtime());
//
//        temp.setDay2Starttime(timesheet.getDay2Starttime());
//        temp.setDay2Endtime(timesheet.getDay2Endtime());
//
//        temp.setDay3Starttime(timesheet.getDay3Starttime());
//        temp.setDay3Endtime(timesheet.getDay3Endtime());
//
//        temp.setDay4Starttime(timesheet.getDay4Starttime());
//        temp.setDay4Endtime(timesheet.getDay4Endtime());
//
//        temp.setDay5Starttime(timesheet.getDay5Starttime());
//        temp.setDay5Endtime(timesheet.getDay5Endtime());
//
//        temp.setDay6Starttime(timesheet.getDay6Starttime());
//        temp.setDay6Endtime(timesheet.getDay6Endtime());
//
//        temp.setDay7Starttime(timesheet.getDay7Starttime());
//        temp.setDay7Endtime(timesheet.getDay7Endtime());
//
//        temp.setDay1Status(timesheet.getDay1Status());
//        temp.setDay2Status(timesheet.getDay2Status());
//        temp.setDay3Status(timesheet.getDay3Status());
//        temp.setDay4Status(timesheet.getDay4Status());
//        temp.setDay5Status(timesheet.getDay5Status());
//        temp.setDay6Status(timesheet.getDay6Status());
//        temp.setDay7Status(timesheet.getDay7Status());
//
//        temp.setTotalBillingHours(timesheet.getTotalBillingHours());
//        temp.setTotalCompensatedHours(timesheet.getTotalCompensatedHours());

        return repository.save(timesheet);
    }

    public Timesheet updateCommentSheetBySheetId(String id, String comment) {
        Timesheet temp = service.findTimeSheetBy_Id(id);
        System.out.println(temp);
        temp.setComment(comment);
        return repository.save(temp);
    }

    public Timesheet updateApprovedSheetBySheetId(String id) {
        Timesheet temp = service.findTimeSheetBy_Id(id);
        temp.setApprovalStatus("approved");
        return repository.save(temp);
    }
}
