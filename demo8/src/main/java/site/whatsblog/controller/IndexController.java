package site.whatsblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.whatsblog.pojo.User;
import site.whatsblog.service.UserService;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/5/3 19:05</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public String login() {
        return userService.selectAll().toString();
    }
}
