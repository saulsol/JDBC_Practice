package model.dao;

import model.bean.LoginDto;
import model.bean.UserDto;

import java.util.List;

public interface UserDao {

	String userLogin(LoginDto loginDto);
	String findByUserId();
	void registerUser(UserDto userDto);
	List<UserDto> searchListAll();
	String searchByUserName(String subject);
	UserDto viewUserInfo(int userNum);
	void modifyUserInfo(UserDto userDto);
	void deleteUserInfo(int no);
	

}
