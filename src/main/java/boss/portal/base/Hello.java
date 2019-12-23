package boss.portal.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xxf123 on 2019/12/23.
 */
@Controller
public class Hello {
    @RequestMapping
    public String hello(){
        System.out.println("hello world 你好设计界");
        return "fjosdf来电订购数量";
    }
}
