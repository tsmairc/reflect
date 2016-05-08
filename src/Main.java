import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		//传入当前对象，然后自动读出字段的名和字段的值 
		Test aTest  = new Test("wo shi mai rong chao",1);
		Class clazz = Test.class;
		Field field = null;
		field = clazz.getDeclaredField("b");
		field.setAccessible(true);
		
		System.out.println(field.get(aTest));
	}

	//此处可做一个函数用于提取任意对象的变量，用于拼成一个字符串（通用化功能）
}
