package br.gov.sedurb.backing;

import javax.faces.component.UISelectItems;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
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
import oracle.adf.view.rich.component.rich.layout.RichShowDetailHeader;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichSpacer;


public class ImprimirCarteira {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelHeader ph1;
    private RichPanelGroupLayout pgl5;
    private RichCommandButton cbConsultarCidadao;
    private RichShowDetailHeader sdh1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph2;
    private RichPanelGridLayout pgl6;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichPanelFormLayout pfl5;
    private RichInputText itCpf;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichInputText itNomeCompleto;
    private RichSelectOneRadio sorSexo;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichInputText itIdentidadeNumero;
    private RichInputText itIdentidadeComplemento;
    private RichInputText itIdentidadeOrgaoEmissor;
    private UISelectItems si3;
    private RichPanelHeader ph4;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichPanelFormLayout pfl3;
    private RichInputText itEnderecoCEP;
    private RichInputText itEnderecoPais;
    private RichSelectOneChoice socEnderecoUF;
    private UISelectItems si4;
    private RichInputText itEnderecoMunicipio;
    private RichInputText itEnderecoBairro;
    private RichGridCell gc4;
    private RichCommandButton commandButton4;
    private RichGridCell gc5;
    private RichPanelFormLayout pfl4;
    private RichInputText itEnderecoComplemento;
    private RichInputText itEnderecoNumeroLogradouro;
    private RichInputText itEnderecoTipoLogradouro;
    private RichInputText itEnderecoNomeLogradouro;
    private RichCommandButton cb3;
    private RichCommandButton commandButton1;
    private RichPanelGroupLayout pglPrincipal;
    private RichPanelGroupLayout pglConsultarCidadao;
    private RichPanelHeader ph3;
    private RichPanelGroupLayout pgl3;
    private RichInputText itCpfConsulta;
    private RichCommandButton cb1;
    private RichShowDetailHeader sdh2;
    private RichPanelGroupLayout pgl4;
    private RichPanelHeader ph5;
    private RichPanelGridLayout pgl8;
    private RichGridRow gr4;
    private RichGridCell gc6;
    private RichPanelFormLayout pfl1;
    private RichInputText it2;
    private RichGridRow gr5;
    private RichGridCell gc7;
    private RichPanelFormLayout pfl6;
    private RichInputText it3;
    private RichInputDate idDataNascimento;
    private RichSelectOneRadio sor1;
    private RichSelectItem si5;
    private RichSelectItem si6;
    private RichInputText itTelefoneResidencial;
    private RichInputText itTelefoneCelular;
    private RichInputText it6;
    private RichInputText it7;
    private RichInputDate idIdentidadeDataEmissao;
    private RichInputText it8;
    private RichSelectOneChoice socIdentidadeUF;
    private UISelectItems si7;
    private RichPanelHeader ph6;
    private RichPanelGridLayout pgl9;
    private RichGridRow gr6;
    private RichGridCell gc8;
    private RichPanelFormLayout pfl7;
    private RichInputText it9;
    private RichInputText it10;
    private RichSelectOneChoice soc2;
    private UISelectItems si8;
    private RichInputText it11;
    private RichInputText it12;
    private RichGridCell gc10;
    private RichPanelFormLayout pfl8;
    private RichInputText it13;
    private RichInputText it14;
    private RichInputText it15;
    private RichInputText it16;
    private RichPanelGroupLayout panelGroupLayout2;
    private RichShowDetailHeader showDetailHeader1;
    private RichPanelGroupLayout panelGroupLayout3;
    private RichOutputLabel ol1;
    private RichSpacer s3;
    private RichPanelGridLayout pgl10;
    private RichPanelGroupLayout pglAgend;
    private RichShowDetailHeader sdhAgend;
    private RichPanelFormLayout pfl2;
    private RichCommandButton cbHiddenCarteira;
    private RichInputText itNumProtocolo;
    private RichInputText itCpfCarteira;
    private RichInputText itCatCarteira;
    private RichInputText itTipoCarteira;
    private RichPanelGroupLayout panelGroupLayout1;
    private RichCommandButton cbNovaConsulta;
    private RichCommandButton chHiddenRecibo;

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


    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setCbConsultarCidadao(RichCommandButton cbConsultarCidadao) {
        this.cbConsultarCidadao = cbConsultarCidadao;
    }

    public RichCommandButton getCbConsultarCidadao() {
        return cbConsultarCidadao;
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

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setItCpf(RichInputText itCpf) {
        this.itCpf = itCpf;
    }

    public RichInputText getItCpf() {
        return itCpf;
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


    public void setItNomeCompleto(RichInputText itNomeCompleto) {
        this.itNomeCompleto = itNomeCompleto;
    }

    public RichInputText getItNomeCompleto() {
        return itNomeCompleto;
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

    public void setItIdentidadeOrgaoEmissor(RichInputText itIdentidadeOrgaoEmissor) {
        this.itIdentidadeOrgaoEmissor = itIdentidadeOrgaoEmissor;
    }

    public RichInputText getItIdentidadeOrgaoEmissor() {
        return itIdentidadeOrgaoEmissor;
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

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setItEnderecoCEP(RichInputText itEnderecoCEP) {
        this.itEnderecoCEP = itEnderecoCEP;
    }

    public RichInputText getItEnderecoCEP() {
        return itEnderecoCEP;
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

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setCommandButton4(RichCommandButton commandButton4) {
        this.commandButton4 = commandButton4;
    }

    public RichCommandButton getCommandButton4() {
        return commandButton4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
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


    public void setCb3(RichCommandButton cb3) {
        this.cb3 = cb3;
    }

    public RichCommandButton getCb3() {
        return cb3;
    }

    public void setCommandButton1(RichCommandButton commandButton1) {
        this.commandButton1 = commandButton1;
    }

    public RichCommandButton getCommandButton1() {
        return commandButton1;
    }


    public void setPglPrincipal(RichPanelGroupLayout pglPrincipal) {
        this.pglPrincipal = pglPrincipal;
    }

    public RichPanelGroupLayout getPglPrincipal() {
        return pglPrincipal;
    }

    public void setPglConsultarCidadao(RichPanelGroupLayout pglConsultarCidadao) {
        this.pglConsultarCidadao = pglConsultarCidadao;
    }

    public RichPanelGroupLayout getPglConsultarCidadao() {
        return pglConsultarCidadao;
    }

    public void setPh3(RichPanelHeader ph3) {
        this.ph3 = ph3;
    }

    public RichPanelHeader getPh3() {
        return ph3;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setItCpfConsulta(RichInputText itCpfConsulta) {
        this.itCpfConsulta = itCpfConsulta;
    }

    public RichInputText getItCpfConsulta() {
        return itCpfConsulta;
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setSdh2(RichShowDetailHeader sdh2) {
        this.sdh2 = sdh2;
    }

    public RichShowDetailHeader getSdh2() {
        return sdh2;
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

    public void setPgl8(RichPanelGridLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGridLayout getPgl8() {
        return pgl8;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIdDataNascimento(RichInputDate idDataNascimento) {
        this.idDataNascimento = idDataNascimento;
    }

    public RichInputDate getIdDataNascimento() {
        return idDataNascimento;
    }

    public void setSor1(RichSelectOneRadio sor1) {
        this.sor1 = sor1;
    }

    public RichSelectOneRadio getSor1() {
        return sor1;
    }

    public void setSi5(RichSelectItem si5) {
        this.si5 = si5;
    }

    public RichSelectItem getSi5() {
        return si5;
    }

    public void setSi6(RichSelectItem si6) {
        this.si6 = si6;
    }

    public RichSelectItem getSi6() {
        return si6;
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

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setIdIdentidadeDataEmissao(RichInputDate idIdentidadeDataEmissao) {
        this.idIdentidadeDataEmissao = idIdentidadeDataEmissao;
    }

    public RichInputDate getIdIdentidadeDataEmissao() {
        return idIdentidadeDataEmissao;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setSocIdentidadeUF(RichSelectOneChoice socIdentidadeUF) {
        this.socIdentidadeUF = socIdentidadeUF;
    }

    public RichSelectOneChoice getSocIdentidadeUF() {
        return socIdentidadeUF;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setPh6(RichPanelHeader ph6) {
        this.ph6 = ph6;
    }

    public RichPanelHeader getPh6() {
        return ph6;
    }

    public void setPgl9(RichPanelGridLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGridLayout getPgl9() {
        return pgl9;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setPfl7(RichPanelFormLayout pfl7) {
        this.pfl7 = pfl7;
    }

    public RichPanelFormLayout getPfl7() {
        return pfl7;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setPfl8(RichPanelFormLayout pfl8) {
        this.pfl8 = pfl8;
    }

    public RichPanelFormLayout getPfl8() {
        return pfl8;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setPanelGroupLayout2(RichPanelGroupLayout panelGroupLayout2) {
        this.panelGroupLayout2 = panelGroupLayout2;
    }

    public RichPanelGroupLayout getPanelGroupLayout2() {
        return panelGroupLayout2;
    }

    public void setShowDetailHeader1(RichShowDetailHeader showDetailHeader1) {
        this.showDetailHeader1 = showDetailHeader1;
    }

    public RichShowDetailHeader getShowDetailHeader1() {
        return showDetailHeader1;
    }

    public void setPanelGroupLayout3(RichPanelGroupLayout panelGroupLayout3) {
        this.panelGroupLayout3 = panelGroupLayout3;
    }

    public RichPanelGroupLayout getPanelGroupLayout3() {
        return panelGroupLayout3;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setPgl10(RichPanelGridLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGridLayout getPgl10() {
        return pgl10;
    }

    public void setPglAgend(RichPanelGroupLayout pglAgend) {
        this.pglAgend = pglAgend;
    }

    public RichPanelGroupLayout getPglAgend() {
        return pglAgend;
    }

    public void setSdhAgend(RichShowDetailHeader sdhAgend) {
        this.sdhAgend = sdhAgend;
    }

    public RichShowDetailHeader getSdhAgend() {
        return sdhAgend;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setCbHiddenCarteira(RichCommandButton cb2) {
        this.cbHiddenCarteira = cb2;
    }

    public RichCommandButton getCbHiddenCarteira() {
        return cbHiddenCarteira;
    }

    public void setItNumProtocolo(RichInputText itNumProtocolo) {
        this.itNumProtocolo = itNumProtocolo;
    }

    public RichInputText getItNumProtocolo() {
        return itNumProtocolo;
    }

    public void setItCpfCarteira(RichInputText itCpfCarteira) {
        this.itCpfCarteira = itCpfCarteira;
    }

    public RichInputText getItCpfCarteira() {
        return itCpfCarteira;
    }

    public void setItCatCarteira(RichInputText itCatCarteira) {
        this.itCatCarteira = itCatCarteira;
    }

    public RichInputText getItCatCarteira() {
        return itCatCarteira;
    }

    public void setItTipoCarteira(RichInputText itTipoCarteira) {
        this.itTipoCarteira = itTipoCarteira;
    }

    public RichInputText getItTipoCarteira() {
        return itTipoCarteira;
    }

    public void setPanelGroupLayout1(RichPanelGroupLayout panelGroupLayout1) {
        this.panelGroupLayout1 = panelGroupLayout1;
    }

    public RichPanelGroupLayout getPanelGroupLayout1() {
        return panelGroupLayout1;
    }

    public void setCbNovaConsulta(RichCommandButton cbNovaConsulta) {
        this.cbNovaConsulta = cbNovaConsulta;
    }

    public RichCommandButton getCbNovaConsulta() {
        return cbNovaConsulta;
    }

    public void setChHiddenRecibo(RichCommandButton commandButton2) {
        this.chHiddenRecibo = commandButton2;
    }

    public RichCommandButton getChHiddenRecibo() {
        return chHiddenRecibo;
    }
}
