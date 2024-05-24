package objectarray;
import java.util.*;

public class BookDemo {
    public static void main(String[] args) {

        int BookId, Count = 0;
        String BookName;
        String AuthorName;
        int prize;
        int opertion;
        boolean continueLoop = true;

        Scanner sc = new Scanner(System.in);
        Book book[] = new Book[10];
        do {
            System.out.println("1.ADD BOOK");
            System.out.println("2.UPDATE BOOK");
            System.out.println("3.DELETE BOOK");
            System.out.println("4.SEARCH BOOK");
            System.out.println("5.GET ALL BOOK");
            System.out.println("6.EXIT");
            System.out.println(" ");
            System.out.println(" Enther the choice");
            opertion = sc.nextInt();

            switch (opertion) {
                case 1:
                    System.out.println("ADD BOOK");
                    //   System.out.println("Enter number of Book enter:");
                    int a = sc.nextInt();
                    for (int i = 0; i < a; i++) {
                        System.out.println("Enter the BookId");
                        BookId = sc.nextInt();
                        System.out.println("Enter BookName");
                        BookName = sc.next();
                        sc.nextLine();
                        System.out.println("Enter the Book AuthorName");
                        AuthorName = sc.nextLine();
                        System.out.println("Enter the prize");
                        prize = (int) sc.nextDouble();


                        book[Count] = new Book(BookId, BookName, AuthorName, prize);
                        Count++;
                    }
                    System.out.println("ADD BOOK SUCCESSFULL:");
                    break;

                case 2:
                    System.out.println("UPDATE BOOK");
                    System.out.println("Enter the BookId for Update :");
                    BookId = sc.nextInt();
                    for (int i = 0; i < Count; i++) {
                        if (book[i] != null && book[i].getBookId() == BookId) {
                            System.out.println("Enter the book name for update :");
                            BookName = sc.next();
                            book[i].setBookName(BookName);
                            System.out.println("Enter book author name for update :");
                            AuthorName = sc.nextLine();
                            book[i].setAuthorName(AuthorName);
                            System.out.println("Enter the book prize for update :");
                            prize = (int) sc.nextDouble();
                            book[i].setPrize(prize);
                        }
                    }
                    System.out.println("Book Update Successfull :");
                    break;

                case 3:
                    System.out.println("DELETE BOOK");
                    System.out.println("Enter the BookId for delete");

                    BookId = sc.nextInt();
                    for (int i = 0; i < Count; i++) {
                        if (book[i] != null && book[i].getBookId() == BookId) {
                            book[i] = null;

                        }
                    }
                    System.out.println("Delete book Successfull :");
                    break;

                case 4:
                    System.out.println(" SEARCH BOOK");
                    System.out.println("Enter the BookId for Search");

                    BookId = sc.nextInt();
                    for (int i = 0; i < Count; i++) {
                        if (book[i] != null && book[i].getBookId() == BookId) {
                            System.out.println(book[i]);

                        }
                    }
                    System.out.println("Search completed :");
                    break;

                case 5:
                    System.out.println(" ALL INFO BOOK");
                    System.out.println("ALL BOOK ARE");


                    for (int i = 0; i < Count; i++) {

                        System.out.println(book[i]);
                    }
                    System.out.println("ALL BOOK ARE :");
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter right choice");


            }
            System.out.println("Do you want to continue? (yes/no)");
            String userInput = sc.next();

            if ("no".equalsIgnoreCase(userInput)) {
                continueLoop = false;
            }

        } while (continueLoop);


    }
}