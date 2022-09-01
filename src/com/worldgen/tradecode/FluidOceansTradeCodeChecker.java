package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class FluidOceansTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if (atmosphere >= 10
                && hydrographics == 1) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Fl;
    }
}

