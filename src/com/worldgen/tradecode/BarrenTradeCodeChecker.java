package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class BarrenTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int population = uwp.getPopulation();
        int government = uwp.getGovernment();
        int law = uwp.getLaw();

        if (population == 0
                && government == 0
                && law == 0) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ba;
    }
}

