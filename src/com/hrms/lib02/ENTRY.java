package com.hrms.lib02;
import org.openqa.selenium.WebDriver;

public class ENTRY {
	 public WebDriver driver;
	   //To provide Test Data & Objects related to whole application
	   //**************TestData
	   public String url = "http://183.82.103.245/nareshit/login.php";
	   public String un = "nareshit";
	   public String pw = "nareshit";
	   public String efn = "suresh";
	   public String eln = "selenium";

	   //**************Objects/Elements
	   public String txt_loginname = "txtUserName";
	   public String txt_password = "txtPassword";
	   public String btn_login = "Submit";
	   public String link_logout = "Logout";
	   public String frm_empinfo = "rightMenu";
	   public String btn_Add = "//input[@value='Add']";
	   public String txt_efn = "txtEmpFirstName";
	   public String txt_eln = "txtEmpLastName";
	   public String btn_save = "btnEdit";
	}


