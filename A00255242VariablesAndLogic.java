/* 

NAME : SAMA MANIKANTA REDDY
STUDENT ID : A00255242
PROGRAM DESCRIPTION : JAV-1001-50733-APP DEVELOPMENT FOR ANDROID-APPLIED ACTIVITIES-LABS
                        VARIABLES AND LOGIC

*/

import java.util.Scanner;

public  class A00255242VariablesAndLogic {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        /*  values to be coverted are collected from the users using Scanner class */

        System.out.println(" Please enter the value to be converted ");
        Double givenvalue = scanner.nextDouble();

        System.out.println(" Please enter the digit beside the desired convertion ");
        System.out.println(" 1 - kilometers to miles");
        System.out.println(" 2 - miles to kilometers");
        System.out.println(" 3 - centimeters to inches");
        System.out.println(" 4 - inches to centimeters");
        System.out.println(" 5 - kilograms to pounds");
        System.out.println(" 6 - pounds to kilograms");
        System.out.println(" 7 - grams to ounce");
        System.out.println(" 8 - ounce to grams");
        System.out.println(" 9 - litres to cups");
        System.out.println(" 10 - cups to litres");
        System.out.println(" 11 - celcuis to fahrenheit");
        System.out.println(" 12 - fahrenheit to celcuis");

        int convertionUnit = scanner.nextInt();

        /* Switch statement is used to make our job easy by easily navigating between the user entered vales*/
        
        switch(convertionUnit)
        {
            case 1:
            Double valueinmiles = (0.62)*givenvalue;
            System.out.println(givenvalue+" kilometers is equals to " + valueinmiles + " miles ");
            break;
            case 2:
            Double valueinkilometers = (1.61)*givenvalue;
            System.out.println(givenvalue+" miles is equals to " + valueinkilometers + " kilometers");
            break;
            case 3:
            Double valueininches = (0.39)*givenvalue;
            System.out.println(givenvalue+" centimeters is equals to " + valueininches + " inches ");
            break;
            case 4:
            Double valueincentimeters = (2.54)*givenvalue;
            System.out.println(givenvalue+" inches is equals to " + valueincentimeters + " centimeters ");
            break;
            case 5:
            Double valueinpounds = (2.2)*givenvalue;
            System.out.println(givenvalue+" kilograms is equals to " + valueinpounds + " lbs ");
            break;
            case 6:
            Double valueinkilograms = (0.45)*givenvalue;
            System.out.println(givenvalue+" lbs is equals to " + valueinkilograms + " kilograms ");
            break;
            case 7:
            Double valueinounce = (0.04)*givenvalue;
            System.out.println(givenvalue+" grams is equals to " + valueinounce + " ounce ");
            break;
            case 8:
            Double valueingrams = (28.35)*givenvalue;
            System.out.println(givenvalue+" ounce is equals to " + valueingrams + " grams ");
            break;
            case 9:
            Double valueincups = (4.17)*givenvalue;
            System.out.println(givenvalue+" litres is equals to " + valueincups + " cups ");
            break;
            case 10:
            Double valueinlitres = (0.24)*givenvalue;
            System.out.println(givenvalue+" cups is equals to " + valueinlitres + " litres ");
            break;
            case 11:
            Double valueinfahrenheit = (givenvalue)*(1.85)+32;
            System.out.println(givenvalue+" celcuis is equals to "+ valueinfahrenheit + " fahrenheit ");
            break;
            case 12:
            Double valueincelcuis = (givenvalue-32)*(0.55555556);
            System.out.println(givenvalue+" fahrenheit is equals to "+ valueincelcuis +" celcuis ");
            break;
            default:
            System.out.println("enter a valid option");
        }
    
    }
    
}
