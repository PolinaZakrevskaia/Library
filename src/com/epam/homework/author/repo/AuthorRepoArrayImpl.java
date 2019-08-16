package com.epam.homework.author.repo;

import ru.yusdm.stud.lesson_6_2_collection_list.homework.Storage;
import ru.yusdm.stud.lesson_6_2_collection_list.homework.author.domain.Author;

public class AuthorRepoArrayImpl implements AuthorRepo {
    @Override
    public int count() {
        int result = 0;

        for (Author author : Storage.authors) {
            if (author != null) {
                result++;
            }
        }
        return result;
    }

    @Override
    public void print() {
        for (Author author : Storage.authors) {
            if (author != null) {
                System.out.println(author.toString());
            }
        }
    }

    @Override
    public void delete(Author author) {
        Storage.removeAuthor(author);
    }

    @Override
    public Long add(Author author) {
        Storage.addAuthor(author);
        return author.getId();
    }

}
