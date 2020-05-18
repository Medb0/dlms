package daelim.lnl.dlms.domain.posts;

import daelim.lnl.dlms.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11 , nullable = false)
    private String phone_num;

    @Column(length = 50 , nullable = false)
    private String position;

    @Builder
    public Posts(String phone_num, String position){
        this.phone_num = phone_num;
        this.position = position;
    }

    public void update(String phone_num, String position){
        this.phone_num = phone_num;
        this.position = position;
    }
}
