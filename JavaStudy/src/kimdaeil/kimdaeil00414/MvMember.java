package kimdaeil.kimdaeil00414;



public class MvMember {
	private String Id;
	private String password;
	private String name;
	
	public MvMember() {}


	public MvMember(String id, String password, String name) {
		MvMemberDB memDB = MvMemberDB.getInstance();
		this.Id = id;
		this.password = password;
		this.name = name;
	}

	@Override
	public String toString() {
		return "회원 아이디 = " + Id + ", 회원 비밀번호 = " + password + ", 회원 이름 = " + name + "]";
	}
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
