package mapleTest;

import com.maple.MapleStoryApplication;
import com.maple.common.model.UUID;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: test01
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/26 12:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MapleStoryApplication.class)
public class test01 {

    @Autowired
    private UUID uuid;
    @Test
    public void testUUID(){
        System.out.println("机器id: "+uuid.getDatacenterId());
    }
}
