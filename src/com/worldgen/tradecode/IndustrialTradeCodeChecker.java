package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class IndustrialTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int population = uwp.getPopulation();

        if (((atmosphere >= 0 && atmosphere <= 2)
                || atmosphere == 4
                || atmosphere == 7
                || (atmosphere >= 9 && atmosphere <= 12))
                && population >= 9) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.In;
    }
}

