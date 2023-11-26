package com.turkcell.carservice.services.abstracts;

import com.turkcell.carservice.entities.ImageModel;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ImageService {
    ResponseEntity<Map> uploadImage(ImageModel imageModel, String inventoryCode);
}
