package com.xworkz.java.interfaceconcept;

public class Client implements Vendor {
	
	String Orgid = "Client Org id";
	
	@Override
	public void organizationLevel() {
		System.out.println("Organization level");
	}

	@Override
	public void thirdPartyVendor() {
		System.out.println("Third Party Vendor");
	}
	
	public static void main(String[] args) {
		Organization c = new Client();
		c.organizationLevel();
		c.thirdPartyVendor();
		System.out.println(Organization.Orgid);
		
		Client c1 = new Client();
		System.out.println(c1.Orgid);
	}

}
