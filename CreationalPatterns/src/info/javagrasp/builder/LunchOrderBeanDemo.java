package info.javagrasp.builder;

public class LunchOrderBeanDemo {
	
	public static void main(String[] args){
		
		LunchOrderBean lob = new LunchOrderBean();
		
		lob.setBread("Wheat");
		lob.setCondiments("Lettuce");
		lob.setDressing("Mustard");
		lob.setMeat("Ham");
		
		System.out.println(lob.getBread());
		System.out.println(lob.getCondiments());
		System.out.println(lob.getDressing());
		System.out.println(lob.getMeat());
	}

}
