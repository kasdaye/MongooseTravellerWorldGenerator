import com.worldgen.tradecode.TradeCode;
import com.worldgen.tradecode.TradeCodeParser;

import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);

        TradeCodeParser tradeCodeParser = new TradeCodeParser();
        Set<TradeCode> tradeCodes = tradeCodeParser.parse(parseUwpFromArguments(args));
        String tradeCodesAsString = tradeCodes.stream()
                .map(TradeCode::toString)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(tradeCodesAsString);
    }

    private static String parseUwpFromArguments(String[] args) {
        return args[0];
    }
}