package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class NonAgriculturalTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int atmosphere = uwp.getAtmosphere();
        int hydrographics = uwp.getHydrographics();
        int population = uwp.getPopulation();

        if (atmosphere >= 0 && atmosphere <= 3
                && hydrographics >= 0 && hydrographics <= 3
                && population >= 6) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Na;
    }
}

