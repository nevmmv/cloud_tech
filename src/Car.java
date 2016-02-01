/**
 * 
 */

/**
 * @author Nikolay
 *
 */
public class Car {
	private int velocity = 170;
	private String name;

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, int velocity) {
		this.name = name;
		this.velocity = velocity;
	}

	public void setVelocity(int v) {
		this.velocity = v;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getVelocity() {
		return this.velocity;
	}

	public String getName() {
		return this.name;
	}

	public void drive() {
		System.out.println("Drive..." + this);
		for (int i = 0; i < 30; ++i) {
			System.out.println("= I am " + "[" + getName() + ",velocity=" + getVelocity() + "]" + '=');
			try {
				Thread.sleep(10000 / getVelocity());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " finish!");
	}

	public String toString() {
		return "Car[" + getName() + ",velocity=" + getVelocity() + "]";
	}
}
