import java.sql.*;
class Task2{
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","database");
			
			Statement stnt=con.createStatement();
			ResultSet rs=stnt.executeQuery("SELECT * FROM students"+ "WHERE semester=2");
			// System.out.println("SUCCESS..");
			 while(rs.next()){
			 	//int sem=rs.getInt("semester");
			 	System.out.println(rs.getString("roll_num"));
			 	System.out.println(rs.getString("name"));
			 	System.out.println(rs.getInt("batch"));
			 	System.out.println(rs.getString("dept"));
			 	System.out.println(rs.getInt("year"));
			 	System.out.println(rs.getInt("semester"));

			 }

		}catch(Exception e){
			System.out.println(e);
		}
	}
}