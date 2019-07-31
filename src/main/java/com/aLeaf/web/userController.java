package com.aLeaf.web;

import com.aLeaf.entity.User;
import com.aLeaf.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class userController {

    @Autowired
    userService userService;

    @RequestMapping("UserLogin")
    public ModelAndView UserLogin(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            List<FieldError> list = bindingResult.getFieldErrors();
            for (ObjectError objectError : list) {
                // 输出错误信息
                System.out.println(objectError.getDefaultMessage());
                //...
            }
        } else {
            System.out.println("No Error");
            //userService.verifyUser(user);
            //...
        }
        return modelAndView;
    }

}
