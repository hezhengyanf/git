package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
 
public class Huan {
	private static final Logger log = Logger.getLogger(Huan.class);
	 
	 
	@Test
 
	public Object afterReturning(ProceedingJoinPoint jp) throws Throwable{
		 log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName()
		            + " 方法入参" + Arrays.toString(jp.getArgs()));
		 try {
			 Object result=jp.proceed();
			  log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName()
			            + "方法返回值" + result);
				return result; 
		} catch (Throwable e) {
			// TODO: handle exception
			log.error(jp.getSignature().getName()+"方法发生异常"+e);
			throw e;
		}finally {
			log.info(jp.getSignature().getName()+"方法结束执行");
		}
		
	 	
	}
}
