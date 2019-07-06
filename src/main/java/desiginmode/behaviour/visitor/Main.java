package desiginmode.behaviour.visitor;

/**
 * @author Jay
 * @date 2019/7/6 21:20
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Directory dirRoot = new Directory("root");
        Directory dirUser = new Directory("user");
        Directory dirBin = new Directory("bin");
        Directory dirTmp = new Directory("tmp");

        dirRoot.add(dirBin);
        dirRoot.add(dirUser);
        dirRoot.add(dirTmp);
        dirBin.add(new File("bin1", 1024));

        Directory dirAdmin = new Directory("admin");
        dirUser.add(dirAdmin);
        dirUser.add(new File("admin1", 1024));
        dirRoot.printList();
        System.out.println("+========================+");
        dirRoot.accept(new ListVisitor());
    }
}
