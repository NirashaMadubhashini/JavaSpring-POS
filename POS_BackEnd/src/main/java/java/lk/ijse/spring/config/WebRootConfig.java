package java.lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(java.lk.ijse.spring.config.JPAConfig.class)
public class WebRootConfig {

}
