package huy.dev;

import java.sql.DriverManager;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tên cơ sở dữ liệu
		String DB_URL = "jdbc:mysql://localhost:3306/shop";
		// Tên người dùng
		String DB_USER = "root";
		// Mật khẩu
		String DB_PASS = "";
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	            System.out.println("Chay thanh cong");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}