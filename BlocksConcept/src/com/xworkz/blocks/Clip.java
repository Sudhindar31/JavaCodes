package com.xworkz.blocks;

public class Clip {
	String material;
	double price;

	// non-static blocks / initialization block
	// called during the object creation just before constructor is called
	{
		material = "metal";
	}

	Clip(String inputmaterial, double inputprice) {
		System.out.println("Material : " + material + "Price : " + price);

		material = inputmaterial;
		price = inputprice;
	}

	void putClip() {
		System.out.println("putclip");
	}

	// all the block is called in sequence they have written
	{
		price = 50.00;
	}
}
