package DTO01;

public class CommentDTO {
	
	int idx;
	int boardIdx;
	String content;
	String writer;
	
	// 멤버변수 출력용 메소드
	// 디버깅 목적
	public void info() {
		System.out.println("idx = " + idx);
		System.out.println("boardIdx = " + boardIdx);
		System.out.println("content = " + content);
		System.out.println("writer = " + writer);
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getBoardIdx() {
		return boardIdx;
	}

	public void setBoardIdx(int boardIdx) {
		this.boardIdx = boardIdx;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
