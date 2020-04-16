package com.example.mlpuj;

import java.util.ArrayList;

public class BaseballData {
    private static String[] namaTeam = {
            "Chiba Lotte Marines",
            "Yomiuri Giants",
            "Yokohama BayStars",
            "Nippon Ham-Fighters",
            "Rakuten Eagles"

    };

    private static String[] deskTeam = {
            "Chiba Lotte Marines adalah tim baseball profesional di Liga Pasifik Jepang yang berbasis di Kota Chiba, Prefektur Chiba, di wilayah Kanto, dan dimiliki oleh Lotte Holdings Co., Ltd.",
            "Yomiuri Giants adalah tim bisbol profesional Jepang yang bermain di Liga Sentral Nippon Professional Baseball. Sejak 1988, stadion kandang mereka di Tokyo Dome yang terletak di Bunkyo, Tokyo. Yomiuri Giants adalah tim bisbol tertua di Jepang yang masih terus berkompetisi hingga kini. Liga minor Yomiuri Giants bermain di Liga Timur, dan bermarkas di Stadion Bisbol Yomiuri Giants, Tama-ku, Kawasaki, Prefektur Kanagawa.",
            "Yokohama BayStars adalah tim baseball profesional di Liga Sentral Jepang. Lapangan tuan rumah mereka adalah Stadion Yokohama, yang terletak di pusat Yokohama. Tim ini telah dikenal dengan beberapa nama sejak menjadi tim profesional pada tahun 1950. Ini mengadopsi nama saat ini pada tahun 2011 ketika klub dibeli oleh perusahaan perangkat lunak DeNA.",
            "Hokkaido Nippon-Ham Fighters adalah tim baseball profesional Jepang yang berbasis di Sapporo, Hokkaidō. Mereka berkompetisi di Liga Pasifik Nippon Professional Baseball, memainkan sebagian besar pertandingan kandang mereka di Sapporo Dome.Nama tim berasal dari organisasi induknya, Nippon Ham, sebuah perusahaan pengolahan makanan utama Jepang.",
            "Tohoku Rakuten Golden Eagles, sering disingkat sebagai Rakuten Eagles, adalah tim bisbol yang berbasis di Sendai, di Prefektur Miyagi, Jepang. Ini telah bermain di Liga Pasifik Nippon Professional Baseball sejak pembentukan tim pada tahun 2005. Tim ini dimiliki oleh perusahaan belanja internet Rakuten."
    };

    private static String[] desk2Team = {
            "Pada tahun 1992, tim ini pindah ke Stadion Chiba Marine di Kota Chiba di pantai timur Teluk Tokyo dan berganti nama menjadi Chiba Lotte Marines .",
            "Manajemen tim ini berada di tangan konglomerat media The Yomiuri Shimbun Holdings yang memiliki surat kabar dan jaringan televisi. Penggemar bisbol dan media massa lebih sering menyebut nama tim ini sebagai Kyojin (巨人) yang juga berarti Giants daripada nama Inggris atau nama pemiliknya. Rival abadi tim ini adalah Hanshin Tigers dari wilayah Kansai.",
            "Tim liga minor memiliki nama dan seragam yang sama dengan tim induk dan bermain di Liga Timur. Lapangan kandang liga minor adalah Stadion Yokosuka, yang terletak di Yokosuka, Kanagawa.",
            "Didirikan pada tahun 1946, yang Fighters disebut rumah Tokyo selama 58 tahun, sebagai co-penyewa dari Tokyo Dome dengan Liga Central 's Yomiuri Giants dekat akhir masa jabatan mereka di ibu kota. Waralaba telah memenangkan tiga gelar Seri Jepang , pada tahun 1962, 2006, dan, paling baru, 2016.",
            "Tim ini diciptakan untuk mengisi kekosongan yang ditinggalkan oleh merger Orix BlueWave dan Osaka Kintetsu Buffaloes selama penataan kembali Nippon Professional Baseball 2004. Merger ini akan meninggalkan Liga Pasifik dengan lima tim, menyebabkan krisis terbesar dalam sejarah NPB, termasuk pemogokan pemain pertama dalam sejarah bisbol profesional Jepang."
    };

    private static String [] managerTeam = {
            "Iguchi Tadahito",
            "Hara Tatsunori",
            "Ramirez Alex",
            "Kuriyama Hideki",
            "Hiraishi Yosuke"

    };

    private static String [][] playerTeam = {
            {
                //Chiba Lotte Marines
                    //Catcher
                    "53\n55\n99\n45\n22",
                    "Emura Naoya\nHosokawa Toru\nKakinuma Tomoya\nMunetsugu Yuito\nTamura Tatsuhiro",
                    "6 Mei 1992\n4 Januari 1980\n12 Mai 1993\n6 Juli 1994\n13 Mei 1994",
                    "176cm\n183cm\n180cm\n183cm\n174cm",
                    "83kg\n103kg\n82kg\n90kg\n80kg",
                    "R\nR\nR\nR\nR",
                    "R\nR\nR\nR\nR",

                    //Pitcher
                    "60\n36\n24\n62\n30",
                    "Abe Kazunari\nAriyoshi Yuki\nAzuma Yusuke\nNagano Shoji\nOmine Yuta",
                    "19 Mei 1989\n12 Maret 1991\n4 April 1996\n2 Maret 1933\n16 Juni 1988",
                    "183cm\n178cm\n172cm\n181cm\n184cm",
                    "80kg\n87kg\n80kg\n82kg\n80kg",
                    "R\nR\nR\nL\nR",
                    "R\nR\nR\nL\nL",

                    //Infielder
                    "4\n9\n13\n59\n57",
                    "Fujioka Yudai\nFukuura Kazuya\nHirasawa Taiga\nHosoya Kei\nKatsuki Kazuya",
                    "8 Agustus 1993\n14 Desember 1975\n24 Desember 1997\n17 Januari 1988\n16 April 1996",
                    "178cm\n183cm\n176cm\n182cm\n176cm",
                    "77kg\n88kg\n80kg\n84kg\n83kg",
                    "R\nL\nR\nR\nR",
                    "L\nL\nL\nR\nL",

                    //Outfilder
                    "2\n38\n10\n1\n22",
                    "Fujiwara Kyota\nIshimine Shota\nKato Shohei\nKiyota Ikuhiro\nMike Kazuma",
                    "6 Mei 2000\n12 Mei 1988\n28 Maret 1991\n11 Februari 1986\n13 Agustus 1993",
                    "181cm\n180cm\n183cm\n180cm\n180cm",
                    "78kg\n85kg\n84kg\n85kg\n80kg",
                    "L\nR\nR\nR\nR",
                    "L\nR\nS\nR\nS"
            },
            {
                //Yomiuri Giants
                    //Catcher
                    "10\n38\n22\n46\n27",
                    "Abe Shinnosuke\nKishida Yukinori\nKobayashi Seiji\nOshiro Takumi\nSumitani Ginjiro",
                    "20 Maret 1979\n10 Oktober 1996\n7 Januari 1989\n11 Februari 1993\n19 Juli 1987",
                    "180cm\n176cm\n178cm\n187cm\n174cm",
                    "97kg\n87kg\n85kg\n90kg\n80kg",
                    "R\nR\nR\nR\nR",
                    "L\nR\nR\nL\nR",

                    //Pitcher
                    "92\n24\n31\n48\n21",
                    "Adames Samuel\nCook Ryan\nHatake Seishu\nIkeda Shun\nIwakuma Hisashi",
                    "27 September 1994\n30 Juni 1987\n31 Mei 1994\n29 November 1992\n12 April 1981",
                    "193cm\n188cm\n180cm\n174cm\n190cm",
                    "86kg\n100kg\n82kg\n78kg\n77kg",
                    "R\nR\nR\nL\nR",
                    "R\nR\nR\nL\nR",

                    //Infielder
                    "52\n96\n63\n5\n60",
                    "Kitamura Takumi\nMartinez Jorge\nMasuda Daiki\nMasuda Riku\nWakabayshi Akihiro",
                    "29 Agustus 1995\n29 Maret 1993\n29 Juli 1993\n17 Juni 2000\n26 Agustus 1993",
                    "181cm\n188cm\n172cm\n178cm\n176cm",
                    "88kg\n77kg\n68kg\n80kg\n76kg",
                    "R\nR\nR\nR\nR",
                    "R\nS\nR\nR\nS",

                    //Outfilder
                    "44\n36\n9\n8\n2",
                    "Guerrero Alex\nIshikawa Shingo\nKamei Yoshiyuki\nMaru Yoshihiro\nYoh Daikan",
                    "20 November 1986\n27 April 1993\n28 Juli 1982\n11 April 1989\n17 Januari 1987",
                    "182cm\n178cm\n178cm\n177cm\n183cm",
                    "99kg\n80kg\n82kg\n90kg\n89kg",
                    "R\nR\nR\nR\nR",
                    "R\nR\nL\nL\nR"
            },
            {
                //Yokohama BayStars
                    //Catcher
                    "29\n32\n39\n66\n10",
                    "Ito Hikaru\nMashiko Kyosuke\nMinei Hiroki\nNishimori Masashi\nTobashira Yasutaka",
                    "23 April 1989\n27 Desember 2000\n4 Juni 1991\n29 Desember 1987\n11 April 1990",
                    "180cm\n176cm\n175cm\n182cm\n179cm",
                    "83kg\n87kg\n85kg\n80kg\n90kg",
                    "R\nR\nR\nR\nR",
                    "R\nR\nR\nS\nL",

                    //Pitcher
                    "49\n45\n11\n42\n17",
                    "Akama Ken\nAyabe Kakeru\nAzuma Katsuki\nBarrios Edison\nMishima Kazuku",
                    "14 November 1990\n25 April 1997\n29 November 1995\n11 Oktober 1988\n7 Mei 1990",
                    "180cm\n189cm\n170cm\n185cm\n176cm",
                    "87kg\n100kg\n78kg\n85kg\n80kg",
                    "R\nR\nL\nR\nR",
                    "R\nR\nL\nR\nS",

                    //Infielder
                    "60\n7\n4\n36\n5",
                    "Chino Naoto\nIshikawa Takehiro\nIto Yukiya\nKarino Yukikazu\nKuramoto Toshihiko",
                    "16 Februari 1999\n10 Juli 1986\n30 Agustus 1996\n31 Juli 1994\n7 Januari 1991",
                    "182cm\n183cm\n182cm\n180cm\n180cm",
                    "83kg\n78kg\n96kg\n80kg\n82kg",
                    "R\nR\nR\nR\nR",
                    "R\nL\nR\nR\nL",

                    //Outfilder
                    "57\n52\n3\n8\n1",
                    "Aoyagi Koki\nHosokawa Seiya\nKajitani Takayuki\nKamizato Kazuki\nKusumoto Taishi",
                    "19 Mei 1997\n4 Agustus 1998\n28 Agustus 1988\n17 Januari 1994\n21 Juli 1993",
                    "182cm\n179cm\n180cm\n179cm\n174cm",
                    "86kg\n86kg\n85kg\n81kg\n78kg",
                    "R\nR\nR\nR\nR",
                    "R\nR\nL\nL\nR"
            },
            {
                //Nippon Ham-Fighters
                    //Catcher
                    "68\n60\n42\n90\n10",
                    "Ishikawa Ryo\nKori Takuya\nKurobane Toshiki\nSanematsu Kazunari\nShimizu Yushi",
                    "22 Mei 1996\n25 April 1998\n2 Juni 1987\n18 Juni 1981\n22 Mei 1996",
                    "180cm\n178cm\n179cm\n177cm\n185cm",
                    "84kg\n81kg\n90kg\n89kg\n88kg",
                    "R\nR\nR\nR\nR",
                    "R\nR\nR\nR\nR",

                    //Pitcher
                    "39\n16\n40\n34\n29",
                    "Akiyoshi Ryo\nArihara Kohei\nFukuda Suguru\nHori Mizuki\nIguchi Kazutomo",
                    "21 Maret 1989\n11 Agustus 1992\n14 Desember 1996\n10 Mei 1998\n7 Januari 1994",
                    "182cm\n189cm\n170cm\n177cm\n175cm",
                    "73kg\n101kg\n74kg\n78kg\n80kg",
                    "R\nR\nL\nL\nR",
                    "R\nR\nL\nL\nR",

                    //Infielder
                    "45\n70\n38\n21\n2",
                    "Hiranuma Shota\nImai Junnosuke\nIshii Kazunari\nKiyomiya Kotaro\nSugiya Kenshi",
                    "16 Agustus 1997\n25 Mei 1998\n6 Mei 1994\n25 Mei 1999\n4 Februari 1991",
                    "179cm\n177cm\n182cm\n184cm\n173cm",
                    "78kg\n94kg\n80kg\n102kg\n78kg",
                    "R\nR\nR\nR\nR",
                    "L\nL\nL\nL\nS",

                    //Outfilder
                    "26\n61\n67\n8\n66",
                    "Asama Daiki\nHimeno Yuya\nKishisat Ryosuke\nKondo Kensuke\nMannami Chusei",
                    "21 Juni 1996\n2 April 1997\n3 April 1995\n9 Agustus 1993\n7 April 2000",
                    "183cm\n184cm\n180cm\n173cm\n190cm",
                    "80kg\n84kg\n76kg\n86kg\n90kg",
                    "R\nR\nR\nR\nR",
                    "L\nS\nL\nL\nR"
            },
            {
                //Rakuten Eagles
                    //Catcher
                    "44\n65\n70\n27\n2",
                    "Adachi Yuichi\nHoriuchi Kengo\nIshihara Tsuyoshi\nOkajima Takero\nOta Hikaru",
                    "22 September 1989\n15 April 1997\n8 Maret 1999\n7 September 1989\n14 Oktober 1996",
                    "178cm\n174cm\n172cm\n176cm\n178cm",
                    "83kg\n82kg\n96kg\n82kg\n76kg",
                    "R\nR\nR\nR\nR",
                    "R\nL\nR\nL\nR",

                    //Pitcher
                    "20\n41\n32\n19\n31",
                    "Anraku Tomohiro\nAoyama Koji\nBusenitz Alan\nFujihara Shoma\nFukui Yuya",
                    "4 November 1996\n12 Agustus 1983\n22 Agustus 1990\n21 September 1998\n8 Februari 1988",
                    "186cm\n18cm\n185cm\n185cm\n178cm",
                    "87kg\n80kg\n81kg\n85kg\n85kg",
                    "R\nR\nR\nR\nR",
                    "L\nR\nR\nR\nR",

                    //Infielder
                    "33\n3\n6\n5\n66",
                    "Akiminai Ginji\nAsamura Hideto\nFujita Kazuya\nMogi Eigoro\nMurabayashi Itsuki",
                    "24 Februari 1988\n12 November 1990\n3 Juli 1982\n14 Februaru 1994\n6 Oktober 1997",
                    "174cm\n182cm\n175cm\n171cm\n180cm",
                    "78kg\n90kg\n75kg\n75kg\n73kg",
                    "R\nR\nR\nR\nR",
                    "L\nR\nL\nL\nR",

                    //Outfilder
                    "69\n49\n13\n51\n25",
                    "Blash Jabari\nHashimoto Itaru\nIwami Masaki\nOgu Yuya\nTanaka Kazuki",
                    "4 Juli 1989\n28 April 1990\n10 Juli 1994\n3 Agustus 1996\n8 Agustus 1994",
                    "196cm\n172cm\n187cm\n178cm\n181cm",
                    "106kg\n79kg\n78kg\n108kg\n75kg",
                    "R\nR\nR\nR\nR",
                    "R\nL\nR\nL\nS"
            },
    };

    private static int[] gambarTeam = {
            R.drawable.marines,
            R.drawable.yomiurigiantslogo,
            R.drawable.yokohama,
            R.drawable.nipponlogo,
            R.drawable.rakuten,
    };

    static ArrayList<Baseball> getListData(){
        int position = 0;
        ArrayList<Baseball> list = new ArrayList<>();

        for (String[]playerData : playerTeam){
            Baseball baseball = new Baseball();
            baseball.setTeam(namaTeam[position]);
            baseball.setDetail(deskTeam[position]);
            baseball.setDetail2(desk2Team[position]);
            baseball.setLogo(gambarTeam[position]);
            baseball.setManager(managerTeam[position++]);
            // Catcher
            baseball.setNocatcher(playerData[0]);
            baseball.setNcatcher(playerData[1]);
            baseball.setLcatcher(playerData[2]);
            baseball.setGcatcher(playerData[3]);
            baseball.setEcatcher(playerData[4]);
            baseball.setTcatcher(playerData[5]);
            baseball.setBcatcher(playerData[6]);
            // Pitcher
            baseball.setNopitcher(playerData[7]);
            baseball.setNpitcher(playerData[8]);
            baseball.setLpitcher(playerData[9]);
            baseball.setGpitcher(playerData[10]);
            baseball.setEpitcher(playerData[11]);
            baseball.setTpitcher(playerData[12]);
            baseball.setBpitcher(playerData[13]);
            //Infielder
            baseball.setNoinfielder(playerData[14]);
            baseball.setNinfielder(playerData[15]);
            baseball.setLinfielder(playerData[16]);
            baseball.setGinfielder(playerData[17]);
            baseball.setEinfielder(playerData[18]);
            baseball.setTinfielder(playerData[19]);
            baseball.setBinfielder(playerData[20]);
            //Outfielder
            baseball.setNooutfielder(playerData[21]);
            baseball.setNoutfielder(playerData[22]);
            baseball.setLoutfielder(playerData[23]);
            baseball.setGoutfielder(playerData[24]);
            baseball.setEoutfielder(playerData[25]);
            baseball.setToutfielder(playerData[26]);
            baseball.setBoutfielder(playerData[27]);

            list.add(baseball);
        }

        return list;
    }
}
