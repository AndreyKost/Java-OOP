package hotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4),
    ;

    public int getMultiplier() {
        return multiplier;
    }

    private int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }



}
