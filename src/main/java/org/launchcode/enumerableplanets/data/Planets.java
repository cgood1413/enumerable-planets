package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("mercury", 88, 2440),
    VENUS("venus", 225, 6052),
    EARTH("earth", 365, 6371),
    MARS("mars", 687, 3390),
    JUPITER("jupiter", 4333, 69911),
    SATURN("saturn", 10759, 58232),
    URANUS("uranus", 30687, 25362),
    NEPTUNE("neptune", 60200, 24622);

    private final String planetName;
    private final int yearLength;
    private final int radiusKm;

    Planets(String planetName, int yearLength, int radiusKm) {
        this.planetName = planetName;
        this.yearLength = yearLength;
        this.radiusKm = radiusKm;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getRadius() {
        return radiusKm;
    }
}