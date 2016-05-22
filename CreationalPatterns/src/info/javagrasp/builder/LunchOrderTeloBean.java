package info.javagrasp.builder;

public class LunchOrderTeloBean {
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderTeloBean(String bread){
		this.bread = bread;
	}
	
	public LunchOrderTeloBean(String bread, String condiments){
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderTeloBean(String bread, String condiments, String dressing){
		this(bread,condiments);
		this.dressing = dressing;
	}
		
	
	public LunchOrderTeloBean(String bread,
			String condiments, String dressing, 
			String meat) {
		// TODO Auto-generated constructor stub
		this(bread,condiments,dressing);
		this.meat = meat;
	}


	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	
	public String getDressing() {
		return dressing;
	}
	
	public String getMeat() {
		return meat;
	}
	
	

}
