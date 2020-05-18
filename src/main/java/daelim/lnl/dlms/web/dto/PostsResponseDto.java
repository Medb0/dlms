package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String phone_num;
    private String position;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.phone_num = entity.getPhone_num();
        this.position = entity.getPosition();
    }
}
