package com.matrix.design.prototype.ex01;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("조정래", "태백산맥"));
        bookShelf.addBook(new Book("박완서", "나목"));
        bookShelf.addBook(new Book("박경리", "토지"));
        System.out.println(bookShelf);

        BookShelf another = (BookShelf) bookShelf.clone();

        System.out.println(another);

        bookShelf.getShelf().get(0).setAuthor("조정래");
        bookShelf.getShelf().get(0).setTitle("한강");
        System.out.println(bookShelf);
        System.out.println(another);
    }

}
