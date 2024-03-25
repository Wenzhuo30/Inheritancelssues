import java.time.LocalDate;

public class PastEvents extends Event{
    public static final double eventCost = 10000;

    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;

    public void PastEvent(LocalDate eventStartDate,LocalDate eventEndDate,String paymentStatus,boolean requiresExtension){
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }

    public LocalDate getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public LocalDate getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean getRequiresExtension() {
        return   requiresExtension ;
    }

    public void setRequiresExtension(boolean requiresExtension ) {
        this.requiresExtension = requiresExtension;
    }

    public void calculateEventCost(){}


    public String paymentDetails(double eventCost, String paymentStatus, boolean requiresExtension){
        return "The event cost was "+eventCost +
        " and the payment status is " + paymentStatus + "." +
        "The Customer requires extension?:" + requiresExtension + ".";
    }

    public String toString(){

        return paymentDetails(baseEventCost, paymentStatus, requiresExtension);
    }
}
