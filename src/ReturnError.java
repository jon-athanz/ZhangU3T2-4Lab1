public class ReturnError {
    private int score;

    public ReturnError(int score) {
        this.score = score;
    }

    public String grade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

