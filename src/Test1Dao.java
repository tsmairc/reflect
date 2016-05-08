//这样做的好处是继承的时候，会自动获取当前要操作的对象，在
//在查询数据库的时候，可通过反射来组织数据来返回一个List<Test>
//用于通用化查询
public class Test1Dao extends TestDAO<Test> {
}
