package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
 
public class Huan {
	private static final Logger log = Logger.getLogger(Huan.class);
	 
	 
	@Test
 
	public Object afterReturning(ProceedingJoinPoint jp) throws Throwable{
		 log.info("���� " + jp.getTarget() + " �� " + jp.getSignature().getName()
		            + " �������" + Arrays.toString(jp.getArgs()));
		 try {
			 Object result=jp.proceed();
			  log.info("���� " + jp.getTarget() + " �� " + jp.getSignature().getName()
			            + "��������ֵ" + result);
				return result; 
		} catch (Throwable e) {
			// TODO: handle exception
			log.error(jp.getSignature().getName()+"���������쳣"+e);
			throw e;
		}finally {
			log.info(jp.getSignature().getName()+"��������ִ��");
		}
		
	 	
	}
}
