package Unit3BooleanExpressionsAndIfStatements;
public class DeMorgansLaws {
    public static void main(String[] args) {
        /* not (A or B) = (not A) and (not B), outside the two circles
        not (A and B) = (not A) or (not B), everything except circle overlap
        reverse everything with not, booleans and numbers
        Booleans:
            !(A && B) = (!A || !B)
            !(A || B) = (!A && !B)
            !(A == B) = (A != B)
            !(A != B) = (A == B)
        Numbers:
            !(A > B) = (A <= B)
            !(A < B) = (A >= B)
            !(A >= B) = (A < B)
            !(A == B) = (A != B)
            !(A != B) = (A =<= B)
        Compound Boolean Expression
            !(A > B || B != A) = (A <= B && B == A)
            !(A == B || (B >= C || B < A)) 
            = (A != B && !(B >= C || B < A))
            = (A != B && (B < C && B >= A))
        */
        
        System.out.print("just read the notes");
    }
}
