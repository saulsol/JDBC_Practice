package model.dao;

import model.bean.LoginDto;
import model.bean.UserDto;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static UserDao userDao = new UserDaoImpl();

    public static UserDao getUserDao(){
        return userDao;
    }

    @Override
    public String userLogin(LoginDto loginDto) {
        return null;
    }

    @Override
    public String findByUserId() {
        return null;
    }

    @Override
    public void registerUser(UserDto userDto) { // 유저 등록
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DBUtil.getInstance().getConnection();
            StringBuilder sql=new StringBuilder("insert into user (user_id, user_password, user_name, user_age, birthdate ) \n");
            connection.setAutoCommit(false); // 트랜잭션 시작

            sql.append("values (?,?,?,?,?)");

            preparedStatement = connection.prepareStatement(sql.toString());
            preparedStatement.setString(1, userDto.getUserId());
            preparedStatement.setString(2, userDto.getUserPassword());
            preparedStatement.setString(3, userDto.getUserName());
            preparedStatement.setInt(4, userDto.getUserAge());
            preparedStatement.setString(5, userDto.getBirthdate());

            if(preparedStatement.executeUpdate()>0){
                System.out.println("insert Success");
                connection.commit();
            }


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }finally {
            DBUtil.getInstance().close(preparedStatement,connection);
        }


    }

    @Override
    public List<UserDto> searchListAll() {
        return null;
    }

    @Override
    public String searchByUserName(String subject) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DBUtil.getInstance().getConnection();
            StringBuilder sql = new StringBuilder("SELECT user_id FROM USER \n");
            connection.setAutoCommit(false); // 트랜잭션 시작
            sql.append("WHERE LIKE (%?%)");
            preparedStatement = connection.prepareStatement(sql.toString());
            preparedStatement.setString(1, subject);




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


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

    private String validateUser(String userID){

        String validatedUserId = searchByUserName(userID);

        return " ";
    }
}
