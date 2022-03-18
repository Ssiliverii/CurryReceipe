class CurryReceipeFactory extends CurryReceipe {

    private Customer customer;
    private Distributor distributor;
    private Shop shop;
	private Object getCurrentTitle;

    CurryReceipeFactory(Customer customer, Distributor distributor, Shop shop) {
        this.Customer = customer;
        this.Distributor = distributor;
        this.Shop = shop;
    }

    void onNewContent() {
    	customer.receiveNewCurry(this.getCurrentTitle, this.getMoreInfo());
    	distributor.receiveNewCurryReceipe(this.getCurrentTitle, this.getMoreInfo());
    	shop.receiveNewCurry(this.getCurrentTitle, this.getMoreInfo());
    }

	private Object getMoreInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCurrentTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}

