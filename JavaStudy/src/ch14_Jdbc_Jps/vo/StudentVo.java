package ch14_Jdbc_Jps.vo;

public class StudentVo {
	private String stuId;
	private String stuPassword;
	private String stuName;
	private int stuScore;
	
	
	public StudentVo() {}
	
	public StudentVo(String stuId, String stuPassword, String stuName, int stuScore) {
		super();
		this.stuId = stuId;
		this.stuPassword = stuPassword;
		this.stuName = stuName;
		this.stuScore = stuScore;
	}

	@Override
	public String toString() {
		return "StudentVo [stuId=" + stuId + ", stuPassword=" + stuPassword + ", stuName=" + stuName + ", stuScore="
				+ stuScore + "]";
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
}
