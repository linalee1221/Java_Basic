package DTO06;

// 구현 클래스
// Service : 비지니스 로직을 구성하는 메소드
public class CommentServiceImpl implements CommentService {

	@Override
	public void registerComment(String params) {
		System.out.println("첨언 등록");
	}

	@Override
	public void deleteComment(Long idx) {
		System.out.println("첨언 삭제");
	}

	@Override
	public void getCommentList(String params) {
		System.out.println("첨언 목록 가져오기");
	}
	
	

}
