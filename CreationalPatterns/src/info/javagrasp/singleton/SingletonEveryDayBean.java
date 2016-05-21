package info.javagrasp.singleton;

public class SingletonEveryDayBean {
	
	public static void main(String[] args){
	Runtime singletonRunTime = Runtime.getRuntime();
	System.out.println(singletonRunTime.hashCode());
	Runtime secondInstanceOfSingleton = Runtime.getRuntime();
	System.out.println(secondInstanceOfSingleton.hashCode());
	}
}
