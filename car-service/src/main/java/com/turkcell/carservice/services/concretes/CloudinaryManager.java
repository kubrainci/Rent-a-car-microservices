package com.turkcell.carservice.services.concretes;

import com.cloudinary.Cloudinary;
import com.turkcell.carservice.services.abstracts.CloudinaryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CloudinaryManager implements CloudinaryService {

    @Resource
    private Cloudinary cloudinary;




    @Override
    public String uploadFile(String folderName) {
        return null;
    }
}
