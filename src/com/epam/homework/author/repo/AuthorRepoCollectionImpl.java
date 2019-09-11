package com.epam.homework.author.repo;

//import com.epam.homework.Storage;
import com.epam.homework.author.domain.Author;
//import com.epam.homework.book.domain.Book;
import com.epam.homework.storage.CollectionStorage;

public class AuthorRepoCollectionImpl implements AuthorRepo {
    @Override
    public int count() {
        return CollectionStorage.getTotalAuthors();
        //return Storage.authorList.size();
    }

    @Override
    public void print() {
        for (Author author : CollectionStorage.getAllAuthors()) {
            if (author != null) {
                System.out.println(author.toString());
            }
        }
        /*for (Author author : Storage.authorList)
        {
            System.out.println(author.toString());
        }*/
    }

    @Override
    public void delete(Author author) {
        //Storage.removeAuthorFromList(author);
        CollectionStorage.removeAuthor(author);
    }

    @Override
    public Long add(Author author) {
        //Storage.addAuthorToList(author);
        CollectionStorage.addAuthor(author);
        return author.getId();
    }

    @Override
    public Author findById(Long authorId) {
        for (Author author : CollectionStorage.getAllAuthors()) {
            if (author != null && authorId.equals(author.getId())) {
                return author;
            }
        }

        return null;
    }

    /*public List<Author> findAuthorsByBookList(long id) {
        List<Author> authorsByBook = new ArrayList<>();
        for (Author author : Storage.authorList)
        {
            for (Book book: author.getBooks())
            {
                if ((book.getId()).equals(id))
                {
                    authorsByBook.add(author);
                }
            }
        }

        return authorsByBook;
    }*/
}
