package com.example.PassbookApp.index.Repository;

import com.example.PassbookApp.index.Entity.CreateEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CreateRepository {
    @Select("SELECT id,category,method,money,memo FROM passbook;")
    public List<CreateEntity> select();

    @Insert("""
    INSERT INTO passbook (id,category,method,money,memo)
    VALUES (#{passbook.category},#{passbook.method},#{passbook.money},#{passbook.memo})
    """)
    void create(@Param("passbook") CreateEntity createentity);

}
