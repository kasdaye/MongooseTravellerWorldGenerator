package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class AsteroidTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int size = uwp.getSize();
        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if (size == 0
                && atmosphere == 0
                && hydrographics == 0) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.As;
    }
}

