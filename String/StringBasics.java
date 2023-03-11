public class StringBasics {
    public static void main(String[] args) {
        

            // IMmputable Sting
        String s = "omkar";
        s.concat("HInde");
        System.out.println(s);

        // Mutable String
            // We use StringBuffer and StringBuilder class 

        StringBuffer obj = new StringBuffer("OMKar");
        System.out.println(obj);
        obj.append("shinde");
        System.out.println(obj);


        
    }   
}
