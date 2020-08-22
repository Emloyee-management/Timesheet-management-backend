package com.bf.viewtimesheetservice.repository;

import com.bf.viewtimesheetservice.entity.Timesheet;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @description: Repository for editing time sheet operations
 * @author: Yang Yuan
 * @Time: 2020/8/22
 */
public interface EditTimeSheetRepository extends MongoRepository<Timesheet, String> {

}
