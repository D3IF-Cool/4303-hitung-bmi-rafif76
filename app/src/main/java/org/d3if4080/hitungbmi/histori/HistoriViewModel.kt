package org.d3if4080.hitungbmi.histori

import androidx.lifecycle.ViewModel
import org.d3if4080.hitungbmi.db.BmiDao


class HistoriViewModel(db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
}