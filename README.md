# Product-services-Test-scripts

For Executing the test scripts require the selenium -java jar files and also selenium standalone server.

Should connect to the local database to execute scripts.

For executing the scripts we need the firefox browser has the version of 45.0 or below that and the remaining jar files versions should be 2.48.

And also set the localhost to 4444 port because the selenium cannot run on different ports.

And also to check the website whether it is connected to the datebase or not the foolowig code is required.

 package productserviceformember;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addingmember {
   public static void main(String[] args){
	   String m="m";
	try{
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "tiger");
    	String s1 = "select first_name from member where userid='"+m+"'";
    	java.sql.Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery(s1);
    	while(rs.next()){
    		String s = rs.getString(1);
    		String s2 = "s";
    		if(s.equals(s2)){
    			System.out.println("Done");
    		}
    		else{
    			System.out.println("fail");
    		}
    	}
    	
    }

