package DTO02;

public class BoardDTO {
	
	String idx;
	String title;
	String content;
	String writer;
	String viewCnt;
	Boolean noticeYn;
	Boolean secretYn;
	Boolean changeYn;
	int fileIdxs;
	
	public void info() {
		System.out.println("idx = " + idx);
		System.out.println("content = " + content);
		System.out.println("writer = " + writer);
		System.out.println("viewCnt = " + viewCnt);
		System.out.println("noticeYn = " + noticeYn);
		System.out.println("secretYn = " + secretYn);
		System.out.println("changeYn = " + changeYn);
		System.out.println("fileIdxs = " + fileIdxs);
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(String viewCnt) {
		this.viewCnt = viewCnt;
	}

	public Boolean getNoticeYn() {
		return noticeYn;
	}

	public void setNoticeYn(Boolean noticeYn) {
		this.noticeYn = noticeYn;
	}

	public Boolean getSecretYn() {
		return secretYn;
	}

	public void setSecretYn(Boolean secretYn) {
		this.secretYn = secretYn;
	}

	public Boolean getChangeYn() {
		return changeYn;
	}

	public void setChangeYn(Boolean changeYn) {
		this.changeYn = changeYn;
	}

	public int getFileIdxs() {
		return fileIdxs;
	}

	public void setFileIdxs(int fileIdxs) {
		this.fileIdxs = fileIdxs;
	}

}
