/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: layout <BR>
 * Classe: @(#)NFPomiagro2.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Layout da nota fiscal para a empresa Pomiagro Ltda.
 */

package org.freedom.layout.nf;
import java.math.BigDecimal;
import java.util.Vector;

import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.NF;
import org.freedom.funcoes.Funcoes;
import org.freedom.layout.componentes.Layout;

public class NFPomiagro2 extends Layout {
  public boolean imprimir(NF nf,ImprimeOS imp) {
    boolean retorno = super.imprimir(nf, imp);

    int iNumNota = 0;
    int iItImp = 0;
    int iLinPag = imp.verifLinPag("NF");
    String sTipoTran="" ;
    boolean bFat = true;
    String[] sValsCli = new String[4];
    String[] sNat = new String[2];
    String[] sVencs = new String[5];
    String[] sVals = new String[4];
    String sObs = "";
	String[] sMatObs = null;
	String sImpDtSaidaNat = "";
	//TabVector 
	int iContaMens = 1;
	int iContaFrete = 0;
	String sIncra = "" ;
	Vector<String[]> vMens = new Vector<String[]>();
	vMens.clear();
	
	try{
      if (cab.next()) {
        iNumNota = cab.getInt(NF.C_DOC);
      }
      for (int i=0; i<4; i++) {
        if (bFat) {
          if (parc.next()) {
            sVencs[i] = (parc.getDate(NF.C_DTVENCTO)!=null ? Funcoes.dateToStrDate(parc.getDate(NF.C_DTVENCTO)) : "");
            sVals[i] = Funcoes.strDecimalToStrCurrency(12,2,""+parc.getFloat(NF.C_VLRPARC));
          }
          else {
            bFat = false;
            sVencs[i] = "";
            sVals[i] = "";
          }
        }
        else {
          bFat = false;
          sVencs[i] = "";
          sVals[i] = "";
        }
      }
      imp.limpaPags();
       boolean bNat = true;
      while (itens.next()) {
           if (bNat) {
             sNat[0] = itens.getString(NF.C_DESCNAT);
             sNat[1] = Funcoes.setMascara(itens.getString(NF.C_CODNAT),"#.###");
             bNat = false;
             
           }
         if (imp.pRow()==0) {
           imp.say(imp.pRow()+1,0,""+imp.comprimido()+imp.expandido());
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+0,7,Funcoes.strZero(""+iNumNota,6));
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.normal()+imp.expandido());
           imp.say(imp.pRow()+0,36,Funcoes.strZero(""+iNumNota,6));
           imp.say(imp.pRow()+1,0,""+imp.retiraExpandido());
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           if (nf.getTipoNF()==NF.TPNF_ENTRADA)
             imp.say(imp.pRow()+0,105,"X");
           else
             imp.say(imp.pRow()+0,93,"X");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,sNat[0]);
           imp.say(imp.pRow()+0,53,sNat[1]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           
           if (adic.next()) {
           	 sValsCli[0] = !adic.getString(NF.C_CPFEMITAUX).equals("") ? adic.getString(NF.C_CPFEMITAUX) : cab.getString(NF.C_CPFEMIT);
           	 sValsCli[1] = !adic.getString(NF.C_NOMEEMITAUX).equals("") ? adic.getString(NF.C_NOMEEMITAUX) : cab.getString(NF.C_RAZEMIT);
           	 sValsCli[2] = !adic.getString(NF.C_CIDEMITAUX).equals("") ? adic.getString(NF.C_CIDEMITAUX) : cab.getString(NF.C_CIDEMIT);
           	 sValsCli[3] = !adic.getString(NF.C_UFEMITAUX).equals("") ? adic.getString(NF.C_UFEMITAUX) : cab.getString(NF.C_UFEMIT);
           }
           else {
           	 sValsCli[0] = cab.getString(NF.C_CPFEMIT);
           	 sValsCli[1] = cab.getString(NF.C_RAZEMIT);
           	 sValsCli[2] = cab.getString(NF.C_CIDEMIT);
           	 sValsCli[3] = cab.getString(NF.C_UFEMIT); 
           }
           	
           
           sIncra = cab.getString(NF.C_INCRAEMIT);
           if (!sIncra.equals("")){
			 imp.say(imp.pRow()+0,6,cab.getInt(NF.C_CODEMIT)+" - "+sValsCli[1]+"Incra:");
			 imp.say(imp.pRow()+0,71,cab.getString(NF.C_INCRAEMIT));
           }
		   else  {
             imp.say(imp.pRow()+0,6,cab.getInt(NF.C_CODEMIT)+" - "+sValsCli[1]);
           }        
            
           imp.say(imp.pRow()+0,95,!sValsCli[0].equals("") ? Funcoes.setMascara(sValsCli[0],"###.###.###-##") : Funcoes.setMascara(cab.getString(NF.C_CNPJEMIT),"##.###.###/####-##")) ;
           imp.say(imp.pRow()+0,126,(cab.getDate(NF.C_DTEMITPED)!=null ? Funcoes.dateToStrDate(cab.getDate(NF.C_DTEMITPED)) : ""));
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,Funcoes.copy(cab.getString(NF.C_ENDEMIT),0,30).trim()+", "+(!cab.getString(NF.C_NUMEMIT).equals("") ? Funcoes.copy(cab.getString(NF.C_NUMEMIT),0,6).trim() : "").trim()+" - "+(cab.getString(NF.C_COMPLEMIT) != null ? Funcoes.copy(cab.getString(NF.C_COMPLEMIT),0,9).trim() : "").trim());
           imp.say(imp.pRow()+0,76,cab.getString(NF.C_BAIREMIT));
           imp.say(imp.pRow()+0,106,Funcoes.setMascara(cab.getString(NF.C_CEPEMIT),"#####-###"));
           sImpDtSaidaNat = itens.getString(NF.C_IMPDTSAIDA);
           if (sImpDtSaidaNat==null) sImpDtSaidaNat = "S";
           if (sImpDtSaidaNat.equals("S"))
              imp.say(imp.pRow()+0,126,(cab.getDate(NF.C_DTSAIDA)!=null ? Funcoes.dateToStrDate(cab.getDate(NF.C_DTSAIDA)) : ""));
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,sValsCli[2] != null ? sValsCli[2] : "");
           imp.say(imp.pRow()+0,63,(!cab.getString(NF.C_DDDEMIT).equals("") ? "("+cab.getString(NF.C_DDDEMIT)+")" : "")+
				   				   (!cab.getString(NF.C_FONEEMIT).equals("") ? Funcoes.setMascara(cab.getString(NF.C_FONEEMIT).trim(),"####-####") : "").trim());
           imp.say(imp.pRow()+0,87,sValsCli[3] != null ? sValsCli[3] : "");
           imp.say(imp.pRow()+0,96,!cab.getString(NF.C_RGEMIT).equals("") ? cab.getString(NF.C_RGEMIT) : cab.getString(NF.C_INSCEMIT));
           //imp.say(imp.pRow()+0,128,sHora);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,37,sVencs[0]);
           imp.say(imp.pRow()+0,63,sVencs[1]);
           imp.say(imp.pRow()+0,89,sVencs[2]);
           imp.say(imp.pRow()+0,117,sVencs[3]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,37,sVals[0]);
           imp.say(imp.pRow()+0,63,sVals[1]);
           imp.say(imp.pRow()+0,89,sVals[2]);
           imp.say(imp.pRow()+0,117,sVals[3]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
         }
             
         imp.say(imp.pRow()+1,0,""+imp.comprimido());
         imp.say(imp.pRow()+0,2,Funcoes.alinhaDir(itens.getInt(NF.C_CODPROD),8));


//Descri��es adicionais colocadas junto a decri��o do produto.
         
         String sDescAdic = ""; 
         //Gambs para colocar o lote:
         if ((itens.getDate(NF.C_VENCLOTE) != null) && (!itens.getString(NF.C_CODLOTE).equals(""))) {
         	sDescAdic = "  - L.:"+itens.getString(NF.C_CODLOTE).trim()+", VC.:"+Funcoes.dateToStrDate(itens.getDate(NF.C_VENCLOTE)).substring(3);
         }
		 String sTmp = !itens.getString(NF.C_DESCFISC).equals("") ? itens.getString(NF.C_DESCFISC).trim() : ""; 
		 //Gambs para colocar arteriscos:
		 if (sTmp.length() > 0) {
		 	 int iLinha;
		 	 for (iLinha=0;iLinha<vMens.size();iLinha++) {
		 	 	if (vMens.elementAt(iLinha)[1].equals(sTmp) &&
		 	 		vMens.elementAt(iLinha)[0].indexOf("*") == 0) {
		 	 		sDescAdic += " "+vMens.elementAt(iLinha)[0];
		 	 		break;
		 	 	}
		 	 }
		 	 if (iLinha==vMens.size()) {
		 	 	vMens.add(
		 	 			new String[] {
		 	 					Funcoes.replicate("*",iContaMens++),
								sTmp
						}
		 	 	);
		 	 	sDescAdic += " "+vMens.elementAt(iLinha)[0];
		 	 }
		 	 
		 }
		 sTmp = !itens.getString(NF.C_DESCFISC2).equals("") ? itens.getString(NF.C_DESCFISC2).trim() : "";
		 String sClasFisc = Funcoes.copy(itens.getString(NF.C_ORIGFISC),0,1)+Funcoes.copy(itens.getString(NF.C_CODTRATTRIB),0,2);
		 if (sTmp.length() > 0) {
		 	int iLinha;
		 	for (iLinha=0;iLinha<vMens.size();iLinha++) {
		 		if (vMens.elementAt(iLinha)[0].equals(sClasFisc))
		 			break;
		 	}
		 	if (iLinha==vMens.size()) {
		 		vMens.add(
		 				new String[] {
		 						sClasFisc,
								sTmp
		 				}
		 		);
		 	}
		 }
		 
		   
         imp.say(imp.pRow()+0,14,(!itens.getString(NF.C_DESCPROD).equals("") ? Funcoes.copy(itens.getString(NF.C_DESCPROD).trim(),0,66-sDescAdic.length())+sDescAdic : ""));
         imp.say(imp.pRow()+0,83,sClasFisc);
         imp.say(imp.pRow()+0,89,itens.getString(NF.C_CODUNID).substring(0,4));
         imp.say(imp.pRow()+0,95,""+itens.getFloat(NF.C_QTDITPED));
          
 /*ARRUMAR*/imp.say(imp.pRow()+0,104,Funcoes.strDecimalToStrCurrency(13,2,""+(new BigDecimal(itens.getFloat(NF.C_VLRLIQITPED))).divide(new BigDecimal(itens.getFloat(NF.C_QTDITPED)),2,BigDecimal.ROUND_HALF_UP)));
//         imp.say(imp.pRow()+0,97,Funcoes.strDecimalToStrCurrency(13,2,rs.getString("VlrProdItVenda")));
         imp.say(imp.pRow()+0,119,Funcoes.strDecimalToStrCurrency(13,2,""+itens.getFloat(NF.C_VLRLIQITPED)));
         imp.say(imp.pRow()+0,135,""+itens.getFloat(NF.C_PERCICMSITPED));
         
         iItImp++;
         System.out.println(imp.pRow()+" = iItImp : "+iItImp);
         if ((iItImp == itens.getInt(NF.C_CONTAITENS)) || (imp.pRow() == 46)) {
           if (iContaFrete == 0){
          	 frete.next();
          	 iContaFrete++;
           }
           if (iItImp == itens.getInt(NF.C_CONTAITENS)) {
             int iRow = imp.pRow();
             for (int i=0; i<(46-iRow);i++) {
                 imp.say(imp.pRow()+1,0,"");
             }
             System.out.println(imp.pRow()+" = iItImp - 2 : "+iItImp);
             imp.say(imp.pRow()+1,0,"");
             imp.say(imp.pRow()+1,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             
             imp.say(imp.pRow()+0,4,Funcoes.strDecimalToStrCurrency(20,2,""+cab.getFloat(NF.C_VLRBASEICMSPED)));
             imp.say(imp.pRow()+0,32,Funcoes.strDecimalToStrCurrency(20,2,""+cab.getFloat(NF.C_VLRICMSPED)));
             imp.say(imp.pRow()+0,114,Funcoes.strDecimalToStrCurrency(20,2,""+cab.getFloat(NF.C_VLRPRODPED)));
//             imp.say(imp.pRow()+0,114,Funcoes.strDecimalToStrCurrency(20,2,""+itens.getFloat(NF.C_VLRLIQITPED)));
             imp.say(imp.pRow()+1,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,Funcoes.strDecimalToStrCurrency(20,2,""+frete.getFloat(NF.C_VLRFRETEPED)));
             imp.say(imp.pRow()+0,62,Funcoes.strDecimalToStrCurrency(20,2,""+itens.getFloat(NF.C_VLRADICITPED)));
             imp.say(imp.pRow()+0,87,Funcoes.strDecimalToStrCurrency(20,2,""+cab.getFloat(NF.C_VLRIPIPED)));
             imp.say(imp.pRow()+0,114,Funcoes.strDecimalToStrCurrency(20,2,""+cab.getFloat(NF.C_VLRLIQPED)));
             iItImp = 0;
			 sObs += !cab.getString(NF.C_OBSPED).equals("") ? cab.getString(NF.C_OBSPED).trim()+'\n' : "";
           }
           else if (imp.pRow() == 46) {
             imp.say(imp.pRow()+1,0,"");
             imp.say(imp.pRow()+1,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"***************");
             imp.say(imp.pRow()+0,32,"***************");
             imp.say(imp.pRow()+0,114,"***************");
             imp.say(imp.pRow()+1,0,"");
             imp.say(imp.pRow()+1,0,""+imp.comprimido());
             imp.say(imp.pRow()+0,4,"***************");
             imp.say(imp.pRow()+0,62,"***************");
             imp.say(imp.pRow()+0,87,"***************");
             imp.say(imp.pRow()+0,114,"***************");
           }
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,(!frete.getString(NF.C_RAZTRANSP).equals("") ? frete.getString(NF.C_RAZTRANSP):""));
           imp.say(imp.pRow()+0,82,(!frete.getString(NF.C_TIPOFRETE).equals("") ? (frete.getString(NF.C_TIPOFRETE).equals("C") ? "1" : "2"):""));
           imp.say(imp.pRow()+0,90,(!frete.getString(NF.C_PLACAFRETE).equals("") ? frete.getString(NF.C_PLACAFRETE):""));
           imp.say(imp.pRow()+0,104,(!frete.getString(NF.C_UFFRETE).equals("") ? frete.getString(NF.C_UFFRETE):""));
           
		   sTipoTran = frete.getString(NF.C_TIPOTRANSP);
			
			   if (sTipoTran==null) sTipoTran = "T";
		         if ( sTipoTran.equals("C") ){
			        imp.say(imp.pRow()+0,111,Funcoes.setMascara(!cab.getString(NF.C_CNPJEMIT).equals("") ? cab.getString(NF.C_CNPJEMIT) : "","##.###.###/####-##"));
				  }
			  
			  else {
					 imp.say(imp.pRow()+0,111,Funcoes.setMascara(!frete.getString(NF.C_CNPJTRANSP).equals("") ? frete.getString(NF.C_CNPJTRANSP) : "","##.###.###/####-##")); 
			   	  }
            

           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,Funcoes.copy(frete.getString(NF.C_ENDTRANSP),0,42)+", "+Funcoes.copy(frete.getString(NF.C_NUMTRANSP),0,6));
           imp.say(imp.pRow()+0,69,(!frete.getString(NF.C_CIDTRANSP).equals("") ? frete.getString(NF.C_CIDTRANSP):""));
           imp.say(imp.pRow()+0,104,(!frete.getString(NF.C_UFTRANSP).equals("") ? frete.getString(NF.C_UFTRANSP) : ""));

  
		   if (!frete.getString(NF.C_TIPOTRANSP).equals("") && frete.getString(NF.C_TIPOTRANSP).compareTo("C") == 0){
			   imp.say(imp.pRow()+0,111,(!cab.getString(NF.C_INSCEMIT).equals("") ? cab.getString(NF.C_INSCEMIT):""));
		   }
		   else { 
			imp.say(imp.pRow()+0,111,(!frete.getString(NF.C_INSCTRANSP).equals("") ? frete.getString(NF.C_INSCTRANSP):""));
		   }
           
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,Funcoes.strDecimalToStrCurrency(5,casasDec,""+frete.getString(NF.C_QTDFRETE)));
           imp.say(imp.pRow()+0,26,(!frete.getString(NF.C_ESPFRETE).equals("") ? frete.getString(NF.C_ESPFRETE):""));
           imp.say(imp.pRow()+0,47,(!frete.getString(NF.C_MARCAFRETE).equals("") ? frete.getString(NF.C_MARCAFRETE):""));
           imp.say(imp.pRow()+0,93,Funcoes.strDecimalToStrCurrency(5,casasDec,""+frete.getFloat(NF.C_PESOBRUTO)));
           imp.say(imp.pRow()+0,120,Funcoes.strDecimalToStrCurrency(5,casasDec,""+frete.getString(NF.C_PESOLIQ)));
           System.out.println(imp.pRow()+" 1= Lins: "+iLinPag);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,25,Funcoes.alinhaDir(cab.getInt(NF.C_CODEMIT),10));
           imp.say(imp.pRow()+0,45,Funcoes.alinhaDir(cab.getInt(NF.C_CODPED),10));
           imp.say(imp.pRow()+0,64,!cab.getString(NF.C_DOC).equals("") ? Funcoes.strZero(""+iNumNota,6) : "000000");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,35,""+cab.getInt(NF.C_CODVEND));
           imp.say(imp.pRow()+0,40,!cab.getString(NF.C_CODCLCOMIS).equals("") ? cab.getString(NF.C_CODCLCOMIS) : "");
           imp.say(imp.pRow()+0,50,(new BigDecimal(cab.getFloat(NF.C_PERCMCOMISPED))).setScale(2,BigDecimal.ROUND_HALF_UP).toString());
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           
           for(int i=0;i<vMens.size();i++)
           	 sObs += vMens.elementAt(i)[0] + " - " +vMens.elementAt(i)[1]+ '\n';
           
           sMatObs = Funcoes.strToStrArray(sObs,5);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+0,2,sMatObs[0]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+0,2,sMatObs[1]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+0,2,sMatObs[2]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+0,2,sMatObs[3]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+0,2,sMatObs[4]);
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           System.out.println(imp.pRow()+" =T Lins: "+iLinPag);
           for (int i=imp.pRow(); i<=iLinPag; i++) { 
             imp.say(imp.pRow()+1,0,"");
           }
           imp.setPrc(0,0);
           imp.incPags();
         }
      }
      imp.fechaGravacao();
      retorno = true;
    }
    catch ( Exception err ) {
      	Funcoes.mensagemErro(null,"Erro ao montar nota \n"+err.getMessage()); 
      	err.printStackTrace();
    }
    return retorno;
  }
}
