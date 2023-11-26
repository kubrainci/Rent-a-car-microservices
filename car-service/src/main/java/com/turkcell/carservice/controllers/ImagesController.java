package com.turkcell.carservice.controllers;

import com.turkcell.carservice.entities.ImageModel;
import com.turkcell.carservice.repositories.ImageRepository;
import com.turkcell.carservice.services.abstracts.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/api/images")
@RestController
@RequiredArgsConstructor
public class ImagesController {
    private ImageRepository imageRepository;
    private ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<Map>upload(ImageModel imageModel, @RequestParam String inventoryCode){
        try {
            return imageService.uploadImage(imageModel, inventoryCode);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
