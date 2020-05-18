package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String phone_num;
    private String position;

    @Builder
    public PostsSaveRequestDto(String phone_num, String position){
        this.phone_num = phone_num;
        this.position = position;
    }

    public Posts toEntity(){
        return Posts.builder()
                .phone_num(phone_num)
                .position(position)
                .build();
    }
}
