package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
		
	Comment comment1 = new Comment("Have a nice trip!");
	Comment comment2 = new Comment("Wow that's awesome!");
	Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand","I'm going to visit this wonderful country!",12);
	p1.addComment(comment1);
	p1.addComment(comment2);
	System.out.println(p1);
	System.out.println("---------------------------------------------------");
	Comment comment3 = new Comment("Good night");
	Comment comment4 = new Comment("May the force be with you");
	Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night","See you tomorrow",5);
	p2.addComment(comment3);
	p2.addComment(comment4);
	System.out.println(p2);
	}
}
