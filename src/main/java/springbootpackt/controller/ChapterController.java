package springbootpackt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import springbootpackt.model.Chapter;
import springbootpackt.repository.ChapterRepository;

@RestController
@RequestMapping("chapters")
public class ChapterController {

    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @GetMapping
    public Flux<Chapter> getChapters() {

        return this.chapterRepository.findAll();
    }
}
