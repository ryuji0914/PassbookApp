package com.example.PassbookApp.index.Repository;

import com.example.PassbookApp.index.Entity.RegisterEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegisterRepository {
    @Insert("""
    INSERT INTO Amounts (totalAmount,targetAmount,difference)
    VALUES (#{Amounts.totalAmount},#{Amounts.targetAmount},#{Amounts.difference})
    """)
    void register(RegisterEntity registerEntity);
}
