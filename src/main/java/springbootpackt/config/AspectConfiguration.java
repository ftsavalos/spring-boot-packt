package springbootpackt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springbootpackt.audit.Auditing;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfiguration {

    @Bean
    public Auditing audit() {
        return new Auditing();
    }
}