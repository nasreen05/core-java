package President;

class ChiefMinister extends PrimeMinister{


        private String cmName;
        private int cmId;
        private String stateName;

        public ChiefMinister(String presidentName, int presidentId,
                             String pmName, int pmId,
                             String cmName, int cmId, String stateName) {
            super(presidentName, presidentId, pmName, pmId);
            this.cmName = cmName;
            this.cmId = cmId;
            this.stateName = stateName;
        }

        public void showChiefMinisterDetails() {
            showPrimeMinisterDetails(); // call parent details
            System.out.println("Chief Minister Name : " + cmName);
            System.out.println("Chief Minister ID   : " + cmId);
            System.out.println("State Name          : " + stateName);
        }
    }


