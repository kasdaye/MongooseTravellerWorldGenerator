package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

class HighTechTradeCodeChecker implements TradeCodeChecker {
    @Override
    public boolean hasTradeCode(UniversalWorldProfile uwp) {
        boolean hasTradeCode = false;

        int techLevel = uwp.getTechLevel();

        if (techLevel >= 12) {
            hasTradeCode = true;
        }

        return hasTradeCode;
    }

    @Override
    public TradeCode getTradeCode() {
        return TradeCode.Ht;
    }
}

