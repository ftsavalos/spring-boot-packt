package springbootpackt.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import springbootpackt.model.Chapter;

@Repository
public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
