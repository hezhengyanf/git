package text;

 
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import entity.Bu;
 
import entity.Yuan;
import service.BuService;
import service.YuanService;
import service.impl.BuServiceImpl;
import service.impl.YuanServiceImpl;
 

 

public class Text {
@Test
public void Num1() {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    BuService a = (BuService)ctx.getBean("buService");
		List<Bu>b=null;
		b=a.Cha1();
		for(Bu n:b) {
			System.out.println(""+n.getBumenTableaddress()+"\t"+n.getBumenTabledirector()+"\t"+n.getBumenTableid()+"\t"+n.getBumenTablename()+"\t");	
		  for(Yuan z:n.getList()) {
			  System.out.println(z.getBonus()+z.getBumenTableId()+z.getId()+z.getWage()+z.getWord()+z.getYuangongname()+z.getBumentable()+z.getEntryTime());	
		  }
		
		}
		System.out.println("\t");
		for(Bu n:b){
			for(Yuan z:n.getList()) {
				  System.out.println(z.getBonus()+z.getBumenTableId()+z.getId()+z.getWage()+z.getWord()+z.getYuangongname()+z.getBumentable()+z.getEntryTime());
			}
					System.out.println(""+n.getBumenTableaddress()+"\t"+n.getBumenTabledirector()+"\t"+n.getBumenTableid()+"\t"+n.getBumenTablename()+"\t");	
			  		
			}	
}
 

@Test
public void Mo() {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	YuanService a = (YuanService)ctx.getBean("yuanService");
	List<Yuan>b=null;
	 b=a.getMo1("ְ", null);
	for(Yuan z:b){
		 
			  System.out.println(z.getBonus()+z.getBumenTableId()+z.getId()+z.getWage()+z.getWord()+z.getYuangongname()+z.getBumentable()+z.getEntryTime());					 	  		
		}	
}

}
 

