package com.scc.Service;

import com.scc.entity.User;
import com.scc.entity.UserBorrowDetail;

public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}