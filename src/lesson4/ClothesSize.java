package lesson4;

public enum ClothesSize {


    XXS(48) {
        @Override
        String getDescription() {
            return "EuroSize 48 - XXS";
        }
    },
    XS(46) {
        @Override
        String getDescription() {
            return "EuroSize 46 - XS";
        }
    },
    L(44) {
        @Override
        String getDescription() {
            return "EuroSize 44 - L";
        }
    },
    M(42) {
        @Override
        String getDescription() {
            return "EuroSize 42 -M";
        }
    },
    S(38) {
        @Override
        String getDescription() {
            return "EuroSize 38 - S";
        }
    };

    int euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "ClothesSize{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }

    abstract String getDescription();

}
