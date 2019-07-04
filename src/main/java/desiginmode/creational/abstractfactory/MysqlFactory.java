package desiginmode.creational.abstractfactory;

/**
 * @author Jay
 * @date 2019/7/4 22:36
 * @description
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public ILogin createLogin() {
        return new MysqlLogin();
    }
}
