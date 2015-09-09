//Fung Yeung
//hw02
//9/8/2015
//set up class

public class Arithmetic{
    
    public static void main (String[]args){
        
        //number of socks
        int nSocks=3;
        //cost of the socks, each pair
        double sockCost$=2.58;
        //number of drinking glasses
        int nGlasses=6;
        //cost of glasses, each
        double glassCost$=2.29;
        //number of envelopes
        int nEnvelopes=1;
        //cost of the envelopes, per box
        double envelopeCost$=3.25;
        double taxPercent= 0.06;
        //total cost of socks variable plus sales tax
        double totalSockCost$;
        //total cost of Glasses variable plus sales tax
        double totalGlassesCost$;
        //total cost of Envelopes plus sales tax
        double totalEnvelopeCost$;
        
        //socks section
        //total cost of socks no sales tax
        double tcsnst;
        tcsnst= (double)(nSocks*sockCost$);
        //total sales tax for socks
        double tsts;
        tsts= (int)(tcsnst*taxPercent*100)/100.0;
        //total cost of socks with sales tax
        double tcsst;
        tcsst= (float) (tsts+tcsnst)*1000/1000.0;
        //println results
        System.out.println("number of socks "+ nSocks);
        System.out.println("cost per sock "+sockCost$);
        System.out.println("sales tax on socks "+tsts);
        System.out.println("cost of socks no sales tax " + tcsnst);
        System.out.println("cost of socks with sales tax "+tcsst);
        
        //glasses section
        //total cost of glasses no sales tax
        double tcgnst;
        tcgnst= (double)(nGlasses*glassCost$);
        //total sales tax for glasses
        double tstg;
        tstg=(int)(tcgnst*taxPercent*100)/100.0;
        //total cost of glasses with sales tax
        double tcgst;
        tcgst= (float) (tstg+tcgnst)*1000/1000.0;
        //println results
        System.out.println("number of glasses "+ nGlasses);
        System.out.println("cost per glass "+glassCost$);
        System.out.println("sales tax on glasses "+ tstg);
        System.out.println("cost of glasses no sales tax "+tcgnst);
        System.out.println("cost of socks with sales tax "+tcgst);
        
        //envelope section
        //total cost of envelopes no sales tax
        double tcenst;
        tcenst= (double)(nEnvelopes*envelopeCost$);
        //total sales tax for envelope
        double tste;
        tste=(int)(tcenst*taxPercent*100)/100.0;
        //total cost of envelope with sales tax
        double tcest;
        tcest= (float) (tste+tcenst)*1000/1000.0;
        //println results
        System.out.println("number of envelopes "+nEnvelopes);
        System.out.println("cost per envelope "+envelopeCost$);
        System.out.println("sales tax on envelope "+tste);
        System.out.println("cost of envelope no sales tax " +tcenst);
        System.out.println("cost of socks with sales tax "+tcest);
        
        //Final price section
        //total cost of purchases
        double tcp;
        tcp= (float)(tcenst+tcgnst+tcsnst)*1000/1000.0;
        //total sales tax
        double tst;
        tst=(float)(tste+tstg+tsts)*1000/1000.0;
        //total cost of purchase with sales tax
        double tcpst;
        tcpst=(float)(tst+tcp)*1000/1000.0;
        //println results
        System.out.println("total cost of purchases no sales tax "+tcp);
        System.out.println("total sales tax "+tst);
        System.out.println("total cost of purchases with sales tax "+tcpst);
        
        
        
    } 
} 