package com.bf.viewtimesheetservice.service;

import com.bf.viewtimesheetservice.entity.Timesheet;
import com.bf.viewtimesheetservice.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TimesheetService {
    @Autowired
    TimesheetRepository timesheetRepository;

    @Resource
    public void setSessionRepository(TimesheetRepository tr) {
        this.timesheetRepository = tr;
    }

    public List<Timesheet> findTimesheetByUserId(String userId) {
        return timesheetRepository.findByUserId(userId);
    }

    public Timesheet findTimeSheetBy_Id(String id) {
        return timesheetRepository.findByShabiId(id);
    }

    public List<Timesheet> findAllTimeSheet() {
        return timesheetRepository.findAll();
    }

}
