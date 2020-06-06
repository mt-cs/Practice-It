public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discountItem;
    private double discount;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
        discount=0.0;
        discountItem=0;
    }

    public void add(Item i){
        super.add(i);
        if(preferred && i.getDiscount()>0){
            discountItem++;
            discount += i.getDiscount();
        }
    }
    
    /**
     * returns the number of items that were discounted, if any
     * @return discountItem
     */
    public int getDiscountCount(){
        return discountItem;
    }

    /**
     * returns the total discount for this list of items, if any
     * @return discount
     */
    public double getDiscountAmount(){
        return discount;
    }

    /**
     * returns the percent of the total discount as a percent of what the total would have been otherwise
     * @return discount
     */
    public double getDiscountPercent(){
        return discount*100/super.getTotal();
    }

    public double getTotal(){
        return super.getTotal()-discount;
    }
}
