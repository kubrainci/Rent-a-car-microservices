package com.turkcell.carservice.services.concretes;

import com.turkcell.carservice.entities.ImageModel;
import com.turkcell.carservice.services.abstracts.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ImageManager implements ImageService {


    @Override
    public ResponseEntity<Map> uploadImage(ImageModel imageModel, String inventoryCode) {
        return null;
    }
}
