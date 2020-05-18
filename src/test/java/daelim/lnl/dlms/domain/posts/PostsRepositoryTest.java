package daelim.lnl.dlms.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void post_load(){
        //given
        String phone_num = "01012345678";
        String position = "M134";

        postsRepository.save(Posts.builder()
                .phone_num(phone_num)
                .position(position)
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getPhone_num()).isEqualTo(phone_num);
        assertThat(posts.getPosition()).isEqualTo(position);
    }

    @Test
    public void BaseTimeEntity_regist(){
        //given
        LocalDateTime now = LocalDateTime.of(2020,05,15,0,0,0);
        postsRepository.save(Posts.builder()
                .phone_num("01012345678")
                .position("M134")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>>> createDate="+posts.getCreateDate()+", modifiedDate="+posts.getModifiedDate());

        assertThat(posts.getCreateDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }
}