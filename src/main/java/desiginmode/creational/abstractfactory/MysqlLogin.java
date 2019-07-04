package desiginmode.creational.abstractfactory;

/**
 * @author Jay
 * @date 2019/7/4 23:01
 * @description
 */
public class MysqlLogin implements ILogin {
    @Override
    public void insert(String login) {
        System.out.println("登陆mysql");
    }

    @Override
    public void getLogin(int id) {

        System.out.println("获取mysql登陆id" + id);
    }
}
