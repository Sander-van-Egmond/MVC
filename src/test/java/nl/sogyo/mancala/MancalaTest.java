package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class MancalaTest {

    @Test
    public void inhoudIs0BijStartBeurt(){
    	SubBakje bakje = new SubBakje();
    	bakje.startBeurt();
        Assert.assertEquals(0, bakje.getSteentjes());
    }
    
    @Test
    public void getBuurmanReturnEenNieuwSubBakjeObject(){
    	SubBakje bakje = new SubBakje();
    	bakje.getBuurman();
    	Assert.assertNotEquals(bakje, bakje.getBuurman());
    }
    
    @Test
    public void geefDoorZorgtVoorBuurmanPlus1(){
    	SubBakje bakje = new SubBakje();
    	bakje.startBeurt();
    	Assert.assertEquals(5, bakje.getBuurman().getSteentjes());
    }
    
    @Test
    public void BuurmanVanBuurmanHeeftOokplus1(){
    	SubBakje bakje = new SubBakje();
    	bakje.startBeurt();
    	Assert.assertEquals(5, bakje.getBuurman(2).getSteentjes());
    }
    
    @Test
    public void buurman5heeft4stenenNaBeurt(){
    	SubBakje bakje = new SubBakje();
    	bakje.startBeurt();
    	Assert.assertEquals(4, bakje.getBuurman(5).getSteentjes());
    }
    
    @Test
    public void buurman6IsKalaha(){
    	SubBakje bakje = new SubBakje();
    	bakje.startBeurt();
    	Assert.assertTrue(bakje.getBuurman(6) instanceof Kalaha);
    }
    
    @Test
    public void alsStartBeurtBij3deBakjeDanHeeftKalaha1Steen(){
    	SubBakje bakje = new SubBakje();
    	bakje.getBuurman(2).startBeurt();
    	Assert.assertEquals(1, bakje.getBuurman(6).getSteentjes());
    }
    
    @Test
    public void bakjeNaKalahaKrijgtOokEenSteenAlsKalahaDoorgeeft(){
    	SubBakje bakje = new SubBakje();
    	bakje.getBuurman(5).startBeurt();
    	Assert.assertEquals(5, bakje.getBuurman(8).getSteentjes());
    }
    
    @Test
    public void kahalaTegenstanderKrijgtGeenSteen(){
    	SubBakje bakje = new SubBakje(20);
    	bakje.startBeurt();
    	Assert.assertEquals(0, bakje.getBuurman(13).getSteentjes());
    }
    
    @Test
    public void deBronMoetOokSteentjesKrijgenAlsHijZichzelfUitdeelt(){
    	SubBakje bakje = new SubBakje(15);
    	bakje.startBeurt();
    	Assert.assertEquals(1, bakje.getSteentjes());
    }
    
    @Test
    public void alsDeBeurtEindigtInEenLeegVakjeAanJouwKantWordtDatBakjeLeeg(){
    	SubBakje bakje = new SubBakje(13);
    	bakje.startBeurt();
    	Assert.assertEquals(0, bakje.getSteentjes());
    }
    
    @Test
    public void alsDeBeurtEindigtInEenLeegVakjeAanJouwKantWordtOverbuurmanLeeg(){
    	SubBakje bakje = new SubBakje(13);
    	bakje.startBeurt();
    	Assert.assertEquals(0, bakje.getBuurman(12).getSteentjes());
    }
    
    @Test
    public void alsDeBeurtEindigtInEenLeegVakjeAanJouwKantKomenSteentjesVanOverBuurmanEnBakjeInJouwMancala(){
    	SubBakje bakje = new SubBakje(13);
    	bakje.startBeurt();
    	Assert.assertEquals(7, bakje.getBuurman(6).getSteentjes());
    }
    
    @Test
    public void andereSpelerIsAanDeBeurtNaEenBeurt(){
    	SubBakje bakje = new SubBakje();
    	bakje.startBeurt();
    	Assert.assertTrue(bakje.getOverBuurman().getEigenaar().getBeurt());
    }
}
