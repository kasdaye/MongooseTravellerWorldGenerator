package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class GardenTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int size = uwp.getSize();
        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();

        if (size >= 6 && size <= 8
                && (atmosphere == 5 || atmosphere == 6 || atmosphere == 8)
                && hydrographics >= 5 && hydrographics <= 7) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ga;
    }
}

