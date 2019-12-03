package com.techcaresinc.technoreply.controllers;

import com.techcaresinc.technoreply.beans.Mail;
import com.techcaresinc.technoreply.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class TechController {
    @Autowired
    private MailService service;

    /*.......................techno-reply post service.............................*/
    @RequestMapping(value = "/post_service", method = RequestMethod.POST)
    public ResponseEntity post_service(@RequestBody Mail mail
            , UriComponentsBuilder builder) {

        service.sendMail(mail);

        return new ResponseEntity(mail, HttpStatus.OK);
    }
}