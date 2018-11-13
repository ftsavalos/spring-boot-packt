package springbootpackt.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springbootpackt.model.Image;

@RestController("/images")
@Slf4j
public class ImageController {

    @GetMapping
    public Flux<Image> getAllImages() {
        return Flux.just(
                new Image(1, "test1.jpeg"),
                new Image(2, "test2.jpeg"),
                new Image(3, "test3.jpeg")
        );
    }

    @PostMapping
    public Mono<Void> insertImage(@RequestBody Flux<Image> images) {
        return images
                .map(image -> {
                    log.info("Your image will soon be saved {}", image);
                    return image;
                })
                .then();
    }

}
