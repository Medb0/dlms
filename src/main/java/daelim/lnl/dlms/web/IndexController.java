package daelim.lnl.dlms.web;

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

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

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
}
