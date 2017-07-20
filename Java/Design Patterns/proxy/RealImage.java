package proxy;

public class RealImage implements Image{

	private String fileName;

	public RealImage(String filenName){
		this.fileName = filenName;
		loadFromDisk(filenName);
	}
	private void loadFromDisk(String filenName) {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}


}
