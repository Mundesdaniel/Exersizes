public class DefangIP {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangIP solution = new DefangIP();
        String address1 = "1.1.1.1";
        String address2 = "255.100.50.0";
        System.out.println("Defanged IP address 1: " + solution.defangIPaddr(address1));
        System.out.println("Defanged IP address 2: " + solution.defangIPaddr(address2));
    }
}
