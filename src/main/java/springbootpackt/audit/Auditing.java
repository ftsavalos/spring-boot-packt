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

        long begin = System.currentTimeMillis();

        // the code above is running before the jointpoint [getChapters() method]
        Object result  = joinPoint.proceed(); // procceed method is invoking the the execution of the jointpoint
        //the code below is running after the joinpoint

        long end = System.currentTimeMillis();
        log.info("Duration of execution of getChapters() is: {}", end - begin);
        return result;
    }

}
