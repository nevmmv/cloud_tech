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
			// will be conflict here
				Car car = new Car("Mazda", 140);
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

		new Thread(new Runnable() {

			@Override
			public void run() {
				Car car2 = new Car("Toyota", 200);
				car2.drive();
			}
		}).start();

	}

}
