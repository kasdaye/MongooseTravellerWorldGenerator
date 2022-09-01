package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

interface TradeCodeChecker {

    boolean hasTradeCode(UniversalWorldProfile uwp);

    TradeCode getTradeCode();
}
