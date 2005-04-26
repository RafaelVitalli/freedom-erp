/**
 * @version 30/05/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.cfg <BR>
 * Classe: @(#)FUsuario.java <BR>
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
 * Formul�rio de cadastro de usu�rios do sistema.
 * 
 */

package org.freedom.modulos.cfg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import org.freedom.componentes.JLabelPad;
import javax.swing.JList;
import javax.swing.JScrollPane;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.acao.CheckBoxEvent;
import org.freedom.acao.CheckBoxListener;
import org.freedom.acao.DeleteEvent;
import org.freedom.acao.DeleteListener;
import org.freedom.acao.InsertEvent;
import org.freedom.acao.InsertListener;
import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JPasswordFieldPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextAreaPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FDados;


public class FUsuario extends FDados implements PostListener, DeleteListener, InsertListener, CarregaListener, ActionListener, CheckBoxListener {
  private JTextFieldPad txtIDUsu = new JTextFieldPad(JTextFieldPad.TP_STRING,8,0);
  private JTextFieldPad txtNomeUsu = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtPNomeUsu = new JTextFieldPad(JTextFieldPad.TP_STRING,20,0);
  private JTextFieldPad txtUNomeUsu = new JTextFieldPad(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtIDGrpUsu = new JTextFieldPad(JTextFieldPad.TP_STRING,8,0);
  private JTextFieldFK txtDescGrup = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextFieldPad txtCodCC = new JTextFieldPad(JTextFieldPad.TP_STRING,19,0);
  private JTextFieldFK txtDescCC = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private JTextAreaPad txaComentUsu = new JTextAreaPad();
  private JPasswordFieldPad txpSenha = new JPasswordFieldPad(8);
  private JPasswordFieldPad txpConfirma = new JPasswordFieldPad(8);
  private JTextFieldPad txtCodAlmox = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescAlmox = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private static Vector vEmp = new Vector();
  private static Vector vDisp =  new Vector();
  private static Vector vCodEmp = new Vector();
  private static Vector vCodDisp =  new Vector();
  private JList lsEmp = new JList();
  private JList lsDisp = new JList();
  private JScrollPane spnObs = new JScrollPane(txaComentUsu);
  private JScrollPane spnEmp = new JScrollPane(lsEmp);
  private JScrollPane spnDisp = new JScrollPane(lsDisp);
  private JButton btAdicEmp = new JButton(Icone.novo("btFlechaDir.gif"));
  private JButton btDelEmp = new JButton(Icone.novo("btFlechaEsq.gif"));
  private ListaCampos lcGrup = new ListaCampos(this,"IG");
  private ListaCampos lcCC = new ListaCampos(this,"CC");
  private ListaCampos lcAlmox = new ListaCampos(this,"AM");
  private JCheckBoxPad cbBaixoCusto = new JCheckBoxPad("Permite vendas abaixo do custo","S","N");
  private JCheckBoxPad cbAbreGaveta = new JCheckBoxPad("Permite abrir gaveta no PDV","S","N");
  private JCheckBoxPad cbAlmoxarife = new JCheckBoxPad("Permite atuar como Almoxarife","S","N");
  private JRadioGroup rgAprovaSolicitacao = null;
  private Vector vAprovaSolicitacaoLab = new Vector();
  private Vector vAprovaSolicitacaoVal = new Vector();
  private Connection conIB = null;
  public FUsuario () {
    setTitulo("Cadastro de Usu�rios");
    setAtribos( 50, 50, 467, 535);

    txpSenha.setListaCampos(lcCampos);
    txpConfirma.setListaCampos(lcCampos);

    lcGrup.add(new GuardaCampo( txtIDGrpUsu, "IDGRPUSU", "ID grupo", ListaCampos.DB_PK,false));
    lcGrup.add(new GuardaCampo( txtDescGrup, "NOMEGRPUSU", "Descri�ao do grupo", ListaCampos.DB_SI, false));
    lcGrup.montaSql(false, "GRPUSU", "SG");    
    lcGrup.setQueryCommit(false);
    lcGrup.setReadOnly(true);
    txtIDGrpUsu.setTabelaExterna(lcGrup);

    lcCC.add(new GuardaCampo( txtCodCC, "CodCC", "C�d.c.c.", ListaCampos.DB_PK, false));
    lcCC.add(new GuardaCampo( txtDescCC, "DescCC", "Descri�ao do centro de custo", ListaCampos.DB_SI, false));
    lcCC.montaSql(false, "CC", "FN");    
    lcCC.setQueryCommit(false);
    lcCC.setReadOnly(true);
    txtCodCC.setTabelaExterna(lcCC);
    
    adicCampo(txtIDUsu, 7, 20, 80, 20, "IDUsu", "ID.usu.", ListaCampos.DB_PK, true);
    adicCampo(txtNomeUsu, 90, 20, 350, 20, "NomeUsu", "Nome do usu�rio", ListaCampos.DB_SI, true);
    adicCampo(txtPNomeUsu, 7, 60, 180, 20, "PNomeUsu", "Primeiro nome", ListaCampos.DB_SI, true);
    adicCampo(txtUNomeUsu, 190, 60, 250, 20, "UNomeUsu", "�ltimo nome", ListaCampos.DB_SI, true);
    adicCampo(txtIDGrpUsu, 7, 100, 70, 20, "IDGRPUSU", "ID.grupo", ListaCampos.DB_FK, false);
    adicDescFK(txtDescGrup, 80, 100, 216, 20, "NOMEGRPUSU", "Descri��o do grupo do usu�rio");
    adic(new JLabelPad("Senha"),300,80,70,20);
    adic(txpSenha,300,100,70,20);
    adic(new JLabelPad("Confirma"),373,80,70,20);
    adic(txpConfirma,373,100,70,20);
    adicCampo(txtCodCC, 7, 140, 110, 20, "CodCC", "C�d.c.c.", ListaCampos.DB_FK, false);
    adicDescFK(txtDescCC, 120, 140, 322, 20, "DescCC", "Descri��o do centro de custo");
    
    adicDBLiv(txaComentUsu, "ComentUsu", "Coment�rio", false);
    adic(new JLabelPad("Coment�rio"),7,160,100,20);
    adic(spnObs,7,180,435,60);
    adic(new JLabelPad("Filiais dispon�veis:"),7,240,120,20);
    adic(spnDisp,7,260,195,100);
    adic(btAdicEmp,210,275,30,30);
    adic(btDelEmp,210,315,30,30);
    adic(new JLabelPad("Acesso:"),247,240,158,20);
    adic(spnEmp,247,260,195,100);
    adicDB(cbBaixoCusto, 7, 360, 225, 20, "BaixoCustoUsu", "", false);
    adicDB(cbAbreGaveta, 7, 380, 225, 20, "AbreGavetaUsu", "", false);
    adicDB(cbAlmoxarife, 7, 400, 225, 20, "AlmoxarifeUsu", "", false);
    
    txtCodAlmox.setRequerido(cbAlmoxarife.isSelected());
  	txtCodAlmox.setAtivo(cbAlmoxarife.isSelected());
  	
    adicCampo(txtCodAlmox, 7, 440, 80, 20, "CodAlmox", "C�d.almox.", ListaCampos.DB_FK, false);
    adicDescFK(txtDescAlmox, 90, 440, 170, 20, "DescAlmox", "Descri��o do almoxarifado");

    lcAlmox.add(new GuardaCampo(txtCodAlmox, "CodAlmox", "Cod.almox.", ListaCampos.DB_PK, false));
    lcAlmox.add(new GuardaCampo(txtDescAlmox,"DescAlmox", "Descri��o do almoxarifado",ListaCampos.DB_SI, false));
    lcAlmox.montaSql(false, "ALMOX", "EQ");    
    lcAlmox.setQueryCommit(false);
    lcAlmox.setReadOnly(true);
    txtCodAlmox.setTabelaExterna(lcAlmox);   
    
    vAprovaSolicitacaoLab.add("Nenhuma");
    vAprovaSolicitacaoLab.add("Mesmo Centro de Custo");
    vAprovaSolicitacaoLab.add("Todas");

    vAprovaSolicitacaoVal.add("ND");
    vAprovaSolicitacaoVal.add("CC");
    vAprovaSolicitacaoVal.add("TD");

    rgAprovaSolicitacao = new JRadioGroup(3, 1, vAprovaSolicitacaoLab, vAprovaSolicitacaoVal);
    adicDB(rgAprovaSolicitacao, 263, 380, 180, 80, "AprovCPSolicitacaoUsu", "Aprova solicita��o", false);
    
    setListaCampos( false, "USUARIO", "SG");
    lcCampos.addCarregaListener(this);
    lcCampos.addPostListener(this);
	lcCampos.addInsertListener(this);
    lcCampos.addDeleteListener(this);
    cbAlmoxarife.addCheckBoxListener(this);
       
    lcCampos.setQueryInsert(false);    
    
    btAdicEmp.addActionListener(this);
    btDelEmp.addActionListener(this);
  }
  public void valorAlterado(CheckBoxEvent evt) {
  		boolean checked = evt.getCheckBox().isSelected();
  		txtCodAlmox.setRequerido(checked);
  		txtCodAlmox.setAtivo(checked);
  }
  private void adicionaEmp() {
  	if (lsDisp.isSelectionEmpty()) 
  	  return;
  	for (int i=lsDisp.getMaxSelectionIndex();i>=0;i--) {
  	  if (lsDisp.isSelectedIndex(i)) {
        vEmp.add(vDisp.elementAt(i));
        vDisp.remove(i);
        vCodEmp.add(vCodDisp.elementAt(i));
        vCodDisp.remove(i);
  	  }
  	}
    lsDisp.setListData(vDisp);
    lsEmp.setListData(vEmp);
    lcCampos.edit();
  }
  private void removeEmp() {
  	if (lsEmp.isSelectionEmpty()) 
  	  return;
  	for (int i=lsEmp.getMaxSelectionIndex();i>=0;i--) {
  	  if (lsEmp.isSelectedIndex(i)) {
        vDisp.add(vEmp.elementAt(i));
        vEmp.remove(i);
        vCodDisp.add(vCodEmp.elementAt(i));
        vCodEmp.remove(i);
  	  }
  	}
    lsDisp.setListData(vDisp);
    lsEmp.setListData(vEmp);
    lcCampos.edit();
  }
  private void carregaDisp() {
  	try {
      PreparedStatement ps;
      ps = con.prepareStatement("SELECT CODFILIAL,NOMEFILIAL FROM SGFILIAL WHERE CODEMP=?");
  	  ps.setInt(1,Aplicativo.iCodEmp);
  	  ResultSet rs = ps.executeQuery();
  	  vDisp.clear();
  	  vCodDisp.clear();
      while (rs.next()) {
        vCodDisp.addElement(rs.getString("CodFilial"));
        vDisp.addElement(rs.getString("NomeFilial") != null ? rs.getString("NomeFilial").trim(): "");
  	  }
  	  rs.close();
	  ps.close();
	  if (!con.getAutoCommit())
	  	con.commit();
  	  lsDisp.setListData(vDisp);
	}
  	catch(SQLException err) {
		Funcoes.mensagemErro(this,"N�o foi carregar as filiais dipon�veis.\n"+err);
	}  		
  }
  private void carregaAcesso() {
  	int iPos = 0;
  	try {
      String sSQL = "SELECT FL.CODFILIAL,FL.NOMEFILIAL FROM SGFILIAL FL, SGACESSOEU AC WHERE "+
                    "AC.IDUSU = ? AND FL.CODEMP = AC.CODEMPFL AND FL.CODFILIAL = AC.CODFILIALFL";
      PreparedStatement ps = con.prepareStatement(sSQL);
      ps.setString(1,txtIDUsu.getVlrString());
      ResultSet rs = ps.executeQuery();
      vEmp.clear();
      vCodEmp.clear();
      while (rs.next()) {
        vCodEmp.addElement(rs.getString("CodFilial"));
        vEmp.addElement(rs.getString("NomeFilial") != null ? rs.getString("NomeFilial").trim(): "");
        
        iPos = vCodDisp.indexOf(rs.getString("CodFilial"));
        
        vCodDisp.remove(iPos);
        vDisp.remove(iPos);
  	  }
  	  rs.close();
	  ps.close();
	  if (!con.getAutoCommit())
	  	con.commit();
  	  lsEmp.setListData(vEmp);
  	  lsDisp.setListData(vDisp);
	}
  	catch(SQLException err) {
		Funcoes.mensagemInforma(this,"N�o foi carregar as filiais que o usu�rio tem acesso.\n"+err);
	}  		
  }
  private void gravaAcesso() {
  	String sSep = null;
  	String sSqlI = null;
  	String sSqlD = null; 
  	String sSqlG = null;
  	PreparedStatement ps = null;
    try {
      sSep = "";
      sSqlI = "";
      for (int i=0; i<vCodEmp.size();i++) {
          sSqlI += sSep + vCodEmp.elementAt(i);
          sSep = ",";
      }
      sSqlD = "DELETE FROM SGACESSOEU WHERE IDUSU=? AND CODEMP=?";
      ps = con.prepareStatement(sSqlD);
      ps.setString(1,txtIDUsu.getVlrString());
      ps.setInt(2,Aplicativo.iCodEmp);
      ps.executeUpdate();
      ps.close();
      if (!con.getAutoCommit())
      	con.commit();
      if (vCodEmp.size() > 0) {
        sSqlI = "INSERT INTO SGACESSOEU (CODEMP,CODFILIAL,IDUSU,CODEMPFL,CODFILIALFL) "+	
                "SELECT CODEMP,"+Aplicativo.iCodFilial+",'"+txtIDUsu.getVlrString()+"',CODEMP,CODFILIAL FROM SGFILIAL "+
                "WHERE CODEMP=? AND CODFILIAL IN ("+sSqlI+")";
        ps = con.prepareStatement(sSqlI);
        ps.setInt(1,Aplicativo.iCodEmp);
        ps.executeUpdate();
        ps.close();
        if (!con.getAutoCommit())
        	con.commit();
      }
      sSqlG = "GRANT "+txtIDGrpUsu.getVlrString().trim()+" TO USER "+txtIDUsu.getVlrString().trim();
      ps = con.prepareStatement(sSqlG);
//      ps.setString(1,txtIDGrpUsu.getVlrString());
//      ps.setString(2,txtIDUsu.getVlrString());
      ps.executeUpdate();
      ps.close();
      if (!con.getAutoCommit())
      	con.commit();
    }
    catch (SQLException err) {
		Funcoes.mensagemInforma(this,"Erro ao cadastrar o acesso!\n"+err.getMessage());
    }
    finally {
      	sSep = null;
      	sSqlI = null;
      	sSqlD = null;
      	sSqlG = null;
      	ps = null;
    }
  }
  private int buscaAnoBaseCC() {
	int iRet = 0;
	String sSQL = "SELECT ANOCENTROCUSTO FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?";
	try {
		PreparedStatement ps = con.prepareStatement(sSQL);
		ps.setInt(1,Aplicativo.iCodEmp);
		ps.setInt(2,ListaCampos.getMasterFilial("SGPREFERE1"));
		ResultSet rs = ps.executeQuery();
		if (rs.next())
			iRet = rs.getInt("ANOCENTROCUSTO");
		rs.close();
		ps.close();
	}
	catch (SQLException err) {
		Funcoes.mensagemErro(this,"Erro ao buscar o ano-base para o centro de custo.\n"+err.getMessage());
	}
	return iRet;
  }
  public void beforePost(PostEvent pevt) {
  	if (!txpSenha.getVlrString().equals(txpConfirma.getVlrString())) {
        pevt.cancela();
		Funcoes.mensagemInforma(this,"Senha diferente da confirma��o!");
  		txpSenha.requestFocus();
  		return;
  	}
  	else if (txpSenha.getVlrString().trim().equals("")) {
        pevt.cancela();
		Funcoes.mensagemInforma(this,"Senha em branco!");
  		txpSenha.requestFocus();
  		return;
  	}
  	else if (txpSenha.getVlrString().length() > 8) {
        pevt.cancela();
		Funcoes.mensagemInforma(this,"A senha n�o pode ultrapassar 8 caracteres!");
  		txpSenha.requestFocus();
  		return;
  	}
  	else if (!txtIDGrpUsu.getVlrString().equalsIgnoreCase("ADM")) {
  		pevt.cancela();
  		Funcoes.mensagemInforma(this,"S� o grupo \"ADM\" est� dispon�vel!");
  		//txtIDGrpUsu.setVlrString("ADM");
  		txtIDGrpUsu.requestFocus();
  		return;
  	}
  	else {
  		try {
  			boolean bCheck = false;
			PreparedStatement ps;
		  	if ((lcCampos.getStatus() == ListaCampos.LCS_INSERT) || (lcCampos.getStatus() == ListaCampos.LCS_EDIT)) {
				ps = conIB.prepareStatement("SELECT SRET FROM CHECKUSER(?)");
				ps.setString(1,txtIDUsu.getVlrString());
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					if (rs.getString(1).trim().equals("S")) {
						if (lcCampos.getStatus() == ListaCampos.LCS_INSERT)
						  Funcoes.mensagemInforma(this,"Aten��o!!\n"+
														   "O usu�rio n�o ser� inserido no banco de dados ISC4, \n"+
														   "pois este j� esta cadastrado.");
					    bCheck = true;
					}
				}
				rs.close();
				ps.close();
				if (bCheck) {
				  if (!txpSenha.getVlrString().equals("88888888") && !txtIDUsu.getVlrString().toUpperCase().equals("SYSDBA"))
				    ps = conIB.prepareStatement("EXECUTE PROCEDURE CHANGEPASSWORD(?,?)");
				  else
				    return;
				}
  				else
				  ps = conIB.prepareStatement("EXECUTE PROCEDURE ADDUSER(?,?)");
		  	}
  			else
            	return;
	  		ps.setString(1,txtIDUsu.getVlrString());
  			ps.setString(2,txpSenha.getVlrString());
  			ps.execute();
	  		ps.close();
	  		if (!con.getAutoCommit())
	  			con.commit();
	  	}
  		catch(SQLException err) {
			Funcoes.mensagemInforma(this,"N�o foi poss�vel criar usu�rio no banco de dados.\n"+err);
    	    pevt.cancela();
	  	}  		
  	}
  }
  public void beforeDelete(DeleteEvent devt) {
  	if(txtIDUsu.getVlrString().toUpperCase().equals("SYSDBA"))
  	  return;
  	try {
  		PreparedStatement ps = conIB.prepareStatement("execute procedure deleteuser(?)");
		ps.setString(1,txtIDUsu.getVlrString());
		ps.execute();
		ps.close();
		if (!con.getAutoCommit())
			con.commit();
	}
  	catch(SQLException err) {
		Funcoes.mensagemInforma(this,"N�o foi poss�vel excluir usu�rio no banco de dados.\n"+err);
    	devt.cancela();
	}  		
  }
  public void afterCarrega(CarregaEvent pevt) { 
  	carregaDisp();
  	carregaAcesso();
  	txpSenha.setVlrString("88888888");
  	txpConfirma.setVlrString("88888888");
    txtCodAlmox.setRequerido(cbAlmoxarife.isSelected());
  	txtCodAlmox.setAtivo(cbAlmoxarife.isSelected());
  }
  public void actionPerformed(ActionEvent evt) {
  	if (evt.getSource() == btAdicEmp)
  		adicionaEmp();
  	else if (evt.getSource() == btDelEmp)
  		removeEmp();
  	super.actionPerformed(evt);

  }
  public void beforeCarrega(CarregaEvent pevt) { }
  public void beforeInsert(InsertEvent ievt) { }
  public void afterPost(PostEvent pevt) {
  	if (pevt.ok)
      gravaAcesso();
  }
  public void afterInsert(InsertEvent ievt) {
	carregaDisp();
	carregaAcesso();
  }
  public void afterDelete(DeleteEvent devt) { }
  public void setConexao(Connection cn, Connection cnIB) {
	super.setConexao(cn);
  	conIB = cnIB;
    lcGrup.setConexao(cn);
	lcCC.setConexao(cn);
    lcCC.setWhereAdic("NIVELCC=10 AND ANOCC="+buscaAnoBaseCC());
	lcAlmox.setConexao(cn);
	if (conIB == null) {
		Funcoes.mensagemInforma(this,"A conex�o com o banco de dados de usu�rio est� nula,\n"+
										  "provavelmente o usu�rio qual voc� conectou n�o possui\n"+
										  "permiss�o para acessar este banco de dados.\n"+
										  "Por favor, contate o administrador do sistema.");
		dispose();
	}
  }
}
