/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptapreparereffile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GenerateFile {

    ArrayList<String> timeCol = new ArrayList();
    ArrayList<String> arcICol = new ArrayList();
    ArrayList<String> arcVCol = new ArrayList();
    ArrayList<String> gasFlowCol = new ArrayList();
    ArrayList<String> dee1kV = new ArrayList();
    ArrayList<String> dee2kV = new ArrayList();
    ArrayList<String> magnetI = new ArrayList();
    ArrayList<String> foilI = new ArrayList();
    ArrayList<String> collLI = new ArrayList();
    ArrayList<String> targetI = new ArrayList();
    ArrayList<String> collRI = new ArrayList();
    ArrayList<String> vacuumP = new ArrayList();
    ArrayList<String> targetP = new ArrayList();
    ArrayList<String> deltaDeekV = new ArrayList();
    ArrayList<String> phaseLoad = new ArrayList();
    ArrayList<String> deeRefV = new ArrayList();
    ArrayList<String> probeI = new ArrayList();
    ArrayList<String> heCoolP = new ArrayList();
    ArrayList<String> flap1Pos = new ArrayList();
    ArrayList<String> flap2Pos = new ArrayList();
    ArrayList<String> stepPos = new ArrayList();
    ArrayList<String> extractionPos = new ArrayList();
    ArrayList<String> balance = new ArrayList();
    ArrayList<String> rfFwdW = new ArrayList();
    ArrayList<String> rfReflectedW = new ArrayList();
    ArrayList<String> foilN = new ArrayList();

    List<String> timeColTrim = null;
    List<String> arcIColTrim = null;
    List<String> arcVColTrim = null;
    List<String> gasFlowColTrim = null;
    List<String> dee1kVTrim = null;
    List<String> dee2kVTrim = null;
    List<String> magnetITrim = null;
    List<String> foilITrim = null;
    List<String> collLITrim = null;
    List<String> targetITrim = null;
    List<String> collRITrim = null;
    List<String> vacuumPTrim = null;
    List<String> targetPTrim = null;
    List<String> deltaDeekVTrim = null;
    List<String> phaseLoadTrim = null;
    List<String> deeRefVTrim = null;
    List<String> probeITrim = null;
    List<String> heCoolPTrim = null;
    List<String> flap1PosTrim = null;
    List<String> flap2PosTrim = null;
    List<String> stepPosTrim = null;
    List<String> extractionPosTrim = null;
    List<String> balanceTrim = null;
    List<String> rfFwdWTrim = null;
    List<String> rfReflectedWTrim = null;
    List<String> foilNTrim = null;

    String[] tabulatedRows = null;
    String temp;
    int startindex = 0;
    int endindex = 0;

    //public static void main(String[] args) throws IOException {
    GenerateFile(String file_import, String file_export) throws IOException {
        ArrayProvider ap = new ArrayProvider();
        String[] lines = ap.readLines(file_import);

        splitLinesByTab(lines);

        System.out.println("Gas col: " + gasFlowCol.get(60));
        System.out.println("gasFlowCol (parsed): " + Float.parseFloat(gasFlowCol.get(60)) + "gasFlowCol size: " + gasFlowCol.size());
        //Find start index
        findStartAndEndIndex();
        trimArrays(startindex, endindex);

        System.out.println("Startindex: " + startindex + " Endindex: " + endindex);

        FileWriter writer = new FileWriter(file_export);

        //writer.write("Time,9.241c vent ut,MIP2int.,MIP2ext.,MIP3ext.\n");
        writer.write("Time: ");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write("\""+timeCol.get(i)+"\""+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(arcICol.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(arcVCol.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(gasFlowCol.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(dee1kV.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(dee2kV.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(magnetI.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(foilI.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(collLI.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(targetI.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(collRI.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(vacuumP.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(targetP.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(deltaDeekV.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(phaseLoad.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(deeRefV.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(probeI.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(heCoolP.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(flap1Pos.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(flap2Pos.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(stepPos.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(extractionPos.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(balance.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(rfFwdW.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(rfReflectedW.get(i)+",");
        }
        writer.write("\n");
        for (int i = 0; i < timeCol.size(); i++) {
            writer.write(foilN.get(i)+",");
        }
        writer.close();

    }

    public void findStartAndEndIndex() {
        for (int i = 0; i < gasFlowCol.size(); i++) {
            //System.out.println("gasFlowCol: ");
            if (Float.parseFloat(gasFlowCol.get(i)) >= 0.3) {
                startindex = i;
                break;
            }
        }

        //Find endindex
        for (int i = startindex + 5; i < gasFlowCol.size(); i++) {
            if (Float.parseFloat(gasFlowCol.get(i)) <= 0.3) {
                endindex = i;
                break;
            }
        }
    }

    public void splitLinesByTab(String[] lines) {
        for (int i = 4, a = 0; i < lines.length; i++, a++) {
            temp = lines[i];
            tabulatedRows = temp.split("\\t");
            timeCol.add(tabulatedRows[0]);
            arcICol.add(tabulatedRows[1]);
            arcVCol.add(tabulatedRows[2]);
            gasFlowCol.add(tabulatedRows[3]);
            dee1kV.add(tabulatedRows[4]);
            dee2kV.add(tabulatedRows[5]);
            magnetI.add(tabulatedRows[6]);
            foilI.add(tabulatedRows[7]);
            collLI.add(tabulatedRows[8]);
            targetI.add(tabulatedRows[9]);
            collRI.add(tabulatedRows[10]);
            vacuumP.add(tabulatedRows[11]);
            targetP.add(tabulatedRows[12]);
            deltaDeekV.add(tabulatedRows[13]);
            phaseLoad.add(tabulatedRows[14]);
            deeRefV.add(tabulatedRows[15]);
            probeI.add(tabulatedRows[16]);
            heCoolP.add(tabulatedRows[17]);
            flap1Pos.add(tabulatedRows[18]);
            flap2Pos.add(tabulatedRows[19]);
            stepPos.add(tabulatedRows[20]);
            extractionPos.add(tabulatedRows[21]);
            balance.add(tabulatedRows[22]);
            rfFwdW.add(tabulatedRows[23]);
            rfReflectedW.add(tabulatedRows[24]);
            foilN.add(tabulatedRows[25]);
        }
    }

    public void trimArrays(int start, int end) {
        start += -5;
        end += 10; 
        timeColTrim = timeCol.subList(start, end);
        arcIColTrim = arcICol.subList(start, end);
        arcVColTrim = arcVCol.subList(start, end);
        gasFlowColTrim = gasFlowCol.subList(start, end);
        dee1kVTrim = dee1kV.subList(start, end);
        dee2kVTrim = dee2kV.subList(start, end);
        magnetITrim = magnetI.subList(start, end);
        foilITrim = foilI.subList(start, end);
        collLITrim = collLI.subList(start, end);
        targetITrim = targetI.subList(start, end);
        collRITrim = collRI.subList(start, end);
        vacuumPTrim = vacuumP.subList(start, end);
        targetPTrim = targetP.subList(start, end);
        deltaDeekVTrim = deltaDeekV.subList(start, end);
        phaseLoadTrim = phaseLoad.subList(start, end);
        deeRefVTrim = deeRefV.subList(start, end);
        probeITrim = probeI.subList(start, end);
        heCoolPTrim = heCoolP.subList(start, end);
        flap1PosTrim = flap1Pos.subList(start, end);
        flap2PosTrim = flap2Pos.subList(start, end);
        stepPosTrim = stepPos.subList(start, end);
        extractionPosTrim = extractionPos.subList(start, end);
        balanceTrim = balance.subList(start, end);
        rfFwdWTrim = rfFwdW.subList(start, end);
        rfReflectedWTrim = rfReflectedW.subList(start, end);
        foilNTrim = foilN.subList(start, end);
    }
}
