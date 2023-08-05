package se.mbaeumer.solidexample;

public abstract class PaymentInstrument {
    public abstract boolean validate();
    public abstract void runFraudCheck();
}
