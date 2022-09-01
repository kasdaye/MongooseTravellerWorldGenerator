package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class LowPopulationTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int population = uwp.getPopulation();

        if (population >= 1 && population <= 3) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Lo;
    }
}

