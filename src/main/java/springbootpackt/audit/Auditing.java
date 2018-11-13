package springbootpackt.audit;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class Auditing {

    @Around("execution(* springbootpackt.service.ImageService.findOneImage(..))")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        log.info("Aspect @Around triggered: {}", pjp);
        return pjp.proceed();
    }

    @Around("execution(* springbootpackt.controller.ChapterController.getChapters())")
    public Object logAroundGetChapters(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Aspect @Around triggered for getChapters endpoint [{}]", joinPoint);
        return joinPoint.proceed();
    }

}
