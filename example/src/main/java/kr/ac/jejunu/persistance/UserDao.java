package kr.ac.jejunu.persistance;

import kr.ac.jejunu.domain.LoginDTO;
import kr.ac.jejunu.domain.User;

public interface UserDao {

//    회원가입 처리
    public void register(User user) throws Exception;

//    로그인 처리
    public User login(LoginDTO loginDTO) throws Exception;
}
