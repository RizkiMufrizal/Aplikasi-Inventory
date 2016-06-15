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
package com.rizki.mufrizal.aplikasi.inventory.service.impl;

import com.rizki.mufrizal.aplikasi.inventory.domain.PembelianDetail;
import com.rizki.mufrizal.aplikasi.inventory.repository.PembelianDetailRepository;
import com.rizki.mufrizal.aplikasi.inventory.service.PembelianDetailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Mar 25, 2016
 * @Time 5:27:06 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Inventory
 * @Package com.rizki.mufrizal.aplikasi.inventory.service.impl
 *
 */
@Service("PembelianDetailService")
@Transactional(readOnly = true)
public class PembelianDetailServiceImpl implements PembelianDetailService {

    @Autowired
    private PembelianDetailRepository pembelianDetailRepository;

    @Override
    public List<PembelianDetail> ambilPembelianDetails(String kodeTransaksiPembelian) {
        return pembelianDetailRepository.ambilPembelianDetails(kodeTransaksiPembelian);
    }

}
