package org.example.dependency_injection.impl;

import org.example.dependency_injection.BoyFriend;
import org.example.dependency_injection.GirlFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // ko ngữ nghĩa - đánh dâu là bean để IoC khởi tạo
public class GirlFriendImpl implements GirlFriend {

    @Autowired // tiêm dưới dạng field // DI
    private BoyFriend boyFriend;

    // mấy cách tiêm
    // 3 gồm: field, setter, constructors

    @Override
    public void seen() {
        boyFriend.chat();
    }

    @Override
    public void block() {
        boyFriend.dating();
    }
}
