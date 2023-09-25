package com.blog.serviceimpl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.blog.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String fileUpload(MultipartFile multipartFile, String Path) throws IOException {
		Path root = Paths.get(Path);
		Files.createDirectories(root);
		String fileName = "" + UUID.randomUUID() + multipartFile.getOriginalFilename();
		Files.copy(multipartFile.getInputStream(), root.resolve(fileName));
		return fileName;
	}

	@Override
	public Resource loadImage(String Path, String fileName) throws IOException {
		try {
			Path root = Paths.get(Path);
			Path file = root.resolve(fileName);
			Resource resource = new UrlResource(file.toUri());

			if (resource.exists() || resource.isReadable())
				return resource;
			else
				throw new RuntimeException("Could not read the file!");

		} catch (MalformedURLException e) {
			throw new RuntimeException("Error: " + e.getMessage());
		}

	}

}
