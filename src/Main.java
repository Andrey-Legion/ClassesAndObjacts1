public class Main {
    public static void main(String[] args) {
        Book demonolatry = new Book("Demonolatry", "Nicola Remy", 1595);
        Author nicolaRemy = new Author("Nicola", "Remy");
        Book necronomicon = new Book("Necronomicon", "AbdulAlhazred", 730);
        Author abdulAlhazred = new Author("Abdul", "Alhazred");
        //demonolatry.title = "Demonolatry";
        //demonolatry.authorName = "Nicola Remy";
        //demonolatry.yearPublishing = 1595;
        //necronomicon.title = "Necronomicon";
        //necronomicon.authorName = "Abdul Alhazred";
        //necronomicon.yearPublishing = 730;
        //nicolaRemy.name = "Nicola";
        //nicolaRemy.surname = "Remy";
        //abdulAlhazred.name = "Abdul";
        //abdulAlhazred.surname = "Alhazred";
        System.out.println("demonolatry.title = " + demonolatry.title);
        System.out.println("demonolatry.authorName = " + demonolatry.authorName);
        System.out.println("demonolatry.yearPublishing = " + demonolatry.yearPublishing);
    }



}