package desiginmode.creational.builder.type1;

/**
 * @author Jay
 * @date 2019/6/25 22:44
 * @description Builder子类, 纯文本写文档
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    /**
     * 标题
     *
     * @param title
     */
    @Override
    public void makeTitle(String title) {
        buffer.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        buffer.append("(" + title + ")\n");
        buffer.append("#############################\n");
        buffer.append("\n");
    }

    /**
     * 内容
     *
     * @param str
     */
    @Override
    public void makeString(String str) {
        buffer.append("$" + str + "\n");
        buffer.append("\n");
    }

    /**
     * 条目
     *
     * @param items
     */
    @Override
    public void makeItems(String[] items) {
        for (String string : items) {
            buffer.append("##" + string + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
    }

    /**
     * 输出文档
     *
     * @return
     */
    public String getResult() {
        return buffer.toString();
    }
}
