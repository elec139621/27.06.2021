package projecta;

public class Taxi implements IRide {

	protected double m_fuel;

	public Taxi(double m_fuel) {
		super();
		this.m_fuel = m_fuel;
	}

	public void ride(double km) throws OutOfFuelException  {
		if (km / 10.0 >= m_fuel) {
			m_fuel -= (km / 10.0);
			System.out.println("performing ride!");
			return;
		}
		throw new OutOfFuelException("".format(
				"ride for %f KM requires too much fuel. i only have %f", 
				km, m_fuel));
	}
	
	@Override
	public String toString() {
		return "Taxi [m_fuel=" + m_fuel + "]";
	}
	
	
	
}
