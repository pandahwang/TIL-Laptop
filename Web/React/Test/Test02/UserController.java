package Web.React.Test.Test02;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping(value = "/login")

    public String login() {

        // 로그인

    }

    @GetMapping(value = "/allUser")

    public String allUser() {

        // 전체회원조회

    }

    @PostMapping(value = "/regist")

    public String regist() {

        // 회원가입

    }

    @GetMapping(value = "/mypage")

    public String mypage() {

        // 마이페이지

    }

    @PostMapping(value = "/modify")

    public String modify() {

        // 정보수정

    }

    @GetMapping(value = "/remove")

    public String remove() {

        // 회원탈퇴

    }

}
