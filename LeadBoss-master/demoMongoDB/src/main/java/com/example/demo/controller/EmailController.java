package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Email;
import com.example.demo.service.EmailService;

@RestController
public class EmailController {

	@Autowired
    private EmailService emailService;

    @PostMapping("/sendmail")
    public String sendmail(@RequestBody Email email) {

        emailService.sendMail(email);

        return "emailsent";
    }
}
