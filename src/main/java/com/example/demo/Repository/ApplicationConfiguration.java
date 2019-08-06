package com.example.demo.Repository;

import com.example.demo.Model.Image;
import com.example.demo.Model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public Person person()
    {
   return new Person();
    }
    @Bean
    public Image image()
    {
        return new Image();
    }
}
