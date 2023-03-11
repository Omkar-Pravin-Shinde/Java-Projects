class StringCompare{
    public static void main(String[] args) {
        

        String s1 = "omkar";
        String s2 = new String("omkar");
        String s3 = new String("Omkar");
        
        System.out.println(s1==s2); //== cheacks refernces
        System.out.println(s1.equals(s2));   //checks character 
        System.out.println(s1.equalsIgnoreCase(s3));    //checks character and ignore upper and lower cases.
    }
}