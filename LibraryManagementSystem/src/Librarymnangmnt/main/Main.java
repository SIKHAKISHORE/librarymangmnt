package Librarymnangmnt.main;

import Librarymnangmnt.functions.Systemoperations;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ch;
		char ch1;
		int id;
		Systemoperations ob = new Systemoperations();
		Scanner sc = new Scanner(System.in);
		Scanner ab = new Scanner(System.in);
		do {

			System.out.println("1.To add new book \n2.List of available books \n3.Search for a book \n4.Select book \n ");

			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ob.addBooks();
				break;
			case 2:
				ob.availableBooks();
				break;
			case 3:
				System.out.println("enter id to be searched for");
				id = sc.nextInt();
				ob.searchBook(id);
				break;
			case 4:
				System.out.println("enter required book id");
				id = sc.nextInt();
				ob.searchBook(id);
				break;

			}
			System.out.println("want to continue?");
			ch1 = ab.next().charAt(0);
		} while (ch1 == 's');
sc.close();
ab.close();
	}

}
