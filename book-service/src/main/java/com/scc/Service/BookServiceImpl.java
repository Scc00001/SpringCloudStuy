package com.scc.Service;
import com.scc.Mapper.BookMapper;
import com.scc.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;
    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}