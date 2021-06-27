package swing4;

public class Person {

	protected int m_id;
	protected String m_name;
	protected String m_address;
	protected float m_height;

	public Person(int m_id, String m_name, String m_address, float m_height) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_address = m_address;
		this.m_height = m_height;
	}
	
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public float getM_height() {
		return m_height;
	}
	public void setM_height(float m_height) {
		this.m_height = m_height;
	}

	@Override
	public String toString() {
		return "Person [m_id=" + m_id + ", m_name=" + m_name + ", m_address=" + m_address + ", m_height=" + m_height
				+ "]";
	}


	
}
