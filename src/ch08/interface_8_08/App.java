package ch08.interface_8_08;

public class App {

	public static void main(String[] args) {
		
		RemoteControll remoteControll = new SmartTelevision();
		remoteControll.turnOn();
		remoteControll.turnOff();
		
		System.out.println();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("https://www.youtube.com");
	}

}
