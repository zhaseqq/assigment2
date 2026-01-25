import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("press 1 to create book");
                System.out.println("press 2 to read all books");
                System.out.println("press 3 to read book by ID");
                System.out.println("press 4 to update the book");
                System.out.println("press 5 to delete the book");
                System.out.println("press 6 to exit");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("title: ");
                        String title = sc.nextLine();
                        System.out.print("author: ");
                        String author = sc.nextLine();
                        System.out.print("price: ");
                        double price = sc.nextDouble();
                        System.out.print("pages: ");
                        int pages = sc.nextInt();
                        System.out.print("year: ");
                        int year = sc.nextInt();

                        if (price < 0 || pages <= 0 || year <= 0) {
                            System.out.println("invalid values");
                            break;
                        }

                        PreparedStatement insert = conn.prepareStatement(
                                "INSERT INTO books(title, author, price, pages, published_year) VALUES (?, ?, ?, ?, ?)");
                        insert.setString(1, title);
                        insert.setString(2, author);
                        insert.setDouble(3, price);
                        insert.setInt(4, pages);
                        insert.setInt(5, year);
                        insert.executeUpdate();
                        System.out.println("book created");
                        break;

                    case 2:
                        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM books");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + " " + rs.getString("title"));
                        }
                        break;

                    case 3:
                        System.out.print("enter ID: ");
                        int id = sc.nextInt();
                        PreparedStatement sel = conn.prepareStatement("SELECT * FROM books WHERE id=?");
                        sel.setInt(1, id);
                        ResultSet rs2 = sel.executeQuery();
                        if (rs2.next()) {
                            System.out.println(rs2.getString("title") + " by " + rs2.getString("author"));
                        } else {
                            System.out.println("not found");
                        }
                        break;

                    case 4:
                        System.out.print("enter ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("new title: ");
                        String nt = sc.nextLine();
                        System.out.print("new author: ");
                        String na = sc.nextLine();
                        System.out.print("new price: ");
                        double np = sc.nextDouble();
                        System.out.print("new pages: ");
                        int npg = sc.nextInt();
                        System.out.print("new year: ");
                        int ny = sc.nextInt();

                        PreparedStatement upd = conn.prepareStatement(
                                "UPDATE books SET title=?, author=?, price=?, pages=?, published_year=? WHERE id=?");
                        upd.setString(1, nt);
                        upd.setString(2, na);
                        upd.setDouble(3, np);
                        upd.setInt(4, npg);
                        upd.setInt(5, ny);
                        upd.setInt(6, uid);
                        upd.executeUpdate();
                        System.out.println("Updated!");
                        break;

                    case 5:
                        System.out.print("enter ID to delete: ");
                        int did = sc.nextInt();
                        PreparedStatement del = conn.prepareStatement("DELETE FROM books WHERE id=?");
                        del.setInt(1, did);
                        del.executeUpdate();
                        System.out.println("deleted");
                        break;

                    case 6:
                        System.out.println("exiting...");
                        return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
