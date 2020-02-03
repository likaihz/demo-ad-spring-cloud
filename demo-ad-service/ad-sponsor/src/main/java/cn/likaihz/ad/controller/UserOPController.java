package cn.likaihz.ad.controller;

import cn.likaihz.ad.exception.AdException;
import cn.likaihz.ad.service.IUserService;
import cn.likaihz.ad.vo.CreateUserRequest;
import cn.likaihz.ad.vo.CreateUserResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Li Kai
 */
@Slf4j
@RestController
public class UserOPController {
    private IUserService userService;

    @Autowired
    public UserOPController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request)
            throws AdException {
        log.info("ad-sponsor: createUser -> {}", JSON.toJSONString(request));
        return userService.createUser(request);
    }
}
