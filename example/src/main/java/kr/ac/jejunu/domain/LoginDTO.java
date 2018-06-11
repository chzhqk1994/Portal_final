package kr.ac.jejunu.domain;


//DTO : 화면에서 전달되는 데이터를 수정하는 용도
//아이디, 비밀번호 등등
public class LoginDTO {

    private String uid;
    private String upw;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpw() {
        return upw;
    }

    public void setUpw(String upw) {
        this.upw = upw;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "uid='" + uid + '\'' +
                ", upw='" + upw + '\'' +
                '}';
    }
}
