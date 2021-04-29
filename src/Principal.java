import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rodolfo rudi = new Rodolfo();
        int contador = 1;

        System.out.println("Digite enter enquanto Rudi não acordar");
        while (!rudi.estaAcordado() && entrada.nextLine().isBlank()) {
            System.out.println(FrasesUtils.frases.get(contador));
            rudi.tentarAcordar();
            if (rudi.estaAcordado()) {
                System.out.println(FrasesUtils.FRASE_ALIVIO);
            }
            if (contador == 11) System.out.println(FrasesUtils.FRASE_TERROR);
            else contador++;
        }
    }
}
