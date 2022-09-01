package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class HighPopulationTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int population = uwp.getPopulation();

        if (population >= 9) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Hi;
    }
}

