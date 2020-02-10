package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.Test;
  
public class Zeng {
private static final Logger log = Logger.getLogger(Zeng.class);
 
	 
	
	@Test 
	public void afterReturning(JoinPoint jp, RuntimeException e) {
	    log.info(jp.getSignature().getName()
	            + "��������ֵ" + e +",�޸��쳣�׳���ǿ���");
	}
}
