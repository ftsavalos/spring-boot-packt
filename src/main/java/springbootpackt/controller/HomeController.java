package springbootpackt.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import springbootpackt.service.ImageService;

import java.io.IOException;

@RestController
public class HomeController {

    private static final String BASE_PATH = "/images";
    private static final String FILENAME = "{filename:.+}";

    private final ImageService imageService;

    public HomeController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping(value = BASE_PATH + "/" + FILENAME + "/raw", produces = MediaType.IMAGE_JPEG_VALUE)
    public Mono<ResponseEntity<?>> oneRawImage(@PathVariable String filename) {
        return imageService
                .findOneImage(filename)
                .map(resource -> {
                    try {
                        return ResponseEntity
                                .ok()
                                .contentLength(resource.contentLength())
                                .body(new InputStreamResource(resource.getInputStream()));
                    } catch (IOException e) {
                        return ResponseEntity.badRequest().body("Couldn't find: " + filename + " => " + e.getMessage());
                    }
                });

    }

}
