package desiginmode.creational.builder.type2;

/**
 * @author Jay
 * @date 2019/6/25 23:06
 * @description
 */
public class TextBuilder implements Builder {
    /**
     * 文档内容保存在其中
     */
    private StringBuffer buffer = new StringBuffer();

    public TextBuilder() {
        super();
    }

    @Override
    public Builder makeTitle(String title) {
        buffer.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        buffer.append("(" + title + ")\n");
        buffer.append("#############################\n");
        buffer.append("\n");
        //直接将实例本身返回,实现链式调用
        return this;
    }

    @Override
    public Builder makeString(String str) {
        buffer.append("$" + str + "\n");
        buffer.append("\n");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (String string : items) {
            buffer.append("##" + string + "\n");
        }
        buffer.append("\n");
        return this;
    }

    @Override
    public Builder close() {
        buffer.append("%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
        return this;
    }

    public String getResult() {
        //变化为String
        return buffer.toString();
    }
}
