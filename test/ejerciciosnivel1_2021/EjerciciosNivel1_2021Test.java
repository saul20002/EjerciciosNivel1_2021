/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1_2021;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gaming JS
 */
public class EjerciciosNivel1_2021Test {
    
    public EjerciciosNivel1_2021Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of maximo method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int[] lista = null;
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();
        int expResult = 0;
        int result = instance.maximo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esPalindromo method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();
 
        assertEquals(true, instance.esPalindromo("Acaso hubo buhos aca"));
        assertEquals(true, instance.esPalindromo("Aca"));
        assertEquals(false, instance.esPalindromo("feo cara culo"));
        assertEquals(false, instance.esPalindromo("ligar es agil"));
        assertEquals(true, instance.esPalindromo("Allí ves a Sevilla"));
        
        
    }

    /**
     * Test of esIsograma method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();

        assertEquals(true, instance.esIsograma("murcielago"));
        assertEquals(false, instance.esIsograma("cocreta"));
        assertEquals(false, instance.esIsograma("casa"));
        assertEquals(false, instance.esIsograma("Supercalifragilisticoespialidoso"));
        assertEquals(false, instance.esIsograma("Cocreta"));
        assertEquals(false, instance.esIsograma("isódroma"));
        assertEquals(true, instance.esIsograma("pita"));
        assertEquals(false, instance.esIsograma("pájaro"));
        assertEquals(true, instance.esIsograma("MURCIELAGO"));
        assertEquals(false, instance.esIsograma("COCRETA"));
        assertEquals(true, instance.esIsograma("CETYS"));
        assertEquals(true, instance.esIsograma("UFV"));
        

        
        
               
    }

    
    /**
     * Test of quitaAcentos method, of class EjerciciosNivel1_2021.
     * Sólo quita los acentos, no cambia a mayúsculas
     */
    @Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();
      
        assertEquals("pajaro", instance.quitaAcentos("pájaro"));
        assertEquals("Andale", instance.quitaAcentos("Ándale"));
        assertEquals("Cigueña", instance.quitaAcentos("Cigüeña"));
        assertEquals("perro", instance.quitaAcentos("perro"));
        assertEquals("pajaro", instance.quitaAcentos("pájáró"));
        assertEquals("pristino", instance.quitaAcentos("prístino"));
        assertEquals("murcielago", instance.quitaAcentos("murciélago"));
        assertEquals("atun", instance.quitaAcentos("atún"));
        assertEquals("camion", instance.quitaAcentos("camión"));       
        assertEquals("PAJARO", instance.quitaAcentos("PÁJÁRÓ"));
        assertEquals("PRISTINO", instance.quitaAcentos("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentos("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentos("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentos("CAMIÓN"));
        
    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();

        assertEquals("pajaro", instance.quitaAcentosV2("pájaro"));
        assertEquals("Andale", instance.quitaAcentosV2("Ándale"));
        assertEquals("Cigueña", instance.quitaAcentosV2("Cigüeña"));
        assertEquals("perro", instance.quitaAcentosV2("perro"));
        assertEquals("pajaro", instance.quitaAcentosV2("pájáró"));
        assertEquals("pristino", instance.quitaAcentosV2("prístino"));
        assertEquals("murcielago", instance.quitaAcentosV2("murciélago"));
        assertEquals("atun", instance.quitaAcentosV2("atún"));
        assertEquals("camion", instance.quitaAcentosV2("camión"));       
        assertEquals("PAJARO", instance.quitaAcentosV2("PÁJÁRÓ"));
        assertEquals("PRISTINO", instance.quitaAcentosV2("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentosV2("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentosV2("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentosV2("CAMIÓN"));
    }

    /**
     * Test of divideFrase method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testDivideFrase() {
        System.out.println("divideFrase");
        String frase = "";
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();
        String[] expResult = null;
        String[] result = instance.divideFrase(frase);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acronimo method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");
        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();

        assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        assertEquals("CETS", instance.acronimo("Centro de Estudios Tecnológicos y Sociales"));
        assertEquals("CETS", instance.acronimo("Centro de Estudios Tecnológicos y Sociales"));
        assertEquals("UFV", instance.acronimo("Universidad Francisco de Vitoria"));          
    }

    /**
     * Test of esAnagrama method, of class EjerciciosNivel1_2021.
     */
    @Test
    public void testEsAnagrama() {
        System.out.println("esAnagrama");

        EjerciciosNivel1_2021 instance = new EjerciciosNivel1_2021();
        assertEquals(true, instance.esAnagrama("amor", "roma"));
        assertEquals(true, instance.esAnagrama("Claudia", "licuada"));
        assertEquals(false, instance.esAnagrama("", ""));
        
        assertEquals(true, instance.esAnagrama("Helios", "hiÉlos"));
        assertEquals(true, instance.esAnagrama("Nacionalista", "Altisonancia"));
        assertEquals(false, instance.esAnagrama("kike", "aprobado"));

    }

    

   
    
}
