package daelim.lnl.dlms.web.dto;

import daelim.lnl.dlms.domain.posts.Lockers;
import lombok.Getter;

@Getter
public class LockersListResponseDto {
    private Long idx;
    private String position;
    private String price;
    private String status;

    public LockersListResponseDto(Lockers entity){
        this.idx = entity.getIdx();
        this.position = entity.getPosition();
        this.price = entity.getPrice();
        this.status = entity.getStatus();
    }
}
