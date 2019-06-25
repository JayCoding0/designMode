package desiginmode.builder.type2;

/**
 * @author Jay
 * @date 2019/6/25 23:11
 * @description
 */
public class Main {
    public static void main(String[] args) {
        TextBuilder tb = (TextBuilder) new TextBuilder().makeTitle("这是一个标题")
                .makeString("这是一个字符串").makeItems(new String[]{"这是第一条数据"})
                .makeItems(new String[]{"这是第二条数据",
                        "这是第三条数据",
                        "这是第四条数据"
                }).makeTitle("再加一个标题").makeString("最后一个字符").close();
        System.out.println(tb.getResult());
    }
}
