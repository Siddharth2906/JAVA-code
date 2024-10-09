class demo {
    int id;

    public void show() {
        System.out.println("class demo" + id);
    }
}

class shop extends demo {
    public void show() {
        System.out.println("class shop" + id);
    }
}

class shop12 extends demo {

    public void show() {
        System.out.println("class shop12" + id);
    }
}

public class poly {
    public static void main(String[] args) {
        demo d;
        d = new shop();
        d.id = 21;
        d.show();
        d = new demo();

        d.show();
        d = new shop12();

        d.show();

    }
}
