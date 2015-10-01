class B {
    private int value;
    public B () {
        value = 3;
    }
    public int getD() {
        return 2 * value;
    }
    public void setV(int v) {
        value = v + value;
    }

    public static void main(String[] args) {
        int value = 3;
        B mymy = new B();
        mymy.setV(value);
        System.out.println(value + mymy.getD());
    }
}
