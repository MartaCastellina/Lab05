package it.polito.tdp.model;

public class TestModel {

	public static void main(String[] args) {
		Model model=new Model();
		
		
		
		model.calcolaPermutazioni("eat");
		System.out.println(model.lettere);
		System.out.println(model.isCorretta("aat"));
		
	

	}

}
