package board.model.service;

import model.bean.BoardDto;
import model.bean.LoginDto;
import model.bean.UserDto;

import java.util.List;

public interface UserService {
    String userLogin(LoginDto loginDto);

    String userLogout(String userId);
    List<BoardDto> findBoardByUserId(String userId);
    void registerUser(UserDto userDto);
    List<String> searchListAll();

}
