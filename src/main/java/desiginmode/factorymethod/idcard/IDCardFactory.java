package desiginmode.factorymethod.idcard;

import desiginmode.factorymethod.framework.Factory;
import desiginmode.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jay
 * @date 2019/5/21 22:34
 * @description
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList<String>();

    @Override
    public void registerProduct(Product p) {
        owners.add(((IDCard) p).getOwner());
    }

    /**
     * 修饰符为类访问,外界无法直接通过创建对象,只能父类接收,调用父类创造类的模板
     *
     * @param owner
     * @return
     */
    @Override
    protected Product createProduct(String owner) {
        //构造方法为包级别,只能本包使用,所以只能通过本类调用
        return new IDCard(owner);
    }
}
