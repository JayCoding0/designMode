package desiginmode.creational.abstractfactory;


/**
 * @author Jay
 * @date 2019/7/4 22:41
 * @description
 */
public class Main {
    public static void main(String[] args) {
        // 只需要确定实例化哪一个数据库访问对象给factory
        // IFactory factory=new MysqlFactory();
        IFactory factory = new OracleFactory();
        // 已与具体的数据库访问解除了耦合
        IUser userOperation = factory.createUser();
        userOperation.getUser(1);
        userOperation.insert("user");
        // 不同的产品
        ILogin loginOperation = factory.createLogin();
        loginOperation.insert("user");
        loginOperation.getLogin(1);
    }
}
