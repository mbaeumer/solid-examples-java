package se.mbaeumer.solidexample;

import java.util.Calendar;
import java.util.Date;

public class ExpressOrder extends Order{
    @Override
    public Date calculateExpectedDeliveryDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        return calendar.getTime();
    }
}
