package desiginmode.factorymethodmode.idcard;

import desiginmode.factorymethodmode.framework.Product;

/**
 * @author Jay
 * @date 2019/5/21 22:27
 * @description 具体产品实现类
 */
public class IDCard extends Product {
    private String owner;

    /**
     * 默认访问权限,只能本包调用
     */
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
