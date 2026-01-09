package bookbazar;

class Order {
    private String user;
    private String status;  

    Order(String user) {
        this.user = user;
        this.status = "Placed";
    }

    protected void updateStatus(String status) {
        this.status = status;
    }

    public void showStatus() {
        System.out.println("Order Status: " + status);
    }
}
