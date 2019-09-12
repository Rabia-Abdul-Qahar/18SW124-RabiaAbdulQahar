import java.sql.*;
class Task2{
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","database");
			
			Statement stnt=con.createStatement();
		//	stnt.exceuteUpdate("INSERT INTO students VALUES ('18SW01', 'Neha', '18', 'SW', '3, '6");
  			//ResultSet rs=
  			stnt.executeUpdate("INSERT INTO students"+" VALUES ('18SW01', 'Sara' , 18, 'SW', 2, 6)");
            stnt.executeUpdate("INSERT INTO students"+" VALUES ('18SW02', 'Mahrukh' , 18, 'SW', 1, 6)");
            stnt.executeUpdate("INSERT INTO students"+" VALUES ('18SW03', 'Iqra' , 18, 'SW', 3, 1)");
            stnt.executeUpdate("INSERT INTO students"+" VALUES ('18SW04', 'Misbah' , 18, 'SW', 2, 2)");
            stnt.executeUpdate("INSERT INTO students"+" VALUES ('18SW05', 'Dua' , 18, 'SW', 1, 3)");
            System.out.println("SUCCESS..");

		}catch(Exception e){
			System.out.println(e);
		}
	}
}