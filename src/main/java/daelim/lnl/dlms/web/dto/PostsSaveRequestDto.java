package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String stduent_id;
    private String pwd;
    private String name;
    private String phone_num;
    private String position;

    @Builder
    public PostsSaveRequestDto(String stduent_id, String pwd, String name, String phone_num, String position){
        this.stduent_id = stduent_id;
        this.pwd = pwd;
        this.name = name;
        this.phone_num = phone_num;
        this.position = position;
    }

    public Posts toEntity(){
        return Posts.builder()
                .stduent_id(stduent_id)
                .pwd(pwd)
                .name(name)
                .phone_num(phone_num)
                .position(position)
                .build();
    }
}
