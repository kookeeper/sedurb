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
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailHeader;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

public class ConfirmarPericiaMedica {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol3;
    private RichSpacer spacer1;
    private RichPanelGroupLayout pglConsultarCidadao;
    private RichPanelGroupLayout pgl4;
    private RichPanelLabelAndMessage plam2;
    private RichInputText itCpfConsulta;
    private RichCommandButton cbConsultarCidadao;
    private RichPanelGroupLayout pglCadastrarCidadao;
    private RichShowDetailHeader sdh1;
    private RichPanelHeader ph2;
    private RichPanelGridLayout pgl5;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichPanelFormLayout pfl1;
    private RichPanelLabelAndMessage plam3;
    private RichInputText itCpf;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichPanelFormLayout pfl4;
    private RichPanelLabelAndMessage plam4;
    private RichInputText itNomeCompleto;
    private RichPanelLabelAndMessage plam5;
    private RichInputDate idDataNascimento;
    private RichPanelLabelAndMessage plam6;
    private RichSelectOneRadio sorSexo;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichPanelLabelAndMessage plam7;
    private RichInputText itTelefoneCelular;
    private RichPanelLabelAndMessage plam8;
    private RichInputText itTelefoneResidencial;
    private RichPanelLabelAndMessage plam9;
    private RichInputText itIdentidadeNumero;
    private RichPanelLabelAndMessage plam10;
    private RichInputText itIdentidadeComplemento;
    private RichPanelLabelAndMessage plam11;
    private RichInputDate idIdentidadeDataEmissao;
    private RichPanelLabelAndMessage plam12;
    private RichInputText itIdentidadeOrgaoEmissor;
    private RichPanelLabelAndMessage plam13;
    private RichSelectOneChoice socIdentidadeUF;
    private UISelectItems si3;
    private RichPanelHeader ph4;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichPanelFormLayout pfl3;
    private RichPanelLabelAndMessage plam15;
    private RichInputText itEnderecoCEP;
    private RichPanelLabelAndMessage plam16;
    private RichInputText itEnderecoPais;
    private RichPanelLabelAndMessage plam17;
    private RichSelectOneChoice socEnderecoUF;
    private UISelectItems si4;
    private RichPanelLabelAndMessage plam18;
    private RichInputText itEnderecoMunicipio;
    private RichPanelLabelAndMessage plam14;
    private RichInputText itEnderecoBairro;
    private RichGridCell gc5;
    private RichPanelFormLayout pfl2;
    private RichPanelLabelAndMessage plam20;
    private RichInputText itEnderecoComplemento;
    private RichPanelLabelAndMessage plam21;
    private RichInputText itEnderecoNumeroLogradouro;
    private RichPanelLabelAndMessage plam22;
    private RichInputText itEnderecoTipoLogradouro;
    private RichPanelLabelAndMessage plam19;
    private RichInputText itEnderecoNomeLogradouro;
    private RichSpacer s1;
    private RichPanelGroupLayout pglCommandButton;
    private RichCommandButton cb6;
    private RichCommandButton commandButton3;
    private RichPanelGroupLayout pglAgend;
    private RichShowDetailHeader sdhAgend;
    private RichPanelGroupLayout pgl9;
    private RichOutputLabel ol1;
    private RichSpacer s3;
    private RichPanelGridLayout pgl10;

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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setSpacer1(RichSpacer spacer1) {
        this.spacer1 = spacer1;
    }

    public RichSpacer getSpacer1() {
        return spacer1;
    }

    public void setPglConsultarCidadao(RichPanelGroupLayout pglConsultarCidadao) {
        this.pglConsultarCidadao = pglConsultarCidadao;
    }

    public RichPanelGroupLayout getPglConsultarCidadao() {
        return pglConsultarCidadao;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
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

    public void setPglCadastrarCidadao(RichPanelGroupLayout pglCadastrarCidadao) {
        this.pglCadastrarCidadao = pglCadastrarCidadao;
    }

    public RichPanelGroupLayout getPglCadastrarCidadao() {
        return pglCadastrarCidadao;
    }

    public void setSdh1(RichShowDetailHeader sdh1) {
        this.sdh1 = sdh1;
    }

    public RichShowDetailHeader getSdh1() {
        return sdh1;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setPgl5(RichPanelGridLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGridLayout getPgl5() {
        return pgl5;
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

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
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

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }

    public void setItNomeCompleto(RichInputText itNomeCompleto) {
        this.itNomeCompleto = itNomeCompleto;
    }

    public RichInputText getItNomeCompleto() {
        return itNomeCompleto;
    }

    public void setPlam5(RichPanelLabelAndMessage plam5) {
        this.plam5 = plam5;
    }

    public RichPanelLabelAndMessage getPlam5() {
        return plam5;
    }

    public void setIdDataNascimento(RichInputDate idDataNascimento) {
        this.idDataNascimento = idDataNascimento;
    }

    public RichInputDate getIdDataNascimento() {
        return idDataNascimento;
    }

    public void setPlam6(RichPanelLabelAndMessage plam6) {
        this.plam6 = plam6;
    }

    public RichPanelLabelAndMessage getPlam6() {
        return plam6;
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

    public void setPlam7(RichPanelLabelAndMessage plam7) {
        this.plam7 = plam7;
    }

    public RichPanelLabelAndMessage getPlam7() {
        return plam7;
    }

    public void setItTelefoneCelular(RichInputText itTelefoneCelular) {
        this.itTelefoneCelular = itTelefoneCelular;
    }

    public RichInputText getItTelefoneCelular() {
        return itTelefoneCelular;
    }

    public void setPlam8(RichPanelLabelAndMessage plam8) {
        this.plam8 = plam8;
    }

    public RichPanelLabelAndMessage getPlam8() {
        return plam8;
    }

    public void setItTelefoneResidencial(RichInputText itTelefoneResidencial) {
        this.itTelefoneResidencial = itTelefoneResidencial;
    }

    public RichInputText getItTelefoneResidencial() {
        return itTelefoneResidencial;
    }

    public void setPlam9(RichPanelLabelAndMessage plam9) {
        this.plam9 = plam9;
    }

    public RichPanelLabelAndMessage getPlam9() {
        return plam9;
    }

    public void setItIdentidadeNumero(RichInputText itIdentidadeNumero) {
        this.itIdentidadeNumero = itIdentidadeNumero;
    }

    public RichInputText getItIdentidadeNumero() {
        return itIdentidadeNumero;
    }

    public void setPlam10(RichPanelLabelAndMessage plam10) {
        this.plam10 = plam10;
    }

    public RichPanelLabelAndMessage getPlam10() {
        return plam10;
    }

    public void setItIdentidadeComplemento(RichInputText itIdentidadeComplemento) {
        this.itIdentidadeComplemento = itIdentidadeComplemento;
    }

    public RichInputText getItIdentidadeComplemento() {
        return itIdentidadeComplemento;
    }

    public void setPlam11(RichPanelLabelAndMessage plam11) {
        this.plam11 = plam11;
    }

    public RichPanelLabelAndMessage getPlam11() {
        return plam11;
    }

    public void setIdIdentidadeDataEmissao(RichInputDate idIdentidadeDataEmissao) {
        this.idIdentidadeDataEmissao = idIdentidadeDataEmissao;
    }

    public RichInputDate getIdIdentidadeDataEmissao() {
        return idIdentidadeDataEmissao;
    }

    public void setPlam12(RichPanelLabelAndMessage plam12) {
        this.plam12 = plam12;
    }

    public RichPanelLabelAndMessage getPlam12() {
        return plam12;
    }

    public void setItIdentidadeOrgaoEmissor(RichInputText itIdentidadeOrgaoEmissor) {
        this.itIdentidadeOrgaoEmissor = itIdentidadeOrgaoEmissor;
    }

    public RichInputText getItIdentidadeOrgaoEmissor() {
        return itIdentidadeOrgaoEmissor;
    }

    public void setPlam13(RichPanelLabelAndMessage plam13) {
        this.plam13 = plam13;
    }

    public RichPanelLabelAndMessage getPlam13() {
        return plam13;
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

    public void setPlam15(RichPanelLabelAndMessage plam15) {
        this.plam15 = plam15;
    }

    public RichPanelLabelAndMessage getPlam15() {
        return plam15;
    }

    public void setItEnderecoCEP(RichInputText itEnderecoCEP) {
        this.itEnderecoCEP = itEnderecoCEP;
    }

    public RichInputText getItEnderecoCEP() {
        return itEnderecoCEP;
    }

    public void setPlam16(RichPanelLabelAndMessage plam16) {
        this.plam16 = plam16;
    }

    public RichPanelLabelAndMessage getPlam16() {
        return plam16;
    }

    public void setItEnderecoPais(RichInputText itEnderecoPais) {
        this.itEnderecoPais = itEnderecoPais;
    }

    public RichInputText getItEnderecoPais() {
        return itEnderecoPais;
    }

    public void setPlam17(RichPanelLabelAndMessage plam17) {
        this.plam17 = plam17;
    }

    public RichPanelLabelAndMessage getPlam17() {
        return plam17;
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

    public void setPlam18(RichPanelLabelAndMessage plam18) {
        this.plam18 = plam18;
    }

    public RichPanelLabelAndMessage getPlam18() {
        return plam18;
    }

    public void setItEnderecoMunicipio(RichInputText itEnderecoMunicipio) {
        this.itEnderecoMunicipio = itEnderecoMunicipio;
    }

    public RichInputText getItEnderecoMunicipio() {
        return itEnderecoMunicipio;
    }

    public void setPlam14(RichPanelLabelAndMessage plam14) {
        this.plam14 = plam14;
    }

    public RichPanelLabelAndMessage getPlam14() {
        return plam14;
    }

    public void setItEnderecoBairro(RichInputText itEnderecoBairro) {
        this.itEnderecoBairro = itEnderecoBairro;
    }

    public RichInputText getItEnderecoBairro() {
        return itEnderecoBairro;
    }


    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }


    public void setPlam20(RichPanelLabelAndMessage plam20) {
        this.plam20 = plam20;
    }

    public RichPanelLabelAndMessage getPlam20() {
        return plam20;
    }

    public void setItEnderecoComplemento(RichInputText itEnderecoComplemento) {
        this.itEnderecoComplemento = itEnderecoComplemento;
    }

    public RichInputText getItEnderecoComplemento() {
        return itEnderecoComplemento;
    }

    public void setPlam21(RichPanelLabelAndMessage plam21) {
        this.plam21 = plam21;
    }

    public RichPanelLabelAndMessage getPlam21() {
        return plam21;
    }

    public void setItEnderecoNumeroLogradouro(RichInputText itEnderecoNumeroLogradouro) {
        this.itEnderecoNumeroLogradouro = itEnderecoNumeroLogradouro;
    }

    public RichInputText getItEnderecoNumeroLogradouro() {
        return itEnderecoNumeroLogradouro;
    }

    public void setPlam22(RichPanelLabelAndMessage plam22) {
        this.plam22 = plam22;
    }

    public RichPanelLabelAndMessage getPlam22() {
        return plam22;
    }

    public void setItEnderecoTipoLogradouro(RichInputText itEnderecoTipoLogradouro) {
        this.itEnderecoTipoLogradouro = itEnderecoTipoLogradouro;
    }

    public RichInputText getItEnderecoTipoLogradouro() {
        return itEnderecoTipoLogradouro;
    }

    public void setPlam19(RichPanelLabelAndMessage plam19) {
        this.plam19 = plam19;
    }

    public RichPanelLabelAndMessage getPlam19() {
        return plam19;
    }

    public void setItEnderecoNomeLogradouro(RichInputText itEnderecoNomeLogradouro) {
        this.itEnderecoNomeLogradouro = itEnderecoNomeLogradouro;
    }

    public RichInputText getItEnderecoNomeLogradouro() {
        return itEnderecoNomeLogradouro;
    }


    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPglCommandButton(RichPanelGroupLayout pglCommandButton) {
        this.pglCommandButton = pglCommandButton;
    }

    public RichPanelGroupLayout getPglCommandButton() {
        return pglCommandButton;
    }

    public void setCb6(RichCommandButton cb6) {
        this.cb6 = cb6;
    }

    public RichCommandButton getCb6() {
        return cb6;
    }

    public void setCommandButton3(RichCommandButton commandButton3) {
        this.commandButton3 = commandButton3;
    }

    public RichCommandButton getCommandButton3() {
        return commandButton3;
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

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
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
}
