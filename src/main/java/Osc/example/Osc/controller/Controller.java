package Osc.example.Osc.controller;


import Osc.example.Osc.model.CheckModel;
import Osc.example.Osc.model.EmployeeDemo;
import Osc.example.Osc.service.EmployeeDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/fromkarthi")
public class Controller {

    @Autowired
    EmployeeDemoService employeeser;


    //following below code for checking purpose(it has minimum fields or small table)
    @GetMapping("/getcheck")
    public List<CheckModel> getcheck()
    {
        return employeeser.getCheck();
    }

    @PostMapping("/postcheck")
    public String postcheck(@RequestBody CheckModel checking)
    {
        employeeser.postCheck(checking);
        System.out.println("checkingg" + checking.getGender());
        return "checked succesefully";
    }

//    @PostMapping("/upload")
//    public String uploadfile(@RequestParam("file")MultipartFile file)
//    {
//        employeeser.uploadfile(file);
//        return "uploaded" + file.getName();
//
//    }





    // Define the directory where files will be saved
    private static final String UPLOAD_DIR = "/home/karthikesan/Downloads/check/";

    // Endpoint to upload file
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<>("No file uploaded", HttpStatus.BAD_REQUEST);
        }

        // Get the original file name
        String fileName = file.getOriginalFilename();
        if (fileName == null) {
            return new ResponseEntity<>("Invalid file name", HttpStatus.BAD_REQUEST);
        }

        // Create the directory if it doesn't exist
        File directory = new File(UPLOAD_DIR);
        if (!directory.exists()) {
            directory.mkdirs(); // Make the directory if it doesn't exist
        }

        // Save the file to the directory with its original name
        try {
            file.transferTo(new File(UPLOAD_DIR + fileName));
            return new ResponseEntity<>("File uploaded successfully: " + fileName + UPLOAD_DIR, HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("Error uploading file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint to download file by file name
    @GetMapping("/download/{fileName}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable String fileName) {
        try {
            // Read the file as bytes
            byte[] fileBytes = Files.readAllBytes(Paths.get(UPLOAD_DIR + fileName));

            // Return the file as a response with the correct content type (image/jpeg for this example)
            return ResponseEntity.ok()
                    .contentType(org.springframework.http.MediaType.IMAGE_JPEG)
                    .body(fileBytes);

        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
