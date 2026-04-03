package org.example.dependency_injection.impl;

import org.example.dependency_injection.BoyFriend;
import org.springframework.stereotype.Component;

@Component
public class BoyFriendImpl implements BoyFriend {

    @Override
    public void chat() {
        System.out.println("Em ăn cơm chưa...");
    }

    @Override
    public void dating() {
        System.out.println("Em rảnh mình đi nói chuyện...");
    }
}
