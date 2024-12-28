public class RemoveWhitespaces {

    public static void remove(String str) {
        String result = str.replaceAll("\\s+", "");
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "I am very happy today";

        remove(str);
    }
}
