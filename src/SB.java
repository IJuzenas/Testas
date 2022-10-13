public class SB {
    public static void main(String[] args) {


        String a = "Liepa";
        String b = "Antradienis";

        StringBuilder sb = new StringBuilder();

        System.out.println(a+b);
        System.out.println(sb.append(a).append(b).reverse());


    }
}
