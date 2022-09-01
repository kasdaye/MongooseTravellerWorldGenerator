package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class PoorTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if (atmosphere >= 2 && atmosphere <= 5
                && hydrographics >= 0 && hydrographics <= 3) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Po;
    }
}

