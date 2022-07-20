package DTO07;

public class CategoryDTO {

	int	idParent;
	String title;
	String icon;
	String description;
	
	public void info() {
		System.out.println("idParent = " + idParent);
		System.out.println("title = " + title);
		System.out.println("icon = " + icon);
		System.out.println("description = " + description);
	}

	public int getIdParent() {
		return idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
