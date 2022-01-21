package technoserve.c2tc.b5.dao;

import technoserve.c2tc.b5.entities.User;

public interface UserDao {
	public void addUser(User user);
	public User getUser(long id);
	public void updateUser(User user);
	public long deleteUser(long id);
	public void startTransaction();
	public void endTransaction();
	
}
