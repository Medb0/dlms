package daelim.lnl.dlms.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String phone_num;
    private String position;

    @Builder
    public PostsUpdateRequestDto(String phone_num, String position) {
        this.phone_num = phone_num;
        this.position = position;
    }
}
