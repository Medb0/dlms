package daelim.lnl.dlms.web;

import daelim.lnl.dlms.service.posts.LockersService;
import daelim.lnl.dlms.service.posts.PostsService;
import daelim.lnl.dlms.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final LockersService lockersService;

    // login 페이지

    @GetMapping("login")
    public String login(){return "login";}

    // 관리자 페이지
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        model.addAttribute("lockers",lockersService.findAllDesc());
        return "index";
    }
    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/check")
    public String check(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "check";
    }
    @GetMapping("/cancel")
    public String cancel(){
        return "cancel";
    }

    @GetMapping("/dayChange")
    public String dayChange(){
        return "dayChange";
    }

    @GetMapping("/member")
    public String member(){
        return "member";
    }

    // 사용자 페이지
    @GetMapping("/user")
    public String user_main(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "user_main";
    }
    @GetMapping("/user_form")
    public String user_form(){
        return "user_form";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("posts", dto);

        return "user_form2";
    }

    // 모바일 페이지
    @GetMapping("/m")
    public String m_user_main(){
        return "m_user_main";
    }

    @GetMapping("/m_reservation")
    public String m_user_reservation(){
        return "m_user_reservation";
    }

    @GetMapping("/m_check")
    public String m_user_check(){
        return "m_user_check";
    }

    @GetMapping("/m_questions")
    public String m_usesr_questions(){
        return "m_user_questions";
    }

    @GetMapping("/m_withdraw")
    public String m_user_withdraw(){
        return "m_user_withdraw";
    }
}
