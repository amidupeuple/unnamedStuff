package com.danyapivovarov.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dpivovar on 04.05.2016.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String getRegistrationForm() {
        return "registration";
    }
}
