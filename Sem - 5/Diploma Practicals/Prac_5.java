

public class Prac_5 {
    public static void main(String args[]) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length(); //length() method 
        System.out.println(value);

        String lstring = name.toLowerCase(); // toLowerCase()
        System.out.println(lstring);

        String ustring = name.toUpperCase(); // toUpperCase()
        System.out.println(ustring);

        String nonTrimmedString = "     Raj     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim(); //trim()
        System.out.println(trimmedString);

        System.out.println(name.substring(1));// substring()
        System.out.println(name.substring(1,5)); // substring()

        System.out.println(name.replace('r', 'p')); //replace()
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har")); //startsWith()
        System.out.println(name.endsWith("dd")); // endsWith()

        System.out.println(name.charAt(4)); //charAt()

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry")); //index()
        System.out.println(modifiedName.lastIndexOf("rry", 7)); // lastIndexOf()

        System.out.println(name.equals("Harry")); //equals()
        System.out.println(name.equalsIgnoreCase("HarRY")); // equalsignorecase()

        System.out.println("I am escape sequence\tdouble quote");
    }
}