 package org.abs;

public class Staff extends Student {

	@Override
	void name() {
		System.out.println("My name is Sudhir Kumar");
			}

	@Override
	void age() {
		System.out.println("My age is 28");
		}

	@Override
	void height() {
		System.out.println("My height is 158");
		}

	@Override
	void bloodgroup() {
		System.out.println("My bloodgroup is A+");
		}

	@Override
	void mobile() {
		System.out.println("My mobile no is 984123123");
		}
	
	public static void main (String [] args) {
		Staff s = new Staff();
		s.name();
		s.age();
		s.height();
		s.bloodgroup();
		s.mobile();
		s.bike();
		s.car();
		s.cycle();
	}
	

}
