
public class TestDAO<T> {

	private Class<T> clazz;

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	//这里定义好clazz
	//获取父类的泛型类型，放入到clazz
	//因为这个类专用于继承，继承者便会执行父类构造函数，获取父类泛型的类型放入到clazz中
	//这个clazz是用于组织数据（通有化）
	@SuppressWarnings("unchecked")
	public TestDAO() {
		// TODO Auto-generated constructor stub
	}
}
