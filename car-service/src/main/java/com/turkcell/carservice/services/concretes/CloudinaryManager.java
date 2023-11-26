package com.turkcell.carservice.services.concretes;

import com.cloudinary.Cloudinary;
import com.turkcell.carservice.services.abstracts.CloudinaryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryManager implements CloudinaryService {

    @Resource
    private Cloudinary cloudinary;






    @Override
    public String uploadFile(MultipartFile file, String folderName) {
        return null;
    }
}
