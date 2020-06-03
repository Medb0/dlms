package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String stduent_id;
    private String pwd;
    private String name;
    private String phone_num;
    private String position;
    private LocalDateTime createDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.stduent_id = entity.getStduent_id();
        this.pwd = entity.getPwd();
        this.name = entity.getName();
        this.phone_num = entity.getPhone_num();
        this.position = entity.getPosition();
        this.createDate = entity.getCreateDate();
    }
}
