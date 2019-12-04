package com.anggiat.BelajarSpringBootWeb.services;

import com.anggiat.BelajarSpringBootWeb.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    List<Mahasiswa> mahasiswaList();
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void hapus (Integer id);

}
