package shekarfrqs;

import com.nighthawk.csa.kianfrqs.FRQ9.Book;

public class frq9 {
    private String title;
    private String author;

    public frq9(String t, String a)
    {
        title = t;
        author = a;
    }

    public void printBookInfo()
    {
        System.out.print(title + ", written by " + author);
    }
}

class PictureBook extends frq9 {

    public PictureBook(String t, String a) {
        super(t, a);
    }

    public void printBookInfo()
    {
        //System.out.print(Book.t + ", written by " + Book.a);
    }

    public static void main(String[] args) {

    }
}