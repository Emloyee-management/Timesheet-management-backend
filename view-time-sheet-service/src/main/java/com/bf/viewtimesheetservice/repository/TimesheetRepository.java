package com.bf.viewtimesheetservice.repository;

import com.bf.viewtimesheetservice.entity.Timesheet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TimesheetRepository extends MongoRepository<Timesheet, String> {
    List<Timesheet> findByUserId(String userId);

//    @Query(value="{'_id':{'$ne':id}}")
//    Timesheet findByShabiId(String id);

}

