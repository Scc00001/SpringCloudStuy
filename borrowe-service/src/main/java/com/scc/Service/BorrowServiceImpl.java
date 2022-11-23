package com.scc.Service;

import com.scc.Mapper.BorrowMapper;


import com.scc.Service.client.BookClient;
import com.scc.Service.client.UserClient;
import com.scc.entity.Book;
import com.scc.entity.Borrow;
import com.scc.entity.User;
import com.scc.entity.UserBorrowDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper mapper;

    @Resource
    UserClient userClient;

    @Resource
    BookClient bookClient;
    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = mapper.getBorrowsByUid(uid);

        User user = userClient.findUserById(uid);
        List<Book> bookList = borrow
                .stream()
                .map(b -> bookClient.findBookById(b.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}