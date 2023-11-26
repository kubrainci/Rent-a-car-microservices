package com.turkcell.carservice.services.concretes;

import com.turkcell.carservice.services.abstracts.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageManager implements ImageService {
    @Override
    public ResponseEntity<Map> uploadImage(ImageModel imageModel, String inventoryCode) {


    }
}
