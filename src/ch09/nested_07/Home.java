package ch09.nested_07;

public class Home {
	private RemoteControl remoteControl = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TURN ON TV NOW");
		}	
		@Override
		public void turnOff() {
			System.out.println("TURN OFF TV NOW");
		}
	};
	
	public void use1() {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	public void use2() {
		RemoteControl remoteControl = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("TURN ON THE AIRCONTIONER");
			}
			@Override
			public void turnOff() {
				System.out.println("TURN OFF THE AIRCONTIONER");
			}
		};
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	public void user3(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
}
