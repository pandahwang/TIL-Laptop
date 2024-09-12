package ncs.kh.dao;

import org.springframework.stereotype.Repository;
import ncs.kh.dto.MembersDTO;

@Repository
public class MembersDAO {

    public MembersDTO isLoginAvailable(String email, String pw) {
        System.out.println("Login : " + email + " : " + pw);
        return null;
    }

    public boolean isEmailExist(String email) {
        System.out.println("EmailExist : " + email);
        return false;
    }

    public int memberOut(String email, String pw) {
        System.out.println("MemberOut : " + email + " : " + pw);
        return 1;
    }

}

