public class ConversaoImpliciaExplicita {
    public static void main(String[] args) {
        double a= 1; //implícita;
        System.out.println(a);

        float b = (float) 1.1234567888888; //explícita
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //explcíta
        System.out.println(d);

        double e = 1.999999999999999;
        int f = (int) e;
        System.out.println(f);
    }
}
