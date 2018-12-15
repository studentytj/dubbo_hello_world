package com.test.helloprovider.service.impl;

import com.test.hello.api.IUserService;

/**
 * @author ytj
 * @date 2018/12/15
 */
public class UserServiceImpl implements IUserService {
    public String sayHi(String name) {
        return "Hello World ! " + name;
    }
}
