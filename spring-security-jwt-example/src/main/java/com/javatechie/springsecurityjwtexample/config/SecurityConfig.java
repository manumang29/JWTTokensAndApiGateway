package com.javatechie.springsecurityjwtexample.config;

import com.javatechie.springsecurityjwtexample.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigureAdapter{
    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    protected void configure(AuthenticationManagerBuilder managerBuilder) throws Exception  {
        managerBuilder.userDetailsService(customUserDetailsService);

    }

}
