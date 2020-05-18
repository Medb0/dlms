package daelim.lnl.dlms.web;

import daelim.lnl.dlms.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("id") int id, @RequestParam("phone_num") String phone_num){
        return new HelloResponseDto(id, phone_num);
    }
}
