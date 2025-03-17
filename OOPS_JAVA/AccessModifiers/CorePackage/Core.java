package AccessModifiers.CorePackage;

import AccessModifiers.PublicClass;

public class Core {
    PublicClass cls = new PublicClass(3); // class from another package
}

class DefaultClass {
    // default members are accessible only within the same package
    int x;

    DefaultClass(int x) {
        this.x = x;
    }
}