package uoft.csc207.week2;

public class Trade extends Person {
    private final String occupation;
    private final String type;

    public Trade(String[] name, String utorid, String occupation, String type) {
        super(name, utorid);
        this.occupation = occupation;
        this.type = type;

    }
    @Override
    public String toString() {
        String s = super.toString();
        String result = s + "; this is a trade personal";
        return result;
    }
}
