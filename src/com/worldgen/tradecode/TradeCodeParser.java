package com.worldgen.tradecode;

import com.worldgen.UniversalWorldProfile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TradeCodeParser {
    public Set<TradeCode> parse(String uwpString) {
        UniversalWorldProfile uwp = UniversalWorldProfile.of(uwpString);
        HashSet<TradeCode> tradeCodes = new HashSet<>();
        ArrayList<TradeCodeChecker> tradeCodeCheckers = getTradeCodeCheckers();

        for (TradeCodeChecker tradeCodeChecker : tradeCodeCheckers) {
            if (tradeCodeChecker.hasTradeCode(uwp)) {
                tradeCodes.add(tradeCodeChecker.getTradeCode());
            }
        }

        return tradeCodes;
    }

    private ArrayList<TradeCodeChecker> getTradeCodeCheckers() {
        ArrayList<TradeCodeChecker> tradeCodeCheckers = new ArrayList<>();
        tradeCodeCheckers.add(new AgriculturalTradeCodeChecker());
        tradeCodeCheckers.add(new AsteroidTradeCodeChecker());
        tradeCodeCheckers.add(new BarrenTradeCodeChecker());
        tradeCodeCheckers.add(new DesertTradeCodeChecker());
        tradeCodeCheckers.add(new FluidOceansTradeCodeChecker());
        tradeCodeCheckers.add(new GardenTradeCodeChecker());
        tradeCodeCheckers.add(new HighPopulationTradeCodeChecker());
        tradeCodeCheckers.add(new HighTechTradeCodeChecker());
        tradeCodeCheckers.add(new IceCappedTradeCodeChecker());
        tradeCodeCheckers.add(new IndustrialTradeCodeChecker());
        tradeCodeCheckers.add(new LowPopulationTradeCodeChecker());
        tradeCodeCheckers.add(new LowTechTradeCodeChecker());
        tradeCodeCheckers.add(new NonAgriculturalTradeCodeChecker());
        tradeCodeCheckers.add(new NonIndustrialTradeCodeChecker());
        tradeCodeCheckers.add(new PoorTradeCodeChecker());
        tradeCodeCheckers.add(new RichTradeCodeChecker());
        tradeCodeCheckers.add(new VacuumTradeCodeChecker());
        tradeCodeCheckers.add(new WaterWorldTradeCodeChecker());
        return tradeCodeCheckers;
    }
}
