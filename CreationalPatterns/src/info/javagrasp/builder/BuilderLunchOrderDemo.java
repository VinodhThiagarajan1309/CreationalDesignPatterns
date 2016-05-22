package info.javagrasp.builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.setBread("Wheat");
		builder.setCondiments("Lettuce");
		builder.setDressing("Mustard");
		builder.setMeat("Ham");
		
		LunchOrder lo = builder.build();
		
		System.out.println(lo.getBread());
		System.out.println(lo.getCondiments());
		System.out.println(lo.getDressing());
		System.out.println(lo.getMeat());
	}

}
