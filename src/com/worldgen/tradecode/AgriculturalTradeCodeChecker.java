package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class AgriculturalTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();
        int population = uwp.getPopulation();

        if (atmosphere >= 4 && atmosphere <= 9
                && hydrographics >= 4 && hydrographics <= 8
                && population >= 5 && population <= 7) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ag;
    }
}

