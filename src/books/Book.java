package books;

public class Book {
	private int Id;
	private String name;
	private String count;
	
	Book(){}
	Book(String name,String count){
		this.name=name;
		this.count=count;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCount() {
		return count;
	}


	public void setCount(String count) {
		this.count = count;
	}


		
	
	
	
}
