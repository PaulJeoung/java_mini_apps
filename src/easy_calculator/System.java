/* 
 * Author        : pj
 * Class Name    : System.java
 * modified date : 2024-08-29
 * description   : 계산기 전원 ON/OFF
 * */

package easy_calculator;

public class System {
	
	boolean power;
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	boolean isPower() {
		if (power == true) {
			return true;
		} else {
			return false;
		}
	}
	
}