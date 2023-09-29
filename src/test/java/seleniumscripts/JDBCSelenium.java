package seleniumscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCSelenium {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		String dburl = "jdbc:mysql://localhost:3306/selenium_test";
		String username = "root";
		String password = "Sindhu13501!@2";
		
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps = con.prepareStatement("insert into web_test values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		ps.executeUpdate();
		
		
		
		
		
		con.close();
		
		
		
		
		
		
		
		

	}

}

		