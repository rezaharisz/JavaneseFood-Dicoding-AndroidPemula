package com.rezaharis.javanesefood

object FoodData {
    private val foodName = arrayOf(
        "Ayam Lodho",
        "Bakpia Pathok",
        "Gethuk",
        "Gudeg",
        "Nasi Liwet",
        "Nasi Pecel",
        "Rawon",
        "Rujak Cingur",
        "Sate Klatak",
        "Tengkleng"
    )

    private val foodDes = arrayOf(
        "Ayam Lodho adalah adalah masakan dari ayam kampung yang dibakar kemudian dimasukkan ke dalam adonan santan kental. Kuliner ini merupakan khas dari Tulungagung. Rasa yang ditawarkan dari ayam lodho ini adalah pedas, jadi sangat cocok bagi anda pecinta masakan pedas.",
        "Bakpia Pathok adalah adalah kue berbentuk bulat pipih, terbuat dari campuran kacang hijau dengan gula, yang dibungkus dengan tepung, lalu dipanggang. Bakpia asal mulanya berasal dari daratan Tiongkok. Bakpia Pathuk adalah salah satu varian Bakpia yang berkembang di Yogyakarta Saat ini Bakpia Pathuk sudah menjadi salah satu makanan khas sekaligus oleh-oleh khas dari Yogyakarta. Ini merupakan salah satu wujud nyata akulturasi budaya Tiongkok dan budaya Jawa, dalam hal ini Yogyakarta.",
        "Gethuk adalah adalah makanan ringan yang terbuat dengan bahan utama ketela pohon atau singkong. Gethuk merupakan makanan yang mudah ditemukan di Jawa Tengah dan Jawa Timur. Pembuatan Gethuk diawali dengan mengupas singkong dan merebusnya. Setelah matang singkong ditumbuk atau dihaluskan dengan cara digiling lalu diberi pemanis gula dan pewarna makanan. Sebagai pelengkap, biasanya Gethuk ditaburi dengan parutan kelapa.",
        "Gudeg adalah adalah makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
        "Nasi Liwet adalah adalah makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa).",
        "Nasi Pecel adalah adalah makanan yang menggunakan bumbu sambal kacang sebagai bahan utamanya yang dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur. Asal kata dan daerah pecel belum diketahui secara pasti. Dalam bahasa Jawa, pecel dapat diartikan sebagai ‘tumbuk’ atau ‘dihancurkan dengan cara ditumbuk.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Daging untuk rawon umumnya adalah daging sapi yang dipotong kecil-kecil, utamanya adalah bagian sandung lamur. Bumbu supnya sangat khas Indonesia, yaitu campuran bawang merah, bawang putih, lengkuas (laos), ketumbar, kemiri, serai, kunir, cabai, kluwek, garam, serta minyak nabati. Semua bahan ini dihaluskan, lalu ditumis sampai harum. Campuran bumbu ini kemudian dimasukkan dalam kaldu rebusan daging bersama-sama dengan daging. Warna gelap khas rawon berasal dari kluwek. Di luar negeri, rawon disebut sebagai black soup.",
        "Rujak Cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama di daerah asalnya Surabaya. Dalam penyajiannya rujak cingur dibedakan menjadi dua macam, yaitu penyajian 'biasa' dan 'matengan' (menyebut huruf e dalam kata matengan seperti menyebut huruf e dalam kata: seperti/menyebut/bendoyo). Penyajian 'biasa' atau umumnya, berupa semua bahan yang telah disebutkan di atas, sedangkan 'matengan' (matang, Jawa) hanya terdiri dari bahan-bahan matang saja; lontong, tahu goreng, tempe goreng, bendoyo (kerahi yang digodok) dan sayur (kangkung, kacang panjang, taoge) yang telah digodok. Tanpa ada bahan 'mentah'nya yaitu buah-buahan, karena pada dasarnya ada orang yang tidak menyukai buah-buahan. Keduanya memakai saus atau bumbu yang sama.",
        "Sate Klatak adalah sebuah hidangan sate kambing asal Kecamatan Pleret, Kabupaten Bantul, Yogyakarta. Dalam bahasa Jawa, kegiatan membakar sate di pembakaran terbuka disebut \"klathak\". Sate ini sangat berbeda dari ragam sate lainnya, yang biasanya memakai garam dan lada sebagai bumbu utamanya. Tusukan yang dipakai untuk memanggang dan membakar terbuat dari besi, tak seperti sate lainnya yang memakai tusukan bambu. Tusukan besi sebagai konduktor penghangat akan membuat daging lebih masak dari bagian dalam. Sate tersebut biasanya disajikan dengan gulai. Gulai kaya akan rempah-rempah, terkadang dimasak dengan tulang lembu, dan direbus memakai api kecil selama sekitar 30 menit.",
        "Tengkleng adalah adalah masakan sejenis sup dengan bahan utama tulang kambing. Sejarah tengkleng konon menurut para tetua di kota Solo hanya para bangsawan dan orang-orang Belanda saja yang bisa menikmati masakan daging kambing. Hanya kepala, kaki, dan tulang saja yang tersisa untuk pekerja dan tukang masak. Para juru masak pada waktu itu tak kurang akal, maka dimasaklah tulang-tulang itu yang tentunya masih menempel sedikit daging. Masakan ini berasal dari Solo. Bentuk fisik dari tengkleng hampir mirip dengan gulai kambing, tetapi kuahnya lebih encer ada juga tengkleng dengan sedikit kuah."
    )

    private val foodImage = intArrayOf(
        R.drawable.ayam_lodho,
        R.drawable.bakpia_pathok,
        R.drawable.gethuk,
        R.drawable.gudeg_jogja,
        R.drawable.nasi_liwet,
        R.drawable.nasi_pecel,
        R.drawable.rawon,
        R.drawable.rujak_cingur,
        R.drawable.sate_klatak,
        R.drawable.tengkleng
    )

    val listFood : ArrayList<Food>
    get() {
        val list = arrayListOf<Food>()
        for (position in foodName.indices){
            val food = Food()
            food.foodName = foodName[position]
            food.desFood = foodDes[position]
            food.photo = foodImage[position]
            list.add(food)
        }
        return list
    }

}