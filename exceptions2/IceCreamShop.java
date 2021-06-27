package projecta;

public class IceCreamShop {
	
	protected int m_valina;
	
	public IceCreamShop() {
		m_valina = 10;
	}
	
	public void GiveVanillaIcecream() throws OutOfVanillaException {
		if (m_valina > 0) {
			System.out.println("Giving vanilla ice cream");
			m_valina--;
		}
		else
		{
			//System.out.println("no more ice cream");
			throw new OutOfVanillaException();
		}
	}

}
