package org.example.ss04.repository;

import org.example.ss04.model.Tool;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ToolRepository {
    // mô phỏng lại lớp tương tác database (DAO | Repository)
    private List<Tool> tools = new ArrayList<>(
            Arrays.asList(
                    new Tool("Cờ lê", 1200.0, "Dùng để vít ốc", "Thiết bị sửa chữa"),
                    new Tool("Tua vít", 2000.0, "Dùng để vặn ốc 4 cạnh", "Thiết bị sửa chữa")
            )
    );

    // trả về 1 danh sách để dùng
    public List<Tool> findAll() {
        return tools;
    }

    // tạo 1 hàm tìm kiếm
    public List<Tool> search(String name) {
        return tools.stream().filter(
                t -> t.getName().contains(name)
        ).toList();
    }

}
