package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class LowTechTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int population = uwp.getPopulation();
        int techLevel = uwp.getTechLevel();

        if (population >= 1
                && techLevel <= 5) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Lt;
    }
}

