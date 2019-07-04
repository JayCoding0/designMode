package desiginmode.creational.abstractfactory;


/**
 * @author Jay
 * @date 2019/7/4 22:32
 * @description 抽象零件接口
 */
public interface IUser {
    void insert(String tableName);

    IUser getUser(int uid);
}
