public class MutableFinal {
    public static void main(String[] args) {
        

        final StringBuffer sb= new StringBuffer("Omkar");
        sb.append(" Shinde");
        sb.replace(0, sb.length(), "Bhushan");      //This will work because it refer to same object only
        System.out.println(sb);
        // sb = new StringBuffer("Bhushan");        This is invalid beacuse it create new object
    }
}
