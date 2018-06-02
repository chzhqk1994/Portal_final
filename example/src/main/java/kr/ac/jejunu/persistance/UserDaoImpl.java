package kr.ac.jejunu.persistance;

import kr.ac.jejunu.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Inject
    SqlSession sqlSession;

    private static final String NAMESPACE = "kr.ac.jejunu.mapper.MemberMapper";

    @Override
    public void insertMember(User user) {
        sqlSession.insert(NAMESPACE + ".insertMember", user);
    }

    @Override
    public User readMember(String userid) throws Exception {
        return (User) sqlSession.selectOne(NAMESPACE + ".selectMember", userid);
    }

    @Override
    public User readWithPW(String userid, String password) throws Exception {
        Map<String, Object> paraMap = new HashMap<String, Object>();
        paraMap.put("userid", userid);
        paraMap.put("userpw", password);

        return sqlSession.selectOne(NAMESPACE + ".readWithPW", paraMap);
    }
}
