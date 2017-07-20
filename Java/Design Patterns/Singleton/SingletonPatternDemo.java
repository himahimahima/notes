package Singleton;

public class SingletonPatternDemo {
	public static void main(String[] args){
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();
		
		SingletonObject objec2t = SingletonObject.getInstance();
		objec2t.showMessage();
	}
}
