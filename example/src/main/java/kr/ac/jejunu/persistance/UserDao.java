package kr.ac.jejunu.persistance;

import kr.ac.jejunu.domain.User;

public interface UserDao {

    public void insertMember(User user); // 회원 추가

    public User readMember(String userid) throws Exception;

    public User readWithPW(String userid, String password) throws Exception;
}
