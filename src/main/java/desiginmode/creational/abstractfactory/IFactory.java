package desiginmode.creational.abstractfactory;

/**
 * @author Jay
 * @date 2019/7/4 22:26
 * @description 抽象方法
 * 抽象工厂可以生产多个抽象产品
 */
public interface IFactory {
    IUser createUser();

    ILogin createLogin();
}
