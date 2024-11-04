import java.util.Scanner;

import com.kevenreyes.converter.ArsToUsd;
import com.kevenreyes.converter.BlrToUsd;
import com.kevenreyes.converter.CopToUsd;
import com.kevenreyes.converter.UsdToArs;
import com.kevenreyes.converter.UsdToBlr;
import com.kevenreyes.converter.UsdToCop;
// import com.kevenreyes.services.ConsultApi;

public class App {
    public static void main(String[] args) throws Exception {
        ArsToUsd arsToUsd = new ArsToUsd();
        UsdToArs usdToArs = new UsdToArs();
        BlrToUsd blrToUsd = new BlrToUsd();
        CopToUsd copToUsd = new CopToUsd();
        UsdToBlr usdToBlr = new UsdToBlr();
        UsdToCop usdToCop = new UsdToCop();
        Scanner optionValue = new Scanner(System.in);

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
        int option1 = 0;

        while (option1 != 7) {

            System.out.println(data);

            int option = optionValue.nextInt();

            switch (option) {
                case 1:

                    usdToArs.converterUsdToArs();

                    break;
                case 2:

                    arsToUsd.converterArsToUsd();

                    break;
                case 3:

                    usdToBlr.converterUsdToBrl();

                    break;
                case 4:

                    blrToUsd.converterBlrToUsd();

                    break;
                case 5:
                    usdToCop.converterUsdToCop();

                    break;
                case 6:

                    copToUsd.converterCopToUsd();

                    break;
                case 7:
                    System.out.println("Thank you for using this app, goodbye");

                    break;
            }

            option1 = option;
        }

    }
}
