package soquestions;

public class OverrideEquals {

    private double re, im;

    public OverrideEquals(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof OverrideEquals)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        OverrideEquals c = (OverrideEquals) o;

        // Compare the data members and return accordingly
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
    }

    public static void main(String[] args) {
        OverrideEquals c1 = new OverrideEquals(10, 15);
        OverrideEquals c2 = new OverrideEquals(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }

}
