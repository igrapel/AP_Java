public class Vehicle extends TaxableItem
{
    double dealerCost;
    double dealerMarkup;

    public Vehicle(double theDealerCost, double theDealearMarkup, double theTaxRate)
    {
        super(theTaxRate);
        dealerCost= theDealerCost;
        dealerMarkup = theDealearMarkup;
    }

    public void changeMarkup(double changedMarkup)
    {
        dealerMarkup  = changedMarkup;
    }
    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }

}
