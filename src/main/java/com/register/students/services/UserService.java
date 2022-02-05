package com.register.students.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.register.students.interfaceService.IuserService;
import com.register.students.interfaces.Iuser;
import com.register.students.model.User;

@Service
public class UserService implements IuserService {
	
	@Autowired
	private Iuser data;

	@Override
	public List<User> list() {
		return (List<User>)data.findAll();
	}

	@Override
	public Optional<User> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(User u) {
		int res = 0;
		User user = data.save(u);
		if (!user.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
