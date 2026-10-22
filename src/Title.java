public abstract class Title {
    private String title;
    private String literatureType;
    protected double rate = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                throw new IllegalArgumentException("Ukendt type: " + literatureType);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }
}


