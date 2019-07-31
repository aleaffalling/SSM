package com.aLeaf.service.serviceImpl;

import com.aLeaf.dao.UserMapper;
import com.aLeaf.entity.User;
import com.aLeaf.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User verifyUser(User user) {
        return userMapper.selectByPrimaryKey(user.getU_id());
    }

    @Override
    public User selectUserByid(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
