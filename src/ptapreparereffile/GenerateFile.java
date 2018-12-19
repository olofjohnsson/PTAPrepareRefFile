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
    //public static void main(String[] args) throws IOException {
    GenerateFile(String file_import, String file_export, int hr_start, int hr_end)throws IOException{
        int min_start = 00;
        int min_end = 60;
        //String fileName= "C:temp\\2018-11-28\\import.csv";
        
        ArrayProvider ap = new ArrayProvider();
        String[] lines = ap.readLines(file_import);
        int startindex = 0;
        int endindex = 0;
        for (int i = 0;i<lines.length;i++){
            if (lines[i].matches(".*"+hr_start+":00:\\d\\d.*")){
                startindex = i;
                break;
            }
        }
        for (int i = 0;i<lines.length;i++){
            if (lines[i].matches(".*"+hr_end+":00:\\d\\d.*")){
                endindex = i;
                break;
            }
        }
        lines = Arrays.copyOfRange(lines, startindex, endindex);
        //Declare variables
        //Modify2
        ArrayList<String> _221b = new ArrayList();
        ArrayList<String> _221b_values = new ArrayList();
        ArrayList<String> _221b_values_extended = new ArrayList();
        ArrayList<String> _221b_time = new ArrayList();
        ArrayList<String> _221b_roundedtime = new ArrayList();
        
        ArrayList<String> _221c = new ArrayList();
        ArrayList<String> _221c_values = new ArrayList();
        ArrayList<String> _221c_values_extended = new ArrayList();
        ArrayList<String> _221c_time = new ArrayList();
        ArrayList<String> _221c_roundedtime = new ArrayList();
        
        ArrayList<String> _221d = new ArrayList();
        ArrayList<String> _221d_values = new ArrayList();
        ArrayList<String> _221d_values_extended = new ArrayList();
        ArrayList<String> _221d_time = new ArrayList();
        ArrayList<String> _221d_roundedtime = new ArrayList();
        
        ArrayList<String> _221f = new ArrayList();
        ArrayList<String> _221f_values = new ArrayList();
        ArrayList<String> _221f_values_extended = new ArrayList();
        ArrayList<String> _221f_time = new ArrayList();
        ArrayList<String> _221f_roundedtime = new ArrayList();
        
        ArrayList<String> _227 = new ArrayList();
        ArrayList<String> _227_values = new ArrayList();
        ArrayList<String> _227_values_extended = new ArrayList();
        ArrayList<String> _227_time = new ArrayList();
        ArrayList<String> _227_roundedtime = new ArrayList();
        
        ArrayList<String> _233 = new ArrayList();
        ArrayList<String> _233_values = new ArrayList();
        ArrayList<String> _233_values_extended = new ArrayList();
        ArrayList<String> _233_time = new ArrayList();
        ArrayList<String> _233_roundedtime = new ArrayList();
        
        ArrayList<String> _236a = new ArrayList();
        ArrayList<String> _236a_values = new ArrayList();
        ArrayList<String> _236a_values_extended = new ArrayList();
        ArrayList<String> _236a_time = new ArrayList();
        ArrayList<String> _236a_roundedtime = new ArrayList();
        
        ArrayList<String> _238c = new ArrayList();
        ArrayList<String> _238c_values = new ArrayList();
        ArrayList<String> _238c_values_extended = new ArrayList();
        ArrayList<String> _238c_time = new ArrayList();
        ArrayList<String> _238c_roundedtime = new ArrayList();
        
        ArrayList<String> _239_left = new ArrayList();
        ArrayList<String> _239_left_values = new ArrayList();
        ArrayList<String> _239_left_values_extended = new ArrayList();
        ArrayList<String> _239_left_time = new ArrayList();
        ArrayList<String> _239_left_roundedtime = new ArrayList();
        
        ArrayList<String> _239_right = new ArrayList();
        ArrayList<String> _239_right_values = new ArrayList(); 
        ArrayList<String> _239_right_values_extended = new ArrayList(); 
        ArrayList<String> _239_right_time = new ArrayList(); 
        ArrayList<String> _239_right_roundedtime = new ArrayList(); 
        
        ArrayList<String> _240c = new ArrayList();
        ArrayList<String> _240c_values = new ArrayList();
        ArrayList<String> _240c_values_extended = new ArrayList();
        ArrayList<String> _240c_time = new ArrayList();
        ArrayList<String> _240c_roundedtime = new ArrayList();
        
        ArrayList<String> _241a_teknik = new ArrayList();
        ArrayList<String> _241a_teknik_values = new ArrayList();
        ArrayList<String> _241a_teknik_values_extended = new ArrayList();
        ArrayList<String> _241a_teknik_time = new ArrayList();
        ArrayList<String> _241a_teknik_roundedtime = new ArrayList();
        
        ArrayList<String> _241b_technik = new ArrayList();
        ArrayList<String> _241b_technik_values = new ArrayList();
        ArrayList<String> _241b_technik_values_extended = new ArrayList();
        ArrayList<String> _241b_technik_time = new ArrayList();
        ArrayList<String> _241b_technik_roundedtime = new ArrayList();
        
        ArrayList<String> _241c_vent_ut = new ArrayList();
        ArrayList<String> _241c_vent_ut_values = new ArrayList();
        ArrayList<String> _241c_vent_ut_values_extended = new ArrayList();
        ArrayList<String> _241c_vent_ut_time = new ArrayList();
        ArrayList<String> _241c_vent_ut_roundedtime = new ArrayList();
        
        ArrayList<String> _242 = new ArrayList();
        ArrayList<String> _242_values = new ArrayList();
        ArrayList<String> _242_values_extended = new ArrayList();
        ArrayList<String> _242_time = new ArrayList();
        ArrayList<String> _242_roundedtime = new ArrayList();
        
        ArrayList<String> _256b = new ArrayList();
        ArrayList<String> _256b_values = new ArrayList();
        ArrayList<String> _256b_values_extended = new ArrayList();
        ArrayList<String> _256b_time = new ArrayList();
        ArrayList<String> _256b_roundedtime = new ArrayList();
        
        ArrayList<String> _256c = new ArrayList();
        ArrayList<String> _256c_values = new ArrayList();
        ArrayList<String> _256c_values_extended = new ArrayList();
        ArrayList<String> _256c_time = new ArrayList();
        ArrayList<String> _256c_roundedtime = new ArrayList();
        
        ArrayList<String> _256d = new ArrayList();
        ArrayList<String> _256d_values = new ArrayList();
        ArrayList<String> _256d_values_extended = new ArrayList();
        ArrayList<String> _256d_time = new ArrayList();
        ArrayList<String> _256d_roundedtime = new ArrayList();
        
        ArrayList<String> _257a = new ArrayList();
        ArrayList<String> _257a_values = new ArrayList();
        ArrayList<String> _257a_values_extended = new ArrayList();
        ArrayList<String> _257a_time = new ArrayList();
        ArrayList<String> _257a_roundedtime = new ArrayList();
        
        ArrayList<String> _257b = new ArrayList();
        ArrayList<String> _257b_values = new ArrayList();
        ArrayList<String> _257b_values_extended = new ArrayList();
        ArrayList<String> _257b_time = new ArrayList();
        ArrayList<String> _257b_roundedtime = new ArrayList();
        
        ArrayList<String> _01_226_floor = new ArrayList();
        ArrayList<String> _01_226_floor_values = new ArrayList();
        ArrayList<String> _01_226_floor_values_extended = new ArrayList();
        ArrayList<String> _01_226_floor_time = new ArrayList();
        ArrayList<String> _01_226_floor_roundedtime = new ArrayList();
        
        ArrayList<String> MIP1int = new ArrayList();
        ArrayList<String> MIP1int_values = new ArrayList();
        ArrayList<String> MIP1int_values_extended = new ArrayList();
        ArrayList<String> MIP1int_time = new ArrayList();
        ArrayList<String> MIP1int_roundedtime = new ArrayList();
        
        ArrayList<String> MIP1ext = new ArrayList();
        ArrayList<String> MIP1ext_values = new ArrayList();
        ArrayList<String> MIP1ext_values_extended = new ArrayList();
        ArrayList<String> MIP1ext_time = new ArrayList();
        ArrayList<String> MIP1ext_roundedtime = new ArrayList();
        
        ArrayList<String> MIP2int = new ArrayList();
        ArrayList<String> MIP2int_values = new ArrayList();
        ArrayList<String> MIP2int_values_extended = new ArrayList();
        ArrayList<String> MIP2int_time = new ArrayList();
        ArrayList<String> MIP2int_roundedtime = new ArrayList();
        
        ArrayList<String> MIP2ext = new ArrayList();
        ArrayList<String> MIP2ext_values = new ArrayList();
        ArrayList<String> MIP2ext_values_extended = new ArrayList();
        ArrayList<String> MIP2ext_time = new ArrayList();
        ArrayList<String> MIP2ext_roundedtime = new ArrayList();
        
        ArrayList<String> MIP3int = new ArrayList();
        ArrayList<String> MIP3int_values = new ArrayList();
        ArrayList<String> MIP3int_values_extended = new ArrayList();
        ArrayList<String> MIP3int_time = new ArrayList();
        ArrayList<String> MIP3int_roundedtime = new ArrayList();
        
        ArrayList<String> MIP3ext = new ArrayList();
        ArrayList<String> MIP3ext_values = new ArrayList();
        ArrayList<String> MIP3ext_values_extended = new ArrayList();
        ArrayList<String> MIP3ext_time = new ArrayList();
        ArrayList<String> MIP3ext_roundedtime = new ArrayList();
        
        ArrayList<String> Talia = new ArrayList();
        ArrayList<String> Talia_values = new ArrayList();
        ArrayList<String> Talia_values_extended = new ArrayList();
        ArrayList<String> Talia_time = new ArrayList();
        ArrayList<String> Talia_roundedtime = new ArrayList();
        
        ArrayList<String> BBS2_Upper = new ArrayList();
        ArrayList<String> BBS2_Upper_values = new ArrayList();
        ArrayList<String> BBS2_Upper_values_extended = new ArrayList();
        ArrayList<String> BBS2_Upper_time = new ArrayList();
        ArrayList<String> BBS2_Upper_roundedtime = new ArrayList();
        
        ArrayList<String> BBS2_down = new ArrayList();
        ArrayList<String> BBS2_down_values = new ArrayList();
        ArrayList<String> BBS2_down_values_extended = new ArrayList();
        ArrayList<String> BBS2_down_time = new ArrayList();
        ArrayList<String> BBS2_down_roundedtime = new ArrayList();
        
        ArrayList<String> BBS1_Geigerbox = new ArrayList();
        ArrayList<String> BBS1_Geigerbox_values = new ArrayList();
        ArrayList<String> BBS1_Geigerbox_values_extended = new ArrayList();
        ArrayList<String> BBS1_Geigerbox_time = new ArrayList();
        ArrayList<String> BBS1_Geigerbox_roundedtime = new ArrayList();
        
        ArrayList<String> Manuela_Geiger = new ArrayList();
        ArrayList<String> Manuela_Geiger_values = new ArrayList();
        ArrayList<String> Manuela_Geiger_values_extended = new ArrayList();
        ArrayList<String> Manuela_Geiger_time = new ArrayList();
        ArrayList<String> Manuela_Geiger_roundedtime = new ArrayList();
        
        ArrayList<String> stack_monitor = new ArrayList();
        ArrayList<String> stack_monitor_values = new ArrayList();
        ArrayList<String> stack_monitor_values_extended = new ArrayList();
        ArrayList<String> stack_monitor_time = new ArrayList();
        ArrayList<String> stack_monitor_roundedtime = new ArrayList();
        
        ArrayList<String> stack_monitor_flow = new ArrayList();
        ArrayList<String> stack_monitor_flow_values = new ArrayList();
        ArrayList<String> stack_monitor_flow_values_extended = new ArrayList();
        ArrayList<String> stack_monitor_flow_time = new ArrayList();
        ArrayList<String> stack_monitor_flow_roundedtime = new ArrayList();
        
        ArrayList<String> Hi_stack = new ArrayList();
        ArrayList<String> Hi_stack_values = new ArrayList();
        ArrayList<String> Hi_stack_values_extended = new ArrayList();
        ArrayList<String> Hi_stack_time = new ArrayList();
        ArrayList<String> Hi_stack_roundedtime = new ArrayList();
        
        ArrayList<String> Cyclotron = new ArrayList();
        ArrayList<String> Cyclotron_values = new ArrayList();
        ArrayList<String> Cyclotron_values_extended = new ArrayList();
        ArrayList<String> Cyclotron_time = new ArrayList();
        ArrayList<String> Cyclotron_roundedtime = new ArrayList();
        
        ArrayList<String> Neutron_Probe = new ArrayList();
        ArrayList<String> Neutron_Probe_values = new ArrayList();
        ArrayList<String> Neutron_Probe_values_extended = new ArrayList();
        ArrayList<String> Neutron_Probe_time = new ArrayList();
        ArrayList<String> Neutron_Probe_roundedtime = new ArrayList();
        
        ArrayList<String> common_time = new ArrayList();
        ArrayList<String> common_roundedtime = new ArrayList();
        ArrayList<String> common = new ArrayList();
        
        DecimalFormat df = new DecimalFormat("00");
        
        //Modify3
        String[] _221b_split = null;
        String[] _221c_split = null;
        String[] _221d_split = null;
        String[] _221f_split = null;
        String[] _227_split = null;
        String[] _233_split = null;
        String[] _236a_split = null;
        String[] _238c_split = null;
        String[] _239_left_split = null;
        String[] _239_right_split = null;
        String[] _240c_split = null;
        String[] _241a_teknik_split = null;
        String[] _241b_technik_split = null;
        String[] _241c_vent_ut_split = null;
        String[] _242_split = null;
        String[] _256b_split = null;
        String[] _256c_split = null;
        String[] _256d_split = null;
        String[] _257a_split = null;
        String[] _257b_split = null;
        String[] _01_226_floor_split = null;
        String[] MIP1int_split = null;
        String[] MIP1ext_split = null;
        String[] MIP2int_split = null;
        String[] MIP2ext_split = null;
        String[] MIP3int_split = null;
        String[] MIP3ext_split = null;
        String[] Talia_split = null;
        String[] BBS2_Upper_split = null;
        String[] BBS2_down_split = null;
        String[] BBS1_Geigerbox_split = null;
        String[] Manuela_Geiger_split = null;
        String[] stack_monitor_split = null;
        String[] stack_monitor_flow_split = null;
        String[] Hi_stack_split = null;
        String[] Cyclotron_split = null;
        String[] Neutron_Probe_split = null;

        
        //Modify4
        //Sort data ny ID e.g "MIP 2 ext." etc.
        for (String line : lines){
            if (line.contains("99.221b")){
                _221b.add(line);
            }
            if (line.contains("99.221c")){
                _221c.add(line);
            }
            if (line.contains("99.221d")){
                _221d.add(line);
            }
            if (line.contains("99.221f")){
                _221f.add(line);
            }
            if (line.contains("99.227")){
                _227.add(line);
            }
            if (line.contains("99.233")){
                _233.add(line);
            }
            if (line.contains("99.236a")){
                _236a.add(line);
            }
            if (line.contains("99.238c")){
                _238c.add(line);
            }
            if (line.contains("99.239 left")){
                _239_left.add(line);
            }
            if (line.contains("99.239 right")){
                _239_right.add(line);
            }
            if (line.contains("99.240c")){
                _240c.add(line);
            }
            if (line.contains("99.241a teknik")){
                _241a_teknik.add(line);
            }
            if (line.contains("99.241b technik")){
                _241b_technik.add(line);
            }
            if (line.contains("99.241c vent ut")){
                _241c_vent_ut.add(line);
            }
            if (line.contains("99.242")){
                _242.add(line);
            }
            if (line.contains("99.256b")){
                _256b.add(line);
            }
            if (line.contains("99.256c")){
                _256c.add(line);
            }
            if (line.contains("99.256d")){
                _256d.add(line);
            }
            if (line.contains("99.257a")){
                _257a.add(line);
            }
            if (line.contains("99.257b")){
                _257b.add(line);
            }
            if (line.contains("01.226 floor")){
                _01_226_floor.add(line);
            }
            if (line.contains("MIP 1 int.")){
                MIP1int.add(line);
            }
            if (line.contains("MIP 1 ext.")){
                MIP1ext.add(line);
            }
            if (line.contains("MIP 2 int.")){
                MIP2int.add(line);
            }
            if (line.contains("MIP 2 ext.")){
                MIP2ext.add(line);
            }
            if (line.contains("MIP 3 int.")){
                MIP3int.add(line);
            }
            if (line.contains("MIP 3 ext.")){
                MIP3ext.add(line);
            }
            if (line.contains("Talia")){
                Talia.add(line);
            }
            if (line.contains("BBS 2 Upper")){
                BBS2_Upper.add(line);
            }
            if (line.contains("BBS 2 down")){
                BBS2_down.add(line);
            }
            if (line.contains("BBS 1 Geigerbox")){
                BBS1_Geigerbox.add(line);
            }
            if (line.contains("Manuela Geiger")){
                Manuela_Geiger.add(line);
            }
            if (line.contains("stack monitor") && line.contains("Activity concentration")){
                stack_monitor.add(line);
            }
            if (line.contains("stack monitor") && line.contains("Volume flow rate")){
                stack_monitor_flow.add(line);
            }
            if (line.contains("Hi stack")){
                Hi_stack.add(line);
            }
            if (line.contains("Cyclotron")){
                Cyclotron.add(line);
            }
            if (line.contains("Neutron Probe")){
                Neutron_Probe.add(line);
            }
        }
        
        //Modify5
        //Store time stamps and doserate in seperat variables
        for (int i=0;i<_221b.size();i++){
            _221b_split = _221b.get(i).split(",");
            _221b_values.add(_221b_split[3]);
            _221b_time.add(_221b_split[1]);
        }
        for (int i=0;i<_221c.size();i++){
            _221c_split = _221c.get(i).split(",");
            _221c_values.add(_221c_split[3]);
            _221c_time.add(_221c_split[1]);
        }
        for (int i=0;i<_221d.size();i++){
            _221d_split = _221d.get(i).split(",");
            _221d_values.add(_221d_split[3]);
            _221d_time.add(_221d_split[1]);
        }
        for (int i=0;i<_221f.size();i++){
            _221f_split = _221f.get(i).split(",");
            _221f_values.add(_221f_split[3]);
            _221f_time.add(_221f_split[1]);
        }
        for (int i=0;i<_227.size();i++){
            _227_split = _227.get(i).split(",");
            _227_values.add(_227_split[3]);
            _227_time.add(_227_split[1]);
        }
        for (int i=0;i<_233.size();i++){
            _233_split = _233.get(i).split(",");
            _233_values.add(_233_split[3]);
            _233_time.add(_233_split[1]);
        }
        for (int i=0;i<_236a.size();i++){
            _236a_split = _236a.get(i).split(",");
            _236a_values.add(_236a_split[3]);
            _236a_time.add(_236a_split[1]);
        }
        for (int i=0;i<_238c.size();i++){
            _238c_split = _238c.get(i).split(",");
            _238c_values.add(_238c_split[3]);
            _238c_time.add(_238c_split[1]);
        }
        for (int i=0;i<_239_left.size();i++){
            _239_left_split = _239_left.get(i).split(",");
            _239_left_values.add(_239_left_split[3]);
            _239_left_time.add(_239_left_split[1]);
        }
        for (int i=0;i<_239_right.size();i++){
            _239_right_split = _239_right.get(i).split(",");
            _239_right_values.add(_239_right_split[3]);
            _239_right_time.add(_239_right_split[1]);
        }
        for (int i=0;i<_240c.size();i++){
            _240c_split = _240c.get(i).split(",");
            _240c_values.add(_240c_split[3]);
            _240c_time.add(_240c_split[1]);
        }
        for (int i=0;i<_241a_teknik.size();i++){
            _241a_teknik_split = _241a_teknik.get(i).split(",");
            _241a_teknik_values.add(_241a_teknik_split[3]);
            _241a_teknik_time.add(_241a_teknik_split[1]);
        }
        for (int i=0;i<_241b_technik.size();i++){
            _241b_technik_split = _241b_technik.get(i).split(",");
            _241b_technik_values.add(_241b_technik_split[3]);
            _241b_technik_time.add(_241b_technik_split[1]);
        }
        for (int i=0;i<_241c_vent_ut.size();i++){
            _241c_vent_ut_split = _241c_vent_ut.get(i).split(",");
            _241c_vent_ut_values.add(_241c_vent_ut_split[3]);
            _241c_vent_ut_time.add(_241c_vent_ut_split[1]);
        }
        for (int i=0;i<_242.size();i++){
            _242_split = _242.get(i).split(",");
            _242_values.add(_242_split[3]);
            _242_time.add(_242_split[1]);
        }
        for (int i=0;i<_256b.size();i++){
            _256b_split = _256b.get(i).split(",");
            _256b_values.add(_256b_split[3]);
            _256b_time.add(_256b_split[1]);
        }
        for (int i=0;i<_256c.size();i++){
            _256c_split = _256c.get(i).split(",");
            _256c_values.add(_256c_split[3]);
            _256c_time.add(_256c_split[1]);
        }
        for (int i=0;i<_256d.size();i++){
            _256d_split = _256d.get(i).split(",");
            _256d_values.add(_256d_split[3]);
            _256d_time.add(_256d_split[1]);
        }
        for (int i=0;i<_257a.size();i++){
            _257a_split = _257a.get(i).split(",");
            _257a_values.add(_257a_split[3]);
            _257a_time.add(_257a_split[1]);
        }
        for (int i=0;i<_257b.size();i++){
            _257b_split = _257b.get(i).split(",");
            _257b_values.add(_257b_split[3]);
            _257b_time.add(_257b_split[1]);
        }
        for (int i=0;i<_01_226_floor.size();i++){
            _01_226_floor_split = _01_226_floor.get(i).split(",");
            _01_226_floor_values.add(_01_226_floor_split[3]);
            _01_226_floor_time.add(_01_226_floor_split[1]);
        }
        for (int i=0;i<MIP1int.size();i++){
            MIP1int_split = MIP1int.get(i).split(",");
            MIP1int_values.add(MIP1int_split[3]);
            MIP1int_time.add(MIP1int_split[1]);
        }
        for (int i=0;i<MIP1ext.size();i++){
            MIP1ext_split = MIP1ext.get(i).split(",");
            MIP1ext_values.add(MIP1ext_split[3]);
            MIP1ext_time.add(MIP1ext_split[1]);
        }
        for (int i=0;i<MIP2int.size();i++){
            MIP2int_split = MIP2int.get(i).split(",");
            MIP2int_values.add(MIP2int_split[3]);
            MIP2int_time.add(MIP2int_split[1]);
        }
        for (int i=0;i<MIP2ext.size();i++){
            MIP2ext_split = MIP2ext.get(i).split(",");
            MIP2ext_values.add(MIP2ext_split[3]);
            MIP2ext_time.add(MIP2ext_split[1]);
        }
        for (int i=0;i<MIP3int.size();i++){
            MIP3int_split = MIP3int.get(i).split(",");
            MIP3int_values.add(MIP3int_split[3]);
            MIP3int_time.add(MIP3int_split[1]);
        }
        for (int i=0;i<MIP3ext.size();i++){
            MIP3ext_split = MIP3ext.get(i).split(",");
            MIP3ext_values.add(MIP3ext_split[3]);
            MIP3ext_time.add(MIP3ext_split[1]);
        }
        for (int i=0;i<Talia.size();i++){
            Talia_split = Talia.get(i).split(",");
            Talia_values.add(Talia_split[3]);
            Talia_time.add(Talia_split[1]);
        }
        for (int i=0;i<BBS2_Upper.size();i++){
            BBS2_Upper_split = BBS2_Upper.get(i).split(",");
            BBS2_Upper_values.add(BBS2_Upper_split[3]);
            BBS2_Upper_time.add(BBS2_Upper_split[1]);
        }
        for (int i=0;i<BBS2_down.size();i++){
            BBS2_down_split = BBS2_down.get(i).split(",");
            BBS2_down_values.add(BBS2_down_split[3]);
            BBS2_down_time.add(BBS2_down_split[1]);
        }
        for (int i=0;i<BBS1_Geigerbox.size();i++){
            BBS1_Geigerbox_split = BBS1_Geigerbox.get(i).split(",");
            BBS1_Geigerbox_values.add(BBS1_Geigerbox_split[3]);
            BBS1_Geigerbox_time.add(BBS1_Geigerbox_split[1]);
        }
        for (int i=0;i<Manuela_Geiger.size();i++){
            Manuela_Geiger_split = Manuela_Geiger.get(i).split(",");
            Manuela_Geiger_values.add(Manuela_Geiger_split[3]);
            Manuela_Geiger_time.add(Manuela_Geiger_split[1]);
        }
        for (int i=0;i<stack_monitor.size();i++){
            stack_monitor_split = stack_monitor.get(i).split(",");
            stack_monitor_values.add(stack_monitor_split[3]);
            stack_monitor_time.add(stack_monitor_split[1]);
        }
        for (int i=0;i<stack_monitor_flow.size();i++){
            stack_monitor_flow_split = stack_monitor_flow.get(i).split(",");
            stack_monitor_flow_values.add(stack_monitor_flow_split[3]);
            stack_monitor_flow_time.add(stack_monitor_flow_split[1]);
        }
        for (int i=0;i<Hi_stack.size();i++){
            Hi_stack_split = Hi_stack.get(i).split(",");
            Hi_stack_values.add(Hi_stack_split[3]);
            Hi_stack_time.add(Hi_stack_split[1]);
        }
        for (int i=0;i<Cyclotron.size();i++){
            Cyclotron_split = Cyclotron.get(i).split(",");
            Cyclotron_values.add(Cyclotron_split[3]);
            Cyclotron_time.add(Cyclotron_split[1]);
        }
        for (int i=0;i<Neutron_Probe.size();i++){
            Neutron_Probe_split = Neutron_Probe.get(i).split(",");
            Neutron_Probe_values.add(Neutron_Probe_split[3]);
            Neutron_Probe_time.add(Neutron_Probe_split[1]);
        }
               
        //Create common time axes
        String com_time_str;
        
        for (int hr=hr_start;hr<hr_end;hr++){
            for(int min=min_start;min<min_end;min++){
                for(int sec=0;sec<60;sec++){
                    com_time_str = df.format(hr)+":"+df.format(min)+":"+df.format(sec);
                    common_time.add(com_time_str);
                }
            }
        }
        
        //Modify6
        //Store only time, not date and round to nearest second (get rid of milliseconds))
        String time;
        for (int i=0;i<common_time.size();i++){
            time = common_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            common_roundedtime.add(i,time);
        }
        for (int i=0;i<_221b_time.size();i++){
            time = _221b_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _221b_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_221c_time.size();i++){
            time = _221c_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _221c_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_221d_time.size();i++){
            time = _221d_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _221d_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_221f_time.size();i++){
            time = _221f_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _221f_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_227_time.size();i++){
            time = _227_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _227_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_233_time.size();i++){
            time = _233_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _233_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_236a_time.size();i++){
            time = _236a_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _236a_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_238c_time.size();i++){
            time = _238c_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _238c_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_239_left_time.size();i++){
            time = _239_left_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _239_left_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_239_right_time.size();i++){
            time = _239_right_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _239_right_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_240c_time.size();i++){
            time = _240c_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _240c_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_241a_teknik_time.size();i++){
            time = _241a_teknik_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _241a_teknik_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_241b_technik_time.size();i++){
            time = _241b_technik_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _241b_technik_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_241c_vent_ut_time.size();i++){
            time = _241c_vent_ut_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _241c_vent_ut_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_242_time.size();i++){
            time = _242_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _242_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_256b_time.size();i++){
            time = _256b_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _256b_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_256c_time.size();i++){
            time = _256c_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _256c_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_256d_time.size();i++){
            time = _256d_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _256d_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_257a_time.size();i++){
            time = _257a_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _257a_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_257b_time.size();i++){
            time = _257b_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _257b_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<_01_226_floor_time.size();i++){
            time = _01_226_floor_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            _01_226_floor_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<MIP1int_time.size();i++){
            time = MIP1int_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            MIP1int_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<MIP1ext_time.size();i++){
            time = MIP1ext_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            MIP1ext_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<MIP2int_time.size();i++){
            time = MIP2int_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            MIP2int_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<MIP2ext_time.size();i++){
            time = MIP2ext_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            MIP2ext_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<MIP3int_time.size();i++){
            time = MIP3int_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            MIP3int_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<MIP3ext_time.size();i++){
            time = MIP3ext_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            MIP3ext_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<Talia_time.size();i++){
            time = Talia_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            Talia_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<BBS2_Upper_time.size();i++){
            time = BBS2_Upper_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            BBS2_Upper_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<BBS2_down_time.size();i++){
            time = BBS2_down_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            BBS2_down_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<BBS1_Geigerbox_time.size();i++){
            time = BBS1_Geigerbox_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            BBS1_Geigerbox_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<Manuela_Geiger_time.size();i++){
            time = Manuela_Geiger_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            Manuela_Geiger_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<stack_monitor_time.size();i++){
            time = stack_monitor_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            stack_monitor_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<stack_monitor_flow_time.size();i++){
            time = stack_monitor_flow_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            stack_monitor_flow_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<Hi_stack_time.size();i++){
            time = Hi_stack_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            Hi_stack_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<Cyclotron_time.size();i++){
            time = Cyclotron_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            Cyclotron_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        }
        for (int i=0;i<Neutron_Probe_time.size();i++){
            time = Neutron_Probe_time.get(i);
            time = time.replaceAll("\\d\\d\\d\\d-\\d\\d-\\d\\d\\s","");
            String[] time_arr = time.split(":");
            double time_double = Double.parseDouble(time_arr[2]);
            time_arr[2] = df.format(round(time_double));
            Neutron_Probe_roundedtime.add(i,time_arr[0]+":"+time_arr[1]+":"+time_arr[2]);
        } 
        //Modify7
        //Convert time lists to Date format (in case comparison is needed)
        ArrayList<Date> common_dateTime = new ArrayList<Date>();
        ArrayList<Date> _221b_dateTime = new ArrayList<Date>();
        ArrayList<Date> _221c_dateTime = new ArrayList<Date>();
        ArrayList<Date> _221d_dateTime = new ArrayList<Date>();
        ArrayList<Date> _221f_dateTime = new ArrayList<Date>();
        ArrayList<Date> _227_dateTime = new ArrayList<Date>();
        ArrayList<Date> _233_dateTime = new ArrayList<Date>();
        ArrayList<Date> _236a_dateTime = new ArrayList<Date>();
        ArrayList<Date> _238c_dateTime = new ArrayList<Date>();
        ArrayList<Date> _239_left_dateTime = new ArrayList<Date>();
        ArrayList<Date> _239_right_dateTime = new ArrayList<Date>();
        ArrayList<Date> _240c_dateTime = new ArrayList<Date>();
        ArrayList<Date> _241a_teknik_dateTime = new ArrayList<Date>();
        ArrayList<Date> _241b_technik_dateTime = new ArrayList<Date>();
        ArrayList<Date> _241c_vent_ut_dateTime = new ArrayList<Date>();
        ArrayList<Date> _242_dateTime = new ArrayList<Date>();
        ArrayList<Date> _256b_dateTime = new ArrayList<Date>();
        ArrayList<Date> _256c_dateTime = new ArrayList<Date>();
        ArrayList<Date> _256d_dateTime = new ArrayList<Date>();
        ArrayList<Date> _257a_dateTime = new ArrayList<Date>();
        ArrayList<Date> _257b_dateTime = new ArrayList<Date>();
        ArrayList<Date> _01_226_floor_dateTime = new ArrayList<Date>();
        ArrayList<Date> MIP1int_dateTime = new ArrayList<Date>();
        ArrayList<Date> MIP1ext_dateTime = new ArrayList<Date>();
        ArrayList<Date> MIP2int_dateTime = new ArrayList<Date>();
        ArrayList<Date> MIP2ext_dateTime = new ArrayList<Date>();
        ArrayList<Date> MIP3int_dateTime = new ArrayList<Date>();
        ArrayList<Date> MIP3ext_dateTime = new ArrayList<Date>();
        ArrayList<Date> Talia_dateTime = new ArrayList<Date>();
        ArrayList<Date> BBS2_Upper_dateTime = new ArrayList<Date>();
        ArrayList<Date> BBS2_down_dateTime = new ArrayList<Date>();
        ArrayList<Date> BBS1_Geigerbox_dateTime = new ArrayList<Date>();
        ArrayList<Date> Manuela_Geiger_dateTime = new ArrayList<Date>();
        ArrayList<Date> stack_monitor_dateTime = new ArrayList<Date>();
        ArrayList<Date> stack_monitor_flow_dateTime = new ArrayList<Date>();
        ArrayList<Date> Hi_stack_dateTime = new ArrayList<Date>();
        ArrayList<Date> Cyclotron_dateTime = new ArrayList<Date>();
        ArrayList<Date> Neutron_Probe_dateTime = new ArrayList<Date>();

        //Modify8
        //Set date format to only time
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        for (String dateString : common_roundedtime) {
            try {
                common_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _221b_roundedtime) {
            try {
                _221b_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _221c_roundedtime) {
            try {
                _221c_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _221d_roundedtime) {
            try {
                _221d_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _221f_roundedtime) {
            try {
                _221f_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _227_roundedtime) {
            try {
                _227_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _233_roundedtime) {
            try {
                _233_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _236a_roundedtime) {
            try {
                _236a_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _238c_roundedtime) {
            try {
                _238c_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _239_left_roundedtime) {
            try {
                _239_left_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _239_right_roundedtime) {
            try {
                _239_right_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : _240c_roundedtime) {
            try {
                _240c_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _241a_teknik_roundedtime) {
            try {
                _241a_teknik_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _241b_technik_roundedtime) {
            try {
                _241b_technik_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _241c_vent_ut_roundedtime) {
            try {
                _241c_vent_ut_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _242_roundedtime) {
            try {
                _242_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _256b_roundedtime) {
            try {
                _256b_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _256c_roundedtime) {
            try {
                _256c_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _256d_roundedtime) {
            try {
                _256d_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _257a_roundedtime) {
            try {
                _257a_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _257b_roundedtime) {
            try {
                _257b_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : _01_226_floor_roundedtime) {
            try {
                _01_226_floor_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : MIP1int_roundedtime) {
            try {
                MIP1int_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : MIP1ext_roundedtime) {
            try {
                MIP1ext_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : MIP2int_roundedtime) {
            try {
                MIP2int_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : MIP2ext_roundedtime) {
            try {
                MIP2ext_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : MIP3int_roundedtime) {
            try {
                MIP3int_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : MIP3ext_roundedtime) {
            try {
                MIP3ext_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : Talia_roundedtime) {
            try {
                Talia_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : BBS2_Upper_roundedtime) {
            try {
                BBS2_Upper_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : BBS2_down_roundedtime) {
            try {
                BBS2_down_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : BBS1_Geigerbox_roundedtime) {
            try {
                BBS1_Geigerbox_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : Manuela_Geiger_roundedtime) {
            try {
                Manuela_Geiger_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : stack_monitor_roundedtime) {
            try {
                stack_monitor_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for (String dateString : stack_monitor_flow_roundedtime) {
            try {
                stack_monitor_flow_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : Hi_stack_roundedtime) {
            try {
                Hi_stack_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : Cyclotron_roundedtime) {
            try {
                Cyclotron_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
	for (String dateString : Neutron_Probe_roundedtime) {
            try {
                Neutron_Probe_dateTime.add(simpleDateFormat.parse(dateString));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        //Loop through varible time axes and create index array where
        //each index correspnds to a matcing time stamp in the common time list
        int current = 0;
        
        for(int i=0;i<_221b_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_221b_dateTime.get(i).equals(common_dateTime.get(j))){
                    _221b_values_extended.add(j,_221b_values.get(i));
                    current = j+1;
                    if(!(i==_221b_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_221b_dateTime.size()-1){
                        _221b_values_extended.add(j,_221b_values.get(i));
                        current = j+1;
                    }else{
                        _221b_values_extended.add(j,_221b_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
        current = 0;
        for(int i=0;i<_221c_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_221c_dateTime.get(i).equals(common_dateTime.get(j))){
                    _221c_values_extended.add(j,_221c_values.get(i));
                    current = j+1;
                    if(!(i==_221c_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_221c_dateTime.size()-1){
                        _221c_values_extended.add(j,_221c_values.get(i));
                        current = j+1;
                    }else{
                        _221c_values_extended.add(j,_221c_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_221d_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_221d_dateTime.get(i).equals(common_dateTime.get(j))){
                    _221d_values_extended.add(j,_221d_values.get(i));
                    current = j+1;
                    if(!(i==_221d_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_221d_dateTime.size()-1){
                        _221d_values_extended.add(j,_221d_values.get(i));
                        current = j+1;
                    }else{
                        _221d_values_extended.add(j,_221d_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_221f_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_221f_dateTime.get(i).equals(common_dateTime.get(j))){
                    _221f_values_extended.add(j,_221f_values.get(i));
                    current = j+1;
                    if(!(i==_221f_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_221f_dateTime.size()-1){
                        _221f_values_extended.add(j,_221f_values.get(i));
                        current = j+1;
                    }else{
                        _221f_values_extended.add(j,_221f_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_227_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_227_dateTime.get(i).equals(common_dateTime.get(j))){
                    _227_values_extended.add(j,_227_values.get(i));
                    current = j+1;
                    if(!(i==_227_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_227_dateTime.size()-1){
                        _227_values_extended.add(j,_227_values.get(i));
                        current = j+1;
                    }else{
                        _227_values_extended.add(j,_227_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_233_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_233_dateTime.get(i).equals(common_dateTime.get(j))){
                    _233_values_extended.add(j,_233_values.get(i));
                    current = j+1;
                    if(!(i==_233_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_233_dateTime.size()-1){
                        _233_values_extended.add(j,_233_values.get(i));
                        current = j+1;
                    }else{
                        _233_values_extended.add(j,_233_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_236a_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_236a_dateTime.get(i).equals(common_dateTime.get(j))){
                    _236a_values_extended.add(j,_236a_values.get(i));
                    current = j+1;
                    if(!(i==_236a_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_236a_dateTime.size()-1){
                        _236a_values_extended.add(j,_236a_values.get(i));
                        current = j+1;
                    }else{
                        _236a_values_extended.add(j,_236a_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_238c_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_238c_dateTime.get(i).equals(common_dateTime.get(j))){
                    _238c_values_extended.add(j,_238c_values.get(i));
                    current = j+1;
                    if(!(i==_238c_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_238c_dateTime.size()-1){
                        _238c_values_extended.add(j,_238c_values.get(i));
                        current = j+1;
                    }else{
                        _238c_values_extended.add(j,_238c_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_239_left_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_239_left_dateTime.get(i).equals(common_dateTime.get(j))){
                    _239_left_values_extended.add(j,_239_left_values.get(i));
                    current = j+1;
                    if(!(i==_239_left_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_239_left_dateTime.size()-1){
                        _239_left_values_extended.add(j,_239_left_values.get(i));
                        current = j+1;
                    }else{
                        _239_left_values_extended.add(j,_239_left_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_239_right_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_239_right_dateTime.get(i).equals(common_dateTime.get(j))){
                    _239_right_values_extended.add(j,_239_right_values.get(i));
                    current = j+1;
                    if(!(i==_239_right_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_239_right_dateTime.size()-1){
                        _239_right_values_extended.add(j,_239_right_values.get(i));
                        current = j+1;
                    }else{
                        _239_right_values_extended.add(j,_239_right_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_240c_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_240c_dateTime.get(i).equals(common_dateTime.get(j))){
                    _240c_values_extended.add(j,_240c_values.get(i));
                    current = j+1;
                    if(!(i==_240c_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_240c_dateTime.size()-1){
                        _240c_values_extended.add(j,_240c_values.get(i));
                        current = j+1;
                    }else{
                        _240c_values_extended.add(j,_240c_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_241a_teknik_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_241a_teknik_dateTime.get(i).equals(common_dateTime.get(j))){
                    _241a_teknik_values_extended.add(j,_241a_teknik_values.get(i));
                    current = j+1;
                    if(!(i==_241a_teknik_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_241a_teknik_dateTime.size()-1){
                        _241a_teknik_values_extended.add(j,_241a_teknik_values.get(i));
                        current = j+1;
                    }else{
                        _241a_teknik_values_extended.add(j,_241a_teknik_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_241b_technik_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_241b_technik_dateTime.get(i).equals(common_dateTime.get(j))){
                    _241b_technik_values_extended.add(j,_241b_technik_values.get(i));
                    current = j+1;
                    if(!(i==_241b_technik_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_241b_technik_dateTime.size()-1){
                        _241b_technik_values_extended.add(j,_241b_technik_values.get(i));
                        current = j+1;
                    }else{
                        _241b_technik_values_extended.add(j,_241b_technik_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_241c_vent_ut_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_241c_vent_ut_dateTime.get(i).equals(common_dateTime.get(j))){
                    _241c_vent_ut_values_extended.add(j,_241c_vent_ut_values.get(i));
                    current = j+1;
                    if(!(i==_241c_vent_ut_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_241c_vent_ut_dateTime.size()-1){
                        _241c_vent_ut_values_extended.add(j,_241c_vent_ut_values.get(i));
                        current = j+1;
                    }else{
                        _241c_vent_ut_values_extended.add(j,_241c_vent_ut_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_242_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_242_dateTime.get(i).equals(common_dateTime.get(j))){
                    _242_values_extended.add(j,_242_values.get(i));
                    current = j+1;
                    if(!(i==_242_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_242_dateTime.size()-1){
                        _242_values_extended.add(j,_242_values.get(i));
                        current = j+1;
                    }else{
                        _242_values_extended.add(j,_242_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_256b_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_256b_dateTime.get(i).equals(common_dateTime.get(j))){
                    _256b_values_extended.add(j,_256b_values.get(i));
                    current = j+1;
                    if(!(i==_256b_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_256b_dateTime.size()-1){
                        _256b_values_extended.add(j,_256b_values.get(i));
                        current = j+1;
                    }else{
                        _256b_values_extended.add(j,_256b_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_256c_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_256c_dateTime.get(i).equals(common_dateTime.get(j))){
                    _256c_values_extended.add(j,_256c_values.get(i));
                    current = j+1;
                    if(!(i==_256c_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_256c_dateTime.size()-1){
                        _256c_values_extended.add(j,_256c_values.get(i));
                        current = j+1;
                    }else{
                        _256c_values_extended.add(j,_256c_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_256d_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_256d_dateTime.get(i).equals(common_dateTime.get(j))){
                    _256d_values_extended.add(j,_256d_values.get(i));
                    current = j+1;
                    if(!(i==_256d_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_256d_dateTime.size()-1){
                        _256d_values_extended.add(j,_256d_values.get(i));
                        current = j+1;
                    }else{
                        _256d_values_extended.add(j,_256d_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_257a_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_257a_dateTime.get(i).equals(common_dateTime.get(j))){
                    _257a_values_extended.add(j,_257a_values.get(i));
                    current = j+1;
                    if(!(i==_257a_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_257a_dateTime.size()-1){
                        _257a_values_extended.add(j,_257a_values.get(i));
                        current = j+1;
                    }else{
                        _257a_values_extended.add(j,_257a_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_257b_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_257b_dateTime.get(i).equals(common_dateTime.get(j))){
                    _257b_values_extended.add(j,_257b_values.get(i));
                    current = j+1;
                    if(!(i==_257b_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_257b_dateTime.size()-1){
                        _257b_values_extended.add(j,_257b_values.get(i));
                        current = j+1;
                    }else{
                        _257b_values_extended.add(j,_257b_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<_01_226_floor_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(_01_226_floor_dateTime.get(i).equals(common_dateTime.get(j))){
                    _01_226_floor_values_extended.add(j,_01_226_floor_values.get(i));
                    current = j+1;
                    if(!(i==_01_226_floor_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==_01_226_floor_dateTime.size()-1){
                        _01_226_floor_values_extended.add(j,_01_226_floor_values.get(i));
                        current = j+1;
                    }else{
                        _01_226_floor_values_extended.add(j,_01_226_floor_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<MIP1int_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(MIP1int_dateTime.get(i).equals(common_dateTime.get(j))){
                    MIP1int_values_extended.add(j,MIP1int_values.get(i));
                    current = j+1;
                    if(!(i==MIP1int_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==MIP1int_dateTime.size()-1){
                        MIP1int_values_extended.add(j,MIP1int_values.get(i));
                        current = j+1;
                    }else{
                        MIP1int_values_extended.add(j,MIP1int_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<MIP1ext_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(MIP1ext_dateTime.get(i).equals(common_dateTime.get(j))){
                    MIP1ext_values_extended.add(j,MIP1ext_values.get(i));
                    current = j+1;
                    if(!(i==MIP1ext_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==MIP1ext_dateTime.size()-1){
                        MIP1ext_values_extended.add(j,MIP1ext_values.get(i));
                        current = j+1;
                    }else{
                        MIP1ext_values_extended.add(j,MIP1ext_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<MIP2int_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(MIP2int_dateTime.get(i).equals(common_dateTime.get(j))){
                    MIP2int_values_extended.add(j,MIP2int_values.get(i));
                    current = j+1;
                    if(!(i==MIP2int_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==MIP2int_dateTime.size()-1){
                        MIP2int_values_extended.add(j,MIP2int_values.get(i));
                        current = j+1;
                    }else{
                        MIP2int_values_extended.add(j,MIP2int_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<MIP2ext_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(MIP2ext_dateTime.get(i).equals(common_dateTime.get(j))){
                    MIP2ext_values_extended.add(j,MIP2ext_values.get(i));
                    current = j+1;
                    if(!(i==MIP2ext_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==MIP2ext_dateTime.size()-1){
                        MIP2ext_values_extended.add(j,MIP2ext_values.get(i));
                        current = j+1;
                    }else{
                        MIP2ext_values_extended.add(j,MIP2ext_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<MIP3int_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(MIP3int_dateTime.get(i).equals(common_dateTime.get(j))){
                    MIP3int_values_extended.add(j,MIP3int_values.get(i));
                    current = j+1;
                    if(!(i==MIP3int_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==MIP3int_dateTime.size()-1){
                        MIP3int_values_extended.add(j,MIP3int_values.get(i));
                        current = j+1;
                    }else{
                        MIP3int_values_extended.add(j,MIP3int_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<MIP3ext_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(MIP3ext_dateTime.get(i).equals(common_dateTime.get(j))){
                    MIP3ext_values_extended.add(j,MIP3ext_values.get(i));
                    current = j+1;
                    if(!(i==MIP3ext_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==MIP3ext_dateTime.size()-1){
                        MIP3ext_values_extended.add(j,MIP3ext_values.get(i));
                        current = j+1;
                    }else{
                        MIP3ext_values_extended.add(j,MIP3ext_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<Talia_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(Talia_dateTime.get(i).equals(common_dateTime.get(j))){
                    Talia_values_extended.add(j,Talia_values.get(i));
                    current = j+1;
                    if(!(i==Talia_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==Talia_dateTime.size()-1){
                        Talia_values_extended.add(j,Talia_values.get(i));
                        current = j+1;
                    }else{
                        Talia_values_extended.add(j,Talia_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<BBS2_Upper_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(BBS2_Upper_dateTime.get(i).equals(common_dateTime.get(j))){
                    BBS2_Upper_values_extended.add(j,BBS2_Upper_values.get(i));
                    current = j+1;
                    if(!(i==BBS2_Upper_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==BBS2_Upper_dateTime.size()-1){
                        BBS2_Upper_values_extended.add(j,BBS2_Upper_values.get(i));
                        current = j+1;
                    }else{
                        BBS2_Upper_values_extended.add(j,BBS2_Upper_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<BBS2_down_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(BBS2_down_dateTime.get(i).equals(common_dateTime.get(j))){
                    BBS2_down_values_extended.add(j,BBS2_down_values.get(i));
                    current = j+1;
                    if(!(i==BBS2_down_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==BBS2_down_dateTime.size()-1){
                        BBS2_down_values_extended.add(j,BBS2_down_values.get(i));
                        current = j+1;
                    }else{
                        BBS2_down_values_extended.add(j,BBS2_down_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<BBS1_Geigerbox_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(BBS1_Geigerbox_dateTime.get(i).equals(common_dateTime.get(j))){
                    BBS1_Geigerbox_values_extended.add(j,BBS1_Geigerbox_values.get(i));
                    current = j+1;
                    if(!(i==BBS1_Geigerbox_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==BBS1_Geigerbox_dateTime.size()-1){
                        BBS1_Geigerbox_values_extended.add(j,BBS1_Geigerbox_values.get(i));
                        current = j+1;
                    }else{
                        BBS1_Geigerbox_values_extended.add(j,BBS1_Geigerbox_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<Manuela_Geiger_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(Manuela_Geiger_dateTime.get(i).equals(common_dateTime.get(j))){
                    Manuela_Geiger_values_extended.add(j,Manuela_Geiger_values.get(i));
                    current = j+1;
                    if(!(i==Manuela_Geiger_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==Manuela_Geiger_dateTime.size()-1){
                        Manuela_Geiger_values_extended.add(j,Manuela_Geiger_values.get(i));
                        current = j+1;
                    }else{
                        Manuela_Geiger_values_extended.add(j,Manuela_Geiger_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<stack_monitor_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(stack_monitor_dateTime.get(i).equals(common_dateTime.get(j))){
                    stack_monitor_values_extended.add(j,stack_monitor_values.get(i));
                    current = j+1;
                    if(!(i==stack_monitor_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==stack_monitor_dateTime.size()-1){
                        stack_monitor_values_extended.add(j,stack_monitor_values.get(i));
                        current = j+1;
                    }else{
                        stack_monitor_values_extended.add(j,stack_monitor_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
        current = 0;
	for(int i=0;i<stack_monitor_flow_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(stack_monitor_flow_dateTime.get(i).equals(common_dateTime.get(j))){
                    stack_monitor_flow_values_extended.add(j,stack_monitor_flow_values.get(i));
                    current = j+1;
                    if(!(i==stack_monitor_flow_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==stack_monitor_flow_dateTime.size()-1){
                        stack_monitor_flow_values_extended.add(j,stack_monitor_flow_values.get(i));
                        current = j+1;
                    }else{
                        stack_monitor_flow_values_extended.add(j,stack_monitor_flow_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<Hi_stack_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(Hi_stack_dateTime.get(i).equals(common_dateTime.get(j))){
                    Hi_stack_values_extended.add(j,Hi_stack_values.get(i));
                    current = j+1;
                    if(!(i==Hi_stack_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==Hi_stack_dateTime.size()-1){
                        Hi_stack_values_extended.add(j,Hi_stack_values.get(i));
                        current = j+1;
                    }else{
                        Hi_stack_values_extended.add(j,Hi_stack_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<Cyclotron_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(Cyclotron_dateTime.get(i).equals(common_dateTime.get(j))){
                    Cyclotron_values_extended.add(j,Cyclotron_values.get(i));
                    current = j+1;
                    if(!(i==Cyclotron_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==Cyclotron_dateTime.size()-1){
                        Cyclotron_values_extended.add(j,Cyclotron_values.get(i));
                        current = j+1;
                    }else{
                        Cyclotron_values_extended.add(j,Cyclotron_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;
	for(int i=0;i<Neutron_Probe_dateTime.size();i++){
            for(int j=current;j<common_dateTime.size();j++){
                if(Neutron_Probe_dateTime.get(i).equals(common_dateTime.get(j))){
                    Neutron_Probe_values_extended.add(j,Neutron_Probe_values.get(i));
                    current = j+1;
                    if(!(i==Neutron_Probe_dateTime.size()-1)){
                        break;
                    }
                }else{
                    if (i == 0){
                        i++;
                    }
                    if(i==Neutron_Probe_dateTime.size()-1){
                        Neutron_Probe_values_extended.add(j,Neutron_Probe_values.get(i));
                        current = j+1;
                    }else{
                        Neutron_Probe_values_extended.add(j,Neutron_Probe_values.get(i-1)); 
                        current = j+1;
                    }
                }
            }
        }
	current = 0;

        //Write arrays to file
        common_roundedtime.add(0,"Time");
        if (_221b_values_extended.size()>0){
            _221b_values_extended.add(0,"99.221b");
        }
	if (_221c_values_extended.size()>0){
            _221c_values_extended.add(0,"99.221c");
        }
	if (_221d_values_extended.size()>0){
            _221d_values_extended.add(0,"99.221d");
        }
	if (_221f_values_extended.size()>0){
            _221f_values_extended.add(0,"99.221f");
        }
	if (_227_values_extended.size()>0){
            _227_values_extended.add(0,"99.227");
        }
	if (_233_values_extended.size()>0){
            _233_values_extended.add(0,"99.233");
        }
	if (_236a_values_extended.size()>0){
            _236a_values_extended.add(0,"99.236a");
        }
	if (_238c_values_extended.size()>0){
            _238c_values_extended.add(0,"99.238c");
        }
	if (_239_left_values_extended.size()>0){
            _239_left_values_extended.add(0,"99.239 left");
        }
	if (_239_right_values_extended.size()>0){
            _239_right_values_extended.add(0,"99.239 right");
        }
	if (_240c_values_extended.size()>0){
            _240c_values_extended.add(0,"99.240c");
        }
	if (_241a_teknik_values_extended.size()>0){
            _241a_teknik_values_extended.add(0,"99.241a teknik");
        }
	if (_241b_technik_values_extended.size()>0){
            _241b_technik_values_extended.add(0,"99.241b technik");
        }
	if (_241c_vent_ut_values_extended.size()>0){
            _241c_vent_ut_values_extended.add(0,"99.241c vent ut");
        }
	if (_242_values_extended.size()>0){
            _242_values_extended.add(0,"99.242");
        }
	if (_256b_values_extended.size()>0){
            _256b_values_extended.add(0,"99.256b");
        }
	if (_256c_values_extended.size()>0){
            _256c_values_extended.add(0,"99.256c");
        }
	if (_256d_values_extended.size()>0){
            _256d_values_extended.add(0,"99.256d");
        }
	if (_257a_values_extended.size()>0){
            _257a_values_extended.add(0,"99.257a");
        }
	if (_257b_values_extended.size()>0){
            _257b_values_extended.add(0,"99.257b");
        }
	if (_01_226_floor_values_extended.size()>0){
            _01_226_floor_values_extended.add(0,"01.226 floor");
        }
	if (MIP1int_values_extended.size()>0){
            MIP1int_values_extended.add(0,"MIP 1 int.");
        }
	if (MIP1ext_values_extended.size()>0){
            MIP1ext_values_extended.add(0,"MIP 1 ext.");
        }
	if (MIP2int_values_extended.size()>0){
            MIP2int_values_extended.add(0,"MIP 2 int.");
        }
	if (MIP2ext_values_extended.size()>0){
            MIP2ext_values_extended.add(0,"MIP 2 ext.");
        }
	if (MIP3int_values_extended.size()>0){
            MIP3int_values_extended.add(0,"MIP 3 int.");
        }
	if (MIP3ext_values_extended.size()>0){
            MIP3ext_values_extended.add(0,"MIP 3 ext.");
        }
	if (Talia_values_extended.size()>0){
            Talia_values_extended.add(0,"Talia");
        }
	if (BBS2_Upper_values_extended.size()>0){
            BBS2_Upper_values_extended.add(0,"BBS2 Upper");
        }
	if (BBS2_down_values_extended.size()>0){
            BBS2_down_values_extended.add(0,"BBS2 down");
        }
	if (BBS1_Geigerbox_values_extended.size()>0){
            BBS1_Geigerbox_values_extended.add(0,"BBS1 Geigerbox");
        }
	if (Manuela_Geiger_values_extended.size()>0){
            Manuela_Geiger_values_extended.add(0,"Manuela Geiger");
        }
	if (stack_monitor_values_extended.size()>0){
            stack_monitor_values_extended.add(0,"stack monitor activity concentration");
        }
        if (stack_monitor_flow_values_extended.size()>0){
            stack_monitor_flow_values_extended.add(0,"stack monitor flow");
        }
	if (Hi_stack_values_extended.size()>0){
            Hi_stack_values_extended.add(0,"Hi stack");
        }
	if (Cyclotron_values_extended.size()>0){
            Cyclotron_values_extended.add(0,"Cyclotron");
        }
	if (Neutron_Probe_values_extended.size()>0){
            Neutron_Probe_values_extended.add(0,"Neutron Probe");
        }
	
	
        
        
        FileWriter writer = new FileWriter(file_export);
        
        //writer.write("Time,9.241c vent ut,MIP2int.,MIP2ext.,MIP3ext.\n");
        for (int i = 0;i < common_roundedtime.size();i++){
            writer.write(common_roundedtime.get(i)+",");
            if (_221b_values_extended.size()>0){
                writer.write(_221b_values_extended.get(i)+",");
            }
            if (_221c_values_extended.size()>0){
                writer.write(_221c_values_extended.get(i)+",");
            }
            if (_221d_values_extended.size()>0){
                writer.write(_221d_values_extended.get(i)+",");
            }
            if (_221f_values_extended.size()>0){
                writer.write(_221f_values_extended.get(i)+",");
            }
            if (_227_values_extended.size()>0){
                writer.write(_227_values_extended.get(i)+",");
            }
            if (_233_values_extended.size()>0){
                writer.write(_233_values_extended.get(i)+",");
            }
            if (_236a_values_extended.size()>0){
                writer.write(_236a_values_extended.get(i)+",");
            }
            if (_238c_values_extended.size()>0){
                writer.write(_238c_values_extended.get(i)+",");
            }
            if (_239_left_values_extended.size()>0){
                writer.write(_239_left_values_extended.get(i)+",");
            }
            if (_239_right_values_extended.size()>0){
                writer.write(_239_right_values_extended.get(i)+",");
            }
            if (_240c_values_extended.size()>0){
                writer.write(_240c_values_extended.get(i)+",");
            }
            if (_241a_teknik_values_extended.size()>0){
                writer.write(_241a_teknik_values_extended.get(i)+",");
            }
            if (_241b_technik_values_extended.size()>0){
                writer.write(_241b_technik_values_extended.get(i)+",");
            }
            if (_241c_vent_ut_values_extended.size()>0){
                writer.write(_241c_vent_ut_values_extended.get(i)+",");
            }
            if (_242_values_extended.size()>0){
                writer.write(_242_values_extended.get(i)+",");
            }
            if (_256b_values_extended.size()>0){
                writer.write(_256b_values_extended.get(i)+",");
            }
            if (_256c_values_extended.size()>0){
                writer.write(_256c_values_extended.get(i)+",");
            }
            if (_256d_values_extended.size()>0){
                writer.write(_256d_values_extended.get(i)+",");
            }
            if (_257a_values_extended.size()>0){
                writer.write(_257a_values_extended.get(i)+",");
            }
            if (_257b_values_extended.size()>0){
                writer.write(_257b_values_extended.get(i)+",");
            }
            if (_01_226_floor_values_extended.size()>0){
                writer.write(_01_226_floor_values_extended.get(i)+",");
            }
            if (MIP1int_values_extended.size()>0){
                writer.write(MIP1int_values_extended.get(i)+",");
            }
            if (MIP1ext_values_extended.size()>0){
                writer.write(MIP1ext_values_extended.get(i)+",");
            }
            if (MIP2int_values_extended.size()>0){
                writer.write(MIP2int_values_extended.get(i)+",");
            }
            if (MIP2ext_values_extended.size()>0){
                writer.write(MIP2ext_values_extended.get(i)+",");
            }
            if (MIP3int_values_extended.size()>0){
                writer.write(MIP3int_values_extended.get(i)+",");
            }
            if (MIP3ext_values_extended.size()>0){
                writer.write(MIP3ext_values_extended.get(i)+",");
            }
            if (Talia_values_extended.size()>0){
                writer.write(Talia_values_extended.get(i)+",");
            }
            if (BBS2_Upper_values_extended.size()>0){
                writer.write(BBS2_Upper_values_extended.get(i)+",");
            }
            if (BBS2_down_values_extended.size()>0){
                writer.write(BBS2_down_values_extended.get(i)+",");
            }
            if (BBS1_Geigerbox_values_extended.size()>0){
                writer.write(BBS1_Geigerbox_values_extended.get(i)+",");
            }
            if (Manuela_Geiger_values_extended.size()>0){
                writer.write(Manuela_Geiger_values_extended.get(i)+",");
            }
            if (stack_monitor_values_extended.size()>0){
                writer.write(stack_monitor_values_extended.get(i)+",");
            }
            if (stack_monitor_flow_values_extended.size()>0){
                writer.write(stack_monitor_flow_values_extended.get(i)+",");
            }
            if (Hi_stack_values_extended.size()>0){
                writer.write(Hi_stack_values_extended.get(i)+",");
            }
            if (Cyclotron_values_extended.size()>0){
                writer.write(Cyclotron_values_extended.get(i)+",");
            }
            if (Neutron_Probe_values_extended.size()>0){
                writer.write(Neutron_Probe_values_extended.get(i)+",");
            }
            
            
            writer.write("\n");
            //writer.write(str+",\n");
            //writer.write(common_roundedtime.get(i)+","+_241c_vent_ut_values_extended.get(i)+","+MIP2int_values_extended.get(i)+","+MIP2ext_values_extended.get(i)+","+MIP3ext_values_extended.get(i)+"\n");
        }
        writer.close();
        System.out.println("Startindex: \n"+startindex+"\nEndindex: \n"+endindex);
        System.out.println("\nSize of common time: \n"+common_dateTime.size());
        System.out.println("\nSize of MIP3ext_values_extended: \n"+MIP3ext_values_extended.size());
        System.out.println("\nSize of MIP2ext_values_extended: \n"+MIP2ext_values_extended.size());
        System.out.println("\nSize of MIP2int_values_extended: \n"+MIP2int_values_extended.size());
        System.out.println("\nSize of Stack monitor_values_extended: \n"+stack_monitor_values_extended.size());
        System.out.println("\nSize of Stack monitor_flow_values_extended: \n"+stack_monitor_flow_values_extended.size());
        System.out.println("\nSize of _241c_vent_ut_values_extended: \n"+_241c_vent_ut_values_extended.size());
        System.out.println("\nSize of common roundedtime: \n"+common_roundedtime.size());
    }
}

