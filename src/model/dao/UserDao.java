package model.dao;

import model.bean.BoardDto;
import model.bean.LoginDto;
import model.bean.UserDto;

import java.util.List;

public interface UserDao {

	String userLogin(LoginDto loginDto);

	String logout(String user_id);

	List<BoardDto> findBoardByUserId(String userId);
	void registerUser(UserDto userDto);
	List<String> searchListAll();
	String searchByUserId(String subject);

	

}
