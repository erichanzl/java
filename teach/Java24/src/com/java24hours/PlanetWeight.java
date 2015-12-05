package com.java24hours;

class PlanetWeight {
	public static void main(String[] arguments) {
		System.out.print("Your Weight on Earth is ");
		double weight = 178;
		System.out.println(weight);
		
		System.out.print("Your Weight on Mercury is ");
		double mercury = weight * .378;
		System.out.println(mercury);
		
		System.out.print("Your Weight on the Moon is ");
		double moon = weight * .166;
		System.out.println(moon);
		
		System.out.print("Your Weight on Jupider is ");
		double jupider = weight * 2.364;
		System.out.println(jupider);
		
		System.out.print("Your weight on Venus is ");
        double venus = weight * .907;
        System.out.println(venus);

        System.out.print("Your weight on Uranus is ");
        double uranus = weight * .889;
        System.out.println(uranus); 
	}
}