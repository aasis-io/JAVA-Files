class pen {
    private String color;
    private String brand;
    private int price;

    public void setDetail(String _color, String _brand, int _price) {
        this.color = _color;
        this.brand = _brand;
        this.price = _price;
    }

    public void getDetail() {
        System.out.println("pen " + this.color + this.brand + this.price);
    }
}