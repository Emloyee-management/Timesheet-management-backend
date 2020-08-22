package com.bf.viewtimesheetservice;

import com.bf.viewtimesheetservice.dao.DemoDao;
import com.bf.viewtimesheetservice.entity.DemoEntity;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ViewTimeSheetServiceApplication.class)
public class SpringBootMongodbApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void saveDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(3L);

        demoDao.saveDemo(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(4L);

        demoDao.saveDemo(demoEntity);
    }

//    @Test
//    public void removeDemoTest() {
//        demoDao.removeDemo(2L);
//    }

    @Test
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();

        demoDao.updateDemo(demoEntity);
    }

    @Test
    public void findDemoByIdTest() {
        DemoEntity demoEntity = demoDao.findDemoById(1L);
        System.out.println(demoEntity);
    }
}
