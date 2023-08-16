package board.model.service;

import model.bean.BoardDto;
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

    public String userLogout(String userId){
        return UserDaoImpl.getUserDao().logout(userId);
    }

    @Override
    public List<BoardDto> findBoardByUserId(String userId) {
        return UserDaoImpl.getUserDao().findBoardByUserId(userId);
    }

    @Override
    public void registerUser(UserDto userDto) {
        UserDaoImpl.getUserDao().registerUser(userDto);
    }

    @Override
    public List<String> searchListAll() {
        return UserDaoImpl.getUserDao().searchListAll();
    }


}
