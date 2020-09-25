package hotelReservation;

public class PriceCalculator {

    public double calculate(Reservation reservation){
        double sumBeforeDiscount=reservation.getPricePerDay()*reservation.getNumberOfDays()*reservation.getSeason().getMultiplier();
        double percent=1 -(reservation.getDiscount().getPercentDiscount()/100.0);
        double sumAfterDiscount=sumBeforeDiscount*percent;

        return sumAfterDiscount;
    }

}
