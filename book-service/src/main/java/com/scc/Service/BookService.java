package com.scc.Service;

import com.scc.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    Book getBookById(int bid);
}
