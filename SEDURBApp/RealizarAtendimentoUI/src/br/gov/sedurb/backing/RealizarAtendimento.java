package br.gov.sedurb.backing;


import javax.faces.component.UISelectItems;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailHeader;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;

import oracle.adf.view.rich.component.rich.output.RichMessages;


import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class RealizarAtendimento {
    private RichForm f1;
    private RichDocument d1;
    private UIXGroup g1;
    private RichShowDetailHeader sdh1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph2;
    private RichInputText itCpf;
    private RichInputText itNomeCompleto;
    private RichInputDate idDataNascimento;
    private RichSelectOneRadio sorSexo;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichInputText itTelefoneResidencial;
    private RichInputText itTelefoneCelular;
    private RichInputText itIdentidadeNumero;
    private RichInputText itIdentidadeComplemento;
    private RichInputDate idIdentidadeDataEmissao;
    private RichInputText itIdentidadeOrgaoEmissor;
    private RichSelectOneChoice socIdentidadeUF;
    private UISelectItems si3;
    private RichPanelHeader ph4;
    private RichInputText itEnderecoPais;
    private RichSelectOneChoice socEnderecoUF;
    private UISelectItems si4;
    private RichInputText itEnderecoCEP;
    private RichInputText itEnderecoMunicipio;
    private RichInputText itEnderecoBairro;
    private RichInputText itEnderecoComplemento;
    private RichInputText itEnderecoNumeroLogradouro;
    private RichInputText itEnderecoTipoLogradouro;
    private RichInputText itEnderecoNomeLogradouro;
    private RichPanelGroupLayout pgl1;
    private RichCommandButton cb2;
    private RichCommandButton cb3;
    private RichPanelGroupLayout pglConsultarCidadao;
    private RichInputText itCpfConsulta;
    private RichCommandButton cbConsultarCidadao;
    private RichCommandButton commandButton1;
    private RichPanelGroupLayout pgl3;
    private RichCommandButton cbNovaConsulta;
    private RichPanelGroupLayout pglAgend;
    private RichTable tbDoc;
    private RichPanelGroupLayout pgl4;
    private RichPanelHeader ph5;
    private RichShowDetailHeader sdhAgend;
    private RichShowDetailHeader sdhDoc;
    private RichInputText it1;
    private RichMessages m1;
    private RichPanelFormLayout pfl1;
    private RichPanelFormLayout pfl2;
    private RichCommandButton cb1;
    private RichSelectOneChoice socCategoriaIdoso;
    private UISelectItems si5;
    private RichPanelGroupLayout pgl5;
    private RichPanelGroupLayout pglDoc;
    private RichPanelHeader panelHeader1;
    private RichPanelFormLayout panelFormLayout1;
    private RichCommandButton commandButton3;
    private RichInputText inputText1;
    private RichSelectOneChoice socCategoriaDeficiente;
    private UISelectItems selectItems1;
    private RichInputText it2;
    private RichInputText inputText2;
    private RichPanelGridLayout pgl6;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichPanelFormLayout pfl5;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichCommandButton commandButton4;
    private RichPanelFormLayout pfl3;
    private RichPanelFormLayout pfl4;
    private RichPanelLabelAndMessage plam1;
    private RichPanelLabelAndMessage plam2;
    private RichPanelLabelAndMessage plam3;
    private RichPanelLabelAndMessage plam4;
    private RichPanelLabelAndMessage plam5;
    private RichPanelLabelAndMessage plam6;
    private RichPanelLabelAndMessage plam7;
    private RichPanelLabelAndMessage plam8;
    private RichPanelLabelAndMessage plam9;
    private RichPanelLabelAndMessage plam10;
    private RichPanelLabelAndMessage plam11;
    private RichPanelLabelAndMessage plam12;
    private RichPanelLabelAndMessage plam13;
    private RichPanelLabelAndMessage panelLabelAndMessage1;
    private RichPanelLabelAndMessage panelLabelAndMessage2;
    private RichPanelLabelAndMessage panelLabelAndMessage3;
    private RichPanelLabelAndMessage panelLabelAndMessage4;
    private RichPanelLabelAndMessage plam14;
    private RichPanelLabelAndMessage panelLabelAndMessage5;
    private RichPanelLabelAndMessage panelLabelAndMessage6;
    private RichPanelLabelAndMessage panelLabelAndMessage7;
    private RichPanelLabelAndMessage panelLabelAndMessage8;
    private RichPanelLabelAndMessage panelLabelAndMessage9;
    private RichPanelLabelAndMessage panelLabelAndMessage10;
    private RichPanelLabelAndMessage panelLabelAndMessage11;
    private RichPanelLabelAndMessage panelLabelAndMessage12;
    private RichPanelLabelAndMessage panelLabelAndMessage13;
    private RichPanelGroupLayout pgl8;
    private RichSpacer s1;
    private RichOutputLabel ol1;
    private RichPanelGroupLayout pgl9;
    private RichPanelGridLayout pgl10;
    private RichCommandButton commandButton2;
    private RichOutputLabel ol3;
    private RichPopup popupConfirmacaoIdoso;
    private RichDialog d2;
    private RichPopup popupConfirmacaoDeficiente;
    private RichDialog dialog1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }


    public void setSdh1(RichShowDetailHeader sdh1) {
        this.sdh1 = sdh1;
    }

    public RichShowDetailHeader getSdh1() {
        return sdh1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setItCpf(RichInputText itCpf) {
        this.itCpf = itCpf;
    }

    public RichInputText getItCpf() {
        return itCpf;
    }

    public void setItNomeCompleto(RichInputText itNomeCompleto) {
        this.itNomeCompleto = itNomeCompleto;
    }

    public RichInputText getItNomeCompleto() {
        return itNomeCompleto;
    }

    public void setIdDataNascimento(RichInputDate idDataNascimento) {
        this.idDataNascimento = idDataNascimento;
    }

    public RichInputDate getIdDataNascimento() {
        return idDataNascimento;
    }

    public void setSorSexo(RichSelectOneRadio sorSexo) {
        this.sorSexo = sorSexo;
    }

    public RichSelectOneRadio getSorSexo() {
        return sorSexo;
    }

    public void setSi1(RichSelectItem si1) {
        this.si1 = si1;
    }

    public RichSelectItem getSi1() {
        return si1;
    }

    public void setSi2(RichSelectItem si2) {
        this.si2 = si2;
    }

    public RichSelectItem getSi2() {
        return si2;
    }

    public void setItTelefoneResidencial(RichInputText itTelefoneResidencial) {
        this.itTelefoneResidencial = itTelefoneResidencial;
    }

    public RichInputText getItTelefoneResidencial() {
        return itTelefoneResidencial;
    }

    public void setItTelefoneCelular(RichInputText itTelefoneCelular) {
        this.itTelefoneCelular = itTelefoneCelular;
    }

    public RichInputText getItTelefoneCelular() {
        return itTelefoneCelular;
    }


    public void setItIdentidadeNumero(RichInputText itIdentidadeNumero) {
        this.itIdentidadeNumero = itIdentidadeNumero;
    }

    public RichInputText getItIdentidadeNumero() {
        return itIdentidadeNumero;
    }

    public void setItIdentidadeComplemento(RichInputText itIdentidadeComplemento) {
        this.itIdentidadeComplemento = itIdentidadeComplemento;
    }

    public RichInputText getItIdentidadeComplemento() {
        return itIdentidadeComplemento;
    }

    public void setIdIdentidadeDataEmissao(RichInputDate idIdentidadeDataEmissao) {
        this.idIdentidadeDataEmissao = idIdentidadeDataEmissao;
    }

    public RichInputDate getIdIdentidadeDataEmissao() {
        return idIdentidadeDataEmissao;
    }

    public void setItIdentidadeOrgaoEmissor(RichInputText itIdentidadeOrgaoEmissor) {
        this.itIdentidadeOrgaoEmissor = itIdentidadeOrgaoEmissor;
    }

    public RichInputText getItIdentidadeOrgaoEmissor() {
        return itIdentidadeOrgaoEmissor;
    }

    public void setSocIdentidadeUF(RichSelectOneChoice socIdentidadeUF) {
        this.socIdentidadeUF = socIdentidadeUF;
    }

    public RichSelectOneChoice getSocIdentidadeUF() {
        return socIdentidadeUF;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setPh4(RichPanelHeader ph4) {
        this.ph4 = ph4;
    }

    public RichPanelHeader getPh4() {
        return ph4;
    }

    public void setItEnderecoPais(RichInputText itEnderecoPais) {
        this.itEnderecoPais = itEnderecoPais;
    }

    public RichInputText getItEnderecoPais() {
        return itEnderecoPais;
    }

    public void setSocEnderecoUF(RichSelectOneChoice socEnderecoUF) {
        this.socEnderecoUF = socEnderecoUF;
    }

    public RichSelectOneChoice getSocEnderecoUF() {
        return socEnderecoUF;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setItEnderecoCEP(RichInputText itEnderecoCEP) {
        this.itEnderecoCEP = itEnderecoCEP;
    }

    public RichInputText getItEnderecoCEP() {
        return itEnderecoCEP;
    }

    public void setItEnderecoMunicipio(RichInputText itEnderecoMunicipio) {
        this.itEnderecoMunicipio = itEnderecoMunicipio;
    }

    public RichInputText getItEnderecoMunicipio() {
        return itEnderecoMunicipio;
    }

    public void setItEnderecoBairro(RichInputText itEnderecoBairro) {
        this.itEnderecoBairro = itEnderecoBairro;
    }

    public RichInputText getItEnderecoBairro() {
        return itEnderecoBairro;
    }

    public void setItEnderecoComplemento(RichInputText itEnderecoComplemento) {
        this.itEnderecoComplemento = itEnderecoComplemento;
    }

    public RichInputText getItEnderecoComplemento() {
        return itEnderecoComplemento;
    }

    public void setItEnderecoNumeroLogradouro(RichInputText itEnderecoNumeroLogradouro) {
        this.itEnderecoNumeroLogradouro = itEnderecoNumeroLogradouro;
    }

    public RichInputText getItEnderecoNumeroLogradouro() {
        return itEnderecoNumeroLogradouro;
    }

    public void setItEnderecoTipoLogradouro(RichInputText itEnderecoTipoLogradouro) {
        this.itEnderecoTipoLogradouro = itEnderecoTipoLogradouro;
    }

    public RichInputText getItEnderecoTipoLogradouro() {
        return itEnderecoTipoLogradouro;
    }

    public void setItEnderecoNomeLogradouro(RichInputText itEnderecoNomeLogradouro) {
        this.itEnderecoNomeLogradouro = itEnderecoNomeLogradouro;
    }

    public RichInputText getItEnderecoNomeLogradouro() {
        return itEnderecoNomeLogradouro;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setCb3(RichCommandButton cb3) {
        this.cb3 = cb3;
    }

    public RichCommandButton getCb3() {
        return cb3;
    }


    public void setPglConsultarCidadao(RichPanelGroupLayout pglConsultarCidadao) {
        this.pglConsultarCidadao = pglConsultarCidadao;
    }

    public RichPanelGroupLayout getPglConsultarCidadao() {
        return pglConsultarCidadao;
    }


    public void setItCpfConsulta(RichInputText itCpfConsulta) {
        this.itCpfConsulta = itCpfConsulta;
    }

    public RichInputText getItCpfConsulta() {
        return itCpfConsulta;
    }

    public void setCbConsultarCidadao(RichCommandButton cbConsultarCidadao) {
        this.cbConsultarCidadao = cbConsultarCidadao;
    }

    public RichCommandButton getCbConsultarCidadao() {
        return cbConsultarCidadao;
    }

    public void setCommandButton1(RichCommandButton commandButton1) {
        this.commandButton1 = commandButton1;
    }

    public RichCommandButton getCommandButton1() {
        return commandButton1;
    }


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }


    public void setCbNovaConsulta(RichCommandButton cb4) {
        this.cbNovaConsulta = cb4;
    }

    public RichCommandButton getCbNovaConsulta() {
        return cbNovaConsulta;
    }

    public void setPglAgend(RichPanelGroupLayout pglServicosAgendados) {
        this.pglAgend = pglServicosAgendados;
    }

    public RichPanelGroupLayout getPglAgend() {
        return pglAgend;
    }


    public void setTbDoc(RichTable tbDoc) {
        this.tbDoc = tbDoc;
    }

    public RichTable getTbDoc() {
        return tbDoc;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPh5(RichPanelHeader ph5) {
        this.ph5 = ph5;
    }

    public RichPanelHeader getPh5() {
        return ph5;
    }

    public void setSdhAgend(RichShowDetailHeader sdh2) {
        this.sdhAgend = sdh2;
    }

    public RichShowDetailHeader getSdhAgend() {
        return sdhAgend;
    }

    public void setSdhDoc(RichShowDetailHeader sdh3) {
        this.sdhDoc = sdh3;
    }

    public RichShowDetailHeader getSdhDoc() {
        return sdhDoc;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }


    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setSocCategoriaIdoso(RichSelectOneChoice soc1) {
        this.socCategoriaIdoso = soc1;
    }

    public RichSelectOneChoice getSocCategoriaIdoso() {
        return socCategoriaIdoso;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }


    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setPglDoc(RichPanelGroupLayout pgl6) {
        this.pglDoc = pgl6;
    }

    public RichPanelGroupLayout getPglDoc() {
        return pglDoc;
    }


    public void setPanelHeader1(RichPanelHeader panelHeader1) {
        this.panelHeader1 = panelHeader1;
    }

    public RichPanelHeader getPanelHeader1() {
        return panelHeader1;
    }

    public void setPanelFormLayout1(RichPanelFormLayout panelFormLayout1) {
        this.panelFormLayout1 = panelFormLayout1;
    }

    public RichPanelFormLayout getPanelFormLayout1() {
        return panelFormLayout1;
    }

    public void setCommandButton3(RichCommandButton commandButton3) {
        this.commandButton3 = commandButton3;
    }

    public RichCommandButton getCommandButton3() {
        return commandButton3;
    }

    public void setInputText1(RichInputText inputText1) {
        this.inputText1 = inputText1;
    }

    public RichInputText getInputText1() {
        return inputText1;
    }

    public void setSocCategoriaDeficiente(RichSelectOneChoice selectOneChoice1) {
        this.socCategoriaDeficiente = selectOneChoice1;
    }

    public RichSelectOneChoice getSocCategoriaDeficiente() {
        return socCategoriaDeficiente;
    }

    public void setSelectItems1(UISelectItems selectItems1) {
        this.selectItems1 = selectItems1;
    }

    public UISelectItems getSelectItems1() {
        return selectItems1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setInputText2(RichInputText inputText2) {
        this.inputText2 = inputText2;
    }

    public RichInputText getInputText2() {
        return inputText2;
    }


    public void setPgl6(RichPanelGridLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGridLayout getPgl6() {
        return pgl6;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setPgl7(RichPanelGridLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGridLayout getPgl7() {
        return pgl7;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setCommandButton4(RichCommandButton commandButton4) {
        this.commandButton4 = commandButton4;
    }

    public RichCommandButton getCommandButton4() {
        return commandButton4;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }

    public void setPlam5(RichPanelLabelAndMessage plam5) {
        this.plam5 = plam5;
    }

    public RichPanelLabelAndMessage getPlam5() {
        return plam5;
    }

    public void setPlam6(RichPanelLabelAndMessage plam6) {
        this.plam6 = plam6;
    }

    public RichPanelLabelAndMessage getPlam6() {
        return plam6;
    }

    public void setPlam7(RichPanelLabelAndMessage plam7) {
        this.plam7 = plam7;
    }

    public RichPanelLabelAndMessage getPlam7() {
        return plam7;
    }

    public void setPlam8(RichPanelLabelAndMessage plam8) {
        this.plam8 = plam8;
    }

    public RichPanelLabelAndMessage getPlam8() {
        return plam8;
    }

    public void setPlam9(RichPanelLabelAndMessage plam9) {
        this.plam9 = plam9;
    }

    public RichPanelLabelAndMessage getPlam9() {
        return plam9;
    }

    public void setPlam10(RichPanelLabelAndMessage plam10) {
        this.plam10 = plam10;
    }

    public RichPanelLabelAndMessage getPlam10() {
        return plam10;
    }

    public void setPlam11(RichPanelLabelAndMessage plam11) {
        this.plam11 = plam11;
    }

    public RichPanelLabelAndMessage getPlam11() {
        return plam11;
    }

    public void setPlam12(RichPanelLabelAndMessage plam12) {
        this.plam12 = plam12;
    }

    public RichPanelLabelAndMessage getPlam12() {
        return plam12;
    }

    public void setPlam13(RichPanelLabelAndMessage plam13) {
        this.plam13 = plam13;
    }

    public RichPanelLabelAndMessage getPlam13() {
        return plam13;
    }

    public void setPanelLabelAndMessage1(RichPanelLabelAndMessage panelLabelAndMessage1) {
        this.panelLabelAndMessage1 = panelLabelAndMessage1;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage1() {
        return panelLabelAndMessage1;
    }

    public void setPanelLabelAndMessage2(RichPanelLabelAndMessage panelLabelAndMessage2) {
        this.panelLabelAndMessage2 = panelLabelAndMessage2;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage2() {
        return panelLabelAndMessage2;
    }

    public void setPanelLabelAndMessage3(RichPanelLabelAndMessage panelLabelAndMessage3) {
        this.panelLabelAndMessage3 = panelLabelAndMessage3;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage3() {
        return panelLabelAndMessage3;
    }

    public void setPanelLabelAndMessage4(RichPanelLabelAndMessage panelLabelAndMessage4) {
        this.panelLabelAndMessage4 = panelLabelAndMessage4;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage4() {
        return panelLabelAndMessage4;
    }

    public void setPlam14(RichPanelLabelAndMessage plam14) {
        this.plam14 = plam14;
    }

    public RichPanelLabelAndMessage getPlam14() {
        return plam14;
    }

    public void setPanelLabelAndMessage5(RichPanelLabelAndMessage panelLabelAndMessage5) {
        this.panelLabelAndMessage5 = panelLabelAndMessage5;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage5() {
        return panelLabelAndMessage5;
    }

    public void setPanelLabelAndMessage6(RichPanelLabelAndMessage panelLabelAndMessage6) {
        this.panelLabelAndMessage6 = panelLabelAndMessage6;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage6() {
        return panelLabelAndMessage6;
    }

    public void setPanelLabelAndMessage7(RichPanelLabelAndMessage panelLabelAndMessage7) {
        this.panelLabelAndMessage7 = panelLabelAndMessage7;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage7() {
        return panelLabelAndMessage7;
    }

    public void setPanelLabelAndMessage8(RichPanelLabelAndMessage panelLabelAndMessage8) {
        this.panelLabelAndMessage8 = panelLabelAndMessage8;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage8() {
        return panelLabelAndMessage8;
    }

    public void setPanelLabelAndMessage9(RichPanelLabelAndMessage panelLabelAndMessage9) {
        this.panelLabelAndMessage9 = panelLabelAndMessage9;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage9() {
        return panelLabelAndMessage9;
    }

    public void setPanelLabelAndMessage10(RichPanelLabelAndMessage panelLabelAndMessage10) {
        this.panelLabelAndMessage10 = panelLabelAndMessage10;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage10() {
        return panelLabelAndMessage10;
    }

    public void setPanelLabelAndMessage11(RichPanelLabelAndMessage panelLabelAndMessage11) {
        this.panelLabelAndMessage11 = panelLabelAndMessage11;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage11() {
        return panelLabelAndMessage11;
    }

    public void setPanelLabelAndMessage12(RichPanelLabelAndMessage panelLabelAndMessage12) {
        this.panelLabelAndMessage12 = panelLabelAndMessage12;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage12() {
        return panelLabelAndMessage12;
    }

    public void setPanelLabelAndMessage13(RichPanelLabelAndMessage panelLabelAndMessage13) {
        this.panelLabelAndMessage13 = panelLabelAndMessage13;
    }

    public RichPanelLabelAndMessage getPanelLabelAndMessage13() {
        return panelLabelAndMessage13;
    }


    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }


    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setPgl10(RichPanelGridLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGridLayout getPgl10() {
        return pgl10;
    }


    public void setCommandButton2(RichCommandButton commandButton2) {
        this.commandButton2 = commandButton2;
    }

    public RichCommandButton getCommandButton2() {
        return commandButton2;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setPopupConfirmacaoIdoso(RichPopup p1) {
        this.popupConfirmacaoIdoso = p1;
    }

    public RichPopup getPopupConfirmacaoIdoso() {
        return popupConfirmacaoIdoso;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setPopupConfirmacaoDeficiente(RichPopup popup1) {
        this.popupConfirmacaoDeficiente = popup1;
    }

    public RichPopup getPopupConfirmacaoDeficiente() {
        return popupConfirmacaoDeficiente;
    }

    public void setDialog1(RichDialog dialog1) {
        this.dialog1 = dialog1;
    }

    public RichDialog getDialog1() {
        return dialog1;
    }
}
