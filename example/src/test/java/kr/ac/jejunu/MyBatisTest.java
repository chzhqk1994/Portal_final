package kr.ac.jejunu;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:**/applicationContext.xml"})
public class MyBatisTest { // MyBatis 를 사용하면 try~catch~finally, preparedstatement, resultset 을 직접 작성 하지 않고 코드를 간결하게 짤 수 있다.

    @Inject
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFactory(){
        System.out.println(sqlSessionFactory);
    }

    @Test
    public void testSession(){
        try (SqlSession session = sqlSessionFactory.openSession()){
            System.out.println(session);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
