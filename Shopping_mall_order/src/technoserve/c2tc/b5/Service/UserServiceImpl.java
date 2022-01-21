package technoserve.c2tc.b5.Service;

import technoserve.c2tc.b5.dao.UserDao;
import technoserve.c2tc.b5.dao.UserDaoImpl;
import technoserve.c2tc.b5.entities.User;

public class UserServiceImpl implements UserService {
	UserDao ud;
	public UserServiceImpl() {
		ud=new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		ud.startTransaction();
		ud.addUser(user);
		ud.endTransaction();
	
	}

	@Override
	public void updateUser(User user) {
		ud.startTransaction();
		ud.updateUser(user);
		ud.endTransaction();
		
		
	}

	@Override
	public long deleteUser(long id) {
		ud.startTransaction();
		ud.deleteUser(id);
		ud.endTransaction();
		return id;
		
	}
	

}
