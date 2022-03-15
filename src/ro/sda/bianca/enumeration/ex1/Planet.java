package ro.sda.bianca.enumeration.ex1;

public enum Planet {
    JUPITER("Jupiter", "Huge", 414124),
    PLUTO("Pluto", "Small", 43125123),
    TERRA("Terra", "Medium", 0),
    SATURN("Saturn", "ExtraHuge", 1645454);

    private final String prettyName;
    private final String size;
    private final long distanceFromTerra;

    Planet(String prettyName, String size, long distanceFromTerra) { //este private by default
        this.prettyName = prettyName;
        this.size = size;
        this.distanceFromTerra = distanceFromTerra;

    }

    public long distanceFromEarth(){
        return distanceFromTerra;
    }

    @Override
    public String toString() {
        return size + " " + prettyName;
    }
}
