package AccessModifiers.CorePackage;

public class AnotherClass {
    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass(6);
        System.out.println("Default Class: " + defaultClass.x);

        ProtectedExample prot = new ProtectedExample(44);
        prot.protectedValue = 90;
    }

}
