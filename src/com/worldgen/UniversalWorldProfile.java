package com.worldgen;

public class UniversalWorldProfile {
    private final String starport;
    private final String size;
    private final String atmosphere;
    private final String hydrographics;
    private final String population;
    private final String government;
    private final String law;
    private final String techLevel;

    private UniversalWorldProfile(String starport,
                                  String size,
                                  String atmosphere,
                                  String hydrographics,
                                  String population,
                                  String government,
                                  String law,
                                  String techLevel) {
        this.starport = starport;
        this.size = size;
        this.atmosphere = atmosphere;
        this.hydrographics = hydrographics;
        this.population = population;
        this.government = government;
        this.law = law;
        this.techLevel = techLevel;
    }

    public String getStarport() {
        return starport;
    }

    public int getSize() {
        return Integer.parseInt(size, 16);
    }

    public int getAtmosphere() {
        return Integer.parseInt(atmosphere, 16);
    }

    public int getHydrographics() {
        return Integer.parseInt(hydrographics, 16);
    }

    public int getPopulation() {
        return Integer.parseInt(population, 16);
    }

    public int getGovernment() {
        return Integer.parseInt(government, 16);
    }

    public int getLaw() {
        return Integer.parseInt(law, 16);
    }

    public int getTechLevel() {
        return Integer.parseInt(techLevel, 16);
    }

    public static UniversalWorldProfile of(String uwp) {
        // Assumes UWP format of X123456-7
        return new UniversalWorldProfile(uwp.substring(0, 1),
                uwp.substring(1, 2),
                uwp.substring(2, 3),
                uwp.substring(3, 4),
                uwp.substring(4, 5),
                uwp.substring(5, 6),
                uwp.substring(6, 7),
                uwp.substring(8, 9));
    }
}
