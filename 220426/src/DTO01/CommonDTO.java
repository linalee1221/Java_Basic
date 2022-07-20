package DTO01;

// DTO 기본형 : 멤버변수 + GETTER/SETTER
// DTO(Data Transfer Object) : DB에서 정보를 저장할 클래스
public class CommonDTO {

	String paginationInfo;
	Boolean deleteYn;
	String insertTime;
	String updateTime;
	String delteTime;


	// 멤버변수 출력용 메소드
	// 디버깅 목적
	public void info() {
		System.out.println("paginationInfo = " + paginationInfo);
		System.out.println("deleteYn = " + deleteYn);
		System.out.println("insertTime = " + insertTime);
		System.out.println("updateTime = " + updateTime);
		System.out.println("delteTime = " + delteTime);
	}


	public String getPaginationInfo() {
		return paginationInfo;
	}


	public void setPaginationInfo(String paginationInfo) {
		this.paginationInfo = paginationInfo;
	}


	public Boolean getDeleteYn() {
		return deleteYn;
	}


	public void setDeleteYn(Boolean deleteYn) {
		this.deleteYn = deleteYn;
	}


	public String getInsertTime() {
		return insertTime;
	}


	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}


	public String getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}


	public String getDelteTime() {
		return delteTime;
	}


	public void setDelteTime(String delteTime) {
		this.delteTime = delteTime;
	}
	
	
	

}
