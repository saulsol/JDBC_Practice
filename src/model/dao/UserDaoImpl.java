package model.dao;

import model.bean.BoardDto;
import model.bean.LoginDto;
import model.bean.UserDto;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static UserDao userDao = new UserDaoImpl();
    private static HashMap<String, String> loginUser = new HashMap<>();

    public static UserDao getUserDao(){
        return userDao;
    }



    @Override
    public String userLogin(LoginDto loginDto) {

        String validateUser = validateUser(loginDto.getId());
        if(!loginUser.containsKey(validateUser)){
            loginUser.put(validateUser, loginDto.getPassword());
            return validateUser+"님, 로그인 되었습니다.";
        } else
            return "이미 로그인했습니다";


    }

    @Override
    public String logout(String user_id) {
        String validateUser = validateUser(user_id);
        loginUser.remove(validateUser);

        return "로그아웃되었습니다.";
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
    public List<String> searchListAll() { // 가입한 유저 id 목록 (admin 사용자만 사용가능하게)

        List<String> userList = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getInstance().getConnection();
            StringBuilder sql = new StringBuilder("SELECT user_id FROM user \n");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();

            while (rs.next()){
                userList.add(rs.getString("user_id"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;

    }

    @Override
    public String searchByUserId(String name) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String userId = null;

        try {
            connection = DBUtil.getInstance().getConnection();
            StringBuilder sql = new StringBuilder("SELECT user_id FROM USER \n");
            connection.setAutoCommit(false); // 트랜잭션 시작
            sql.append("WHERE user_id LIKE ?");
            preparedStatement = connection.prepareStatement(sql.toString());
            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                userId = resultSet.getString("user_id");
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return userId;
    }


    

    public List<BoardDto> findBoardByUserId(String userid){ // 유저가 쓴 게시물들 리턴

        List<BoardDto> list = new ArrayList<BoardDto>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getInstance().getConnection();
            StringBuilder sql = new StringBuilder("select b.article_no , b.subject , b.content, b.user_id, b.register_time \n");
            sql.append("FROM board b ");
            sql.append("WHERE user_id = ?");
            sql.append("order by article_no desc");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, userid);

            rs = pstmt.executeQuery();

            while(rs.next()){
                BoardDto boardDto = new BoardDto();
                boardDto.setArticleNo(rs.getInt("article_no"));
                boardDto.setSubject(rs.getString("subject"));
                boardDto.setContent(rs.getString("content"));
                boardDto.setUserId(rs.getString("user_id"));
                boardDto.setRegisterTime(rs.getString("register_time"));

                list.add(boardDto);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }




    private String validateUser(String userID){

        String existUserId = searchByUserId(userID);

        if(existUserId == null){
            System.out.println("존재하지 않는 사용자입니다.");
            return null;
        }else{
            System.out.println("존재하는 사용자입니다.");
            return existUserId;
        }

    }





}
