import java.sql.*;
class Task2{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","database");
			Statement stnt=con.createStatement();
			stnt.executeUpdate("UPDATE students SET name='Komal'"+"WHERE roll_num='18SW124' ");
			ResultSet rs=stnt.executeQuery("Select * from students ");
			System.out.println("UPDATED   " );
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