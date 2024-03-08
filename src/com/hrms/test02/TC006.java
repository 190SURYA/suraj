package com.hrms.test02;

import org.testng.annotations.Test;

import com.hrms.lib02.INEXIT;

public class TC006 {
	//public static void main(String args[]) {
	   @Test
	   public void tc002() {
	       //Test Steps
	   INEXIT g = new INEXIT();
	   g.openApplication();
	   g.login();
	   g.enterFrame();
	   g.addNewEmp();
	   g.exitFrame();
	   g.logout();
	   g.closeApplication();


}
}