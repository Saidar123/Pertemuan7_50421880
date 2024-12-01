package com.mahasiswa.service;

import com.mahasiswa.model.modelMahasiswa;
import com.mahasiswa.repository.mahasiswaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mahasiswaService {

    @Autowired
    private mahasiswaRepository repository;

    // Method untuk menambahkan mahasiswa
    public void addMhs(modelMahasiswa mhs) {
        repository.save(mhs);
    }
    // Method untuk mendapatkan mahasiswa berdasarkan ID
    public modelMahasiswa getMhs(int id) {
        return repository.findById(id).orElse(null);
    }
    // Method untuk memperbarui data mahasiswa
    public void updateMhs(modelMahasiswa mhs) {
        repository.save(mhs);
    }
    // Method untuk menghapus mahasiswa berdasarkan ID
    public void deleteMhs(int id) {
        repository.deleteById(id);
    }
    // Method untuk mendapatkan semua data mahasiswa
    public List<modelMahasiswa> getAllMahasiswa() {
        return repository.findAll();
    }
}