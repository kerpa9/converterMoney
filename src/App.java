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

        // usdToArs.converterUsdToArs();
        // arsToUsd.converterArsToUsd();
        // blrToUsd.converterBlrToUsd();
        // copToUsd.converterCopToUsd();
        // usdToBlr.converterUsdToBrl();
        // usdToCop.converterUsdToCop();

    }
}
