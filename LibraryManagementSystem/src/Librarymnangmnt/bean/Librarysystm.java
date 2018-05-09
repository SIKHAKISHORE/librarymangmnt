package Librarymnangmnt.bean;

import java.io.Serializable;
import java.util.Date;

public class Librarysystm implements Serializable {
	String bookName;
	int bookId;
	String name;
	int fine;
	Date issuedate;

	public Librarysystm() {
	}

	public Librarysystm(String bookName, int bookId) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	@Override
	public String toString() {
		return "Librarysystm [bookName=" + bookName + ", bookId=" + bookId + "]";
	}

}
