package model.dao;

import model.bean.UserDto;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public String userLogin() {
        return null;
    }

    @Override
    public String findByUserId() {
        return null;
    }

    @Override
    public void registerUser(UserDto userDto) {

    }

    @Override
    public List<UserDto> searchListAll() {
        return null;
    }

    @Override
    public List<UserDto> searchListByUserName(String subject) {
        return null;
    }

    @Override
    public UserDto viewUserInfo(int userNum) {
        return null;
    }

    @Override
    public void modifyUserInfo(UserDto userDto) {

    }

    @Override
    public void deleteUserInfo(int no) {

    }
}
