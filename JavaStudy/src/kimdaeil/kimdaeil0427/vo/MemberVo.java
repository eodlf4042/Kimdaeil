package kimdaeil.kimdaeil0427.vo;

public class MemberVo {
	private String memId;
	private String memPassword;
	
	
	public MemberVo() {}


	public MemberVo(String memId, String memPassword) {
		super();
		this.memId = memId;
		this.memPassword = memPassword;
	}


	@Override
	public String toString() {
		return "아이디: " + memId + "  비밀번호 : " + memPassword + "]";
	}


	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public String getMemPassword() {
		return memPassword;
	}


	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}
	
	
}
