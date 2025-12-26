package com.classandobject.level1;

public class MobilePhoneDetails {

	public static void main(String[] args) {
		MobilePhone mobile1=new MobilePhone("VIVO","VIVO V29" , 15999);
		MobilePhone mobile2=new MobilePhone("ONE PLUS","ONE PLUS nord4",39999);
		MobilePhone mobile3=new MobilePhone("APPLE","iphone pro16",79999);
		
		mobile1.diplayMobile();
		mobile2.diplayMobile();
		mobile3.diplayMobile();
	}
}
