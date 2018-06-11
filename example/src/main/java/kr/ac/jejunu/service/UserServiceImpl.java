package kr.ac.jejunu.service;

import kr.ac.jejunu.domain.LoginDTO;
import kr.ac.jejunu.domain.User;
import kr.ac.jejunu.persistance.UserDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDAO;

//    로그인 처리
    @Override
    public User login(LoginDTO loginDTO) throws Exception {
        return userDAO.login(loginDTO);
    }

    @Override
    public void register(User user) throws Exception {
        userDAO.register(user);
    }


}