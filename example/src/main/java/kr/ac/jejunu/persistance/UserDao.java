package kr.ac.jejunu.persistance;

import kr.ac.jejunu.domain.LoginDTO;
import kr.ac.jejunu.domain.User;

public interface UserDao {

    public User login(LoginDTO loginDTO) throws Exception;
}
