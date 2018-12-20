import java.sql.SQLException;

import com.codrut.DAOImpl.UserDAOImpl;
import com.codrut.model.User;
public class Test {
	public static void main(String[] arg) throws ClassNotFoundException, SQLException {
		UserDAOImpl user = new UserDAOImpl();
		User user2 = user.getUser(1);
		System.out.println(user2.getUserName());
	}
}
