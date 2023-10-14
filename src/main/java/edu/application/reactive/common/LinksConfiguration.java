package edu.application.reactive.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.Queue;

@Configuration
public class LinksConfiguration {

    @Bean
    Queue<String> linksQueue() {
        Queue<String> result = new LinkedList<>();
        String base = "qwertyuiopasdfghjklzxcvbnm1234567890";
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a < base.length(); a++) {
            for (int b = 0; b < base.length(); b++) {
                for (int c = 0; c < base.length(); c++) {
                    builder.append(base.charAt(a)).append(base.charAt(b)).append(base.charAt(c));
                    result.add(builder.toString());
                    builder.delete(0,builder.length());
                }
            }
        }
        return result;
    }
}
