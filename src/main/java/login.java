// import java.util.List;
// import java.util.ArrayList;
// import org.sql2o.*;

// public class Stylist {
//   private String username;
//   private String password;

//   public Stylist(String username, String password) {
//     this.username = username;
//   }

//   public String getUsername() {
//     return username;
//   }

//   public String getPassword() {
//     return password;
//   }

//   public static List<Login> all() {
//     String sql = "username, password FROM login";
//     try(Connection con = DB.sql2o.open()) {
//       return con.createQuery(sql).executeAndFetch(Stylist.class);
//     }
//   }
  
// }