package AccessModifiers;

import AccessModifiers.CorePackage.ProtectedExample;
/* 

..................................................................................................
. Access Modifier . Same Class . Same Package . Subclass (Different Package) . Different Package .
..................................................................................................
.    public       .    Yes     .     Yes      .            Yes               .       Yes         .
..................................................................................................
.   protected     .    Yes     .     Yes      .            Yes               .       No          .
..................................................................................................
.    default      .    Yes     .     Yes      .            No                .       No          .
..................................................................................................
.    private      .    Yes     .     No       .            No                .       No          .
..................................................................................................

 */

public class PublicClass {
    // public members can be accessed from anywhere, even in different package
    int a;

    public PublicClass(int a) {
        this.a = a;
    }
}

class AccessModifiers {
    public static void main(String[] args) {

        PrivateExample pc = new PrivateExample(89);
        PrivateExample.NonPrivateInnerClass npc = pc.new NonPrivateInnerClass();
        System.out.println("non private inner class value: " + npc.x);

        ProtectedExample prot = new ProtectedExample(4);
        // System.out.println(prot.protectedValue); // ❌ only inside the package where
        // ProtectedExample is or inside the subclass like UseProtectedClass

        UseProtectedClass useProt = new UseProtectedClass(34);
        System.out.println(useProt.getProtectedValue());
    }
}

// private keyword can't be used directly here for PrivateExample class, it can
// be used only for Inner classes. same goes with protected as well
class PrivateExample {
    private int privateValue;

    PrivateExample(int x) {
        this.privateValue = x;
        System.out.println(InnerClass.getPI());
    }

    int getValue() {
        return this.privateValue;
    }

    private class InnerClass {
        static double getPI() {
            return 3.14;
        }
    }

    class NonPrivateInnerClass {
        int x = 10;
    }

}

class UseProtectedClass extends ProtectedExample {

    UseProtectedClass(int val) {
        super(val);
    }

    int getProtectedValue() {
        return super.protectedValue;
    }

}