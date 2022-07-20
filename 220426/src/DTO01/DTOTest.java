package DTO01;

public class DTOTest {

	public static void main(String[] args) {
		
		CommonDTO commonDTO = new CommonDTO();
		
		commonDTO.setDelteTime("삭제일");
		commonDTO.setDeleteYn(true);
		commonDTO.setInsertTime("등록일");
		commonDTO.setPaginationInfo("페이징 정보");
		commonDTO.setUpdateTime("수정일");
		
		
		// commonDTO에 현재 저장된 내용을 출력
		commonDTO.info();
		
		CommentDTO commentDTO = new CommentDTO();
		
		commentDTO.setBoardIdx(1);
		commentDTO.setContent("게시판 내용");
		commentDTO.setIdx(1);
		commentDTO.setWriter("글쓴이");
		
		System.out.println("==============================");
		commentDTO.info();
		
				
		
	}

}
