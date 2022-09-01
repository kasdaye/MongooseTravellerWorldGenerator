package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class IceCappedTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if ((atmosphere == 0 || atmosphere == 1)
                && hydrographics >= 1) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ic;
    }
}

