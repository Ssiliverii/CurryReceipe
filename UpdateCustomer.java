
class Customer implements java.util.Observer {

    private void receiveNewContent(String title, String moreContent) {
        System.out.println("Customer Receives...");
        System.out.println(title);
        System.out.println(moreContent);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof CurryReceipeFactory) {
        	CurryReceipeFactory curryReceipeFactory = (CurryReceipeFactory) o;
            this.receiveNewContent(curryReceipeFactory.getCurrentTitle(), customer.getMoreInfo());
        }
    }
}