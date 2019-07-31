package com.aLeaf.web;

import com.aLeaf.entity.User;
import com.aLeaf.exception.customException;
import com.aLeaf.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller("/UserController")
public class userController {

    @Autowired
    userService userService;

    @RequestMapping("/UserLogin")
    public ModelAndView UserLogin(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, HttpSession session) throws customException {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            List<FieldError> list = bindingResult.getFieldErrors();
            for (ObjectError objectError : list) {
                // 输出错误信息
                throw new customException(objectError.getDefaultMessage());
            }
        } else {
            if(userService.verifyUser(user)!=null){
                session.setAttribute("username",userService.verifyUser(user).getU_name());
                modelAndView.addObject("message","登录成功");
                modelAndView.setViewName("success");
            }else{
                modelAndView.addObject("message","登录失败");
                modelAndView.setViewName("false");
            }
        }
        return modelAndView;
    }

    @RequestMapping("/REST/{id}")
    @ResponseBody
    public User Json(@PathVariable("id") Integer id){
        return userService.selectUserByid(id);
    }

}
