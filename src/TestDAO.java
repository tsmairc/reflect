
public class TestDAO<T> {

	private Class<T> clazz;

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}


	@SuppressWarnings("unchecked")
	public TestDAO() {
		// TODO Auto-generated constructor stub
	}
}
