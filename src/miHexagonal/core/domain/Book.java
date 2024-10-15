package miHexagonal.core.domain;

public class Book {
	
    private Long id;
    private String name;
    
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
	public Book(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
}