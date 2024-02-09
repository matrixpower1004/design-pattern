package com.matrix.design.prototype.ex01;

import java.util.ArrayList;

public class BookShelf implements Cloneable {

    private ArrayList<Book> shelf;

    public BookShelf() {
        this.shelf = new ArrayList<>();
    }

    public BookShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public BookShelf addBook(Book book) {
        shelf.add(book);
        return this;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return shelf.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); // 이렇게 하면 얕은 복사가 이루어진다.
        BookShelf another = new BookShelf();
        for (Book book : shelf) {
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }
        return another; // 깊은 복사
    }
}
