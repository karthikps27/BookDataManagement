package org.karthikps.bookdata.models;

import java.util.List;

public class BookDataReadModel {

	public String kind;
	public String totalItems;
	public List<BookDataItems> items;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public List<BookDataItems> getItems() {
		return items;
	}
	public void setItems(List<BookDataItems> items) {
		this.items = items;
	}	
}
