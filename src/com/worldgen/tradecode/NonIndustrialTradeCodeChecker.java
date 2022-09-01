package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class NonIndustrialTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int population = uwp.getPopulation();

        if (population >= 4 && population <= 6) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ni;
    }
}

