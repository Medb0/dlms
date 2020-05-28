package daelim.lnl.dlms.domain.posts;

import daelim.lnl.dlms.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Lockers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(length = 50 , nullable = false)
    private String position;

    @Column(length = 50 , nullable = false)
    private String status;

    @Column(length = 50 , nullable = false)
    private String price;

    @Builder
    public Lockers(String position, String status, String price){
        this.position = position;
        this.status = status;
        this.price = price;
    }

    public void update(String position, String status, String price){
        this.position = position;
        this.status = status;
        this.price = price;
    }
}
