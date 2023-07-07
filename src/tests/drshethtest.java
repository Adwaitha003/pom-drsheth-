package tests;


import org.testng.annotations.Test;

import basepkg.bclass;
import pages.accountcreate;
import pages.buy;
import pages.registrationpage;

public class drshethtest extends bclass{
@Test
public void test()  throws Exception{
	accountcreate ob =new accountcreate(driver);
	ob.account();
	
	registrationpage ob1=new registrationpage(driver);
	ob1.register("Adwaitha","Chandran","adwaithac3@gmail.com","hello123@");
	
	buy ob2=new buy(driver);
	ob2.pro("sunscreen");
	ob2.cr();
}
}

