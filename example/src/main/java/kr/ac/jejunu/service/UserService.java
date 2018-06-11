package kr.ac.jejunu.service;

import kr.ac.jejunu.domain.LoginDTO;
import kr.ac.jejunu.domain.User;

public interface UserService {
    public User login(LoginDTO loginDTO) throws Exception;
}
