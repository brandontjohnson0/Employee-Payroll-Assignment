// PieceWorker -- class extends Employee
// CSIS 312 - D01

public class PieceWorker extends Employee
{
    private double wage;
    private double pieces;

    // constructor
    public PieceWorker( String firstName, String lastName, String socialSecurityNumber, double wage, double pieces)
    {
        super (firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException ("Wage must be >= 0.0");

        if (pieces < 0.0) // validate pieces
            throw new IllegalArgumentException ("Pieces must be >= 0");

        this.wage = wage;
        this.pieces = pieces;
    }

    public void setWage (double wage)
    {
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException ("Wage must be >= 0.0");

        this.wage = wage;
    }

    public double getWage() { return wage; }

    public void setPieces (double pieces)
    {
        if (pieces < 0.0) // validate pieces
            throw new IllegalArgumentException ("Pieces must be >= 0");

        this.pieces = pieces;
    }

    public double getPieces() { return pieces;}

    // calculate number of pieces of merchandise by wage
    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    // return String representation of PieceWorker object
    @Override
    public String toString()
    {
        return String.format("%s %s: $%,.2f",
                super.toString(), "earnings", earnings());

    }







}
