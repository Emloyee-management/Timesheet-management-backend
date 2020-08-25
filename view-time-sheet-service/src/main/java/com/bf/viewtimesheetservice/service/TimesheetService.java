package com.bf.viewtimesheetservice.service;

import com.bf.viewtimesheetservice.entity.Timesheet;
import com.bf.viewtimesheetservice.repository.TimesheetRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TimesheetService {
    @Autowired
    TimesheetRepository timesheetRepository;

    @Resource
    MongoTemplate template;

    @Resource
    public void setSessionRepository(TimesheetRepository tr) {
        this.timesheetRepository = tr;
    }

    public List<Timesheet> findTimesheetByUserId(String userId) {
        return timesheetRepository.findByUserId(userId);
    }

    public Timesheet findTimeSheetBy_Id(String id) {
        ObjectId oid = new ObjectId(id);
//        System.out.println(oid.getClass() + oid.toString());
        Query query = new Query(Criteria.where("_id").is(oid));
        return template.find(query, Timesheet.class).get(0);
    }

    public List<Timesheet> findAllTimeSheet() {
        return timesheetRepository.findAll();
    }

    public boolean createTimeSheet(Timesheet timesheet) {
        try {
             timesheetRepository.save(timesheet);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
//    Timesheet findById(String id) {
//        BasicDBObject query = new BasicDBObject();
//        query.put("_id", new ObjectId(id));
//        DBCollection users = db.getCollection(tableName);
//
//        Timesheet res = timesheetRepository.findOne(query);
//        return res;
//    }

}
