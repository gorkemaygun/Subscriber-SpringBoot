package com.win2020.subscriberlist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//Designates this class as a Controller
@Controller
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    // Tells our application what template to return at a specific URL
    @GetMapping
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }

    private Subscriber subscriber;

    @PostMapping
    public String addNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
                subscriber.getUserName(), subscriber.getSignedUp()));

        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/result";

    }

}