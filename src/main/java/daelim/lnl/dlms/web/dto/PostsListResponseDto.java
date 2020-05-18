package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String phone_num;
    private String position;
    private LocalDateTime createDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.phone_num = entity.getPhone_num();
        this.position = entity.getPosition();
        this.createDate = entity.getCreateDate();
    }
}
