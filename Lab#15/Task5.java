import java.sql.*;
public class Task5{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","database");
			Statement stnt=con.createStatement();
			stnt.executeUpdate("DELETE FROM students "+"WHERE year = 1 ");
			ResultSet rs=stnt.executeQuery("SELECT * FROM students");
			System.out.println("DELETED");
			while(rs.next()){
				System.out.print(rs.getString("roll_num"));
				System.out.print("   "+rs.getString("name"));
				System.out.print("   "+rs.getInt("batch"));
				System.out.print("   "+rs.getString("dept"));
				System.out.print("   "+rs.getInt("year"));
				System.out.println("   "+rs.getString("semester"));

			}

		}catch(Exception e){
			System.out.println(e);
		}

	}
}