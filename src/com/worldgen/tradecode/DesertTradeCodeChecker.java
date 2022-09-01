package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class DesertTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if (atmosphere >= 2 && atmosphere <= 9
                && hydrographics == 0) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.De;
    }
}

