package DTO02;

public class AttachDTO {
	
	int idx;
	int boardIdx;
	String originalName;
	String saveName;
	int size;
	
	public void info() {
		System.out.println("idx = " + idx);
		System.out.println("boardIdx = " + boardIdx);
		System.out.println("originalName = " + originalName);
		System.out.println("saveName = " + saveName);	
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

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
