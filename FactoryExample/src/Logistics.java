abstract class Logistics {

    public String planDelivery(){
        Transport t = createTransport();
        return "Using " + t.deliver();
    }

    public abstract Transport createTransport();
}
