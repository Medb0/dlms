package daelim.lnl.dlms.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombok_Test(){
        //given
        int id = 1;
        String phone_num = "01012345678";

        //when
        HelloResponseDto dto = new HelloResponseDto(id, phone_num);

        //then
        assertThat(dto.getId()).isEqualTo(id);
        assertThat(dto.getPhone_num()).isEqualTo(phone_num);
    }

}