class mouse {
    private int x;
    private int y;

    public mouse() {
        this.x = 10;
        this.y = 20;
    }

    public mouse(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public void printLocation() {
        System.out.println("x =" + this.x + "y =" + this.y);
    }

}