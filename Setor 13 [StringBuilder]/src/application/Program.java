package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(sdf.parse("21/02/2022 15:32:44"), 
				"Travelling to Norway", 
				"Going to meet the Old Gods!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("That's cool!");
		Comment c4 = new Comment("May the Force be with You.");
		
		Post p2 = new Post(sdf.parse("01/03/2022 10:52:14"), 
				"Night y'all", 
				"See you tomorrow!", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.print("\n");
		System.out.println(p2);
	}
}
