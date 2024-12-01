package com.mahasiswa;

import com.mahasiswa.controller.mahasiswaController;
import com.mahasiswa.service.mahasiswaService;
import com.mahasiswa.view.mahasiswaView;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class mahasiswaApp implements ApplicationRunner {

    @Autowired
    private mahasiswaService mahasiswaService;

    public static void main(String[] args) {
        // Mengatur agar aplikasi dapat menampilkan GUI
        System.setProperty("java.awt.headless", "false");

        // Memulai aplikasi Spring Boot
        ApplicationContext context = SpringApplication.run(mahasiswaApp.class, args);

        // Mendapatkan bean controller dari context
        mahasiswaController controller = context.getBean(mahasiswaController.class);

        // Membuka tampilan GUI
        mahasiswaView mahasiswaView = new mahasiswaView(controller);
        mahasiswaView.setVisible(true);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Implementasikan jika ada logika yang perlu dijalankan saat aplikasi mulai
    }
}