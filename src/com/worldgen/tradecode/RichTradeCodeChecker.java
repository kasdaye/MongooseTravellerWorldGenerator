package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class RichTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int population = uwp.getPopulation();
        int government = uwp.getGovernment();

        if ((atmosphere == 6 || atmosphere == 8)
                && population >= 6 && population <= 8
                && government >= 4 && government <= 9) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ri;
    }
}

