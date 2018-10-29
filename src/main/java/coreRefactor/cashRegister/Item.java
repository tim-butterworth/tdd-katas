package coreRefactor.cashRegister;

public class Item {
    private final String itemType;

    public Item(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return itemType;
    }
}
