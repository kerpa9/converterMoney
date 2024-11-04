import java.util.Scanner;

import com.kevenreyes.converter.ArsToUsd;
import com.kevenreyes.converter.BlrToUsd;
import com.kevenreyes.converter.CopToUsd;
import com.kevenreyes.converter.UsdToArs;
import com.kevenreyes.converter.UsdToBlr;
import com.kevenreyes.converter.UsdToCop;
import com.kevenreyes.services.ConsultApi;

public class App {
    public static void main(String[] args) throws Exception {
        ArsToUsd arsToUsd = new ArsToUsd();
        UsdToArs usdToArs = new UsdToArs();
        BlrToUsd blrToUsd = new BlrToUsd();
        CopToUsd copToUsd = new CopToUsd();
        UsdToBlr usdToBlr = new UsdToBlr();
        UsdToCop usdToCop = new UsdToCop();
        Scanner optionValue = new Scanner(System.in);

        // usdToArs.converterUsdToArs();
        // arsToUsd.converterArsToUsd();
        // blrToUsd.converterBlrToUsd();
        // copToUsd.converterCopToUsd();
        // usdToBlr.converterUsdToBrl();
        // usdToCop.converterUsdToCop();

        String data = """
                        ********** CONVERTER MONEY  ************

                    Welcome to the currency converter app. 

                              1./ Dollar          -> Argentine peso
                              2./ Argentine peso  -> Dollar
                              3./ Dollar          -> Brazilian real
                              4./ Brazilian real  -> Dollar
                              5./ Dollar          -> Colombian peso
                              6./ Colombian peso  -> Dollar
                              7./ Close APP

                    Please choose a valid option.
                """;

        System.out.println(data);

        int option = optionValue.nextInt();
        // while (option != 7) {

        switch (option) {
            case 1:
                System.out.println("Hola");

                break;
            case 2:
                System.out.println("Mundo");

                break;
            case 3:
                System.out.println("Mundo");

                break;
            case 4:
                System.out.println("Mundo");

                break;
            case 5:
                System.out.println("Mundo");

                break;
            case 6:
                System.out.println("Mundo");

                break;
            case 7:
                System.out.println("Thank you for using this app, goodbye");

                break;
        }
        // }

    }
}
