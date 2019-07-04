package desiginmode.creational.abstractfactory;

/**
 * @author Jay
 * @date 2019/7/4 22:40
 * @description
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public ILogin createLogin() {
        return new OracleLogin();
    }
}
