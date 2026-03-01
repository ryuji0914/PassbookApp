package com.example.PassbookApp.index.Repository;

import com.example.PassbookApp.index.Entity.RegisterEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegisterRepository {
    @Select("SELECT id,totalAmount,targetAmount,difference FROM Amounts;")
    public List<RegisterEntity> select();


    @Insert("""
    INSERT INTO Amounts (totalAmount,targetAmount,difference)
    VALUES (#{entity.totalAmount},#{entity.targetAmount},#{entity.difference})
    """)
    void register(@Param("entity") RegisterEntity registerEntity);
}
