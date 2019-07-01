package desiginmode.creational.builder.type3;

/**
 * @author Jay
 * @date 2019/6/25 23:14
 * @description
 */
public class Student {
    private final int age;
    private final int weight;
    private final int height;
    private final int size;
    private final String name;

    @Override
    public String toString() {
        return "Student [age=" + age + ", weight=" + weight + ", height=" + height + ", size=" + size + ", name=" + name
                + "]";
    }

    /**
     * 创建静态内部类
     * 属性都有默认值,若是未定义则是默认值,再次定义会将其覆盖
     */
    public static class Bulider {
        private final int age;
        private final int weight;
        private int height = 0;
        private int size = 0;
        private String name = null;

        public Bulider(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Bulider heiht(int val) {
            //每次返回本身实例,则可以实现属性随意组合,
            height = val;
            return this;
        }

        public Bulider size(int val) {
            size = val;
            return this;
        }

        public Bulider name(String val) {
            name = val;
            return this;
        }

        public Student bulid() {     //最后调用此方法会生成所需实例
            return new Student(this);
        }
    }

    private Student(Bulider bulider) {   //私有构造属性,外界无法调用,内部类可以调用
        age = bulider.age;
        height = bulider.height;
        size = bulider.size;
        name = bulider.name;
        weight = bulider.weight;
    }

    public static void main(String[] args) {
        Student stu = new Student.Bulider(18, 2).heiht(20).name("张三").bulid();
        System.out.println(stu);
    }
}
