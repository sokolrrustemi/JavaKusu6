package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String isim, String tur) {
        super.ad = isim; // public
        super.cinsi = tur; // protected
        // defaulttan farklı olarak
        // extend edildiğinde diğer paketlerden de
        // erişilebilir.

    }


}
