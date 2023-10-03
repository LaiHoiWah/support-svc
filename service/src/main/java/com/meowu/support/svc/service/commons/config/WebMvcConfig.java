package com.meowu.support.svc.service.commons.config;

import com.meowu.commons.common.utils.GsonUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport{

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        // gson convert
        GsonHttpMessageConverter gsonConverter = new GsonHttpMessageConverter();
        gsonConverter.setDefaultCharset(StandardCharsets.UTF_8);
        gsonConverter.setGson(GsonUtils.getGson(false, false, true));

        // string convert
        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
        stringConverter.setDefaultCharset(StandardCharsets.UTF_8);

        converters.add(gsonConverter);
        converters.add(stringConverter);
    }

    @Override
    protected void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods(
                    HttpMethod.POST.name(), HttpMethod.GET.name(), HttpMethod.PUT.name(),
                    HttpMethod.PATCH.name(), HttpMethod.DELETE.name(), HttpMethod.OPTIONS.name()
                )
                .maxAge(-1);
    }
}
