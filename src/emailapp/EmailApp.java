package emailapp;
public class EmailApp{
    public static void main(String[] args) {
        Email em1 = new Email("Simon", "Hansen");

        em1.setAlternateEmail("jvc@SAMSUNG.com");
        System.out.println("Alternate email: " + em1.getAlternateEmail());
    }
}
