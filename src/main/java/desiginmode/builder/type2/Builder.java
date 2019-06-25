package desiginmode.builder.type2;

/**
 * @author Jay
 * @date 2019/6/25 23:03
 * @description 声明编写文档方法的接口
 */
public interface Builder {
    Builder makeTitle(String title);

    Builder makeString(String str);

    Builder makeItems(String[] items);

    Builder close();
}
