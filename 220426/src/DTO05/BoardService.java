package DTO05;

// 메소드 목록이름만 있는 것(메소드 목록 명세서)
public interface BoardService {
	
	public void registerBoard(String params);
	public void registerBoard(String params, String files);
	public void getBoardDetail(Long idx);
	public void deleteBoard(Long idx);
	public void getBoardList(String params);
	public void getAttachFileList(Long boardIdx);
	public void getAttachDetail(Long idx);

}
