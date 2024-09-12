package Web.Test.09.12;

public class AOP {

    @Pointcut("execution(* ncs.kh.dao.MembersDAO.*(..))")
    public void perfCheck() {}

    @Around("perfCheck()")
    public void performance(ProceedingJoinPoint jp) {

        long startTime = System.currentTimeMillis();
        Object returnObj = null;

        try { returnObj = jp.proceed(); } 
        catch (Throwable e) { e.printStackTrace(); }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
    
    /*
    org.springframework.aop.AopInvocationException:
    Null return value from advice does not match primitive return type for: 
    public int ncs.kh.dao.MembersDAO.memberOut(java.lang.String,java.lang.String)
    */
    
    /* 
    Jointpoint가 Around인 메서드는 반드시 return type이 있어야 함.
    그러나 AOP 클래스의 performance 메서드에 return type이 없음.
    
    문제에 나온 에러 메세지 원인은
    MembersDAO의 memberOut 메서드는 int type을 return하는데 
    AOP 클래스의 performance 메서드는 return type이 없어서 발생하는 것임.
    
    하지만 MembersDAO의 메서드 중 return type이 int가 아닌 메서드도 있고,
    추후에 어떤 메서드가 추가될지 모름.

    따라서 performance 메서드의 return type을 Object로 바꾸고,
    jp.proceed의 return 값을 받은 returnObj를 return 하도록 수정하면 됨.
    */ 

    @Pointcut("execution(* ncs.kh.dao.MembersDAO.*(..))")
    public void perfCheck() {}

    @Around("perfCheck()")
    public Object performance(ProceedingJoinPoint jp) {

        long startTime = System.currentTimeMillis();
        Object returnObj = null;

        try { returnObj = jp.proceed(); } 
        catch (Throwable e) { e.printStackTrace(); }
        finally {
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
            return returnObj;
        }
    }

}