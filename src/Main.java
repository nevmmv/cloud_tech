/**
 * 
 */

/**
 * @author Nikolay
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				Car car = new Car("Mersedes", 100);
				car.drive();
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				Car car2 = new Car("LADA");
				car2.drive();
			}
		}).start();

	}

}
