package board;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import board.model.service.BoardServiceImpl;
import board.model.service.UserServiceImpl;
import model.bean.BoardDto;
import model.bean.UserDto;
import util.DBUtil;
public class BoardMain {
	BufferedReader in;
	public BoardMain() {
		in = new BufferedReader(new InputStreamReader(System.in));
		menu();
	}
	private void searchListBySubject() throws Exception {// LIKE
	}
	private void viewArticle() throws Exception {	
		System.out.print("글번호 : ");
		int no = Integer.parseInt(in.readLine());
		BoardDto boardDto = BoardServiceImpl.getBoardService().viewArticle(no);
		System.out.println("********** " + no + "번 글정보 **********");
		System.out.println(boardDto);
	}
	private void modifyArticle()throws Exception {	
		BoardDto boardDto = new BoardDto();
		System.out.print("수정 할 글번호 : ");
		boardDto.setArticleNo(Integer.parseInt(in.readLine()));
		System.out.print("수정 제목 : ");
		boardDto.setSubject(in.readLine());
		System.out.print("수정 내용 : ");
		boardDto.setContent(in.readLine());
		BoardServiceImpl.getBoardService().modifyArticle(boardDto);
	}
	private void deleteArticle()throws Exception{	
		System.out.print("삭제 할 글번호 : ");
		int no = Integer.parseInt(in.readLine());
		BoardServiceImpl.getBoardService().deleteArticle(no);
	}


	private void resisterUser()throws Exception{
		UserDto userDto = new UserDto();
		System.out.print("등록하는 유저 ID : ");
		userDto.setUserId(in.readLine());
		System.out.print("등록하는 유저 PASSWORD : ");
		userDto.setUserPassword(in.readLine());
		System.out.print("등록하는 유저 NAME : ");
		userDto.setUserName(in.readLine());
		System.out.print("등록하는 유저 age : ");
		userDto.setUserAge(Integer.parseInt(in.readLine()));
		System.out.print("등록하는 유저 birthdate(형식 : 19991225) : ");
		userDto.setBirthdate(in.readLine());

		UserServiceImpl.getUserService().registerUser(userDto);

	}

	
	private void menu() {
		while (true) {
			System.out.println("---------- 게시판 메뉴 ----------");
			System.out.println("1. 글등록");
			System.out.println("2. 글목록(전체)");
			System.out.println("3. 글검색(제목)");
			System.out.println("4. 글보기");
			System.out.println("5. 글수정");
			System.out.println("6. 글삭제");
			System.out.println("7. 유저 등록");
			System.out.println("-------------------------------------");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------------------");
			System.out.print("메뉴 선택 : ");
			try {
				int num = Integer.parseInt(in.readLine());
				switch (num) {
				case 1:
					registerArticle();//등록
					break;	
				case 2:
					searchListAll();//전체검색
					break;
				case 3:
					searchListBySubject();//
					break;
				case 4:
					viewArticle();
					break;
				case 5:
					modifyArticle();
					break;
				case 6:
					deleteArticle();
					break;

				case 7:
					resisterUser();
					break;

				default:
					System.exit(0);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
//	private int articleNo;
//	private String subject;
//	private String content;
//	private String userId;
//	private String registerTime;
	private void registerArticle() throws Exception {
		BoardDto boardDto = new BoardDto();
		System.out.println("=========글등록==========");
		System.out.print("제목");
		boardDto.setSubject(in.readLine());		
		System.out.print("내용");
		boardDto.setContent(in.readLine());		
		System.out.print("아이디");
		boardDto.setUserId(in.readLine());
		BoardServiceImpl.getBoardService
		
		().registerArticle(boardDto);
		
	}
	private void searchListAll() {
		List<BoardDto> list = BoardServiceImpl.getBoardService().searchListAll();
		System.out.println("********** 글목록(전체) **********");
		for(BoardDto article : list) {
			System.out.println(article);
		}
	}
	
	public static void main(String[] args) throws Exception{
		//System.out.println(DBUtil.getInstance().getConnection());
		new BoardMain();
	}

}






