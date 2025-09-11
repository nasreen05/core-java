package President;

 class PrimeMinister extends President{

        private String pmName;
        private int pmId;

        public PrimeMinister(String presidentName, int presidentId,
                             String pmName, int pmId) {
            super(presidentName, presidentId);
            this.pmName = pmName;
            this.pmId = pmId;
        }

        public void showPrimeMinisterDetails() {
            showPresidentDetails(); // call parent details
            System.out.println("Prime Minister Name : " + pmName);
            System.out.println("Prime Minister ID   : " + pmId);
        }
    }


