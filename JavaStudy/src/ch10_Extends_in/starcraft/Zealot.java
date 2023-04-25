package ch10_Extends_in.starcraft;

public class Zealot   extends StarUnit {
	

	private int shield;
	
	
	public Zealot() {
		this("질럿", 16, 100, 1, 60);
	}


	

	public Zealot(String name, int damage, int hp, int armor, int shield) {
		// 자식 생성자 맨 위에 부모 생성자가 와야함
		super(name, damage, hp, armor);
		this.shield = shield;
	}
	
	
	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", "
				+ "damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + ", shield=" + shield + "]";
	}




	public int getShield() {
		return shield;
	}


	public void setShield(int shield) {
		this.shield = shield;
	}



}
