import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> HM = new HashMap<>();
        HM.put("um", 1);
        HM.put("dois", 2);
        HM.put("tres", 3);
        HM.put("quatro", 4);

        int numero = HM.get("tres");
        System.out.println("O numero é " + numero);

        HM.put("quatro", 5); //modifica o valor

        HM.remove("tres"); // remove o valor

        System.out.println(HM);
    }
}