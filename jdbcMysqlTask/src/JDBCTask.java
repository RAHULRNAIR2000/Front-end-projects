////import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class JDBCTask {
//    public static void main(String[] args) {
//        String url="jdbc:mysql://localhost:3306/EmployeeData";
//        String username="root";
//        String password="Welcome@123";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection connection= DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//            ResultSet resultSet=statement.executeQuery("select*from Employee");
//             while(resultset.next()) {
//                 System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+resultSet.getInt(3));
//             }
//             connection.close();
//        }
//
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        }
//    }
//}

import java.sql.*;
import java.util.*;
public class JDBCTask {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/EmployeeData";
        String username = "root";
        String password = "Welcome@123";
        Random random = new Random();
        String[] departments = {"Ec", "Digital", "NXT", "Netops", "Finance"};
        String[] name = {"kumar", "Akhil", "Bimal", "Manu", "Franky"};

                try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeData", "root", "Welcome@123");
                    Statement statement = connection.createStatement();

                    //            insert Section

                    for (int i = 111; i < 1000000; i++) {
                        String Name = name[random.nextInt(name.length)];
                        String department = departments[random.nextInt(departments.length)];
//                        String position = positions[random.nextInt(positions.length)];
                        int age = random.nextInt(36) + 20;

                        String insertQuery = "INSERT INTO Employee (EmpId,EmpName,EmpAge,EmpDept) VALUES ('"+ i +"', '" + Name + "','" + age+ "','" + department + "')";
                        int rowsAffected = statement.executeUpdate(insertQuery);


                        if (rowsAffected > 0) {
                            System.out.println("Insertion successful for entry " + (i + 1));
                        } else {
                            System.out.println("Failed to insert entry " + (i + 1));
                        }
                    }
                    System.out.println("All entries inserted successfully.");

                    ResultSet resultSet = statement.executeQuery("Select * from user");
                    while (resultSet.next()) {
                        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
                    }
                } catch (SQLException sqlException) {
                    System.out.println(sqlException.getMessage());
                }
                    //read operation

//                    Statement select = connection.createStatement();
//            java.sql.ResultSet resultSet = statement.executeQuery("select * from Employee");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getString(4) );
//            }

            // Delete operation
//            int employeeIdToDelete = 101; //
//            String deleteQuery = "DELETE FROM Employee WHERE EmpId = " + employeeIdToDelete;
//
//            Statement deleteStatement = connection.createStatement();
//            int rowsDeleted = deleteStatement.executeUpdate(deleteQuery);
//
//            if (rowsDeleted > 0) {
//                System.out.println("Employee with ID " + employeeIdToDelete + " deleted successfully.");
//            } else {
//                System.out.println("No employee found with ID " + employeeIdToDelete);
//            }
            // Update operation

//            statement.executeUpdate("INSERT into Employee(EmpID,EmpName, EmpAge, EmpDept) VALUES(110, 'vikram', 20, 'Digital');");
//            ResultSet rs=select.executeQuery("SELECT * FROM Employee;");
//            while (rs.next()) {
//            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));}
////            statement.executeUpdate("UPDATE Employee SET EmpAge=45 WHERE EmpID=103;");
////            statement.executeUpdate("DELETE from Employee  WHERE EmpID=109;"
//            connection.close();

            // Insert operation

//            String insertQuery = "INSERT INTO Employee (EmpId,EmpName, EmpAge, EmpDept) VALUES (103, 'Rahul' , 23, 'nxt')";
//
//            Statement insertStatement = connection.createStatement();
//            int rowsInserted = insertStatement.executeUpdate(insertQuery);
//
//            if (rowsInserted > 0) {
//                System.out.println("New employee inserted successfully.");
//            } else {
//                System.out.println("Failed to insert new employee.");
//            }
//
//            connection.close();


//        } catch (ClassNotFoundException e) {
//            System.out.println("Driver class not found: " + e.getMessage());
//        } catch (SQLException sqlException) {
//            System.out.println(sqlException.getMessage());
//        }
    }
}
