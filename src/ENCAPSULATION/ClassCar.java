package ENCAPSULATION;
public class ClassCar {
    private int price;
    private String color;
    private char type;
    private boolean isElectric;
	private int weight;
// Shift + ALT + S = TO GET GETTER AND SETTER OPTION WHICH IS FORM = GEN GETTER AND SETTER
	
    public void setClasscar(String color, boolean isElectric, int price, char type, int weight) {
        this.color = color;
        this.isElectric = isElectric;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public char getType() {
        return type;
    }

    public static void main(String[] args) {
        ClassCar c = new ClassCar();
        c.setClasscar("RED", true, 3000, 'o', 1200);

        // GETTERS
        System.out.println(c.getColor());
        System.out.println(c.isElectric());
        System.out.println(c.getPrice());
        System.out.println(c.getType());
        System.out.println(c.getWeight());

        // GETTERS
        ClassCar c1 = new ClassCar();
        c1.setClasscar("weight", false, 8000, 'o', 1200);
        System.out.println(c1.getColor());
        System.out.println(c1.isElectric());
        System.out.println(c1.getPrice());
        System.out.println(c1.getType());
        System.out.println(c1.getWeight());
    }
}
