package com.boproject.controller;


import java.io.IOException;
import java.io.InputStream;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/sendEmail.do")
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(method = RequestMethod.POST)
    public String sendEmail(HttpServletRequest request,
                            final @RequestParam CommonsMultipartFile attachFile) {

        // reads form input
        final String emailTo = "barteksarata@gmail.com";
        final String subject = request.getParameter("subject");
        final String yourmailid = request.getParameter("yourmail");
        final String message = request.getParameter("message");

        // for logging
        System.out.println("emailTo: " + emailTo);
        System.out.println("subject: " + subject);
        System.out.println("Your mail id is: "+yourmailid);
        System.out.println("message: " + message);
        System.out.println("attachFile: " + attachFile.getOriginalFilename());

        mailSender.send(new MimeMessagePreparator() {

            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper messageHelper = new MimeMessageHelper(
                        mimeMessage, true, "UTF-8");
                messageHelper.setTo(emailTo);
                messageHelper.setSubject(subject);
                messageHelper.setReplyTo(yourmailid);
                messageHelper.setText(message);
                // determines if there is an upload file, attach it to the e-mail
                String attachName = attachFile.getOriginalFilename();
                if (!attachFile.equals("")) {

                    messageHelper.addAttachment(attachName, new InputStreamSource() {
                        @Override
                        public InputStream getInputStream() throws IOException {
                            return attachFile.getInputStream();
                        }
                    });
                } else {
                    attachFile.transferTo(null);
                }
            }

        });
        //Asercja spowodowana błędem wysyłania maila z aplikacji.
        assert mailSender == null: "Error in adding new mail";
        return "home";
    }

}
