package model.dao;

import model.bean.BoardDto;
import model.bean.UserDto;

import java.util.List;

public interface UserDao {

	String userLogin();
	String findByUserId();
	void registerUser(UserDto userDto);
	List<UserDto> searchListAll();
	List<UserDto> searchListByUserName(String subject);
	UserDto viewUserInfo(int userNum);
	void modifyUserInfo(UserDto userDto);
	void deleteUserInfo(int no);
	

}
