class mathOperation {

    int n1 = 10, n2 = 5;

    public void add() {
        System.out.println("Added Value = " + (n1 + n2));
    }

    public void sub() {
        System.out.println("Substracted Value = " + (n1 - n2));
    }

    public void multiply() {
        System.out.println("Product Value = " + (n1 * n2));
    }

    public void divide() {
        System.out.println("Divided Value = " + (n1 / n2));
    }

    public static void main(String[] args) {
        mathOperation addition = new mathOperation();
        mathOperation substraction = new mathOperation();
        mathOperation product = new mathOperation();
        mathOperation division = new mathOperation();

        addition.add();
        substraction.sub();
        product.multiply();
        division.divide();

    }
}
