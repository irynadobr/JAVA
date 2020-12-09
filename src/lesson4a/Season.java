package lesson4a;

public enum Season {
    Winter (-10.0) {
        @Override
        public void getDescription() {
            System.out.println(" дуже холодна пора року");
        }
    },
    Autumn (15.0) {
        @Override
        public void getDescription() {

            System.out.println("золота пора року");
        }
    },
    Summer (40.0) {
        @Override
        public void getDescription() {
            System.out.println("тепла пора року");
        }
    },
    Spring (5.0) {
        @Override
        public void getDescription() {

            System.out.println("гарна пора року")  ;
        }
    };

 double averagetemperature;
    Season(double averagetemperature) {
        this.averagetemperature = averagetemperature;
    }

    public double getAveragetemperature() {
        return averagetemperature;
    }

    public void setAveragetemperature(double averagetemperature) {
        this.averagetemperature = averagetemperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "averagetemperature=" + averagetemperature +
                '}';
    }

    public  void getDescription () {

        System.out.println("холодна пора року");

    }


}


