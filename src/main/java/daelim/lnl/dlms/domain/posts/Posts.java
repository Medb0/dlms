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

    @Column(nullable = false, unique = true)
    private String stduent_id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String name;

    @Column(length = 11 , nullable = false)
    private String phone_num;

    @Column(length = 50)
    private String position;

    @Builder
    public Posts(String stduent_id, String pwd, String name , String phone_num, String position){
        this.stduent_id = stduent_id;
        this.pwd = pwd;
        this.name = name;
        this.phone_num = phone_num;
        this.position = position;
    }

    public void update(String position){
        this.position = position;
    }
}
