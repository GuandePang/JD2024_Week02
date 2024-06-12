package Practice16;

import java.sql.*;

public class ThreadPoolJDBC {

    private static String URL = "jdbc:mysql://localhost:3306/shop";
    private static String UserName = "root";
    private static String Password = "202022";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            //加载JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //建立连接
            connection = DriverManager.getConnection(URL, UserName, Password);

            String query = "SELECT * FROM view_shop_product";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String result1 = resultSet.getString("product_type");
                int result2 = resultSet.getInt("sale_price");
                String result3 = resultSet.getString("shop_name");
                System.out.println("product_type: " + result1 + ", sale_price: " + result2 + ", shop_name: " + result3);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(connection != null) connection.close();
                if(statement != null) statement.close();
                if(resultSet != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
