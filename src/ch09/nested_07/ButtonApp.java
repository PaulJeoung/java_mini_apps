package ch09.nested_07;

public class ButtonApp {

	public static void main(String[] args) {
		
		Button btnOK = new Button();
		btnOK.setClickListener(new Button.ClickListener() {	
			@Override
			public void onClick() {
				System.out.println("CLICK THE OK BUTTON");
			}
		});
		btnOK.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("CANCEL BUTTON CLICK NOW");
			}
		});
		btnCancel.click();
	}

}
