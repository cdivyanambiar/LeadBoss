package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.model.Email;
import com.example.demo.repository.EmailRepository;
@Service
public class EmailService 
{
	@Autowired
	private EmailRepository emailRepository;

	private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) 
    {
        this.javaMailSender = javaMailSender;
    }

    public Email sendMail(Email email) 
    {    	
    	SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(email.getTo());
        mailMessage.setSubject(email.getSubject());
        mailMessage.setText(email.getMessage());

        mailMessage.setFrom("sampl@example.com");

        javaMailSender.send(mailMessage);
        
        return emailRepository.save(email);
        
    }
}
