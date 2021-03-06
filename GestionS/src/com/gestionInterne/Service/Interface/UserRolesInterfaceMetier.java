package com.gestionInterne.Service.Interface;



import java.util.List;

import com.gestionInterne.DAO.entity.User;
import com.gestionInterne.DAO.entity.UserRole;



public interface UserRolesInterfaceMetier {

	public UserRole addUserRole(UserRole userRole);

	public void deleteUserRole(UserRole userRole);

	public UserRole updateUserRole(UserRole userRole);

	public UserRole getUserRole(long id_userRole);

	public List<UserRole> getAllUserRole();
	
	public List<String> getAllRoles();
	
	public UserRole getUserRoled(User user);

}
