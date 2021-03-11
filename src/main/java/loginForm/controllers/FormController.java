package loginForm.controllers;

import loginForm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@Validated
@RequestMapping("/")
public class FormController {

    @GetMapping("/userForm")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("loginForm");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/userForm")
    public ModelAndView checkValidate(@Validated @ModelAttribute User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("loginForm");
        } else {
            return new ModelAndView("result");
        }

    }
}
