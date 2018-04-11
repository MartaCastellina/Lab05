package it.polito.tdp.model;

import java.util.*;

public class Model {

	List <String> soluzione; //Elenco delle soluzioni
	Map<Character, Integer> lettere; //Array di caratteri della parola
	
	
	public List<String> calcolaPermutazioni(String s){
		
		soluzione=new ArrayList<String>();
		lettere=new TreeMap<Character,Integer>();
		
		
		
		for (int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			
			
			lettere.put(s.charAt(i),punteggio(c,s)); //Salvo tutti i caratteri che dobbiamo inserire 
		}
		
		recursive("", s.length());
		return soluzione;
	}


	private Integer punteggio(Character c, String s) {
		int conta=0;
		for (int i=0;i<s.length();i++) {
			if (c==s.charAt(i)) {
				conta++;
			}
		}
		return conta;
	}


	private void recursive(String parziale, int lunghezza) {
		if(parziale.length()==lunghezza) {
			
			soluzione.add(parziale);
			System.out.println(soluzione);
			return;
		}
		for (Character c:lettere.keySet()) {
			
			
			parziale+=c.toString();
			
			if(isCorretta(parziale)) {
				recursive(parziale,lunghezza);
			}
			
			
			
			StringBuilder sb=new StringBuilder(parziale);
			parziale=sb.deleteCharAt(parziale.length()-1).toString();
		}
		
	}


	public boolean isCorretta(String parziale) {
		boolean flag=true;
		for (Character c:lettere.keySet()) {
			if (punteggio(c,parziale)>lettere.get(c))
				flag=false;
		}
		return flag;
	}
	
	
}
