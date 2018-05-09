package Librarymnangmnt.functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Librarymnangmnt.bean.Librarysystm;

public class Systemoperations {
	public Systemoperations() {
	}

	public void addBooks() {
		ArrayList<Librarysystm> ListOfBooks = new ArrayList<Librarysystm>();
		Scanner sc = new Scanner(System.in);
		Scanner readInput = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			Librarysystm librarysystm = new Librarysystm();
			System.out.println("enter book id ");
			librarysystm.setBookId(sc.nextInt());
			System.out.println("enter book name ");
			librarysystm.setBookName(readInput.nextLine());
			ListOfBooks.add(librarysystm);
			writefile(ListOfBooks);
		}
	}

	public String writefile(List<Librarysystm> ListOfBooks) {

		OutputStream ops = null;
		ObjectOutputStream objOps = null;

		try {
			ops = new FileOutputStream("F:\\Library Systm.txt");
			objOps = new ObjectOutputStream(ops);
			objOps.writeObject(ListOfBooks);
			objOps.flush();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objOps != null)
					objOps.close();
			} catch (Exception ex) {
				ex.printStackTrace();

			}
		}
		return "Successfully added details";
	}

	public List<Librarysystm> availableBooks() {

		ArrayList<Librarysystm> woi = new ArrayList<>();

		try {
			FileInputStream fis = new FileInputStream("F:\\Library Systm.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Librarysystm wo = null;
			Librarysystm[] woj = new Librarysystm[3];

			woi = (ArrayList<Librarysystm>) ois.readObject();

			for (int i = 0; i < woi.size(); i++) {
				System.out.println(woi.get(i).getBookId());
				System.out.println(woi.get(i).getBookName());

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return woi;

	}

	public void searchBook(int id) {
		ArrayList<Librarysystm> woi = new ArrayList<>();

		try {
			FileInputStream fis = new FileInputStream("F:\\Library Systm.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Librarysystm wo = null;
			Librarysystm[] woj = new Librarysystm[3];

			woi = (ArrayList<Librarysystm>) ois.readObject();
			for (int i = 0; i < woi.size(); i++) {
				if (woi.get(i).getBookId() == id) {
					System.out.println(woi.get(i).getBookName());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	int availability[]= {1,1};	
	
public void selectBook(int id)
{
	ArrayList<Librarysystm> woi = new ArrayList<>();
	

	try {
		FileInputStream fis = new FileInputStream("F:\\Library Systm.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Librarysystm wo = null;
		Librarysystm[] woj = new Librarysystm[3];

		woi = (ArrayList<Librarysystm>) ois.readObject();
		for (int i = 0; i < woi.size(); i++) 
		{
			if (woi.get(i).getBookId() == id )
			{
				if(availability[i]==1)
				{
				System.out.println(woi.get(i).getBookName());
				availability[i]=0;
			    }
				else
				{
					System.out.println("Sorry book not available");
				}
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

}
}
