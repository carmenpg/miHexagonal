package miHexagonal.db_driven_adapter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import miHexagonal.core.domain.Book;

@Entity
public class BookEntity { 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name = "name")
private String name;
   

   
public BookEntity(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}



private Long getId() {
	return id;
}



private void setId(Long id) {
	this.id = id;
}



private String getName() {
	return name;
}



private void setName(String name) {
	this.name = name;
}



public Book toBook(){
return new Book(this.id, this.name);   
}
}