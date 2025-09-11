package President;

 class President {
    private String presidentName;
    private int presidentId;

    public President(String presidentName, int presidentId) {
        this.presidentName = presidentName;
        this.presidentId = presidentId;
    }

    public void showPresidentDetails() {
        System.out.println("President Name : " + presidentName);
        System.out.println("President ID   : " + presidentId);
    }
}

