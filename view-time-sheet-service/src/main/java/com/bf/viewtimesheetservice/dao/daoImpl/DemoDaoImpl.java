package com.bf.viewtimesheetservice.dao.daoImpl;

import com.bf.viewtimesheetservice.dao.DemoDao;
import com.bf.viewtimesheetservice.entity.DemoEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.management.Query;

@Component
public class DemoDaoImpl implements DemoDao {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void saveDemo(DemoEntity demoEntity) {
        mongoTemplate.save(demoEntity);
    }

    @Override
    public void removeDemo(Long id) {
        mongoTemplate.remove(id);
    }

    @Override
    public void updateDemo(DemoEntity demoEntity) {
        System.out.println("not yet");
    }

    @Override
    public DemoEntity findDemoById(Long id) {
//        Query query = new Query(Criteria.where("id").is(id));
//        DemoEntity demoEntity = mongoTemplate.findOne(query, DemoEntity.class);
        return null;
    }

}
