package ro.itschool.personalizedgreeting.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GreetingService {



    public String getGreeting(String name) {
        return "Hello " + name + "!";
    }
}
