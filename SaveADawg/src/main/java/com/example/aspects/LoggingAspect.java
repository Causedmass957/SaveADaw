package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.example.util.MyLogger;

@Aspect
@Component
public class LoggingAspect {
	
	//Logging the return of CredentialsRepo
    @AfterReturning(pointcut = "execution(* com.example.repositories.CredentialsRepo.*(..))", returning = "result")
    public void logAfterCredentialsRepo(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the CredentialsRepo
    @AfterThrowing(pointcut = "execution(* com.example.repositories.CredentialsRepo.*(..))", throwing = "error")
    public void logErrorCredentialsRepo(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of CredentialsService
    @AfterReturning(pointcut = "execution(* com.example.services.CredentialsServiceImpl.*(..))", returning = "result")
    public void logAfterCredentialsService(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the CredentialsService
    @AfterThrowing(pointcut = "execution(* com.example.services.CredentialsServiceImpl.*(..))", throwing = "error")
    public void logErrorCredentialsService(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of UserRepo
    @AfterReturning(pointcut = "execution(* com.example.UserRepo.*(..))", returning = "result")
    public void logAfterUserRepo(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the UserRepo
    @AfterThrowing(pointcut = "execution(* com.example.repositories.UserRepo.*(..))", throwing = "error")
    public void logErrorUserRepo(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of UserService
    @AfterReturning(pointcut = "execution(* com.example.services.UserServiceImpl.*(..))", returning = "result")
    public void logAfterUserService(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the UserService
    @AfterThrowing(pointcut = "execution(* com.example.services.UserServiceImpl.*(..))", throwing = "error")
    public void logErrorUserService(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of UserController
    @AfterReturning(pointcut = "execution(* com.example.controllers.UserController.*(..))", returning = "result")
    public void logAfterUserController(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the UserController
    @AfterThrowing(pointcut = "execution(* com.example.controllers.UserController.*(..))", throwing = "error")
    public void logErrorUserController(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of PostRepo
    @AfterReturning(pointcut = "execution(* com.example.repositories.PostRepo.*(..))", returning = "result")
    public void logAfterPostRepo(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the PostRepo
    @AfterThrowing(pointcut = "execution(* com.example.repositories.PostRepo.*(..))", throwing = "error")
    public void logErrorPostRepo(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of PostService
    @AfterReturning(pointcut = "execution(* com.example.services.PostServiceImpl.*(..))", returning = "result")
    public void logAfterPostService(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the PostService
    @AfterThrowing(pointcut = "execution(* com.example.services.PostServiceImpl.*(..))", throwing = "error")
    public void logErrorPostService(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of PostControllers
    @AfterReturning(pointcut = "execution(* com.example.controllers.PostController.*(..))", returning = "result")
    public void logAfterPostController(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the PostControllers
    @AfterThrowing(pointcut = "execution(* com.example.controllers.PostController.*(..))", throwing = "error")
    public void logErrorPostController(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }
}
