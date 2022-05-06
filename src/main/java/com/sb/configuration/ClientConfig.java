package com.sb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Title: ClientConfig</p>
 *
 * <p>Description: Client config</p>
 *
 * <p>Copyright: copyright (c) 2022</p>
 * <p>Company: Perosnal</p>
 *
 * @author Shankar Bodakunta
 */
@Configuration
public class ClientConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
