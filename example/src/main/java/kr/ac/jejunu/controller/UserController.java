package kr.ac.jejunu.controller;

import kr.ac.jejunu.domain.LoginDTO;
import kr.ac.jejunu.domain.User;
import kr.ac.jejunu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.WebUtils;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Inject
    private UserService userService;

    // 회원가입 페이지
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerGET() {

        return "user/register";
    }

    // 회원가입 처리
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPOST(User user, RedirectAttributes redirectAttributes) throws Exception {
        userService.register(user);
        redirectAttributes.addFlashAttribute("msg", "REGISTERED");

        return "redirect:/user/login";
    }

    // 로그인 페이지
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(@ModelAttribute("loginDTO") LoginDTO loginDTO) {

        return "user/login";
    }

    // 로그인 처리
    @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
    public void loginPOST(LoginDTO loginDTO, HttpSession session, Model model) throws Exception {

//        아이디 비번 확인
        User user = userService.login(loginDTO);

//        틀릴 경우
        if (user == null) {
            return;
        }

//        맞을 경우
        model.addAttribute("user", user);
    }

    // 로그아웃 처리
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request,
                         HttpServletResponse response, HttpSession session) throws Exception {

//        session 에 저장된 login 값
        Object object = session.getAttribute("login");
        if (object != null) {
            User user = (User) object;

//            session 정보 초기화
            session.removeAttribute("login");
            session.invalidate();
//            Cookie loginCookie = WebUtils.getCookie(request, "loginCookie");
//            if (loginCookie != null) {
//                loginCookie.setPath("/");
//                loginCookie.setMaxAge(0);
//                response.addCookie(loginCookie);
//                userService.keepLogin(user.getUid(), session.getId(), new Date());
//            }
        }

        return "user/logout";
    }

}
