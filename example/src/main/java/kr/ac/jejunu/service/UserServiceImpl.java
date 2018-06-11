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

    @Override
    public User login(LoginDTO loginDTO) throws Exception {
        return userDAO.login(loginDTO);
    }
}