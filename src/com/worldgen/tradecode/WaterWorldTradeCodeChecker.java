package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class WaterWorldTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if (((atmosphere >= 3 && atmosphere <= 9) || atmosphere >= 13)
                && hydrographics >= 10) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Wa;
    }
}

