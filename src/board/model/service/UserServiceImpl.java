package board.model.service;

import model.bean.LoginDto;
import model.bean.UserDto;
import model.dao.UserDao;
import model.dao.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static UserService userService = new UserServiceImpl();


    public static UserService getUserService(){
        return userService;
    }

    @Override
    public String userLogin(LoginDto loginDto) {
        return UserDaoImpl.getUserDao().userLogin(loginDto);
    }

    @Override
    public String findByUserId() {
        return UserDaoImpl.getUserDao().findByUserId();
    }

    @Override
    public void registerUser(UserDto userDto) {
        UserDaoImpl.getUserDao().registerUser(userDto);
    }

    @Override
    public List<UserDto> searchListAll() {
        return UserDaoImpl.getUserDao().searchListAll();
    }

    @Override
    public String searchByUserName(String subject) {
        return UserDaoImpl.getUserDao().searchByUserName(subject);
    }

    @Override
    public UserDto viewUserInfo(int userNum) {
        return UserDaoImpl.getUserDao().viewUserInfo(userNum);
    }

    @Override
    public void modifyUserInfo(UserDto userDto) {
        UserDaoImpl.getUserDao().modifyUserInfo(userDto);
    }

    @Override
    public void deleteUserInfo(int no) {
        UserDaoImpl.getUserDao().deleteUserInfo(no);
    }
}
