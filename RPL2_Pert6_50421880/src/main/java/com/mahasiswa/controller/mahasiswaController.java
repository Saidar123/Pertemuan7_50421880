package com.mahasiswa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller; // Tambahan import yang benar
import java.util.List;

import com.mahasiswa.model.modelMahasiswa;
import com.mahasiswa.service.mahasiswaService;

@Controller
@RequestMapping("/mahasiswa")
public class mahasiswaController {

    @Autowired
    private mahasiswaService mahasiswaService;

    // Menambahkan mahasiswa
    @PostMapping("/add")
    public String addMahasiswa(@RequestBody modelMahasiswa mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa Added Successfully";
    }

    // Mendapatkan mahasiswa berdasarkan ID
    @GetMapping("/get/{id}")
    public modelMahasiswa getMahasiswa(@PathVariable int id) {
        return mahasiswaService.getMhs(id);
    }

    // Memperbarui data mahasiswa
    @PutMapping("/update")
    public String updateMahasiswa(@RequestBody modelMahasiswa mhs) {
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa Updated Successfully";
    }

    // Menghapus mahasiswa berdasarkan ID
    @DeleteMapping("/delete/{id}")
    public String deleteMahasiswa(@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa Deleted Successfully";
    }

    // Mendapatkan semua mahasiswa
    @GetMapping("/all")
    public List<modelMahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }
}