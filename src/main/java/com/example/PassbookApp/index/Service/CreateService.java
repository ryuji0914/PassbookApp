package com.example.PassbookApp.index.Service;

import com.example.PassbookApp.index.Entity.CreateEntity;
import com.example.PassbookApp.index.Repository.CreateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreateService {
    private final CreateRepository createRepository;
    public List<CreateEntity> find(){
        return createRepository.select();
    }

    public void create(CreateEntity createEntity){
        createRepository.create(createEntity);
    }

}
