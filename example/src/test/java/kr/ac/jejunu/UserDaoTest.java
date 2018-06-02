package kr.ac.jejunu;

import kr.ac.jejunu.domain.User;
import kr.ac.jejunu.persistance.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:**/applicationContext.xml"})
public class UserDaoTest {

    @Inject
    private UserDao userDao;

    @Test
    public void testInsertUser() {
        User user = new User();

        user.setUserId("song");
        user.setUserPassword("1234");
        user.setUserName("hyunwoo");

        userDao.insertMember(user);
    }

    @Test
    public void testReadMember() throws Exception {
        userDao.readMember("song");
    }

    @Test
    public void testReadWithPW() throws Exception {
        userDao.readWithPW("song", "1234");
    }
}
