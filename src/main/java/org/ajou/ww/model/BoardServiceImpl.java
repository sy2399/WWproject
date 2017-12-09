package org.ajou.ww.model;



import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="boardDAOImpl")
	private BoardDAO boardDAO;	
	@Override
	public int write(BoardVO bvo){
		return boardDAO.write(bvo);
	}
	@Override
	public void insertFile(FileVO fvo) {
		boardDAO.insertFile(fvo);
		
	}
	@Override
	public ArrayList<CategoryVO> findCategoryList() {
		
		return (ArrayList<CategoryVO>) boardDAO.findCategoryList();
	}
	@Override
	public ArrayList<FolderVO> findFolderList() {
		
		return (ArrayList<FolderVO>) boardDAO.findFolderList();
	}	

		
//	@Override
//	public ListVO getBoardList(){				
//		return getBoardList("1");
//	}
//	@Override
//	public ListVO getBoardList(String pageNo){			
//		int totalCount=boardDAO.getTotalContentCount();
//		PagingBean pagingBean=null;
//		if(pageNo==null)
//			pagingBean=new PagingBean(totalCount);
//		else
//			pagingBean=new PagingBean(totalCount,Integer.parseInt(pageNo));		
//		/*HashMap<String,Integer> paramMap=new HashMap<String,Integer>();
//		paramMap.put("startRowNumber",pagingBean.getStartRowNumber());
//		paramMap.put("endRowNumber", pagingBean.getEndRowNumber());*/
//		return new ListVO(boardDAO.getBoardList(pagingBean),pagingBean);
//	}
//	
//	@Override
//	public BoardVO showContent(int no){
//		boardDAO.updateCount(no);
//		return boardDAO.showContent(no);
//	}
//	@Override
//	public void updateCount(int no){
//		boardDAO.updateCount(no);
//	}
//	@Override
//	public BoardVO showContentNoHit(int no){		
//		return boardDAO.showContent(no);
//	}	
//	
//	@Override
//	public void deleteBoard(int no){
//		boardDAO.deleteBoard(no);
//	}
//	
//	@Override
//	public void updateBoard(BoardVO bvo){
//		boardDAO.updateBoard(bvo);
//	}
	
}








