package com.xwrkz.functional.collection.runnerall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xwrkz.functional.collection.imp.MlaDTO;

public class MlaRunner {

	public static void main(String[] args) {
		MlaDTO mla = new MlaDTO("Mane Shrinivas", 55, "hanagal", "INC", false, "male");
		MlaDTO mla1 = new MlaDTO("Sanjeeva Matandoor", 66, "puttur", "BJP", false, "male");
		MlaDTO mla2 = new MlaDTO("Aihole Duryodhan Mahalingappa", 44, "Raibag", "BJP", false, "male");
		MlaDTO mla3 = new MlaDTO("D S Suresh", 66, "Tarikere", "BJP", false, "male");
		MlaDTO mla4 = new MlaDTO("Yadwad Mahadevappa Shivalingappa", 45, "Ramadurg", "BJP", false, "male");
		MlaDTO mla5 = new MlaDTO("Siddu Savadi", 34, "Terdal", "BJP", false, "male");
		MlaDTO mla6 = new MlaDTO("B C Nagesh", 66, "Tiptur", "BJP", false, "male");
		MlaDTO mla7 = new MlaDTO("S Suresh Kumar", 56, "Rajajinagar", "BJP", false, "male");
		MlaDTO mla8 = new MlaDTO("G B Jyothi Ganesh", 46, "Tumkur City", "BJP", false, "male");
		MlaDTO mla9 = new MlaDTO("Jayaram A S", 64, "Turuvekere", "BJP", false, "male");
		MlaDTO mla10 = new MlaDTO("K Raghupathi Bhat", 34, "Udupi", "BJP", false, "male");
		MlaDTO mla11 = new MlaDTO("Dr S Shivaraj Patil", 45, "Raichur", "BJP", false, "male");
		MlaDTO mla12 = new MlaDTO("R Shankar", 52, "Ranebennur", "KPJP", false, "male");
		MlaDTO mla13 = new MlaDTO("Basanagouda Somanagouda Patil", 46, "Devara Hippargi", "BJP", false, "male");
		MlaDTO mla14 = new MlaDTO("S Kumar Bangarappa", 65, "Soraba", "BJP", false, "male");
		MlaDTO mla15 = new MlaDTO("Nagendra L", 67, "Chamaraja", "BJP", false, "male");
		MlaDTO mla16 = new MlaDTO("K Madal Virupakshappa", 44, "Channagiri", "BJP", false, "male");
		MlaDTO mla17 = new MlaDTO("Uday B Garudachar", 54, "Chickpet", "BJP", false, "male");
		MlaDTO mla18 = new MlaDTO("C T Ravi", 35, "Chikmagalur", "BJP", false, "male");
		MlaDTO mla19 = new MlaDTO("J C Madhuswamy", 54, "Chikkanayakanahalli", "BJP", false, "male");
		MlaDTO mla20 = new MlaDTO("G H Thippa Reddy", 36, "Chitradurga", "BJP", false, "male");
		MlaDTO mla21 = new MlaDTO("B M Sukumar Shetty", 61, "Baindur", "BJP", false, "male");
		MlaDTO mla22 = new MlaDTO("K Shivanagouda Naik", 58, "Devadurga", "BJP", false, "male");
		MlaDTO mla23 = new MlaDTO("Amrut Ayyappa Desai", 42, "Dharwad", "BJP", false, "male");
		MlaDTO mla24 = new MlaDTO("Paranna Ishwarappa Munavalli", 44, "Gangavathi", "BJP", false, "male");
		MlaDTO mla25 = new MlaDTO("H Halappa", 49, "Sagara", "BJP", false, "male");
		MlaDTO mla26 = new MlaDTO("Shankar Patil Munenakoppa", 59, "Navalgund", "BJP", false, "male");
		MlaDTO mla27 = new MlaDTO("Dr Umesh G Jadhav", 48, "Chincholi", "INC", false, "male");
		MlaDTO mla28 = new MlaDTO("Priyanka M Kharge", 50, "Chittapur", "INC", false, "male");
		MlaDTO mla29 = new MlaDTO("Patil Mallanagouda Basavanagouda", 60, "	Babaleshwar", "INC", false, "male");
		MlaDTO mla30 = new MlaDTO("Ramalinga Reddy", 55, "B. T. M Layout", "INC", false, "male");
		MlaDTO mla31 = new MlaDTO("T Venkataramanaiah", 48, "Doddaballapur", "INC", false, "male");
		MlaDTO mla32 = new MlaDTO("C C Patil", 44, "Naragund", "BJP", false, "male");
		MlaDTO mla33 = new MlaDTO("R Ashoka", 43, "Padmanaba Nagar", "BJP", false, "male");
		MlaDTO mla34 = new MlaDTO("Jolle Shashikala Annasaheb", 66, "Nippani", "BJP", false, "female");
		MlaDTO mla35 = new MlaDTO("Venkatreddy Mundal", 59, "Yadagir", "BJP", false, "male");
		MlaDTO mla36 = new MlaDTO("S R Vishwanath", 68, "Yelahanka", "BJP", false, "male");
		MlaDTO mla37 = new MlaDTO("B Harshavardhan", 54, "Nanjangud", "BJP", false, "male");
		MlaDTO mla38 = new MlaDTO("S Angara", 65, "Sullia", "BJP", false, "male");
		MlaDTO mla39 = new MlaDTO("Achar Halappa Basappa", 67, "Yelburga", "BJP", false, "male");
		MlaDTO mla40 = new MlaDTO("Araga Jnanendra", 76, "Thirthahalli", "BJP", false, "male");
		MlaDTO mla41 = new MlaDTO("K G Bopaiah", 64, "Virajpet", "BJP", false, "male");
		MlaDTO mla42 = new MlaDTO("Kalakappa Gurushanthappa Bandi", 51, "Ron", "BJP", false, "male");
		MlaDTO mla43 = new MlaDTO("K B Ashok Naik", 61, "Shimoga Rural", "BJP", false, "male");
		MlaDTO mla44 = new MlaDTO("Narasimha Nayak ", 62, "	Shorapur", "BJP", false, "male");
		MlaDTO mla45 = new MlaDTO("K S Eswarappa", 52, "Shimoga", "BJP", false, "male");
		MlaDTO mla46 = new MlaDTO("B S Yediyurappa", 42, "Shikaripura", "BJP", false, "male");
		MlaDTO mla47 = new MlaDTO("Basavaraj Bommai", 43, "Shiggaon", "BJP", false, "male");
		MlaDTO mla48 = new MlaDTO("Rajkumar Patil", 40, "Sedam", "BJP", false, "male");
		MlaDTO mla49 = new MlaDTO("Visweswara Heggade Kageri", 54, "Sirsi", "BJP", false, "male");
		MlaDTO mla50 = new MlaDTO("Vishwanath Chandrashekar Mamani", 59, "Saundatti Yellamma", "BJP", false, "male");
		MlaDTO mla51 = new MlaDTO("M S Somalingappa", 50, "Siruguppa", "BJP", false, "male");
		MlaDTO mla52 = new MlaDTO("Dattatraya Chandrasekar Patil Revoor", 39, "Gulbarga Dakshin", "BJP", false, "male");
		MlaDTO mla53 = new MlaDTO("Ramanna S Lamani", 37, "	Shirahatti", "BJP", false, "male");
		MlaDTO mla54 = new MlaDTO("M Chandrappa", 45, "Holalkere", "BJP", false, "male");
		MlaDTO mla55 = new MlaDTO("V Somanna", 50, "Govindraj Nagar", "BJP", false, "male");
		MlaDTO mla56 = new MlaDTO("Lalaji R Mendon", 60, "Kaup", "BJP", false, "male");
		MlaDTO mla57 = new MlaDTO("D Vedavyasa Kamath", 68, "Mangalore City South", "BJP", false, "male");
		MlaDTO mla58 = new MlaDTO("N Linganna", 57, "Mayakonda", "BJP", false, "male");
		MlaDTO mla59 = new MlaDTO("B Sriramulu", 47, "Molakalmuru", "BJP", false, "male");
		MlaDTO mla60 = new MlaDTO("Umanatha A Kotian", 44, "Moodabidri", "BJP", false, "male");
		MlaDTO mla61 = new MlaDTO("A S Patil ", 66, "Muddebihal", "BJP", false, "male");
		MlaDTO mla62 = new MlaDTO("Karajola Govinda Maktappa", 55, "Mudhol", "BJP", false, "male");
		MlaDTO mla63 = new MlaDTO("Aravinda Limbavali", 39, "Mahadevapura", "BJP", false, "male");
		MlaDTO mla64 = new MlaDTO("Katti Umesh Vishwanath", 44, "Hukkeri", "BJP", false, "male");
		MlaDTO mla65 = new MlaDTO("Preetham J Gowda", 62, "	Hassan", "BJP", false, "male");
		MlaDTO mla66 = new MlaDTO("C S Niranjan Kumar", 65, "Gundlupet", "BJP", false, "male");
		MlaDTO mla67 = new MlaDTO("K Poornima", 53, "	Hiriyur", "BJP", false, "female");
		MlaDTO mla68 = new MlaDTO("M P Appachu Ranjan", 55, "Madikeri", "BJP", false, "male");
		MlaDTO mla69 = new MlaDTO("M P Renukacharya", 60, "Honnali", "BJP", false, "male");
		MlaDTO mla70 = new MlaDTO("Goolihatti D Shekar", 50, "Hosadurga", "BJP", false, "");
		MlaDTO mla71 = new MlaDTO("Doddagoudar Mahantesh Basavantaray", 40, "Kittur", "BJP", false, "male");
		MlaDTO mla72 = new MlaDTO("Aravind Chandrakant Bellad", 48, "Hubli-Dharwad-West", "BJP", false, "male");
		MlaDTO mla73 = new MlaDTO("Roopali Santosh Naik", 38, "	Karwar", "BJP", false, "female");
		MlaDTO mla74 = new MlaDTO("Doddanagouda Gundanagouda Patil", 49, "Hungund", "BJP", false, "male");
		MlaDTO mla75 = new MlaDTO("S V Ramachandra", 48, "Jagalur", "BJP", false, "male");
		MlaDTO mla76 = new MlaDTO("Prakash K S", 47, "Kadur", "BJP", false, "male");
		MlaDTO mla77 = new MlaDTO("C M Nimbannavar", 58, "Kalghatagi", "BJP", false, "male");
		MlaDTO mla78 = new MlaDTO("Basavaraj Dadesugur", 53, "Kanakagiri", "BJP", false, "male");
		MlaDTO mla79 = new MlaDTO("M P Kumaraswamy", 49, "Mudigere", "BJP", false, "male");
		MlaDTO mla80 = new MlaDTO("Jagadish Shettar", 46, "Hubli-Dharwad-Central", "BJP", false, "male");
		MlaDTO mla81 = new MlaDTO("Olekar Neharu Chanabasappa", 60, "Haveri", "BJP", false, "male");
		MlaDTO mla82 = new MlaDTO("Gali Somashekara Reddy", 59, "Bellary City", "BJP", false, "male");
		MlaDTO mla83 = new MlaDTO("Dinesh Gundurao", 70, "Gandhinagar", "INC", false, "male");
		MlaDTO mla84 = new MlaDTO("V Sunil Kumar", 65, "Karkala", "BJP", false, "male");
		MlaDTO mla85 = new MlaDTO("S A Ravindranatha", 41, "Davanagere North", "BJP", false, "male");
		MlaDTO mla86 = new MlaDTO("Abhay Patil", 42, "Belgaum Dakshin", "BJP", false, "male");
		MlaDTO mla87 = new MlaDTO("Guttedar Subhash Rukmayya", 43, "Aland", "BJP", false, "male");
		MlaDTO mla89 = new MlaDTO("Balachandra Lakshmanrao Jarakiholi", 44, "Arabhavi", "BJP", false, "male");
		MlaDTO mla90 = new MlaDTO("Prabhu B Chavhan", 45, "Aurad", "BJP", false, "male");
		MlaDTO mla91 = new MlaDTO("Veerabhadrayya Charantimath", 46, "Bagalkot", "BJP", false, "male");
		MlaDTO mla92 = new MlaDTO("M Krishnappa", 47, "Bangalore South", "BJP", false, "male");
		MlaDTO mla93 = new MlaDTO("Rajesh Naik U", 48, "Bantwal", "BJP", false, "male");
		MlaDTO mla94 = new MlaDTO("S Raghu", 49, "C.V Raman Nagar", "BJP", false, "male");
		MlaDTO mla95 = new MlaDTO("Dr C N Ashwath Narayana", 50, "Malleshwaram", "BJP", false, "male");
		MlaDTO mla96 = new MlaDTO("G Karunakara Reddy", 51, "Harapanahalli", "BJP", false, "male");
		MlaDTO mla97 = new MlaDTO("Basawaraj Mattimud", 52, "Gulbarga Rural", "BJP", false, "male");
		MlaDTO mla98 = new MlaDTO("Harish Poonja", 53, "Belthangady", "BJP", false, "male");
		MlaDTO mla99 = new MlaDTO("Sunil Biliya Naik", 54, "Bhatkal", "BJP", false, "male");
		MlaDTO mla100 = new MlaDTO("Basanagouda Ramanagouda Patil", 55, "Bijapur City", "BJP", false, "male");
		MlaDTO mla101 = new MlaDTO("Nirani Murugesh Rudrappa", 56, "Bilgi", "BJP", false, "male");
		MlaDTO mla102 = new MlaDTO("M Satish Reddy", 57, "Bommanahalli", "BJP", false, "male");
		MlaDTO mla103 = new MlaDTO("L A Ravisubramanya", 58, "Basavanagudi", "BJP", false, "male");
		MlaDTO mla104 = new MlaDTO("Dr Bharath Shetty Y", 59, "Mangalore City North", "BJP", false, "male");
		MlaDTO mla105 = new MlaDTO("S A Ramadas", 60, "Krishnaraja", "BJP", false, "male");
		MlaDTO mla106 = new MlaDTO("P Rajeev", 61, "Kudachi", "BJP", false, "male");
		MlaDTO mla107 = new MlaDTO("N Y Gopalakrishna", 62, "Kudligi", "BJP", false, "male");
		MlaDTO mla108 = new MlaDTO("Dinakar Keshav Shetty", 63, "Kumta", "BJP", false, "male");
		MlaDTO mla109 = new MlaDTO("Haladi Srinivasa Shetty", 64, "Coonadapur", "BJP", false, "male");
		MlaDTO mla110 = new MlaDTO("Anil S Benake", 65, "Belgaum Uttar", "BJP", false, "male");
		MlaDTO mla111 = new MlaDTO("E Tukaram	", 66, "Sandur", "INC", false, "male");
		MlaDTO mla112 = new MlaDTO("U T Khadar", 67, "Mangalore", "INC", false, "male");
		MlaDTO mla113 = new MlaDTO("Raja Venkatappa Nayak", 68, "Manvi", "JDS", false, "male");
		MlaDTO mla114 = new MlaDTO("M Srinivas", 69, "Mandya", "JDS", false, "male");
		MlaDTO mla115 = new MlaDTO("C N Balakrishna", 70, "Sravanabelagola", "JDS", false, "male");
		MlaDTO mla116 = new MlaDTO("D C Thammanna", 39, "Maddur", "JDS", false, "male");
		MlaDTO mla117 = new MlaDTO("Dr K Annadani", 38, "Malavalli", "JDS", false, "male");
		MlaDTO mla118 = new MlaDTO("A Manjunath", 36, "Magadi", "JDS", false, "male");
		MlaDTO mla119 = new MlaDTO("Ravindra Srikantaiah", 37, "Shrirangapattana", "JDS", false, "male");
		MlaDTO mla120 = new MlaDTO("M V Veerabhadraiah", 35, "Madhugiri", "JDS", false, "male");
		MlaDTO mla121 = new MlaDTO("S R Srinivas", 40, "Gubbi", "JDS", false, "male");
		MlaDTO mla122 = new MlaDTO("Anil Kumar C", 41, "Heggadadevankote", "INC", false, "male");
		MlaDTO mla123 = new MlaDTO("Nagangouda Kandkur", 42, "Gurmitkal", "JDS", false, "male");
		MlaDTO mla124 = new MlaDTO("Rajashekar Basavaraj Patil", 43, "Humnabad", "INC", false, "male");
		MlaDTO mla125 = new MlaDTO("C S Puttaraju", 44, "Melukote", "JDS", false, "male");
		MlaDTO mla126 = new MlaDTO("R Narendra", 45, "Hanur", "INC", false, "male");
		MlaDTO mla127 = new MlaDTO("K J George", 46, "Sarvagnanagar", "INC", false, "male");
		MlaDTO mla128 = new MlaDTO("S Ramappa", 47, "Harihar", "INC", false, "male");
		MlaDTO mla129 = new MlaDTO("Abbayya Prasad", 48, "Hubli-Dharwad-East", "INC", false, "male");
		MlaDTO mla130 = new MlaDTO("Sharanabasappa Darshanapur", 49, "Shahapur", "INC", false, "male");
		MlaDTO mla131 = new MlaDTO("M T B Nagaraju", 50, "Hosakote", "INC", false, "male");
		MlaDTO mla132 = new MlaDTO("N A Haris", 51, "Shantinagar", "INC", false, "male");
		MlaDTO mla134 = new MlaDTO("Suresh B S", 52, "Hebbal", "INC", false, "male");
		MlaDTO mla135 = new MlaDTO("L B P Bheema Naik", 53, "Hagaribommanahalli", "INC", false, "male");
		MlaDTO mla136 = new MlaDTO("K Raghavendra Basavaraj Hitnal", 54, "Koppal", "INC", false, "male");
		MlaDTO mla137 = new MlaDTO("Tanveer Sait", 55, "Narasimharaja", "INC", false, "male");
		MlaDTO mla138 = new MlaDTO("Shamanuru Shivashankarappa", 56, "Davanagere South", "INC", false, "male");
		MlaDTO mla139 = new MlaDTO("B C Patil", 57, "Hirekerur", "INC", false, "male");
		MlaDTO mla140 = new MlaDTO("G T Devegowda", 58, "Chamundeshwari", "JDS", false, "male");
		MlaDTO mla141 = new MlaDTO("H Nagesh", 59, "Mulbagal", "INDEPENDENT", true, "male");
		MlaDTO mla142 = new MlaDTO("Narayana Swamy L N", 60, "Devanahalli", "JDS", false, "male");
		MlaDTO mla143 = new MlaDTO("Lingesh K S", 61, "	Belur", "JDS", false, "male");
		MlaDTO mla144 = new MlaDTO("J K Krishnareddy", 62, "Chintamani", "JDS", false, "male");
		MlaDTO mla145 = new MlaDTO("Bhusanur Ramesh Balappa", 63, "Sindgi", "BJP", false, "male");
		MlaDTO mla146 = new MlaDTO("H D Revanna", 64, "Holenarasipura", "JDS", false, "male");
		MlaDTO mla147 = new MlaDTO("Bandeppa Khasempur", 65, "Bidar South", "JDS", false, "male");
		MlaDTO mla148 = new MlaDTO("D C Gowrishankar", 66, "Tumkur Rural", "JDS", false, "male");
		MlaDTO mla149 = new MlaDTO("K Srinivasa Gowda", 67, "Kolar", "JDS", false, "male");
		MlaDTO mla150 = new MlaDTO("K Mahadeva", 68, "Periyapatna", "JDS", false, "male");
		MlaDTO mla151 = new MlaDTO("Narayana Gowda", 69, "Krishnarajapet", "JDS", false, "male");
		MlaDTO mla152 = new MlaDTO("S R Mahesh", 70, "Krishnarajanagara", "JDS", false, "male");
		MlaDTO mla153 = new MlaDTO("K Y Nanjegowda", 39, "Malur", "INC", false, "male");
		MlaDTO mla154 = new MlaDTO("Ashvin Kumar M", 38, "T. Narasipura", "JDS", false, "male");
		MlaDTO mla155 = new MlaDTO("H D Kumaraswamy", 37, "Channapatna", "JDS", false, "male");
		MlaDTO mla156 = new MlaDTO("Manjunatha R", 36, "Dasarahalli", "JDS", false, "male");
		MlaDTO mla157 = new MlaDTO("H Viswanath", 35, "Hunsur", "JDS", false, "male");
		MlaDTO mla158 = new MlaDTO("H K Kumaraswamy", 34, "Sakaleshpur", "JDS", false, "male");
		MlaDTO mla159 = new MlaDTO("Nadagouda Venkatarao", 33, "Sindhanoor", "JDS", false, "male");
		MlaDTO mla160 = new MlaDTO("Dr K Srinivasamurthy", 40, "Nelamangala", "JDS", false, "male");
		MlaDTO mla161 = new MlaDTO("Suresh Gowda", 41, "Nagamangala", "JDS", false, "male");
		MlaDTO mla162 = new MlaDTO("Devanand Fulasing Chavan", 42, "Nagthan", "JDS", false, "male");
		MlaDTO mla163 = new MlaDTO("A T Ramaswamy", 43, "Arakalgud", "JDS", false, "male");
		MlaDTO mla164 = new MlaDTO("K M Shivalinge Gowda", 44, "Arasikere", "JDS", false, "male");
		MlaDTO mla165 = new MlaDTO("K Gopalaiah", 45, "Mahalakshmi Layout", "JDS", false, "male");
		MlaDTO mla166 = new MlaDTO("B Satyanarayana", 46, "Sira", "JDS", false, "male");
		MlaDTO mla167 = new MlaDTO("S N K M Narayana Swamy", 47, "Bangarpet", "INC", false, "male");
		MlaDTO mla168 = new MlaDTO("Pratapagouda Patil", 48, "Maski", "INC", false, "male");
		MlaDTO mla169 = new MlaDTO("K R Ramesh Kumar", 50, "Srinivasapur", "INC", false, "male");
		MlaDTO mla170 = new MlaDTO("Deshpande Raghunath Vishwanathrao", 49, "Haliyal", "INC", false, "male");
		MlaDTO mla171 = new MlaDTO("Siddaramaiah", 51, "Badami", "INC", false, "male");
		MlaDTO mla172 = new MlaDTO("B Narayan Rao", 52, "Basavakalyan", "INC", false, "male");
		MlaDTO mla173 = new MlaDTO("Patil Shivananda Siddaramappa", 53, "Basavana Bagevadi", "INC", false, "male");
		MlaDTO mla174 = new MlaDTO("Raheem Khan", 54, "Bidar", "INC", false, "male");
		MlaDTO mla175 = new MlaDTO("Eshwara Bhimanna Khandre", 55, "Bhalki", "INC", false, "male");
		MlaDTO mla176 = new MlaDTO("B K Sangameshwara", 56, "Bhadravathi", "INC", false, "male");
		MlaDTO mla177 = new MlaDTO("Yathindra S", 57, "Varuna", "INC", false, "male");
		MlaDTO mla178 = new MlaDTO("Laxmi R Hebbalkar", 58, "Belgaum Rural", "INC", false, "female");
		MlaDTO mla179 = new MlaDTO("T Raghumurthy", 59, "Challakere", "INC", false, "male");
		MlaDTO mla180 = new MlaDTO("B Nagendra", 60, "Bellary", "INC", false, "male");
		MlaDTO mla181 = new MlaDTO("C Puttarangashetty", 61, "Chamarajanagar", "INC", false, "male");
		MlaDTO mla182 = new MlaDTO("H K Patil", 62, "Gadag", "INC", false, "male");
		MlaDTO mla183 = new MlaDTO("D K Shivakumar", 63, "Kanakapura", "INC", false, "male");
		MlaDTO mla184 = new MlaDTO("S T Somashekar", 64, "Yeshvanthapura", "INC", false, "male");
		MlaDTO mla185 = new MlaDTO("B Shivanna", 65, "Anekal", "INC", false, "male");
		MlaDTO mla186 = new MlaDTO("Arbail Shivaram Hebbar", 66, "Yellapur", "INC", false, "male");
		MlaDTO mla187 = new MlaDTO("Kaneez Fatima", 67, "Gulbarga Uttar", "INC", false, "male");
		MlaDTO mla188 = new MlaDTO("V Muniyappa", 68, "Sidlaghatta", "INC", false, "male");
		MlaDTO mla189 = new MlaDTO("Ramesh Lakshmanrao Jarakiholi", 69, "Gokak", "INC", false, "male");
		MlaDTO mla190 = new MlaDTO("N H Shivashankara Reddy", 70, "Gowribidanur", "INC", false, "male");
		MlaDTO mla191 = new MlaDTO("Mahesh Iranagouda Kumathalli", 71, "Athani", "INC", false, "male");
		MlaDTO mla192 = new MlaDTO("Dr K Sudhakar", 72, "Chikkaballapur", "INC", false, "male");
		MlaDTO mla193 = new MlaDTO("N Mahesh", 73, "Kollegal", "BSP", false, "male");
		MlaDTO mla194 = new MlaDTO("Anand Singh", 39, "Vijayanagara", "INC", false, "male");
		MlaDTO mla195 = new MlaDTO("J N Ganesh", 38, "Kampli", "INC", false, "male");
		MlaDTO mla196 = new MlaDTO("Venkataramanappa", 37, "Pavagada", "INC", false, "male");
		MlaDTO mla197 = new MlaDTO("D S Hoolageri", 36, "Lingasagur", "INC", false, "male");
		MlaDTO mla198 = new MlaDTO("Amaregouda Linganagouda Patil Bayyapur", 35, "Kushtagi", "INC", false, "male");
		MlaDTO mla199 = new MlaDTO("Dr H D Ranganath", 40, "Kunigal", "INC", false, "male");
		MlaDTO mla200 = new MlaDTO("Shivalli Channabasappa Satyappa", 41, "	Kundagol", "INC", false, "female");
		MlaDTO mla201 = new MlaDTO("R Akhanda Srinivasamurthy", 42, "Pulakeshinagar", "INC", false, "male");
		MlaDTO mla202 = new MlaDTO("M Y Patil", 43, "Afzalpur", "INC", false, "male");
		MlaDTO mla203 = new MlaDTO("Dr G Parameshwara", 44, "Koratagere", "INC", false, "male");
		MlaDTO mla204 = new MlaDTO("Yashvantarayagouda Vittalagouda Patil", 45, "Indi", "INC", false, "male");
		MlaDTO mla205 = new MlaDTO("Roopakala M", 46, "Kolar Gold Field", "INC", false, "female");
		MlaDTO mla206 = new MlaDTO("Dr Anjali Hemant Nimbalkar", 47, "Khanapur", "INC", false, "female");
		MlaDTO mla207 = new MlaDTO("Satish Lakshmanrao Jarakiholi", 48, "Yemkanmardi", "INC", false, "male");
		MlaDTO mla208 = new MlaDTO("Munirathna", 49, "Rajarajeshwarinagar", "INC", false, "male");
		MlaDTO mla209 = new MlaDTO("T D Rajegowda	", 50, "Sringeri", "INC", false, "male");
		MlaDTO mla210 = new MlaDTO("Shrimanth Balasaheb Patil", 51, "Kagawad", "INC", false, "male");
		MlaDTO mla211 = new MlaDTO("B A Basavaraja", 52, "K.R. Pura", "INC", false, "male");
		MlaDTO mla212 = new MlaDTO("Dr Ajay Dharam Singh", 53, "Jewargi", "INC", false, "male");
		MlaDTO mla213 = new MlaDTO("Siddu B Nyamagouda", 54, "Jamakhandi", "INC", false, "male");
		MlaDTO mla214 = new MlaDTO("Basanagouda Daddal", 55, "Raichur Rural", "INC", false, "male");
		MlaDTO mla215 = new MlaDTO("R Roshan Baig", 56, "Shivajinagar", "INC", false, "male");
		MlaDTO mla216 = new MlaDTO("C B Krishna Byregowda", 57, "Byatarayanapura", "INC", false, "male");
		MlaDTO mla217 = new MlaDTO("Ganesh Prakash Hukkeri", 58, "Chikkodi-Sadalga", "INC", false, "male");
		MlaDTO mla218 = new MlaDTO("M Krishnappa", 59, "Vijayanagar", "INC", false, "male");
		MlaDTO mla219 = new MlaDTO("S N Subbareddy", 60, "Bagepalli", "INC", false, "male");
		MlaDTO mla220 = new MlaDTO("Jameer Ahmed Khan", 39, "Chamarajpet", "INC", false, "male");
		MlaDTO mla221 = new MlaDTO("Koujalgi Mahanthesh Shivananda", 38, "Bailhongal", "INC", false, "male");
		MlaDTO mla222 = new MlaDTO("P T Parameshwara Naik", 37, "Hadagali", "INC", false, "male");

		Collection<MlaDTO> mlaDTOs = new ArrayList<>();
		mlaDTOs.add(mla);
		mlaDTOs.add(mla1);
		mlaDTOs.add(mla2);
		mlaDTOs.add(mla3);
		mlaDTOs.add(mla4);
		mlaDTOs.add(mla5);
		mlaDTOs.add(mla6);
		mlaDTOs.add(mla7);
		mlaDTOs.add(mla8);
		mlaDTOs.add(mla9);
		mlaDTOs.add(mla10);
		mlaDTOs.add(mla11);
		mlaDTOs.add(mla12);
		mlaDTOs.add(mla13);
		mlaDTOs.add(mla14);
		mlaDTOs.add(mla15);
		mlaDTOs.add(mla16);
		mlaDTOs.add(mla17);
		mlaDTOs.add(mla18);
		mlaDTOs.add(mla19);
		mlaDTOs.add(mla20);
		mlaDTOs.add(mla21);
		mlaDTOs.add(mla22);
		mlaDTOs.add(mla23);
		mlaDTOs.add(mla24);
		mlaDTOs.add(mla25);
		mlaDTOs.add(mla26);
		mlaDTOs.add(mla27);
		mlaDTOs.add(mla28);
		mlaDTOs.add(mla29);
		mlaDTOs.add(mla30);
		mlaDTOs.add(mla31);
		mlaDTOs.add(mla32);
		mlaDTOs.add(mla33);
		mlaDTOs.add(mla34);
		mlaDTOs.add(mla35);
		mlaDTOs.add(mla36);
		mlaDTOs.add(mla37);
		mlaDTOs.add(mla38);
		mlaDTOs.add(mla39);
		mlaDTOs.add(mla40);
		mlaDTOs.add(mla41);
		mlaDTOs.add(mla42);
		mlaDTOs.add(mla43);
		mlaDTOs.add(mla44);
		mlaDTOs.add(mla45);
		mlaDTOs.add(mla46);
		mlaDTOs.add(mla47);
		mlaDTOs.add(mla48);
		mlaDTOs.add(mla49);
		mlaDTOs.add(mla50);
		mlaDTOs.add(mla51);
		mlaDTOs.add(mla52);
		mlaDTOs.add(mla53);
		mlaDTOs.add(mla54);
		mlaDTOs.add(mla55);
		mlaDTOs.add(mla56);
		mlaDTOs.add(mla57);
		mlaDTOs.add(mla58);
		mlaDTOs.add(mla59);
		mlaDTOs.add(mla60);
		mlaDTOs.add(mla61);
		mlaDTOs.add(mla62);
		mlaDTOs.add(mla63);
		mlaDTOs.add(mla64);
		mlaDTOs.add(mla65);
		mlaDTOs.add(mla66);
		mlaDTOs.add(mla67);
		mlaDTOs.add(mla68);
		mlaDTOs.add(mla69);
		mlaDTOs.add(mla70);
		mlaDTOs.add(mla71);
		mlaDTOs.add(mla72);
		mlaDTOs.add(mla73);
		mlaDTOs.add(mla74);
		mlaDTOs.add(mla75);
		mlaDTOs.add(mla76);
		mlaDTOs.add(mla77);
		mlaDTOs.add(mla78);
		mlaDTOs.add(mla79);
		mlaDTOs.add(mla80);
		mlaDTOs.add(mla81);
		mlaDTOs.add(mla82);
		mlaDTOs.add(mla83);
		mlaDTOs.add(mla84);
		mlaDTOs.add(mla85);
		mlaDTOs.add(mla86);
		mlaDTOs.add(mla87);
		mlaDTOs.add(mla89);
		mlaDTOs.add(mla90);
		mlaDTOs.add(mla91);
		mlaDTOs.add(mla92);
		mlaDTOs.add(mla93);
		mlaDTOs.add(mla94);
		mlaDTOs.add(mla95);
		mlaDTOs.add(mla96);
		mlaDTOs.add(mla97);
		mlaDTOs.add(mla98);
		mlaDTOs.add(mla99);
		mlaDTOs.add(mla100);
		mlaDTOs.add(mla101);
		mlaDTOs.add(mla102);
		mlaDTOs.add(mla103);
		mlaDTOs.add(mla104);
		mlaDTOs.add(mla105);
		mlaDTOs.add(mla106);
		mlaDTOs.add(mla107);
		mlaDTOs.add(mla108);
		mlaDTOs.add(mla109);
		mlaDTOs.add(mla110);
		mlaDTOs.add(mla111);
		mlaDTOs.add(mla112);
		mlaDTOs.add(mla113);
		mlaDTOs.add(mla114);
		mlaDTOs.add(mla115);
		mlaDTOs.add(mla116);
		mlaDTOs.add(mla117);
		mlaDTOs.add(mla118);
		mlaDTOs.add(mla119);
		mlaDTOs.add(mla120);
		mlaDTOs.add(mla121);
		mlaDTOs.add(mla122);
		mlaDTOs.add(mla123);
		mlaDTOs.add(mla124);
		mlaDTOs.add(mla125);
		mlaDTOs.add(mla126);
		mlaDTOs.add(mla127);
		mlaDTOs.add(mla128);
		mlaDTOs.add(mla129);
		mlaDTOs.add(mla130);
		mlaDTOs.add(mla131);
		mlaDTOs.add(mla132);
		mlaDTOs.add(mla134);
		mlaDTOs.add(mla135);
		mlaDTOs.add(mla136);
		mlaDTOs.add(mla137);
		mlaDTOs.add(mla138);
		mlaDTOs.add(mla139);
		mlaDTOs.add(mla140);
		mlaDTOs.add(mla141);
		mlaDTOs.add(mla142);
		mlaDTOs.add(mla143);
		mlaDTOs.add(mla144);
		mlaDTOs.add(mla145);
		mlaDTOs.add(mla146);
		mlaDTOs.add(mla147);
		mlaDTOs.add(mla148);
		mlaDTOs.add(mla149);
		mlaDTOs.add(mla150);
		mlaDTOs.add(mla151);
		mlaDTOs.add(mla152);
		mlaDTOs.add(mla153);
		mlaDTOs.add(mla154);
		mlaDTOs.add(mla155);
		mlaDTOs.add(mla156);
		mlaDTOs.add(mla157);
		mlaDTOs.add(mla158);
		mlaDTOs.add(mla159);
		mlaDTOs.add(mla160);
		mlaDTOs.add(mla161);
		mlaDTOs.add(mla162);
		mlaDTOs.add(mla163);
		mlaDTOs.add(mla164);
		mlaDTOs.add(mla165);
		mlaDTOs.add(mla166);
		mlaDTOs.add(mla167);
		mlaDTOs.add(mla168);
		mlaDTOs.add(mla169);
		mlaDTOs.add(mla170);
		mlaDTOs.add(mla171);
		mlaDTOs.add(mla172);
		mlaDTOs.add(mla173);
		mlaDTOs.add(mla174);
		mlaDTOs.add(mla175);
		mlaDTOs.add(mla176);
		mlaDTOs.add(mla177);
		mlaDTOs.add(mla178);
		mlaDTOs.add(mla179);
		mlaDTOs.add(mla180);
		mlaDTOs.add(mla181);
		mlaDTOs.add(mla182);
		mlaDTOs.add(mla183);
		mlaDTOs.add(mla184);
		mlaDTOs.add(mla185);
		mlaDTOs.add(mla186);
		mlaDTOs.add(mla187);
		mlaDTOs.add(mla188);
		mlaDTOs.add(mla189);
		mlaDTOs.add(mla190);
		mlaDTOs.add(mla191);
		mlaDTOs.add(mla192);
		mlaDTOs.add(mla193);
		mlaDTOs.add(mla194);
		mlaDTOs.add(mla195);
		mlaDTOs.add(mla196);
		mlaDTOs.add(mla197);
		mlaDTOs.add(mla198);
		mlaDTOs.add(mla199);
		mlaDTOs.add(mla200);
		mlaDTOs.add(mla201);
		mlaDTOs.add(mla202);
		mlaDTOs.add(mla203);
		mlaDTOs.add(mla204);
		mlaDTOs.add(mla205);
		mlaDTOs.add(mla206);
		mlaDTOs.add(mla207);
		mlaDTOs.add(mla208);
		mlaDTOs.add(mla209);
		mlaDTOs.add(mla210);
		mlaDTOs.add(mla211);
		mlaDTOs.add(mla212);
		mlaDTOs.add(mla213);
		mlaDTOs.add(mla214);
		mlaDTOs.add(mla215);
		mlaDTOs.add(mla216);
		mlaDTOs.add(mla217);
		mlaDTOs.add(mla218);
		mlaDTOs.add(mla219);
		mlaDTOs.add(mla220);
		mlaDTOs.add(mla221);
		mlaDTOs.add(mla222);
		//mlaDTOs.forEach(all -> System.out.println("MLA's are:" + all));
		System.out.println("       ");
		System.out.println("mla where age is greter than 50");
		mlaDTOs.stream().filter(e -> e.getAge() > 50).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("       ");
		System.out.println("mla where age is less than 50");
		mlaDTOs.stream().filter(e -> e.getAge() < 50).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("  **************************************************************************   ");
		System.out.println("male mla's");
		mlaDTOs.stream().filter(e -> e.getGender() == "male").collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("  ****************************************************************************   ");
		System.out.println("female mla's");
		mlaDTOs.stream().filter(e -> e.getGender() == "female").collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%   ");
		System.out.println("mla age>50 and party is BJP");
		mlaDTOs.stream().filter(e -> e.getAge() > 50 && e.getParty() == "BJP").collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  ");
		System.out.println("INDEPENDENT MLA'S ARE:");
		mlaDTOs.stream().filter(e -> e.getParty() == "INDEPENDENT").collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&        ");
		System.out.println("party by asc order");
		mlaDTOs.stream().sorted((q, p) -> q.getParty().compareTo(p.getParty())).forEach(e -> System.out.println(e));
		System.out.println("  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&     ");
		System.out.println("name by asc order");
		mlaDTOs.stream().sorted((q, p) -> q.getName().compareTo(p.getName())).forEach(e -> System.out.println(e));
		System.out.println("  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   ");
		System.out.println("unique party");
		mlaDTOs.stream().map(e -> e.getParty()).collect(Collectors.toSet()).forEach(e -> System.out.println(e));
		System.out.println("   ***************************************************************************  ");
		System.out.println("all mla by party");
		mlaDTOs.stream().filter(e -> e.getParty() == "BJP").forEach(e -> System.out.println(e));
		mlaDTOs.stream().filter(e -> e.getParty() == "INC").forEach(e -> System.out.println(e));
		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$           ");
		System.out.println("name by dsc order");
		mlaDTOs.stream().sorted((q, p) -> p.getName().compareTo(q.getName())).forEach(e -> System.out.println(e));
		System.out.println("  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&          ");
		System.out.println("mla by consi");
		mlaDTOs.stream().filter(e -> e.getConstituency().equals("Gubbi")).collect(Collectors.toList())
			.forEach(e -> System.out.println(e.getName()));
	}

}
