package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cursos curso1 = new Cursos();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descriçao curso java");
		curso1.setCargaHoraria(8);
		
		Cursos curso2 = new Cursos();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descriçao curso js");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = (Conteudo) new Cursos();
		
		Mentoria mentoria  = new Mentoria();
		mentoria.setTitulo("mentoria jaava");
		mentoria.setDescricao("descriçao mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
	
		
		
	}

}
