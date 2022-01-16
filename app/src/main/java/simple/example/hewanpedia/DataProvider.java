package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Monyet;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataUlar(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Siberia",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut ", R.drawable.cat_angora));
        kucings.add(new Kucing("bengal", "inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris ", R.drawable.cat_bengal));
        kucings.add(new Kucing("birmani", "birma/myianmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("persia ", "iran",
                " Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma ", R.drawable.cat_persia));
        kucings.add(new Kucing("siam", "thailand",
                " Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diim", R.drawable.cat_siam));

        kucings.add(new Kucing("siberia", "rusia",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telingalebar, dan mata kebiruan ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataIkan(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("buldog","inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("husky", "Alaska,Siberia,Finlandia (daerah bersalju)",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("kintami", "indonesia",
                "Ras anjing asli pulau Bali", R.drawable.dog_kintamani));
        anjings.add(new Anjing("samoyat","rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("sepherd","jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("shiba","jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu", R.drawable.dog_shiba));

        return anjings;
    }

    private static List<Monyet>initDataBurung(Context ctx) {
        List<Monyet> monyets = new ArrayList<>();
        monyets.add(new Monyet("monyet atlantic_titi", "Australia",
                "Mamalia menggemaskan ini tinggal di hutan dan daerah mangrove", R.drawable.monyet_atlantic_titi));
        monyets.add(new Monyet("monyet goeldis_marmoset", "Selandia Baru",
                "Salah satu jenis monyet yang mendapat status rentan dari lembaga konservasi  ", R.drawable.monyet_goeldis_marmoset));
        monyets.add(new Monyet("monyet_white_headed_capuchin", "indonesia",
                "Monyet ini tidak terlalu selektif dalam memilih makanan. Mereka biasa makan buah, biji dan daun yang berbeda-beda, tergantung musimny", R.drawable.monyet_white_headed_capuchin));

        return monyets;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataIkan(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
