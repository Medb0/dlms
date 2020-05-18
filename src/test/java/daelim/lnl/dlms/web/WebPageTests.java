package daelim.lnl.dlms.web;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WebPageTests {

    @Test
    public void creation(){
        WebPage webPage = new WebPage("Test에서 전달된 값");
        assertThat(webPage.getName(), is("Test에서 전달된 값"));
    }

    public void infomation(){

    }
}