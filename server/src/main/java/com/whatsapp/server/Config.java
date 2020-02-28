package com.whatsapp.server;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring configuration.
 * =====================
 *
 * Contains server components configuration beans.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Configuration
@EnableSwagger2
public class Config {
    /**
     * Swagger config.
     *
     * @return Swagger config docket.
     */
    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.any())
                .build();
    }

    /**
     * Model mapper.
     *
     * @return ModelMapper instance.
     */
    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
}
