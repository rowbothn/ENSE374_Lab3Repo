import java.util.*;

/*
*
* Filename: ExampleList.java
* Author: Noah Rowbotham (200364559)
*
*/

public class ListElement {
	private ListElement next;
	private ListElement previous;
	private int data;
	
	public ListElement() {
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void addElement(ListElement le) {
		
	}
}
