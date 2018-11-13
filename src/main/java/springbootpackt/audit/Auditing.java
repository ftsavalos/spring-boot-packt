package springbootpackt.audit;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class Auditing {

    @Before("execution(* springbootpackt.service.ImageService.findOneImage(..))")
    public void log() {
        log.info("auditing triggered");
    }

}
