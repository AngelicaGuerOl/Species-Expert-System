/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import Rule.BooleanRuleBase;
import Rule.Clause;
import Rule.Condition;
import Rule.Rule;
import Rule.RuleVariable;

/**
 *
 * @author Angelica Guerrero
 */
public class animalBR {

    //    declaracion de base de reglas
    BooleanRuleBase br = new BooleanRuleBase("test");
    //reino
    RuleVariable Eucariotas;
    RuleVariable Procariotas;
    RuleVariable Unicelular;
    RuleVariable Multicelular;
    RuleVariable Autotrofo;
    RuleVariable Heterotrofo;
    RuleVariable ParedCelular;
    RuleVariable Movilidad;
    RuleVariable Reino;

    RuleVariable Filo;
    RuleVariable SimetriaBilateral;
    RuleVariable Segmentacion;
    RuleVariable Esqueleto;
    RuleVariable CavidadCorporal;
    RuleVariable SistemaDigestivo;
    RuleVariable ApendicesArticulados;
    RuleVariable ReproduccionAsexual;
    RuleVariable ReproduccionSexual;

    RuleVariable Clase;
    RuleVariable GlandulasMamarias;
    RuleVariable EsqueletoOseo;
    RuleVariable EsqueletoCartilaginoso;
    RuleVariable Endotermos;
    RuleVariable RespiranMediantePulmones;
    RuleVariable RespiranMedianteBranqueas;
    RuleVariable VejigaNatatoria;
    RuleVariable BocaSinMandibulas;

    RuleVariable Orden;
    RuleVariable PresenciaDeCola;
    RuleVariable PatasBienDesarrolladas;
    RuleVariable CuerpoAlargado;
    RuleVariable FertilizacionInterna;
    RuleVariable FertilizacionExterna;
    RuleVariable RespiracionCutanea;

    //FAMILIA ORDEN ANURA
    RuleVariable Familia;
    RuleVariable PielRugosa;
    RuleVariable PielLisa;
    RuleVariable Vocalizaciones;
    RuleVariable Hibernacion;
    RuleVariable OjosGrandes;
    RuleVariable ReproduccionEnAgua;
    RuleVariable ReproduccionEnTierra;

    //FAMILIA ORDEN CAUDATA
    RuleVariable Familia1;
    RuleVariable PresenciaDeBranquiasEnAdultos;
    RuleVariable PatasBienDesarrolladas2;
    RuleVariable CuerpoAlargado2;
    RuleVariable FertilizacionInterna2;
    RuleVariable FertilizacionExterna2;
    RuleVariable HabitatTerrestre2;
    RuleVariable HabitatAcuatico2;
    RuleVariable MetamorfosisCompleta;

    //genero ambystoma
    RuleVariable Genero2;
    RuleVariable ColoracionConManchas;
    RuleVariable HabitatEnArroyosDeMontana;
    RuleVariable BranquiasEnAdultos;
    RuleVariable EstadoNeotenicoFrecuente;
    RuleVariable FertilizacionInterna1;
    RuleVariable FertilizacionExterna1;
    RuleVariable MetamorfosisCompleta1;
    RuleVariable NeoteniaFrecuente;
    //genero plento
    //Familia1= Plenthodontidae, Genero1
    RuleVariable GeneroP;
    RuleVariable BranquiasAdultosP;
    RuleVariable FertilizacionInternaP;
    RuleVariable ReproduccionTerrestreP;
    RuleVariable HabitatTerrestreP;
    RuleVariable HabitatAcuaticoP;
    RuleVariable ColoracionBOVP;

    //genero anura
    RuleVariable Genero;
    RuleVariable HabitatTropical;
    RuleVariable DepredadoresNaturales;
    RuleVariable PielGlandularVenenosa;
    RuleVariable EspeciesTerrestres;
    RuleVariable HabitatAcuatico;
    //especie ambystoma    
    RuleVariable Especie2;
    RuleVariable NeoteniaPermanente;
    RuleVariable BranquiasEnAdultos1;
    RuleVariable HabitatTerrestre1;
    RuleVariable HabitatAcuatico1;
    RuleVariable ColoracionOscuraConManchas;
    RuleVariable TamanoPequeno;
    //especie aneides
    RuleVariable EspecieA;
    RuleVariable CabezaAnchaYPlana;
    RuleVariable OjosGrandesA;
    RuleVariable DedosLargos;
    RuleVariable ColoracionUniforme;
    RuleVariable PresenciaDeCrestasDorsales;
    RuleVariable ColaMuyLarga;
    RuleVariable ManchasEnLaPiel;
    RuleVariable PielRugosaOGranulada;
    RuleVariable PatronDeColoracionVentral;
    //especie pseudorycea
    RuleVariable EspecieP;
    RuleVariable ColoracionUniformeP;
    RuleVariable ColoracionConManchasOPatrones;
    RuleVariable ColoracionEnTonosOscurosP;
    RuleVariable ColoracionEnTonosClarosP;
    RuleVariable ExtremidadesAlargadas;
    RuleVariable ExtremidadesCortas;
    //especie anura
    RuleVariable Especie;
    RuleVariable RespiracionBranquial;
    RuleVariable PatronDeManchas;
    RuleVariable PatasLargas;
    RuleVariable PielConVerrugas;
    RuleVariable CuerpoRobusto;
    RuleVariable ColoracionEnTonosMarrones;

    String sreino;
    String sfilo;
    String sclase;
    String sorden;
    String sfamilia;
    String sfamilia1;
    String sgenero;
    String sgenero2;
    String sgeneroP;

    public void BaseReglas() {
    }

    public String getReino(String eucariotas, String procariota,
            String unicelular, String multicelular, String autotrofo,
            String heterotrofo, String paredCelular, String movilidad) {
        staterBR();
        Eucariotas.setValue(eucariotas);
        Procariotas.setValue(procariota);
        Unicelular.setValue(unicelular);
        Multicelular.setValue(multicelular);
        Autotrofo.setValue(autotrofo);
        Heterotrofo.setValue(heterotrofo);
        ParedCelular.setValue(paredCelular);
        Movilidad.setValue(movilidad);
        br.forwardChain();
        sreino = Reino.getValue();
        return sreino;
    }

    public String getFilo(String reino, String simetriaBilateral, String segmentacion, String esqueleto,
            String cavidadCorporal, String sistemaDigestivo, String apendicesArticulados,
            String reproduccionAsexual, String reproduccionSexual) {

        staterBR();
        Reino.setValue(reino);
        SimetriaBilateral.setValue(simetriaBilateral);
        Segmentacion.setValue(segmentacion);
        Esqueleto.setValue(esqueleto);
        CavidadCorporal.setValue(cavidadCorporal);
        SistemaDigestivo.setValue(sistemaDigestivo);
        ApendicesArticulados.setValue(apendicesArticulados);
        ReproduccionAsexual.setValue(reproduccionAsexual);
        ReproduccionSexual.setValue(reproduccionSexual);

        br.forwardChain();
        sreino = Filo.getValue();
        return sreino;
    }

    public String getClase(String filo, String glandulasMamarias, String esqueletoOseo, String esqueletoCartilaginoso, String endotermos,
            String respiranMediantePulmones, String respiranMedianteBranqueas, String vejigaNatatoria, String bocaSinMandibulas) {
        staterBR();
        Filo.setValue(filo);
        GlandulasMamarias.setValue(glandulasMamarias);
        EsqueletoOseo.setValue(esqueletoOseo);
        EsqueletoCartilaginoso.setValue(esqueletoCartilaginoso);
        Endotermos.setValue(endotermos);
        RespiranMediantePulmones.setValue(respiranMediantePulmones);
        RespiranMedianteBranqueas.setValue(respiranMedianteBranqueas);
        VejigaNatatoria.setValue(vejigaNatatoria);
        BocaSinMandibulas.setValue(bocaSinMandibulas);

        br.forwardChain();
        sfilo = Clase.getValue();

        return sfilo;
    }

    public String getOrden(String clase, String presenciaCola, String patasDesarrolladas, String cuerpoAlargado, String fertilizacionInterna, String fertilizacionExterna,
            String respiracionCutanea) {
        staterBR();
        Clase.setValue(clase);
        PresenciaDeCola.setValue(presenciaCola);
        PatasBienDesarrolladas.setValue(patasDesarrolladas);
        CuerpoAlargado.setValue(cuerpoAlargado);
        FertilizacionInterna.setValue(fertilizacionInterna);
        FertilizacionExterna.setValue(fertilizacionExterna);
        RespiracionCutanea.setValue(respiracionCutanea);
        br.forwardChain();
        sclase = Orden.getValue();

        return sclase;
    }

    public String getFamilia2(String orden, String presenciaDeBranquiasEnAdultos,
            String patasBienDesarrolladas2, String cuerpoAlargado2, String fertilizacionInterna2,
            String fertilizacionExterna2, String habitatTerrestre2,
            String habitatAcuatico2, String metamorfosisCompleta) {
        staterBR();
        Orden.setValue(orden);
        PresenciaDeBranquiasEnAdultos.setValue(presenciaDeBranquiasEnAdultos);
        PatasBienDesarrolladas2.setValue(patasBienDesarrolladas2);
        CuerpoAlargado2.setValue(cuerpoAlargado2);
        FertilizacionInterna2.setValue(fertilizacionInterna2);
        FertilizacionExterna2.setValue(fertilizacionExterna2);
        HabitatTerrestre2.setValue(habitatTerrestre2);
        HabitatAcuatico2.setValue(habitatAcuatico2);
        MetamorfosisCompleta.setValue(metamorfosisCompleta);
        br.forwardChain();
        sorden = Familia1.getValue();

        return sorden;
    }

    public String getFamilia(String orden, String pielRugosa, String pielLisa, String vocalizaciones, String hibernacion,
            String ojosGrandes, String reproduccionEnAgua, String reproduccionEnTierra) {
        staterBR();
        Orden.setValue(orden);
        PielRugosa.setValue(pielRugosa);
        PielLisa.setValue(pielLisa);
        Vocalizaciones.setValue(vocalizaciones);
        Hibernacion.setValue(hibernacion);
        OjosGrandes.setValue(ojosGrandes);
        ReproduccionEnAgua.setValue(reproduccionEnAgua);
        ReproduccionEnTierra.setValue(reproduccionEnTierra);
        br.forwardChain();
        sorden = Familia.getValue();

        return sorden;
    }

    public String getGenero(String familia, String habitatTropical,
            String depredadoresNaturales, String pielGlandularVenenosa,
            String especiesTerrestres, String habitatAcuatico) {
        staterBR();
        Familia.setValue(familia);
        HabitatTropical.setValue(habitatTropical);
        DepredadoresNaturales.setValue(depredadoresNaturales);
        PielGlandularVenenosa.setValue(pielGlandularVenenosa);
        EspeciesTerrestres.setValue(especiesTerrestres);
        HabitatAcuatico.setValue(habitatAcuatico);
        br.forwardChain();
        sfamilia = Genero.getValue();

        return sfamilia;
    }

    //genero ambystame
    public String getGenero2(String familia1, String coloracionConManchas, String habitatEnArroyosDeMontana,
            String branquiasEnAdultos, String estadoNeotenicoFrecuente,
            String fertilizacionInterna1, String fertilizacionExterna1,
            String metamorfosisCompleta1, String neoteniaFrecuente) {
        staterBR();
        Familia1.setValue(familia1);
        ColoracionConManchas.setValue(coloracionConManchas);
        HabitatEnArroyosDeMontana.setValue(habitatEnArroyosDeMontana);
        BranquiasEnAdultos.setValue(branquiasEnAdultos);
        EstadoNeotenicoFrecuente.setValue(estadoNeotenicoFrecuente);
        FertilizacionInterna1.setValue(fertilizacionInterna1);
        FertilizacionExterna1.setValue(fertilizacionExterna1);
        MetamorfosisCompleta1.setValue(metamorfosisCompleta1);
        NeoteniaFrecuente.setValue(neoteniaFrecuente);
        br.forwardChain();
        sfamilia1 = Genero2.getValue();

        return sfamilia1;
    }

    //genero plento
    public String getGeneroP(String familia1, String branquiasAdultos, String fertilizacionInterna,
            String reproduccionTerrestre, String habitatTerrestre,
            String habitatAcuatico, String coloracionBOV) {
        staterBR();
        Familia1.setValue(familia1);
        BranquiasAdultosP.setValue(branquiasAdultos);
        FertilizacionInternaP.setValue(fertilizacionInterna);
        ReproduccionTerrestreP.setValue(reproduccionTerrestre);
        HabitatTerrestreP.setValue(habitatTerrestre);
        HabitatAcuaticoP.setValue(habitatAcuatico);
        ColoracionBOVP.setValue(coloracionBOV);
        br.forwardChain();
        sfamilia1 = GeneroP.getValue();

        return sfamilia1;
    }

    public String getEspecie(String genero, String respiracionBranquial,
            String patronDeManchas, String patasLargas, String pielConVerrugas,
            String cuerpoRobusto, String coloracionEnTonosMarrones) {
        staterBR();
        Genero.setValue(genero);
        RespiracionBranquial.setValue(respiracionBranquial);
        PatronDeManchas.setValue(patronDeManchas);
        PatasLargas.setValue(patasLargas);
        PielConVerrugas.setValue(pielConVerrugas);
        CuerpoRobusto.setValue(cuerpoRobusto);
        ColoracionEnTonosMarrones.setValue(coloracionEnTonosMarrones);
        br.forwardChain();
        sgenero = Especie.getValue();

        return sgenero;
    }

    public String getEspecie2(String genero2, String neoteniaPermanente,
            String branquiasEnAdultos1, String habitatTerrestre1, String habitatAcuatico1,
            String coloracionOscuraConManchas, String tamanoPequen) {
        staterBR();
        Genero2.setValue(genero2);
        NeoteniaPermanente.setValue(neoteniaPermanente);
        BranquiasEnAdultos1.setValue(branquiasEnAdultos1);
        HabitatTerrestre1.setValue(habitatTerrestre1);
        HabitatAcuatico1.setValue(habitatAcuatico1);
        ColoracionOscuraConManchas.setValue(coloracionOscuraConManchas);
        TamanoPequeno.setValue(tamanoPequen);
        br.forwardChain();
        sgenero2 = Especie2.getValue();

        return sgenero2;
    }

    public String getEspecieA(String generoP, String cabezaAnchaYPlana, String ojosGrandesA,
            String dedosLargos, String coloracionUniforme,
            String presenciaDeCrestasDorsales, String colaMuyLarga,
            String manchasEnLaPiel, String pielRugosaOGranulada,
            String patronDeColoracionVentral) {
        staterBR();
        GeneroP.setValue(generoP);
        CabezaAnchaYPlana.setValue(cabezaAnchaYPlana);
        OjosGrandesA.setValue(ojosGrandesA);
        DedosLargos.setValue(dedosLargos);
        ColoracionUniforme.setValue(coloracionUniforme);
        PresenciaDeCrestasDorsales.setValue(presenciaDeCrestasDorsales);
        ColaMuyLarga.setValue(colaMuyLarga);
        ManchasEnLaPiel.setValue(manchasEnLaPiel);
        PielRugosaOGranulada.setValue(pielRugosaOGranulada);
        PatronDeColoracionVentral.setValue(patronDeColoracionVentral);
        br.forwardChain();
        sgeneroP = EspecieA.getValue();

        return sgeneroP;
    }
    public String getEspecieP(String generoP, String coloracionUniformeP,
    String coloracionConManchasOPatrones,String coloracionEnTonosOscurosP,
    String coloracionEnTonosClarosP,String extremidadesAlargadas,String extremidadesCortas) {
        staterBR();
        GeneroP.setValue(generoP);
        ColoracionUniformeP.setValue(coloracionUniformeP);
        ColoracionConManchasOPatrones.setValue(coloracionConManchasOPatrones);
        ColoracionEnTonosOscurosP.setValue(coloracionEnTonosOscurosP);
        ColoracionEnTonosClarosP.setValue(coloracionEnTonosClarosP);
        ExtremidadesAlargadas.setValue(extremidadesAlargadas);
        ExtremidadesCortas.setValue(extremidadesCortas);
        br.forwardChain();
        sgeneroP = EspecieP.getValue();

        return sgeneroP;
    }

    public void staterBR() {
        //reino
        Eucariotas = new RuleVariable(br, "Eucariotas");
        Procariotas = new RuleVariable(br, "Procariotas");
        Unicelular = new RuleVariable(br, "Unicelular");
        Multicelular = new RuleVariable(br, "Multicelular");
        Autotrofo = new RuleVariable(br, "Autotrofo");
        Heterotrofo = new RuleVariable(br, "Heterotrofo");
        ParedCelular = new RuleVariable(br, "Pared celular");
        Movilidad = new RuleVariable(br, "Movilidad");
        //filo
        SimetriaBilateral = new RuleVariable(br, "SimetriaBilateral");
        Segmentacion = new RuleVariable(br, "Segmentacion");
        Esqueleto = new RuleVariable(br, "Esqueleto");
        CavidadCorporal = new RuleVariable(br, "CavidadCorporal");
        SistemaDigestivo = new RuleVariable(br, "SistemaDigestivo");
        ApendicesArticulados = new RuleVariable(br, "ApendicesArticulados");
        ReproduccionAsexual = new RuleVariable(br, "ReproduccionAsexual");
        ReproduccionSexual = new RuleVariable(br, "ReproduccionSexual");
        //clase
        GlandulasMamarias = new RuleVariable(br, "GlandulasMamarias");
        EsqueletoOseo = new RuleVariable(br, "EsqueletoOseo");
        EsqueletoCartilaginoso = new RuleVariable(br, "EsqueletoCartilaginoso");
        Endotermos = new RuleVariable(br, "Endotermos");
        RespiranMediantePulmones = new RuleVariable(br, "RespiranMediantePulmones");
        RespiranMedianteBranqueas = new RuleVariable(br, "RespiranMedianteBranqueas");
        VejigaNatatoria = new RuleVariable(br, "VejigaNatatoria");
        BocaSinMandibulas = new RuleVariable(br, "BocaSinMandibulas");
        //orden
        PresenciaDeCola = new RuleVariable(br, "PresenciaCola");
        PatasBienDesarrolladas = new RuleVariable(br, "PatasDesarrolladas");
        CuerpoAlargado = new RuleVariable(br, "CuerpoAlargado");
        FertilizacionInterna = new RuleVariable(br, "FertilizacionInterna");
        FertilizacionExterna = new RuleVariable(br, "FertilizacionExterna");
        RespiracionCutanea = new RuleVariable(br, "RespiracionCutanea");
        //familia caudata
        PresenciaDeBranquiasEnAdultos = new RuleVariable(br, "PresenciaDeBraquiasEnAdultos");
        PatasBienDesarrolladas2 = new RuleVariable(br, "PatasBienDesarrolladas2");
        CuerpoAlargado2 = new RuleVariable(br, "CuerpoAlargado2");
        FertilizacionInterna2 = new RuleVariable(br, "FertilizacionInterna2");
        FertilizacionExterna2 = new RuleVariable(br, "FertilizacionExterna2");
        HabitatTerrestre2 = new RuleVariable(br, "HabitatTerrestre2");
        HabitatAcuatico2 = new RuleVariable(br, "HabitatAcuatico2");
        MetamorfosisCompleta = new RuleVariable(br, "MetamorfosisCompleta");
        //fam caudata

        //familia
        PielRugosa = new RuleVariable(br, "PielRugosa");
        PielLisa = new RuleVariable(br, "PielLisa");
        Vocalizaciones = new RuleVariable(br, "Vocalizaciones");
        Hibernacion = new RuleVariable(br, "Hibernacion");
        OjosGrandes = new RuleVariable(br, "OjosGrandes");
        ReproduccionEnAgua = new RuleVariable(br, "ReproduccionEnAgua");
        ReproduccionEnTierra = new RuleVariable(br, "ReproduccionEnTierra");
        //genero ambystoma
        ColoracionConManchas = new RuleVariable(br, "ColoracionConManchas");
        HabitatEnArroyosDeMontana = new RuleVariable(br, "HabitatEnArroyosDeMontana");
        BranquiasEnAdultos = new RuleVariable(br, "BranquiasEnAdultos");
        EstadoNeotenicoFrecuente = new RuleVariable(br, "EstadoNeotenicoFrecuente");
        FertilizacionInterna1 = new RuleVariable(br, "FertilizacionInterna2");
        FertilizacionExterna1 = new RuleVariable(br, "FertilizacionExterna2");
        MetamorfosisCompleta1 = new RuleVariable(br, "MetamorfosisCompleta");
        NeoteniaFrecuente = new RuleVariable(br, "NeoteniaFrecuente");
        //GENERO PLENTHO
        BranquiasAdultosP = new RuleVariable(br, "BranquiasAdultosP");
        FertilizacionInternaP = new RuleVariable(br, "FertilizacionInternaP");
        ReproduccionTerrestreP = new RuleVariable(br, "ReproduccionTerrestreP");
        HabitatTerrestreP = new RuleVariable(br, "HabitatTerrestreP");
        HabitatAcuaticoP = new RuleVariable(br, "HabitatAcuaticoP");
        ColoracionBOVP = new RuleVariable(br, "ColoracionBOVP");
        //genero anura
        HabitatTropical = new RuleVariable(br, "HabitatTropical");
        HabitatAcuatico = new RuleVariable(br, "HabitatAcuatico");
        DepredadoresNaturales = new RuleVariable(br, "DepredadoresNaturales");
        PielGlandularVenenosa = new RuleVariable(br, " PielGlandularVenenosa");
        EspeciesTerrestres = new RuleVariable(br, "EspeciesTerrestres");
        //especie ambystoma
        NeoteniaPermanente = new RuleVariable(br, "NeoteniaPermanente");
        BranquiasEnAdultos1 = new RuleVariable(br, "BranquiasEnAdultos1");
        HabitatTerrestre1 = new RuleVariable(br, "HabitatTerrestre");
        HabitatAcuatico1 = new RuleVariable(br, "HabitatAcuatico1");
        ColoracionOscuraConManchas = new RuleVariable(br, "ColoracionOscuraConManchas");
        TamanoPequeno = new RuleVariable(br, "TamanoPequenoMenorA15cm");
        //especie anura
        RespiracionBranquial = new RuleVariable(br, "RespiracionBraquial");
        PatronDeManchas = new RuleVariable(br, "PatronDeManchas");
        PatasLargas = new RuleVariable(br, "PatasLargas");
        PielConVerrugas = new RuleVariable(br, "PielConVerrugas");
        CuerpoRobusto = new RuleVariable(br, "CuerpoRobusto");
        ColoracionEnTonosMarrones = new RuleVariable(br, "ColoracionEnTonosMarrones");
        //ESPECIE PSEUDORYCEA
         ColoracionUniformeP = new RuleVariable(br, "ColoracionUniforme");
    ColoracionConManchasOPatrones = new RuleVariable(br, "ColoracionConManchas");
    ColoracionEnTonosOscurosP = new RuleVariable(br, "ColoracionOscura");
    ColoracionEnTonosClarosP = new RuleVariable(br, "ColoracionClara");
    ExtremidadesAlargadas = new RuleVariable(br, "ExtremidadesAlargadas");
    ExtremidadesCortas = new RuleVariable(br, "ExtremidadesCortas");
   
        
        //ESPECIE ANEIDES
        CabezaAnchaYPlana = new RuleVariable(br, "CabezaAnchaYPlana");
        OjosGrandesA = new RuleVariable(br, "OjosGrandes");
        DedosLargos = new RuleVariable(br, "DedosLargos");
        ColoracionUniforme = new RuleVariable(br, "ColoracionUniforme");
        PresenciaDeCrestasDorsales = new RuleVariable(br, "PresenciaCrestasDorsales");
        ColaMuyLarga = new RuleVariable(br, "ColaMuyLarga");
        ManchasEnLaPiel = new RuleVariable(br, "ManchasEnLaPiel");
        PielRugosaOGranulada = new RuleVariable(br, "PielRugosaOGranulada");
        PatronDeColoracionVentral = new RuleVariable(br, "PatronColoracionVentral");

        Clase = new RuleVariable(br, "Clase");
        Reino = new RuleVariable(br, "Reino");
        Filo = new RuleVariable(br, "Filo");
        Orden = new RuleVariable(br, "Orden");

        Familia1 = new RuleVariable(br, "Familia1");
        Familia = new RuleVariable(br, "Familia");
        Genero = new RuleVariable(br, "Genero");
        Genero2 = new RuleVariable(br, "Genero2");
        GeneroP = new RuleVariable(br, "GeneroP");
        Especie = new RuleVariable(br, "Especie");
        Especie2 = new RuleVariable(br, "Especie2");
        EspecieA = new RuleVariable(br, "EspecieA");
        EspecieP = new RuleVariable(br, "EspecieP");
        Condition igual = new Condition("=");

        //REINO
        // Reglas para el reino Monera
        // Reglas para el reino Monera
        Rule monera = new Rule(br, "MONERA",
                new Clause[]{new Clause(Eucariotas, igual, "no"),
                    new Clause(Procariotas, igual, "si"),
                    new Clause(Unicelular, igual, "si"),
                    new Clause(Multicelular, igual, "no"),
                    new Clause(Autotrofo, igual, "si"),
                    new Clause(Heterotrofo, igual, "si"),
                    new Clause(ParedCelular, igual, "si"),
                    new Clause(Movilidad, igual, "no")},
                new Clause(Reino, igual, "Monera"));

        // Reglas para el reino Protista
        Rule protista = new Rule(br, "PROTISTA",
                new Clause[]{new Clause(Eucariotas, igual, "si"),
                    new Clause(Procariotas, igual, "no"),
                    new Clause(Unicelular, igual, "si"),
                    new Clause(Multicelular, igual, "no"),
                    new Clause(Autotrofo, igual, "si"),
                    new Clause(Heterotrofo, igual, "si"),
                    new Clause(ParedCelular, igual, "no"),
                    new Clause(Movilidad, igual, "no")},
                new Clause(Reino, igual, "Protista"));

        // Reglas para el reino Fungi
        Rule fungi = new Rule(br, "FUNGI",
                new Clause[]{new Clause(Eucariotas, igual, "si"),
                    new Clause(Procariotas, igual, "no"),
                    new Clause(Unicelular, igual, "no"),
                    new Clause(Multicelular, igual, "si"),
                    new Clause(Autotrofo, igual, "no"),
                    new Clause(Heterotrofo, igual, "si"),
                    new Clause(ParedCelular, igual, "si"),
                    new Clause(Movilidad, igual, "no")},
                new Clause(Reino, igual, "Fungi"));

        // Reglas para el reino Plantae
        Rule plantae = new Rule(br, "PLANTAE",
                new Clause[]{new Clause(Eucariotas, igual, "si"),
                    new Clause(Procariotas, igual, "no"),
                    new Clause(Unicelular, igual, "no"),
                    new Clause(Multicelular, igual, "si"),
                    new Clause(Autotrofo, igual, "si"),
                    new Clause(Heterotrofo, igual, "no"),
                    new Clause(ParedCelular, igual, "si"),
                    new Clause(Movilidad, igual, "no")},
                new Clause(Reino, igual, "Plantae"));

        // Reglas para el reino Animalia
        Rule animalia = new Rule(br, "ANIMALIA",
                new Clause[]{new Clause(Eucariotas, igual, "si"),
                    new Clause(Procariotas, igual, "no"),
                    new Clause(Unicelular, igual, "no"),
                    new Clause(Multicelular, igual, "si"),
                    new Clause(Autotrofo, igual, "no"),
                    new Clause(Heterotrofo, igual, "si"),
                    new Clause(ParedCelular, igual, "no"),
                    new Clause(Movilidad, igual, "si")},
                new Clause(Reino, igual, "Animalia"));

        //filo
        // Reglas para el filo Arthropoda
        Rule arthropoda = new Rule(br, "ARTHROPODA",
                new Clause[]{new Clause(SimetriaBilateral, igual, "si"),
                    new Clause(Segmentacion, igual, "si"),
                    new Clause(Esqueleto, igual, "si"),
                    new Clause(CavidadCorporal, igual, "si"),
                    new Clause(SistemaDigestivo, igual, "si"),
                    new Clause(ApendicesArticulados, igual, "si"),
                    new Clause(ReproduccionAsexual, igual, "si"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Arthropoda"));

        // Reglas para el filo Mollusca
        Rule mollusca = new Rule(br, "MOLLUSCA",
                new Clause[]{new Clause(SimetriaBilateral, igual, "si"),
                    new Clause(Segmentacion, igual, "no"),
                    new Clause(Esqueleto, igual, "no"),
                    new Clause(CavidadCorporal, igual, "si"),
                    new Clause(SistemaDigestivo, igual, "si"),
                    new Clause(ApendicesArticulados, igual, "no"),
                    new Clause(ReproduccionAsexual, igual, "no"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Mollusca"));

        // Reglas para el filo Porifera
        Rule porifera = new Rule(br, "PORIFERA",
                new Clause[]{new Clause(SimetriaBilateral, igual, "no"),
                    new Clause(Segmentacion, igual, "no"),
                    new Clause(Esqueleto, igual, "no"),
                    new Clause(CavidadCorporal, igual, "no"),
                    new Clause(SistemaDigestivo, igual, "no"),
                    new Clause(ApendicesArticulados, igual, "no"),
                    new Clause(ReproduccionAsexual, igual, "si"),
                    new Clause(ReproduccionSexual, igual, "no")},
                new Clause(Filo, igual, "Porifera"));

        // Reglas para el filo Chordata
        Rule chordata = new Rule(br, "CHORDATA",
                new Clause[]{new Clause(Reino, igual, "ANIMALIA"),
                    new Clause(SimetriaBilateral, igual, "si"),
                    new Clause(Segmentacion, igual, "si"),
                    new Clause(Esqueleto, igual, "si"),
                    new Clause(CavidadCorporal, igual, "si"),
                    new Clause(SistemaDigestivo, igual, "si"),
                    new Clause(ApendicesArticulados, igual, "si"),
                    new Clause(ReproduccionAsexual, igual, "no"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Chordata"));

        // Reglas para el filo Cnidaria
        Rule cnidaria = new Rule(br, "CNIDARIA",
                new Clause[]{new Clause(SimetriaBilateral, igual, "no"),
                    new Clause(Segmentacion, igual, "no"),
                    new Clause(Esqueleto, igual, "no"),
                    new Clause(CavidadCorporal, igual, "no"),
                    new Clause(SistemaDigestivo, igual, "no"),
                    new Clause(ApendicesArticulados, igual, "no"),
                    new Clause(ReproduccionAsexual, igual, "si"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Cnidaria"));

        // Reglas para el filo Platyhelminthes
        Rule platyhelminthes = new Rule(br, "PLATYHELMINTHES",
                new Clause[]{new Clause(SimetriaBilateral, igual, "si"),
                    new Clause(Segmentacion, igual, "no"),
                    new Clause(Esqueleto, igual, "no"),
                    new Clause(CavidadCorporal, igual, "no"),
                    new Clause(SistemaDigestivo, igual, "no"),
                    new Clause(ApendicesArticulados, igual, "no"),
                    new Clause(ReproduccionAsexual, igual, "si"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Platyhelminthes"));

        // Reglas para el filo Nematoda
        Rule nematoda = new Rule(br, "NEMATODA",
                new Clause[]{new Clause(SimetriaBilateral, igual, "si"),
                    new Clause(Segmentacion, igual, "no"),
                    new Clause(Esqueleto, igual, "no"),
                    new Clause(CavidadCorporal, igual, "no"),
                    new Clause(SistemaDigestivo, igual, "si"),
                    new Clause(ApendicesArticulados, igual, "no"),
                    new Clause(ReproduccionAsexual, igual, "no"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Nematoda"));

        // Reglas para el filo Echinodermata
        Rule echinodermata = new Rule(br, "ECHINODERMATA",
                new Clause[]{new Clause(SimetriaBilateral, igual, "no"),
                    new Clause(Segmentacion, igual, "no"),
                    new Clause(Esqueleto, igual, "si"),
                    new Clause(CavidadCorporal, igual, "si"),
                    new Clause(SistemaDigestivo, igual, "si"),
                    new Clause(ApendicesArticulados, igual, "no"),
                    new Clause(ReproduccionAsexual, igual, "no"),
                    new Clause(ReproduccionSexual, igual, "si")},
                new Clause(Filo, igual, "Echinodermata"));
        //

        // Reglas para Actinopterygii
        Rule actinopterygii = new Rule(br, "ACTINOPTERYGII",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "si"),
                    new Clause(EsqueletoCartilaginoso, igual, "no"),
                    new Clause(Endotermos, igual, "no"),
                    new Clause(RespiranMediantePulmones, igual, "no"),
                    new Clause(RespiranMedianteBranqueas, igual, "si"),
                    new Clause(VejigaNatatoria, igual, "si"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Actinopterygii"));

        // Reglas para Aves
        Rule aves = new Rule(br, "AVES",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "si"),
                    new Clause(EsqueletoCartilaginoso, igual, "no"),
                    new Clause(Endotermos, igual, "si"),
                    new Clause(RespiranMediantePulmones, igual, "si"),
                    new Clause(RespiranMedianteBranqueas, igual, "no"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Aves"));

        // Reglas para Amphibia
        Rule amphibii = new Rule(br, "AMPHIBIA",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "no"),
                    new Clause(EsqueletoCartilaginoso, igual, "si"),
                    new Clause(Endotermos, igual, "no"),
                    new Clause(RespiranMediantePulmones, igual, "si"),
                    new Clause(RespiranMedianteBranqueas, igual, "no"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Amphibia"));

        // Reglas para Cephalaspidomorphi
        Rule cephalaspidomorphi = new Rule(br, "CEPHALASPIDOMORPHI",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "no"),
                    new Clause(EsqueletoCartilaginoso, igual, "si"),
                    new Clause(Endotermos, igual, "no"),
                    new Clause(RespiranMediantePulmones, igual, "no"),
                    new Clause(RespiranMedianteBranqueas, igual, "si"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "si")},
                new Clause(Clase, igual, "Cephalaspidomorphi"));

        // Reglas para Elasmobranchii
        Rule elasmobranchii = new Rule(br, "ELASMOBRANCHII",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "no"),
                    new Clause(EsqueletoCartilaginoso, igual, "si"),
                    new Clause(Endotermos, igual, "no"),
                    new Clause(RespiranMediantePulmones, igual, "no"),
                    new Clause(RespiranMedianteBranqueas, igual, "si"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Elasmobranchii"));

        // Reglas para Holosephali
        Rule holosephali = new Rule(br, "HOLOSEPHALI",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "no"),
                    new Clause(EsqueletoCartilaginoso, igual, "si"),
                    new Clause(Endotermos, igual, "no"),
                    new Clause(RespiranMediantePulmones, igual, "no"),
                    new Clause(RespiranMedianteBranqueas, igual, "si"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Holosephali"));

        // Reglas para Mammalia
        Rule mammalia = new Rule(br, "MAMMALIA",
                new Clause[]{new Clause(GlandulasMamarias, igual, "si"),
                    new Clause(EsqueletoOseo, igual, "si"),
                    new Clause(EsqueletoCartilaginoso, igual, "no"),
                    new Clause(Endotermos, igual, "si"),
                    new Clause(RespiranMediantePulmones, igual, "si"),
                    new Clause(RespiranMedianteBranqueas, igual, "no"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Mammalia"));

        // Reglas para Reptilia
        Rule reptilia = new Rule(br, "REPTILIA",
                new Clause[]{new Clause(GlandulasMamarias, igual, "no"),
                    new Clause(EsqueletoOseo, igual, "si"),
                    new Clause(EsqueletoCartilaginoso, igual, "no"),
                    new Clause(Endotermos, igual, "no"),
                    new Clause(RespiranMediantePulmones, igual, "si"),
                    new Clause(RespiranMedianteBranqueas, igual, "no"),
                    new Clause(VejigaNatatoria, igual, "no"),
                    new Clause(BocaSinMandibulas, igual, "no")},
                new Clause(Clase, igual, "Reptilia"));

        //Orden
        // Reglas para el orden Anuras
        Rule anuras = new Rule(br, "ANURA",
                new Clause[]{new Clause(PresenciaDeCola, igual, "no"),
                    new Clause(PatasBienDesarrolladas, igual, "si"),
                    new Clause(CuerpoAlargado, igual, "no"),
                    new Clause(FertilizacionInterna, igual, "no"),
                    new Clause(FertilizacionExterna, igual, "si"),
                    new Clause(RespiracionCutanea, igual, "si")},
                new Clause(Orden, igual, "Anura"));

        // Reglas para el orden Caudata
        Rule caudata = new Rule(br, "CAUDATA",
                new Clause[]{new Clause(PresenciaDeCola, igual, "si"),
                    new Clause(PatasBienDesarrolladas, igual, "si"),
                    new Clause(CuerpoAlargado, igual, "si"),
                    new Clause(FertilizacionInterna, igual, "si"),
                    new Clause(FertilizacionExterna, igual, "no"),
                    new Clause(RespiracionCutanea, igual, "si")},
                new Clause(Orden, igual, "Caudata"));

        // Reglas para el orden Gymnophibia
        Rule gymnophibia = new Rule(br, "GYMNOPHIBIA",
                new Clause[]{new Clause(PresenciaDeCola, igual, "no"),
                    new Clause(PatasBienDesarrolladas, igual, "no"),
                    new Clause(CuerpoAlargado, igual, "si"),
                    new Clause(FertilizacionInterna, igual, "si"),
                    new Clause(FertilizacionExterna, igual, "no"),
                    new Clause(RespiracionCutanea, igual, "si")},
                new Clause(Orden, igual, "Gymnophibia"));

        //familia caudata
        // Reglas para la familia Ambystomatidae
        Rule ambystomatidae = new Rule(br, "AMBYSTOMATIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "no"),
                    new Clause(PatasBienDesarrolladas2, igual, "si"),
                    new Clause(CuerpoAlargado2, igual, "si"),
                    new Clause(FertilizacionInterna2, igual, "si"),
                    new Clause(FertilizacionExterna2, igual, "no"),
                    new Clause(HabitatTerrestre2, igual, "si"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "si")},
                new Clause(Familia1, igual, "Ambystomatidae"));

        // Reglas para la familia Amphiumidae
        Rule amphiumidae = new Rule(br, "AMPHIUMIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "no"),
                    new Clause(PatasBienDesarrolladas2, igual, "si"),
                    new Clause(CuerpoAlargado2, igual, "no"),
                    new Clause(FertilizacionInterna2, igual, "si"),
                    new Clause(FertilizacionExterna2, igual, "no"),
                    new Clause(HabitatTerrestre2, igual, "no"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "si")},
                new Clause(Familia1, igual, "Amphiumidae"));

        // Reglas para la familia Hynobiidae
        Rule hynobiidae = new Rule(br, "HYNOBIIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "no"),
                    new Clause(PatasBienDesarrolladas2, igual, "si"),
                    new Clause(CuerpoAlargado2, igual, "si"),
                    new Clause(FertilizacionInterna2, igual, "no"),
                    new Clause(FertilizacionExterna2, igual, "si"),
                    new Clause(HabitatTerrestre2, igual, "no"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "si")},
                new Clause(Familia1, igual, "Hynobiidae"));

        // Reglas para la familia Plethodontidae
        Rule plethodontidae = new Rule(br, "PLETHODONTIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "no"),
                    new Clause(PatasBienDesarrolladas2, igual, "si"),
                    new Clause(CuerpoAlargado2, igual, "no"),
                    new Clause(FertilizacionInterna2, igual, "si"),
                    new Clause(FertilizacionExterna2, igual, "no"),
                    new Clause(HabitatTerrestre2, igual, "si"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "no")},
                new Clause(Familia1, igual, "Plethodontidae"));

        // Reglas para la familia Proteidae
        Rule proteidae = new Rule(br, "PROTEIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "si"),
                    new Clause(PatasBienDesarrolladas2, igual, "no"),
                    new Clause(CuerpoAlargado2, igual, "si"),
                    new Clause(FertilizacionInterna2, igual, "si"),
                    new Clause(FertilizacionExterna2, igual, "no"),
                    new Clause(HabitatTerrestre2, igual, "no"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "no")},
                new Clause(Familia1, igual, "Proteidae"));

        // Reglas para la familia Rhyacotritonidae
        Rule rhyacotritonidae = new Rule(br, "RHYACOTRITONIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "no"),
                    new Clause(PatasBienDesarrolladas2, igual, "si"),
                    new Clause(CuerpoAlargado2, igual, "si"),
                    new Clause(FertilizacionInterna2, igual, "no"),
                    new Clause(FertilizacionExterna2, igual, "no"),
                    new Clause(HabitatTerrestre2, igual, "si"),
                    new Clause(HabitatAcuatico2, igual, "no"),
                    new Clause(MetamorfosisCompleta, igual, "si")},
                new Clause(Familia1, igual, "Rhyacotritonidae"));

        // Reglas para la familia Salamandridae
        Rule salamandridae = new Rule(br, "SALAMANDRIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "no"),
                    new Clause(PatasBienDesarrolladas2, igual, "si"),
                    new Clause(CuerpoAlargado2, igual, "si"),
                    new Clause(FertilizacionInterna2, igual, "no"),
                    new Clause(FertilizacionExterna2, igual, "no"),
                    new Clause(HabitatTerrestre2, igual, "no"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "si")},
                new Clause(Familia1, igual, "Salamandridae"));

        // Reglas para la familia Sirenidae
        Rule sirenidae = new Rule(br, "SIRENIDAE",
                new Clause[]{new Clause(PresenciaDeBranquiasEnAdultos, igual, "si"),
                    new Clause(PatasBienDesarrolladas2, igual, "no"),
                    new Clause(CuerpoAlargado2, igual, "si"),
                    new Clause(FertilizacionInterna2, igual, "no"),
                    new Clause(FertilizacionExterna2, igual, "si"),
                    new Clause(HabitatTerrestre2, igual, "no"),
                    new Clause(HabitatAcuatico2, igual, "si"),
                    new Clause(MetamorfosisCompleta, igual, "no")},
                new Clause(Familia1, igual, "Sirenidae"));

        // Reglas para la familia Craugastoridae
        Rule craugastoridae = new Rule(br, "CRAUGASTORIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "si"),
                    new Clause(PielLisa, igual, "no"),
                    new Clause(Vocalizaciones, igual, "no"),
                    new Clause(Hibernacion, igual, "si"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "no"),
                    new Clause(ReproduccionEnTierra, igual, "si")},
                new Clause(Familia, igual, "Craugastoridae"));

        // Reglas para la familia Bufonidae
        Rule bufonidae = new Rule(br, "BUFONIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "si"),
                    new Clause(PielLisa, igual, "no"),
                    new Clause(Vocalizaciones, igual, "si"),
                    new Clause(Hibernacion, igual, "si"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "si"),
                    new Clause(ReproduccionEnTierra, igual, "si")},
                new Clause(Familia, igual, "Bufonidae"));

        // Reglas para la familia Strabomantidae
        Rule strabomantidae = new Rule(br, "STRABOMANTIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "si"),
                    new Clause(PielLisa, igual, "no"),
                    new Clause(Vocalizaciones, igual, "no"),
                    new Clause(Hibernacion, igual, "si"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "no"),
                    new Clause(ReproduccionEnTierra, igual, "si")},
                new Clause(Familia, igual, "Strabomantidae"));

        // Reglas para la familia Ranidae
        Rule ranidae = new Rule(br, "RANIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "si"),
                    new Clause(PielLisa, igual, "no"),
                    new Clause(Vocalizaciones, igual, "si"),
                    new Clause(Hibernacion, igual, "no"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "si"),
                    new Clause(ReproduccionEnTierra, igual, "no")},
                new Clause(Familia, igual, "Ranidae"));

        // Reglas para la familia Pipidae
        Rule pipidae = new Rule(br, "PIPIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "no"),
                    new Clause(PielLisa, igual, "si"),
                    new Clause(Vocalizaciones, igual, "no"),
                    new Clause(Hibernacion, igual, "no"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "si"),
                    new Clause(ReproduccionEnTierra, igual, "no")},
                new Clause(Familia, igual, "Pipidae"));

        // Reglas para la familia Hylidae
        Rule hylidae = new Rule(br, "HYLIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "no"),
                    new Clause(PielLisa, igual, "si"),
                    new Clause(Vocalizaciones, igual, "si"),
                    new Clause(Hibernacion, igual, "no"),
                    new Clause(OjosGrandes, igual, "si"),
                    new Clause(ReproduccionEnAgua, igual, "si"),
                    new Clause(ReproduccionEnTierra, igual, "no")},
                new Clause(Familia, igual, "Hylidae"));

        // Reglas para la familia Microhylidae
        Rule microhylidae = new Rule(br, "MICROHYLIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "si"),
                    new Clause(PielLisa, igual, "no"),
                    new Clause(Vocalizaciones, igual, "no"),
                    new Clause(Hibernacion, igual, "no"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "no"),
                    new Clause(ReproduccionEnTierra, igual, "si")},
                new Clause(Familia, igual, "Microhylidae"));

        // Reglas para la familia Centrolenidae
        Rule centrolenidae = new Rule(br, "CENTROLENIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "no"),
                    new Clause(PielLisa, igual, "si"),
                    new Clause(Vocalizaciones, igual, "no"),
                    new Clause(Hibernacion, igual, "no"),
                    new Clause(OjosGrandes, igual, "si"),
                    new Clause(ReproduccionEnAgua, igual, "no"),
                    new Clause(ReproduccionEnTierra, igual, "no")},
                new Clause(Familia, igual, "Centrolenidae"));

        // Reglas para la familia Hemiphractidae
        Rule hemiphractidae = new Rule(br, "HEMIPHRACTIDAE",
                new Clause[]{new Clause(PielRugosa, igual, "si"),
                    new Clause(PielLisa, igual, "no"),
                    new Clause(Vocalizaciones, igual, "no"),
                    new Clause(Hibernacion, igual, "no"),
                    new Clause(OjosGrandes, igual, "no"),
                    new Clause(ReproduccionEnAgua, igual, "no"),
                    new Clause(ReproduccionEnTierra, igual, "si")},
                new Clause(Familia, igual, "Hemiphractidae"));

        // Reglas para el género Hylarana
        Rule hylarana = new Rule(br, "HYLARANA",
                new Clause[]{new Clause(HabitatTropical, igual, "si"),
                    new Clause(DepredadoresNaturales, igual, "no"),
                    new Clause(PielGlandularVenenosa, igual, "no"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Hylarana"));

        // Reglas para el género Rana
        Rule rana = new Rule(br, "RANA",
                new Clause[]{new Clause(HabitatTropical, igual, "no"),
                    new Clause(DepredadoresNaturales, igual, "si"),
                    new Clause(PielGlandularVenenosa, igual, "no"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Rana"));

        // Reglas para el género Clinotarsus
        Rule clinotarsus = new Rule(br, "CLINOTARSUS",
                new Clause[]{new Clause(HabitatTropical, igual, "si"),
                    new Clause(DepredadoresNaturales, igual, "no"),
                    new Clause(PielGlandularVenenosa, igual, "no"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "no")},
                new Clause(Genero, igual, "Clinotarsus"));

        // Reglas para el género Amnirana
        Rule amnirana = new Rule(br, "AMNIRANA",
                new Clause[]{new Clause(HabitatTropical, igual, "si"),
                    new Clause(DepredadoresNaturales, igual, "no"),
                    new Clause(PielGlandularVenenosa, igual, "no"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Amnirana"));

        // Reglas para el género Lithobates
        Rule lithobates = new Rule(br, "LITHOBATES",
                new Clause[]{new Clause(HabitatTropical, igual, "no"),
                    new Clause(DepredadoresNaturales, igual, "si"),
                    new Clause(PielGlandularVenenosa, igual, "si"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Lithobates"));

        // Reglas para el género Glandirana
        Rule glandirana = new Rule(br, "GLANDIRANA",
                new Clause[]{new Clause(HabitatTropical, igual, "si"),
                    new Clause(DepredadoresNaturales, igual, "si"),
                    new Clause(PielGlandularVenenosa, igual, "si"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Glandirana"));

        // Reglas para el género Babina
        Rule babina = new Rule(br, "BABINA",
                new Clause[]{new Clause(HabitatTropical, igual, "si"),
                    new Clause(DepredadoresNaturales, igual, "no"),
                    new Clause(PielGlandularVenenosa, igual, "no"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Babina"));

        // Reglas para el género Pelophylax
        Rule pelophylax = new Rule(br, "PELOPHYLAX",
                new Clause[]{new Clause(HabitatTropical, igual, "si"),
                    new Clause(DepredadoresNaturales, igual, "si"),
                    new Clause(PielGlandularVenenosa, igual, "si"),
                    new Clause(EspeciesTerrestres, igual, "si"),
                    new Clause(HabitatAcuatico, igual, "si")},
                new Clause(Genero, igual, "Pelophylax"));

        //genero ambystoma
        // Reglas para el género Rhyacotriton
        Rule rhyacotriton = new Rule(br, "RHYACOTRITON",
                new Clause[]{
                    new Clause(ColoracionConManchas, igual, "si"),
                    new Clause(HabitatEnArroyosDeMontana, igual, "si"),
                    new Clause(BranquiasEnAdultos, igual, "no"),
                    new Clause(EstadoNeotenicoFrecuente, igual, "no"),
                    new Clause(FertilizacionInterna1, igual, "no"),
                    new Clause(FertilizacionExterna1, igual, "si"),
                    new Clause(MetamorfosisCompleta1, igual, "si"),
                    new Clause(NeoteniaFrecuente, igual, "no")},
                new Clause(Genero2, igual, "Rhyacotriton"));

// Reglas para el género Dicamptodon
        Rule dicamptodon = new Rule(br, "DICAMPTODON",
                new Clause[]{
                    new Clause(ColoracionConManchas, igual, "si"),
                    new Clause(HabitatEnArroyosDeMontana, igual, "si"),
                    new Clause(BranquiasEnAdultos, igual, "si"),
                    new Clause(EstadoNeotenicoFrecuente, igual, "si"),
                    new Clause(FertilizacionInterna1, igual, "si"),
                    new Clause(FertilizacionExterna1, igual, "no"),
                    new Clause(MetamorfosisCompleta1, igual, "si"),
                    new Clause(NeoteniaFrecuente, igual, "si")},
                new Clause(Genero2, igual, "Dicamptodon"));
// Reglas para el género Ambystoma
        Rule ambystoma = new Rule(br, "AMBYSTOMA",
                new Clause[]{
                    new Clause(ColoracionConManchas, igual, "no"),
                    new Clause(HabitatEnArroyosDeMontana, igual, "no"),
                    new Clause(BranquiasEnAdultos, igual, "si"),
                    new Clause(EstadoNeotenicoFrecuente, igual, "si"),
                    new Clause(FertilizacionInterna1, igual, "si"),
                    new Clause(FertilizacionExterna1, igual, "no"),
                    new Clause(MetamorfosisCompleta1, igual, "si"),
                    new Clause(NeoteniaFrecuente, igual, "si")},
                new Clause(Genero2, igual, "Ambystoma"));

        //REGLAS GENERO PLENTHO
        // Reglas para el género Pseudoeurycea
        Rule pseudoeurycea = new Rule(br, "PSEUDOEURYCEA",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "si")},
                new Clause(GeneroP, igual, "Pseudoeurycea"));

        // Reglas para el género Bolitoglosa
        Rule bolitoglosa = new Rule(br, "BOLITOGLOSA",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "no"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "si")},
                new Clause(GeneroP, igual, "Bolitoglosa"));

        // Reglas para el género Thorius
        Rule thorius = new Rule(br, "THORIUS",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "no"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "no")},
                new Clause(GeneroP, igual, "Thorius"));

        // Reglas para el género Batrachoseps
        Rule batrachoseps = new Rule(br, "BATRACHOSEPS",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "si"),
                    new Clause(ColoracionBOVP, igual, "no")},
                new Clause(GeneroP, igual, "Batrachoseps"));

        // Reglas para el género Oedipina
        Rule oedipina = new Rule(br, "OEDIPINA",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "si"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "si")},
                new Clause(GeneroP, igual, "Oedipina"));

        // Reglas para el género Nototriton
        Rule nototriton = new Rule(br, "NOTOTRITON",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "no")},
                new Clause(GeneroP, igual, "Nototriton"));

        // Reglas para el género Isthmura
        Rule isthmura = new Rule(br, "ISTHMURA",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "no"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "si")},
                new Clause(GeneroP, igual, "Isthmura"));

        // Reglas para el género Eurycea
        Rule eurycea = new Rule(br, "EURYCEA",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "no"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "si"),
                    new Clause(ColoracionBOVP, igual, "si")},
                new Clause(GeneroP, igual, "Eurycea"));

        // Reglas para el género Desmognathus
        Rule desmognathus = new Rule(br, "DESMOGNATHUS",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "no"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "si"),
                    new Clause(ColoracionBOVP, igual, "si")},
                new Clause(GeneroP, igual, "Desmognathus"));

        // Reglas para el género Aneides
        Rule aneides = new Rule(br, "ANEIDES",
                new Clause[]{new Clause(BranquiasAdultosP, igual, "si"),
                    new Clause(FertilizacionInternaP, igual, "si"),
                    new Clause(ReproduccionTerrestreP, igual, "si"),
                    new Clause(HabitatTerrestreP, igual, "si"),
                    new Clause(HabitatAcuaticoP, igual, "no"),
                    new Clause(ColoracionBOVP, igual, "no")},
                new Clause(GeneroP, igual, "Aneides"));
        // Reglas para Lithobates pipiens
        Rule lithobatesPipiens = new Rule(br, "PIPIENS",
                new Clause[]{new Clause(RespiracionBranquial, igual, "si"),
                    new Clause(PatronDeManchas, igual, "si"),
                    new Clause(PatasLargas, igual, "si"),
                    new Clause(PielConVerrugas, igual, "no"),
                    new Clause(CuerpoRobusto, igual, "no"),
                    new Clause(ColoracionEnTonosMarrones, igual, "si")},
                new Clause(Especie, igual, "Pipiens"));

        // Reglas para Lithobates clamitans
        Rule lithobatesClamitans = new Rule(br, "CLAMITANS",
                new Clause[]{new Clause(RespiracionBranquial, igual, "no"),
                    new Clause(PatronDeManchas, igual, "no"),
                    new Clause(PatasLargas, igual, "si"),
                    new Clause(PielConVerrugas, igual, "no"),
                    new Clause(CuerpoRobusto, igual, "si"),
                    new Clause(ColoracionEnTonosMarrones, igual, "si")},
                new Clause(Especie, igual, "Clamitans"));

        // Reglas para Lithobates blairi
        Rule lithobatesBlairi = new Rule(br, "BLAIRI",
                new Clause[]{new Clause(RespiracionBranquial, igual, "no"),
                    new Clause(PatronDeManchas, igual, "si"),
                    new Clause(PatasLargas, igual, "si"),
                    new Clause(PielConVerrugas, igual, "si"),
                    new Clause(CuerpoRobusto, igual, "si"),
                    new Clause(ColoracionEnTonosMarrones, igual, "no")},
                new Clause(Especie, igual, "Blairi"));

        // Reglas para Lithobates capito
        Rule lithobatesCapito = new Rule(br, "CAPITO",
                new Clause[]{new Clause(RespiracionBranquial, igual, "si"),
                    new Clause(PatronDeManchas, igual, "no"),
                    new Clause(PatasLargas, igual, "si"),
                    new Clause(PielConVerrugas, igual, "si"),
                    new Clause(CuerpoRobusto, igual, "no"),
                    new Clause(ColoracionEnTonosMarrones, igual, "si")},
                new Clause(Especie, igual, "Capito"));

        // Reglas para Lithobates tlaloci
        Rule lithobatesTlaloci = new Rule(br, "TLALOCI",
                new Clause[]{new Clause(RespiracionBranquial, igual, "no"),
                    new Clause(PatronDeManchas, igual, "si"),
                    new Clause(PatasLargas, igual, "si"),
                    new Clause(PielConVerrugas, igual, "no"),
                    new Clause(CuerpoRobusto, igual, "no"),
                    new Clause(ColoracionEnTonosMarrones, igual, "si")},
                new Clause(Especie, igual, "Tlaloci"));

        // Reglas para Lithobates areolatus
        Rule lithobatesAreolatus = new Rule(br, "AREOLATUS",
                new Clause[]{new Clause(RespiracionBranquial, igual, "si"),
                    new Clause(PatronDeManchas, igual, "si"),
                    new Clause(PatasLargas, igual, "no"),
                    new Clause(PielConVerrugas, igual, "si"),
                    new Clause(CuerpoRobusto, igual, "no"),
                    new Clause(ColoracionEnTonosMarrones, igual, "si")},
                new Clause(Especie, igual, "Areolatus"));

        // Reglas para Lithobates brownorum
        Rule lithobatesBrownorum = new Rule(br, "BROWNORUM",
                new Clause[]{new Clause(RespiracionBranquial, igual, "no"),
                    new Clause(PatronDeManchas, igual, "si"),
                    new Clause(PatasLargas, igual, "no"),
                    new Clause(PielConVerrugas, igual, "si"),
                    new Clause(CuerpoRobusto, igual, "si"),
                    new Clause(ColoracionEnTonosMarrones, igual, "no")},
                new Clause(Especie, igual, "Brownorum"));

        //especie ambystoma
        // Reglas para Ambystoma mexicanum
        Rule ambystomaMexicanum = new Rule(br, "MEXICANUM",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "si"),
                    new Clause(BranquiasEnAdultos1, igual, "si"),
                    new Clause(HabitatTerrestre1, igual, "no"),
                    new Clause(HabitatAcuatico1, igual, "si"),
                    new Clause(ColoracionOscuraConManchas, igual, "no"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie2, igual, "Mexicanum"));

// Reglas para Ambystoma andersoni
        Rule ambystomaAndersoni = new Rule(br, "ANDERSONI",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "si"),
                    new Clause(BranquiasEnAdultos1, igual, "si"),
                    new Clause(HabitatTerrestre1, igual, "no"),
                    new Clause(HabitatAcuatico1, igual, "si"),
                    new Clause(ColoracionOscuraConManchas, igual, "si"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie2, igual, "Andersoni"));

// Reglas para Ambystoma annulatum
        Rule ambystomaAnnulatum = new Rule(br, "ANNULATUM",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "si"),
                    new Clause(HabitatAcuatico1, igual, "no"),
                    new Clause(ColoracionOscuraConManchas, igual, "si"),
                    new Clause(TamanoPequeno, igual, "si")},
                new Clause(Especie, igual, "Annulatum"));

// Reglas para Ambystoma barbouri
        Rule ambystomaBarbouri = new Rule(br, "BARBOURI",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "si"),
                    new Clause(HabitatAcuatico1, igual, "no"),
                    new Clause(ColoracionOscuraConManchas, igual, "no"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie, igual, "Barbouri"));

// Reglas para Ambystoma bishopi
        Rule ambystomaBishopi = new Rule(br, "BISHOPI",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "si"),
                    new Clause(HabitatAcuatico1, igual, "no"),
                    new Clause(ColoracionOscuraConManchas, igual, "si"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie, igual, "Bishopi"));

// Reglas para Ambystoma bombypellum
        Rule ambystomaBombypellum = new Rule(br, "BOMBYPELLUM",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "no"),
                    new Clause(HabitatAcuatico1, igual, "no"),
                    new Clause(ColoracionOscuraConManchas, igual, "no"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie, igual, "Bombypellum"));

// Reglas para Ambystoma californiense
        Rule ambystomaCaliforniense = new Rule(br, "CALIFORNIENSE",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "si"),
                    new Clause(HabitatAcuatico1, igual, "si"),
                    new Clause(ColoracionOscuraConManchas, igual, "no"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie, igual, "Californiense"));

// Reglas para Ambystoma cingulatum
        Rule ambystomaCingulatum = new Rule(br, "CINGULATUM",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "no"),
                    new Clause(HabitatAcuatico1, igual, "no"),
                    new Clause(ColoracionOscuraConManchas, igual, "si"),
                    new Clause(TamanoPequeno, igual, "si")},
                new Clause(Especie, igual, "Cingulatum"));

// Reglas para Ambystoma opacum
        Rule ambystomaOpacum = new Rule(br, "OPACUM",
                new Clause[]{
                    new Clause(NeoteniaPermanente, igual, "no"),
                    new Clause(BranquiasEnAdultos1, igual, "no"),
                    new Clause(HabitatTerrestre1, igual, "si"),
                    new Clause(HabitatAcuatico1, igual, "no"),
                    new Clause(ColoracionOscuraConManchas, igual, "si"),
                    new Clause(TamanoPequeno, igual, "no")},
                new Clause(Especie, igual, "Opacum"));
        //ESPECIE ANEIDES
        // Reglas para A. flavipunctatus
        Rule flavipunctatus = new Rule(br, "A. flavipunctatus",
                new Clause[]{new Clause(CabezaAnchaYPlana, igual, "si"),
                    new Clause(OjosGrandesA, igual, "no"),
                    new Clause(DedosLargos, igual, "si"),
                    new Clause(ColoracionUniforme, igual, "no"),
                    new Clause(PresenciaDeCrestasDorsales, igual, "si"),
                    new Clause(ColaMuyLarga, igual, "si"),
                    new Clause(ManchasEnLaPiel, igual, "si"),
                    new Clause(PielRugosaOGranulada, igual, "si"),
                    new Clause(PatronDeColoracionVentral, igual, "si")},
                new Clause(EspecieA, igual, "A. flavipunctatus"));

        // Reglas para A. ferreus
        Rule ferreus = new Rule(br, "A. ferreus",
                new Clause[]{new Clause(CabezaAnchaYPlana, igual, "no"),
                    new Clause(OjosGrandesA, igual, "si"),
                    new Clause(DedosLargos, igual, "si"),
                    new Clause(ColoracionUniforme, igual, "si"),
                    new Clause(PresenciaDeCrestasDorsales, igual, "no"),
                    new Clause(ColaMuyLarga, igual, "si"),
                    new Clause(ManchasEnLaPiel, igual, "no"),
                    new Clause(PielRugosaOGranulada, igual, "no"),
                    new Clause(PatronDeColoracionVentral, igual, "no")},
                new Clause(EspecieA, igual, "A. ferreus"));

        // Reglas para A. aeneus
        Rule aeneus = new Rule(br, "A. aeneus",
                new Clause[]{new Clause(CabezaAnchaYPlana, igual, "no"),
                    new Clause(OjosGrandesA, igual, "no"),
                    new Clause(DedosLargos, igual, "si"),
                    new Clause(ColoracionUniforme, igual, "si"),
                    new Clause(PresenciaDeCrestasDorsales, igual, "no"),
                    new Clause(ColaMuyLarga, igual, "no"),
                    new Clause(ManchasEnLaPiel, igual, "si"),
                    new Clause(PielRugosaOGranulada, igual, "no"),
                    new Clause(PatronDeColoracionVentral, igual, "si")},
                new Clause(EspecieA, igual, "A. aeneus"));

        // Reglas para A. lugubris
        Rule lugubris = new Rule(br, "A. lugubris",
                new Clause[]{new Clause(CabezaAnchaYPlana, igual, "no"),
                    new Clause(OjosGrandesA, igual, "si"),
                    new Clause(DedosLargos, igual, "no"),
                    new Clause(ColoracionUniforme, igual, "si"),
                    new Clause(PresenciaDeCrestasDorsales, igual, "si"),
                    new Clause(ColaMuyLarga, igual, "no"),
                    new Clause(ManchasEnLaPiel, igual, "no"),
                    new Clause(PielRugosaOGranulada, igual, "si"),
                    new Clause(PatronDeColoracionVentral, igual, "no")},
                new Clause(EspecieA, igual, "A. lugubris"));

        // Reglas para A. hardii
        Rule hardii = new Rule(br, "A. hardii",
                new Clause[]{new Clause(CabezaAnchaYPlana, igual, "si"),
                    new Clause(OjosGrandesA, igual, "no"),
                    new Clause(DedosLargos, igual, "si"),
                    new Clause(ColoracionUniforme, igual, "no"),
                    new Clause(PresenciaDeCrestasDorsales, igual, "si"),
                    new Clause(ColaMuyLarga, igual, "si"),
                    new Clause(ManchasEnLaPiel, igual, "no"),
                    new Clause(PielRugosaOGranulada, igual, "no"),
                    new Clause(PatronDeColoracionVentral, igual, "si")},
                new Clause(EspecieA, igual, "A. hardii"));
        //especie psudorycea
        // Reglas para Pseudorycae lineola
    Rule pLineola = new Rule(br, "P_LINEOLA",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "no"),
                         new Clause(ColoracionConManchasOPatrones, igual, "si"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "no"),
                         new Clause(ColoracionEnTonosClarosP, igual, "si"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "si")},
            new Clause(EspecieP, igual, "P. lineola"));

    // Reglas para Pseudorycae cochranae
    Rule pCochranae = new Rule(br, "P_COCHRANAE",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "no"),
                         new Clause(ColoracionConManchasOPatrones, igual, "si"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "no"),
                         new Clause(ColoracionEnTonosClarosP, igual, "si"),
                         new Clause(ExtremidadesAlargadas, igual, "si"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. cochranae"));

    // Reglas para Pseudorycae altamontana
    Rule pAltamontana = new Rule(br, "P_ALTAMONTANA",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "si"),
                         new Clause(ColoracionConManchasOPatrones, igual, "no"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "si"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. altamontana"));

    // Reglas para Pseudorycae nigromaculata
    Rule pNigromaculata = new Rule(br, "P_NIGROMACULATA",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "no"),
                         new Clause(ColoracionConManchasOPatrones, igual, "si"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "si"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "si")},
            new Clause(EspecieP, igual, "P. nigromaculata"));

    // Reglas para Pseudorycae melanomolga
    Rule pMelanomolga = new Rule(br, "P_MELANOMOLGA",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "si"),
                         new Clause(ColoracionConManchasOPatrones, igual, "si"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "si"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "si"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. melanomolga"));

    // Reglas para Pseudorycae anuitzolt
    Rule pAnuitzolt = new Rule(br, "P_ANUITZOLT",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "no"),
                         new Clause(ColoracionConManchasOPatrones, igual, "no"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "no"),
                         new Clause(ColoracionEnTonosClarosP, igual, "si"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. anuitzolt"));

    // Reglas para Pseudorycae conanti
    Rule pConanti = new Rule(br, "P_CONANTI",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "no"),
                         new Clause(ColoracionConManchasOPatrones, igual, "si"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "no"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. conanti"));

    // Reglas para Pseudorycae gadovii
    Rule pGadovii = new Rule(br, "P_GADOVII",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "no"),
                         new Clause(ColoracionConManchasOPatrones, igual, "si"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "no"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "si"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. gadovii"));

    // Reglas para Pseudorycae goebeli
    Rule pGoebeli = new Rule(br, "P_GOEBELI",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "si"),
                         new Clause(ColoracionConManchasOPatrones, igual, "no"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "no"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "no")},
            new Clause(EspecieP, igual, "P. goebeli"));

    // Reglas para Pseudorycae jaguar
    Rule pJaguar = new Rule(br, "P_JAGUAR",
            new Clause[]{new Clause(ColoracionUniformeP, igual, "si"),
                         new Clause(ColoracionConManchasOPatrones, igual, "no"),
                         new Clause(ColoracionEnTonosOscurosP, igual, "si"),
                         new Clause(ColoracionEnTonosClarosP, igual, "no"),
                         new Clause(ExtremidadesAlargadas, igual, "no"),
                         new Clause(ExtremidadesCortas, igual, "si")},
            new Clause(EspecieP, igual, "P. jaguar"));
    }
    
}
