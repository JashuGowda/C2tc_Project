package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.User;

public class UserDaoImpl implements UserDao {
	EntityManager em;
	
	public UserDaoImpl() {
		em=Configuration.getEntityManager();
	}

	@Override
	public void addUser(User user) {
		em.persist(user);
		
	}

	@Override
	public User getUser(long id) {
		User user=em.find(User.class, id);
		return user;
		
	}

	@Override
	public void updateUser(User user) {
		em.merge(user);
		
	}

	@Override
	public long deleteUser(long id) {
		User user=getUser(id);
		em.remove(user);
		return id;
	
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
	}
}

	
