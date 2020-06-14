package daelim.lnl.dlms.web;

import daelim.lnl.dlms.domain.posts.LockersRepository;
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
    private final LockersRepository lockersRepository;

    // login 페이지

    @GetMapping("/login")
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
    public String cancel(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "cancel";
    }

    @GetMapping("/dayChange")
    public String dayChange(){
        return "dayChange";
    }

    @GetMapping("/member")
    public String member(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "member";
    }

    // API 페이지
    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("posts", dto);

        return "cancel";
    }

    // 모바일 페이지
    @GetMapping("/u")
    public String u_main(){
        return "u_main";
    }

    @GetMapping("/u_reserve")
    public String u_reserve(Model model){
        model.addAttribute("lockers1",lockersRepository.findByIdxBetween(1));
        model.addAttribute("lockers21",lockersRepository.findByIdxBetween(21));
        model.addAttribute("lockers41",lockersRepository.findByIdxBetween(41));
        model.addAttribute("lockers61",lockersRepository.findByIdxBetween(61));
        model.addAttribute("lockers81",lockersRepository.findByIdxBetween(81));
        return "u_reserve";
    }

    @GetMapping("/u_check")
    public String u_check(){
        return "u_check";
    }

    @GetMapping("/u_question")
    public String u_question(){
        return "u_question";
    }

    @GetMapping("/u_withdraw")
    public String u_withdraw(){
        return "u_withdraw";
    }

    @GetMapping("/u_popup/{idx}")
    public String u_popup(@PathVariable Long idx,Model model){

        model.addAttribute("lockers",lockersService.findByIdx(idx));

        return "u_popup";
    }

    @GetMapping("/u_complete")
    public String u_complete(){
        return "u_complete";
    }
}
