class A {
    // class B {
    // public void display() {
    // System.out.println("B");
    // }
    // }
    final int x = 100;

    public int add() {
        x = 200;
        return x;
    }
}

class B {
    final void print() {
        System.out.println("B");
    }
}

class C extends B {
    void print() {
        System.out.println("c");
    }
}