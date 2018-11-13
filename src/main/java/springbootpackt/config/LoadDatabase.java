package springbootpackt.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import springbootpackt.model.Chapter;
import springbootpackt.repository.ChapterRepository;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
//            Flux.just(new Chapter("Quick Start with Java"), new Chapter("Reactive Web with Spring Boot"), new Chapter("...and more!"))
//                    .flatMap(repository::save)
//                    .subscribe(chapter -> log.info("{}", chapter));
        };
    }

}
