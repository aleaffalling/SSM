package com.aLeaf.service;

import com.aLeaf.entity.User;

public interface userService {
    User verifyUser(User user);

    User selectUserByid(Integer id);
}
