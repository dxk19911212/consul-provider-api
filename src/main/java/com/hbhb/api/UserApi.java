package com.hbhb.api;

import com.hbhb.vo.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author xiaokang
 * @since 2020-09-18
 */
public interface UserApi {

    /**
     * 测试api
     */
    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);

    /**
     * 获取用户列表
     */
    @GetMapping("/user/list")
    List<User> getUserList();
}
