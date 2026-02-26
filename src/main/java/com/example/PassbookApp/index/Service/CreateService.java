package com.example.PassbookApp.index.Service;

import com.example.PassbookApp.index.Entity.CreateEntity;
import com.example.PassbookApp.index.Entity.RegisterEntity;
import com.example.PassbookApp.index.Repository.CreateRepository;
import com.example.PassbookApp.index.Repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreateService {
    private final CreateRepository createRepository;
    private final RegisterRepository registerRepository;
    public List<CreateEntity> find(){
        return createRepository.select();
    }

    public void create(CreateEntity createEntity){
        createRepository.create(createEntity);
    }

    public void register(RegisterEntity registerEntity){
        registerRepository.register(registerEntity);
    }

}
