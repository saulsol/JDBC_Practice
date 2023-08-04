package board.model.service;

import java.util.List;

import model.bean.BoardDto;
import model.dao.BoardDaoImpl;

public class BoardServiceImpl implements BoardService{
	private static BoardService boardService=new BoardServiceImpl();	
	
	public static BoardService getBoardService() {
		return boardService;
	}
	
	@Override
	public void registerArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub
		BoardDaoImpl.getBoardDao().registerArticle(boardDto);		
		
	}
	@Override
	public List<BoardDto> searchListAll() {
		// TODO Auto-generated method stub
		return BoardDaoImpl.getBoardDao().searchListAll();
	}

	@Override
	public List<BoardDto> searchListBySubject(String subject) {
		// TODO Auto-generated method stub
		return BoardDaoImpl.getBoardDao().searchListBySubject(subject);
	}

	@Override
	public BoardDto viewArticle(int no) {
		// TODO Auto-generated method stub
		return BoardDaoImpl.getBoardDao().viewArticle(no);
	}

	@Override
	public void modifyArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub
		BoardDaoImpl.getBoardDao().modifyArticle(boardDto);
	}

	@Override
	public void deleteArticle(int no) {
		// TODO Auto-generated method stub
		BoardDaoImpl.getBoardDao().deleteArticle(no);
	}
	

}
