package technoserve.c2tc.b5.Service;

import technoserve.c2tc.b5.entities.User;

public interface UserService {
	public void addUser(User u);
	public void updateUser(User u);
	public long deleteUser(long id);
	
}
