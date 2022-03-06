import java.util.Scanner;

public class HumorTeste {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int tristometro = 0;
            int alegrometro = 0;
            String alegre = ":-)";
            String triste = ":-(";
            String emoticonEscolhido;
            System.out.println("Olá, digite uma sequência de 4 emoticons de acordo com seu humor atual :-) ou :-( ");
            emoticonEscolhido = scan.nextLine();
            String aux = emoticonEscolhido;

            int i;

            i = emoticonEscolhido.indexOf(alegre);

            while (i != -1) {
                alegrometro += i;
                emoticonEscolhido = emoticonEscolhido.substring(1 + 3);
                i = emoticonEscolhido.indexOf(alegre);
            }

            i = aux.indexOf(triste);

            while (i != -1) {
                tristometro += 1;
                aux = aux.substring(i + 3);
                i = aux.indexOf(triste);
            }

            if (alegrometro > tristometro) {

                System.out.println("Divertido");
            }
            else if (alegrometro < tristometro) {

                System.out.println("Chateado");
            }
            else {
                System.out.println("Neutro");
            }
        }

    }



