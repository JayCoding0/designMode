package desiginmode.creational.abstractfactory;

/**
 * @author Jay
 * @date 2019/7/4 23:03
 * @description
 */
public class OracleLogin implements ILogin {
    @Override
    public void insert(String login) {
        System.out.println("登陆oracle");
    }

    @Override
    public void getLogin(int id) {

        System.out.println("获取oracle登陆id" + id);
    }
}
