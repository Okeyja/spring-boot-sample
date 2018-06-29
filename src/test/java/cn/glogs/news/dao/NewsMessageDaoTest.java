package cn.glogs.news.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsMessageDaoTest {

    @Autowired
    NewsMessageDao newsMessageDao;

    @Test
    public void selectMessage(){
        System.out.println(newsMessageDao.selectMessageById(1));
    }

    @Test
    public void listAll(){
        System.out.println(newsMessageDao.selectAllMessages());
    }
}
