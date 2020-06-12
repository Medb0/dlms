package daelim.lnl.dlms.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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

    public void update(String position){
        this.position = position;

    }

    public void save(Lockers positionData) {
        this.status = positionData.getStatus();
    }
}
