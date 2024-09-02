package ch08.interface_8_08;

public class SmartTelevision implements RemoteControll, Searchable {
	
	@Override
	public void turnOn() {
		System.out.println("+++ TURN ON THE TV NOW !!! +++");
	}
	
	@Override
	public void turnOff() {
		System.out.println("||| TURN OFF THE TV NOW, GOOD NIGHT~~ |||");
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + " --> WEB LINK SEARCHING NOW ][][][][");
	}
}
