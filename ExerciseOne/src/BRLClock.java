public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert(Clock clock) {
        switch(clock){
            case USClock usClock ->{
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ?
                        usClock.getHour() + 12 :
                        usClock.getHour();
            }
            case BRLClock brlClock -> {
                this.hour = brlClock.getHour();
            }
        }
        return this;
    }
}
