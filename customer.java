#Currently, the curry factory has 3 subscribers, a distributor, a shop and a customer.
 class customer {
	 void receiveNewCurryReceipe(String title, String moreContent) {
	        System.out.println("customer Receives...");
	        System.out.println(title);
	        System.out.println(moreContent);
}
}