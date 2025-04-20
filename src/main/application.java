package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class application {
	public static void main(String[] args) throws ParseException {

		//Formato da data
		SimpleDateFormat d01 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Instanciando comentarios
		System.out.println();
		Comment c1 = new Comment("Tenha uma ótima viagem!");
		Comment c2 = new Comment("Que belo lanche");

		//Instanciando informações da classe post
		Post post1 = new Post(d01.parse("21/06/2018 13:05:44"), "Viajando pelo EUA!", "Essa viagem está foda", 12);
		Post post2 = new Post(d01.parse("24/12/2024 14:50:22"), "Comendo lanche!", "Muito gostoso", 18);

		//Adcionando comentarios
		post1.addComment(c1);
		post1.addComment(c2);

		post2.addComment(c1);
		post2.addComment(c2);

		System.out.println(post1);
		System.out.println();
		System.out.println(post2);

	}
}
