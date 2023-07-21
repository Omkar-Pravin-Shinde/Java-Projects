public class demo{
    private int roll;
    private String name;
    
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class GetterSetter {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.setRoll(15);
        d1.setName("Omkar");
        System.out.println(d1.getRoll()+ " "+ d1.getName());
    }
}
