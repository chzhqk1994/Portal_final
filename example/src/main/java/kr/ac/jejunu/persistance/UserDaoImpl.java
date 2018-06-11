package kr.ac.jejunu.persistance;

import kr.ac.jejunu.domain.LoginDTO;
import kr.ac.jejunu.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Inject
    private SqlSession sqlSession;

    private static final String NAMESPACE = "kr.ac.jejunu.mapper.UserMapper";

//    로그인 처리
    @Override
    public User login(LoginDTO loginDTO) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".login", loginDTO);
    }

    //    회원가입 처리
    @Override
    public void register(User user) throws Exception {
        sqlSession.insert(NAMESPACE + ".register", user);
    }
}
