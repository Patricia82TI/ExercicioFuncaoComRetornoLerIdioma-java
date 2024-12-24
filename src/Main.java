import java.util.Scanner;

//Faça um programa que leia um idioma selecionado numericamente e exiba "BOM DIA"
//ou "BUENOS DIAS" através de funções com retorno
public class Main {

    static String saudacaoPortugues(){
        return "Bom dia";
    }

    static String saudacaoEspanhol(){
        return "Buenos dias";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um idioma:");
        System.out.println("1 - Português");
        System.out.println("2 - Espanhol");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println(saudacaoPortugues());
                break;

            case 2:
                System.out.println(saudacaoEspanhol());
                break;
        }

    }
}