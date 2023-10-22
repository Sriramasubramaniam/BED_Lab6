package com.glearning.studentManagement.service;


import com.glearning.studentManagement.entity.User;
import com.glearning.studentManagement.repository.UserRepository;
import com.glearning.studentManagement.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private UserRepository userRepository;
	     
	    @Override
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	        User user = userRepository.getUserByUsername(username);
	         
	        if (user == null) {
	            throw new UsernameNotFoundException("User with the given name is not found");
	        }
	         
	        return new MyUserDetails(user);
	    }

}
