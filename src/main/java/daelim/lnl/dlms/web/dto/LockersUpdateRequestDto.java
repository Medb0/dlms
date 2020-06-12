package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Lockers;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LockersUpdateRequestDto {
    private Long idx;
    private String position;
    private String price;
    private String status;

    @Builder LockersUpdateRequestDto(Lockers entity){
        this.idx = entity.getIdx();
        this.position = entity.getPosition();
        this.price = entity.getPrice();
        this.status = entity.getStatus();
    }
}
