package br.gov.sedurb.backing;

import javax.faces.component.UISelectItems;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanRadio;
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
import oracle.adf.view.rich.component.rich.output.RichOutputText;


import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.dnd.DnDAction;
import oracle.adf.view.rich.event.DropEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;


public class QualificarAtendimento {
    private RichForm f1;
    private RichDocument d1;
    private RichCommandButton cbConsultarCidadao;
    private UIXGroup g1;
    private RichInputText itCpfConsulta;
    private RichMessages m1;
    private RichPanelGroupLayout pglConsultarCidadao;
    private RichPanelGroupLayout pglCadastrarCidadao;
    private RichPanelGroupLayout pglCadastrarAgendamento;
    private RichPanelHeader panelHeader3;
    private RichPanelGroupLayout pglServicosAgendados;
    private RichPanelHeader panelHeader4;
    private RichInputText itNomeCompleto;
    private RichInputText itTelefoneResidencial;
    private RichInputText itIdentidadeNumero;
    private RichInputText itIdentidadeOrgaoEmissor;
    private RichInputText itTelefoneCelular;
    private RichInputText itIdentidadeComplemento;
    private RichInputText itCpf;
    private RichPanelHeader ph2;
    private RichInputDate idDataNascimento;
    private RichSelectOneRadio sorSexo;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichInputDate idIdentidadeDataEmissao;
    private RichSelectOneChoice socIdentidadeUF;
    private UISelectItems si3;
    private RichPanelHeader ph4;
    private RichInputText itEnderecoPais;
    private RichInputText itEnderecoCEP;
    private RichInputText itEnderecoMunicipio;
    private RichInputText itEnderecoBairro;
    private RichInputText itEnderecoComplemento;
    private RichInputText itEnderecoNumeroLogradouro;
    private RichInputText itEnderecoTipoLogradouro;
    private RichInputText itEnderecoNomeLogradouro;
    private RichSelectOneChoice socEnderecoUF;
    private UISelectItems si4;
    private RichSelectOneChoice socServicoAtendimento;
    private UISelectItems si5;
    private RichSelectOneChoice socUnidadeServicoAtendimento;
    private UISelectItems selectItems1;
    private RichCommandButton cbCadastrarAgendamento;
    private RichPanelGroupLayout pgl1;
    private RichCommandButton cb2;
    private RichCommandButton cb3;
    private RichShowDetailHeader sdh1;
    private RichCommandButton cb4;
    private RichPanelHeader panelHeader1;
    private RichTable tbDoc;
    private RichPopup popupUpload;
    private RichDialog dialogUpload;
    private RichInputFile inputFile;
    private RichCommandButton commandButton3;
    private RichPanelGroupLayout pglCommandButton;
    private RichCommandButton cb6;
    private RichCommandButton cbUploadArquivo;
    private RichPanelGroupLayout pgl3;
    private RichPanelGroupLayout pgl6;
    private UIXGroup g2;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot10;
    private RichPanelGroupLayout pgl4;
    private RichPanelFormLayout pfl1;
    private RichPanelFormLayout pfl3;
    private RichCommandButton cb1;
    private RichPanelFormLayout pfl4;
    private RichPanelGridLayout pgl5;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichPanelFormLayout pfl2;
    private RichPanelFormLayout pfl5;
    private RichPanelHeader ph3;
    private RichInputDate dtInicioFiltroHorario;
    private RichInputDate dtTerminoFiltroHorario;
    private RichPanelGroupLayout pgl8;
    private RichCommandButton cb5;
    private RichPanelGroupLayout pgl9;
    private RichPanelHeader ph5;
    private RichPanelHeader ph6;
    private RichInputText it1;
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
    private RichPanelLabelAndMessage plam14;
    private RichPanelLabelAndMessage plam15;
    private RichPanelLabelAndMessage plam16;
    private RichPanelLabelAndMessage plam17;
    private RichPanelLabelAndMessage plam18;
    private RichPanelLabelAndMessage plam19;
    private RichPanelLabelAndMessage plam20;
    private RichPanelLabelAndMessage plam21;
    private RichPanelLabelAndMessage plam22;
    private RichPanelLabelAndMessage plam23;
    private RichPanelLabelAndMessage plam25;
    private RichPanelLabelAndMessage plam26;
    private RichSpacer s1;
    private RichPanelGroupLayout pgl2;
    private RichPanelFormLayout pfl7;
    private RichSelectBooleanRadio selectBooleanRadio23;
    private RichPanelGroupLayout pgl12;
    private RichPanelGroupLayout pgl10;
    private RichSpacer spacer1;
    private RichOutputLabel ol3;

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

    public void setCbConsultarCidadao(RichCommandButton cb1) {
        this.cbConsultarCidadao = cb1;
    }

    public RichCommandButton getCbConsultarCidadao() {
        return cbConsultarCidadao;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setItCpfConsulta(RichInputText it1) {
        this.itCpfConsulta = it1;
    }

    public RichInputText getItCpfConsulta() {
        return itCpfConsulta;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPglConsultarCidadao(RichPanelGroupLayout pgl1) {
        this.pglConsultarCidadao = pgl1;
    }

    public RichPanelGroupLayout getPglConsultarCidadao() {
        return pglConsultarCidadao;
    }


    public void setPglCadastrarCidadao(RichPanelGroupLayout panelGroupLayout1) {
        this.pglCadastrarCidadao = panelGroupLayout1;
    }

    public RichPanelGroupLayout getPglCadastrarCidadao() {
        return pglCadastrarCidadao;
    }


    public void setPglCadastrarAgendamento(RichPanelGroupLayout panelGroupLayout3) {
        this.pglCadastrarAgendamento = panelGroupLayout3;
    }

    public RichPanelGroupLayout getPglCadastrarAgendamento() {
        return pglCadastrarAgendamento;
    }

    public void setPanelHeader3(RichPanelHeader panelHeader3) {
        this.panelHeader3 = panelHeader3;
    }

    public RichPanelHeader getPanelHeader3() {
        return panelHeader3;
    }


    public void setPglServicosAgendados(RichPanelGroupLayout panelGroupLayout4) {
        this.pglServicosAgendados = panelGroupLayout4;
    }

    public RichPanelGroupLayout getPglServicosAgendados() {
        return pglServicosAgendados;
    }

    public void setPanelHeader4(RichPanelHeader panelHeader4) {
        this.panelHeader4 = panelHeader4;
    }

    public RichPanelHeader getPanelHeader4() {
        return panelHeader4;
    }


    public void setItNomeCompleto(RichInputText it11) {
        this.itNomeCompleto = it11;
    }

    public RichInputText getItNomeCompleto() {
        return itNomeCompleto;
    }

    public void setItTelefoneResidencial(RichInputText it12) {
        this.itTelefoneResidencial = it12;
    }

    public RichInputText getItTelefoneResidencial() {
        return itTelefoneResidencial;
    }

    public void setItIdentidadeNumero(RichInputText inputText5) {
        this.itIdentidadeNumero = inputText5;
    }

    public RichInputText getItIdentidadeNumero() {
        return itIdentidadeNumero;
    }

    public void setItIdentidadeOrgaoEmissor(RichInputText inputText8) {
        this.itIdentidadeOrgaoEmissor = inputText8;
    }

    public RichInputText getItIdentidadeOrgaoEmissor() {
        return itIdentidadeOrgaoEmissor;
    }

    public void setItTelefoneCelular(RichInputText inputText1) {
        this.itTelefoneCelular = inputText1;
    }

    public RichInputText getItTelefoneCelular() {
        return itTelefoneCelular;
    }

    public void setItIdentidadeComplemento(RichInputText inputText6) {
        this.itIdentidadeComplemento = inputText6;
    }

    public RichInputText getItIdentidadeComplemento() {
        return itIdentidadeComplemento;
    }


    public void setItCpf(RichInputText inputText9) {
        this.itCpf = inputText9;
    }

    public RichInputText getItCpf() {
        return itCpf;
    }


    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setIdDataNascimento(RichInputDate id1) {
        this.idDataNascimento = id1;
    }

    public RichInputDate getIdDataNascimento() {
        return idDataNascimento;
    }


    public void setSorSexo(RichSelectOneRadio sor1) {
        this.sorSexo = sor1;
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

    public void setIdIdentidadeDataEmissao(RichInputDate inputDate1) {
        this.idIdentidadeDataEmissao = inputDate1;
    }

    public RichInputDate getIdIdentidadeDataEmissao() {
        return idIdentidadeDataEmissao;
    }

    public void setSocIdentidadeUF(RichSelectOneChoice soc1) {
        this.socIdentidadeUF = soc1;
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

    public void setItEnderecoPais(RichInputText inputText7) {
        this.itEnderecoPais = inputText7;
    }

    public RichInputText getItEnderecoPais() {
        return itEnderecoPais;
    }


    public void setItEnderecoCEP(RichInputText inputText11) {
        this.itEnderecoCEP = inputText11;
    }

    public RichInputText getItEnderecoCEP() {
        return itEnderecoCEP;
    }

    public void setItEnderecoMunicipio(RichInputText inputText12) {
        this.itEnderecoMunicipio = inputText12;
    }

    public RichInputText getItEnderecoMunicipio() {
        return itEnderecoMunicipio;
    }

    public void setItEnderecoBairro(RichInputText inputText13) {
        this.itEnderecoBairro = inputText13;
    }

    public RichInputText getItEnderecoBairro() {
        return itEnderecoBairro;
    }

    public void setItEnderecoComplemento(RichInputText inputText14) {
        this.itEnderecoComplemento = inputText14;
    }

    public RichInputText getItEnderecoComplemento() {
        return itEnderecoComplemento;
    }

    public void setItEnderecoNumeroLogradouro(RichInputText inputText15) {
        this.itEnderecoNumeroLogradouro = inputText15;
    }

    public RichInputText getItEnderecoNumeroLogradouro() {
        return itEnderecoNumeroLogradouro;
    }

    public void setItEnderecoTipoLogradouro(RichInputText inputText16) {
        this.itEnderecoTipoLogradouro = inputText16;
    }

    public RichInputText getItEnderecoTipoLogradouro() {
        return itEnderecoTipoLogradouro;
    }


    public void setItEnderecoNomeLogradouro(RichInputText inputText17) {
        this.itEnderecoNomeLogradouro = inputText17;
    }

    public RichInputText getItEnderecoNomeLogradouro() {
        return itEnderecoNomeLogradouro;
    }

    public void setSocEnderecoUF(RichSelectOneChoice soc2) {
        this.socEnderecoUF = soc2;
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

    public void setSocServicoAtendimento(RichSelectOneChoice soc3) {
        this.socServicoAtendimento = soc3;
    }

    public RichSelectOneChoice getSocServicoAtendimento() {
        return socServicoAtendimento;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSocUnidadeServicoAtendimento(RichSelectOneChoice selectOneChoice1) {
        this.socUnidadeServicoAtendimento = selectOneChoice1;
    }

    public RichSelectOneChoice getSocUnidadeServicoAtendimento() {
        return socUnidadeServicoAtendimento;
    }

    public void setSelectItems1(UISelectItems selectItems1) {
        this.selectItems1 = selectItems1;
    }

    public UISelectItems getSelectItems1() {
        return selectItems1;
    }


    public void setCbCadastrarAgendamento(RichCommandButton cb1) {
        this.cbCadastrarAgendamento = cb1;
    }

    public RichCommandButton getCbCadastrarAgendamento() {
        return cbCadastrarAgendamento;
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

    public void setSdh1(RichShowDetailHeader sdh1) {
        this.sdh1 = sdh1;
    }

    public RichShowDetailHeader getSdh1() {
        return sdh1;
    }

    public void setCb4(RichCommandButton cb4) {
        this.cb4 = cb4;
    }

    public RichCommandButton getCb4() {
        return cb4;
    }


    public void setPanelHeader1(RichPanelHeader panelHeader1) {
        this.panelHeader1 = panelHeader1;
    }

    public RichPanelHeader getPanelHeader1() {
        return panelHeader1;
    }


    public void setTbDoc(RichTable t2) {
        this.tbDoc = t2;
    }

    public RichTable getTbDoc() {
        return tbDoc;
    }


    public void setPopupUpload(RichPopup p1) {
        this.popupUpload = p1;
    }

    public RichPopup getPopupUpload() {
        return popupUpload;
    }

    public void setDialogUpload(RichDialog d2) {
        this.dialogUpload = d2;
    }

    public RichDialog getDialogUpload() {
        return dialogUpload;
    }

    public void setInputFile(RichInputFile if1) {
        this.inputFile = if1;
    }

    public RichInputFile getInputFile() {
        return inputFile;
    }


    public void setCommandButton3(RichCommandButton commandButton3) {
        this.commandButton3 = commandButton3;
    }

    public RichCommandButton getCommandButton3() {
        return commandButton3;
    }

    public void setPglCommandButton(RichPanelGroupLayout pgl3) {
        this.pglCommandButton = pgl3;
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


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cb7_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("cadastrarAtendimento");
/*        Object result = */operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setCbUploadArquivo(RichCommandButton cbUploadArquivo) {
        this.cbUploadArquivo = cbUploadArquivo;
    }

    public RichCommandButton getCbUploadArquivo() {
        return cbUploadArquivo;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }


    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }


    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt10(RichOutputText ot10) {
        this.ot10 = ot10;
    }

    public RichOutputText getOt10() {
        return ot10;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }


    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }


    public DnDAction dfgdasfgh(DropEvent dropEvent) {
        // Add event code here...
        return DnDAction.NONE;
    }


    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
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

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setPh3(RichPanelHeader ph3) {
        this.ph3 = ph3;
    }

    public RichPanelHeader getPh3() {
        return ph3;
    }

    public void setDtInicioFiltroHorario(RichInputDate id1) {
        this.dtInicioFiltroHorario = id1;
    }

    public RichInputDate getDtInicioFiltroHorario() {
        return dtInicioFiltroHorario;
    }

    public void setDtTerminoFiltroHorario(RichInputDate id2) {
        this.dtTerminoFiltroHorario = id2;
    }

    public RichInputDate getDtTerminoFiltroHorario() {
        return dtTerminoFiltroHorario;
    }


    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setCb5(RichCommandButton cb5) {
        this.cb5 = cb5;
    }

    public RichCommandButton getCb5() {
        return cb5;
    }


    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }


    public void setPh5(RichPanelHeader ph5) {
        this.ph5 = ph5;
    }

    public RichPanelHeader getPh5() {
        return ph5;
    }


    public void setPh6(RichPanelHeader ph6) {
        this.ph6 = ph6;
    }

    public RichPanelHeader getPh6() {
        return ph6;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
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

    public void setPlam14(RichPanelLabelAndMessage plam14) {
        this.plam14 = plam14;
    }

    public RichPanelLabelAndMessage getPlam14() {
        return plam14;
    }

    public void setPlam15(RichPanelLabelAndMessage plam15) {
        this.plam15 = plam15;
    }

    public RichPanelLabelAndMessage getPlam15() {
        return plam15;
    }

    public void setPlam16(RichPanelLabelAndMessage plam16) {
        this.plam16 = plam16;
    }

    public RichPanelLabelAndMessage getPlam16() {
        return plam16;
    }

    public void setPlam17(RichPanelLabelAndMessage plam17) {
        this.plam17 = plam17;
    }

    public RichPanelLabelAndMessage getPlam17() {
        return plam17;
    }

    public void setPlam18(RichPanelLabelAndMessage plam18) {
        this.plam18 = plam18;
    }

    public RichPanelLabelAndMessage getPlam18() {
        return plam18;
    }

    public void setPlam19(RichPanelLabelAndMessage plam19) {
        this.plam19 = plam19;
    }

    public RichPanelLabelAndMessage getPlam19() {
        return plam19;
    }

    public void setPlam20(RichPanelLabelAndMessage plam20) {
        this.plam20 = plam20;
    }

    public RichPanelLabelAndMessage getPlam20() {
        return plam20;
    }

    public void setPlam21(RichPanelLabelAndMessage plam21) {
        this.plam21 = plam21;
    }

    public RichPanelLabelAndMessage getPlam21() {
        return plam21;
    }

    public void setPlam22(RichPanelLabelAndMessage plam22) {
        this.plam22 = plam22;
    }

    public RichPanelLabelAndMessage getPlam22() {
        return plam22;
    }

    public void setPlam23(RichPanelLabelAndMessage plam23) {
        this.plam23 = plam23;
    }

    public RichPanelLabelAndMessage getPlam23() {
        return plam23;
    }


    public void setPlam25(RichPanelLabelAndMessage plam25) {
        this.plam25 = plam25;
    }

    public RichPanelLabelAndMessage getPlam25() {
        return plam25;
    }

    public void setPlam26(RichPanelLabelAndMessage plam26) {
        this.plam26 = plam26;
    }

    public RichPanelLabelAndMessage getPlam26() {
        return plam26;
    }


    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }


    public void setPfl7(RichPanelFormLayout pfl7) {
        this.pfl7 = pfl7;
    }

    public RichPanelFormLayout getPfl7() {
        return pfl7;
    }


    public void setSelectBooleanRadio23(RichSelectBooleanRadio selectBooleanRadio23) {
        this.selectBooleanRadio23 = selectBooleanRadio23;
    }

    public RichSelectBooleanRadio getSelectBooleanRadio23() {
        return selectBooleanRadio23;
    }


    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setSpacer1(RichSpacer spacer1) {
        this.spacer1 = spacer1;
    }

    public RichSpacer getSpacer1() {
        return spacer1;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }
}
