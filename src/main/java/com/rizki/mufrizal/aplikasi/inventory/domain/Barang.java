/**
 * Copyright (C) 2016 Rizki Mufrizal (https://rizkimufrizal.github.io/) (mufrizalrizki@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rizki.mufrizal.aplikasi.inventory.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Mar 16, 2016
 * @Time 7:47:08 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Inventory
 * @Package com.rizki.mufrizal.aplikasi.inventory.domain
 *
 */
@Entity
@Audited
@Table(name = "tb_barang", indexes = {
    @Index(columnList = "id_barang", name = "idBarang")
})
public class Barang implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_barang", length = 150)
    private String idBarang;

    @Column(name = "nama_barang", length = 50, nullable = false)
    private String namaBarang;

    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_barang", length = 50, nullable = false)
    private JenisBarang jenisBarang;

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_kadaluarsa", nullable = false)
    private Date tanggalKadaluarsa;

    @Column(name = "harga_satuan_barang")
    private BigDecimal hargaSatuanBarang;

    @Column(name = "jumlah_barang")
    private Integer jumlahBarang;

    @OneToMany(mappedBy = "barang", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PenjualanDetail> penjualanDetails;

    /**
     * @return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the jenisBarang
     */
    public JenisBarang getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(JenisBarang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the tanggalKadaluarsa
     */
    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    /**
     * @param tanggalKadaluarsa the tanggalKadaluarsa to set
     */
    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    /**
     * @return the hargaSatuanBarang
     */
    public BigDecimal getHargaSatuanBarang() {
        return hargaSatuanBarang;
    }

    /**
     * @param hargaSatuanBarang the hargaSatuanBarang to set
     */
    public void setHargaSatuanBarang(BigDecimal hargaSatuanBarang) {
        this.hargaSatuanBarang = hargaSatuanBarang;
    }

    /**
     * @return the jumlahBarang
     */
    public Integer getJumlahBarang() {
        return jumlahBarang;
    }

    /**
     * @param jumlahBarang the jumlahBarang to set
     */
    public void setJumlahBarang(Integer jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    /**
     * @return the penjualanDetails
     */
    public List<PenjualanDetail> getPenjualanDetails() {
        return penjualanDetails;
    }

    /**
     * @param penjualanDetails the penjualanDetails to set
     */
    public void setPenjualanDetails(List<PenjualanDetail> penjualanDetails) {
        this.penjualanDetails = penjualanDetails;
    }
}
