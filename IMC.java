/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author loic
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double imc = calcIMC(askDouble("Quelle est votre taille en mètre ?"), askDouble("Quelle est votre poids en kilos ?"));
       String sex = ask("Quel est votre sex (F/M) ?");
       Double age = askDouble("Quel age avez vous ?");
       Double FCmax = calcFCMax(sex, age);
       System.out.println("Super RAPPORT:");
       System.out.println(classification(imc, sex, age, FCmax));
    }
    
    public static double calcIMC(double taille, double poids) {
        return poids / (taille*taille);
    }
    
    public static double askDouble(String question){
        double value;
        try{
            value = Double.parseDouble(ask(question));
        }
        catch(Exception e){
            value = askDouble("Entrer un nombre!");
        }
        return value;
    }
    public static String ask(String question){
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        
        return result;
    }

    private static double calcFCMax(String sex, double age) {
        if(sex.equalsIgnoreCase("M")){
            return 220 - age;
        }
        else if (sex.equalsIgnoreCase("F")){
            return 226 - age;
        } else {
            return calcFCMax(ask("Transgenre ? M ou F ?"), age);
        }
    }

    private static String classification(double imc, String sex, double age, double FCmax) {
        switch(sex){
            case "M" :
                if (imc > 26.4 && imc < 31.1 ) {
                    System.out.println("Faites une activite cardiovasculaire qui vous prend entre "+FCmax*0.7+" et "+FCmax*0.75+" BCPM");
                }else if (imc > 31.1 ) {
                    System.out.println("Allez voir un medecin");
                }else {
                    System.out.println("Tout va bien !");
                }
                break;
            case "F" :
                if (imc > 25.8 && imc < 32.3 ) {
                    System.out.println("Faites une activite cardiovasculaire qui vous prend entre "+FCmax*0.7+" et "+FCmax*0.75+" BCPM");
                }else if (imc > 32.3 ) {
                    System.out.println("Allez voir un medecin");
                }else {
                    System.out.println("Tout va bien !");
                }
                break;
            default :
                System.out.println("oups...");
                break;
        }
        return "merci de votre participation vos données seront vendue à la NSA";
    }
}
