package se.mbaeumer.solidexample;

import java.util.Calendar;
import java.util.Date;

public class SuperExpressOrder extends Order{
    @Override
    public Date calculateExpectedDeliveryDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }
}
