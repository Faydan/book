package com.faydan.book.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfig created with IntelliJ IDEA.
 * User:  faydan
 * Email: fei321457749@126.com
 * Date:  2018-05-02
 * Time:  13:22
 * <p>
 * Describe:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:static/");
    }
}
