package br.com;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingRegistry;
import com.knuddels.jtokkit.api.EncodingType;
import com.knuddels.jtokkit.api.ModelType;

import java.math.BigDecimal;
import java.util.List;

public class ContadorDeTokens {
    public static String main() {
        EncodingRegistry registry = Encodings.newDefaultEncodingRegistry();
        Encoding enc = registry.getEncodingForModel(ModelType.GPT_3_5_TURBO);
        int encoded = enc.countTokens("Identifique o perfil de compra de cada cliente.");

        System.out.println(encoded);
        BigDecimal custo =new BigDecimal(encoded)
                .divide(new BigDecimal("1000"))
                .multiply(new BigDecimal("0.0010"));
        System.out.println(custo);
        return "custo";
    }
    public static void main(String[] args) {
        EncodingRegistry registry = Encodings.newDefaultEncodingRegistry();
        Encoding enc = registry.getEncodingForModel(ModelType.GPT_3_5_TURBO);
        int encoded = enc.countTokens("Identifique o perfil de compra de cada cliente.");

        System.out.println(encoded);
        BigDecimal custo =new BigDecimal(encoded)
                .divide(new BigDecimal("1000"))
                .multiply(new BigDecimal("0.0010"));
        System.out.println(custo);
    }
}
