package ch09.nested_06;

public class ButtonApp {

	public static void main(String[] args) {
		
		Button btnOK = new Button();
		
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK Button Click!!");
			}
		}
		
		btnOK.setClickListener(new OkListener());
		btnOK.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel Button Click!!");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();

	}

}
