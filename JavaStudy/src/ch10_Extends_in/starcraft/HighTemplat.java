package ch10_Extends_in.starcraft;

public class HighTemplat  extends StarUnit {
	
	private int shield;
	private int mp;
	
	public HighTemplat() {
		this("하이템플러", 0, 60, 0, 50, 150);
	}
	

	//스킬
	public void tthunderStorm () {
		mp -= 75;
		System.out.println("우루루 콰아앙");
	}

	
	public HighTemplat(String name, int damage, int hp, int armor, int shield, int mp) {
		super(name, damage, hp, armor);
		this.shield = shield;
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "HighTemplat [name=" + getName() + 
				", damage=" + getDamage() + ", hp=" + getHp() 
				+ ", armor=" + getArmor() + ", shield="
				+ shield + ", mp=" + mp + "]";
	}

	
	
	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
	
	
	

}
