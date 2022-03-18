This Curry Receipe factory, has a complex algorithm of creating new receipes. It wants to send the newly created receipes to it’s subscribers but it doesn’t know how to do it.

Currently, it has 3 subscribers, customer, distributor and shop.

If we read the classes of the subscribers of the factory then we’ll find that each of them have a method to get the latest information from the curry receipe factory. So, in solution all we have to do is to call these methods of the subscribers whenever new receipe is generated.

The curry factory Observable keeps a list of Subscribers (Observers) and notifies them whenever it’s content changes.

The Receipe factory becomes the Observable and the Subscribers become the Observers. We’ll be using Java’s own Observer classes.

The classes customer, distributor, and shop will now extend java.util.Observer and it will inherit following one methods that we’ll require:

update(Observable o, Object arg) this method will be called by the Observable whenever it call the notifyObservers

