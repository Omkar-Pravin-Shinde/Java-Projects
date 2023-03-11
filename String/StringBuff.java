public class StringBuff {
    public static void main(String[] args) {
        

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnopq");
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnopqrs");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());


        // StringBuilder sb2 = new StringBuilder("omkar");
        // System.out.println(sb2.capacity());
        // System.out.println(sb2.charAt(1));
        // sb2.setCharAt(1,'b');
        // System.out.println(sb2);

        StringBuffer sb2 = new StringBuffer(150);
        System.out.println(sb2.capacity());
        sb2.append("java");
        sb2.trimToSize();           //use to make capacity same as size
        System.out.println(sb2.capacity());
        System.out.println(sb2.reverse());
    }
}
