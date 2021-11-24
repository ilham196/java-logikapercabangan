package com.sqa.logikapercabangan;

import java.util.Scanner;

public class LogikaPercabangan {

	public static void main(String[] args) {
		//DASAR IF..ELSE
		/*int time;
		Scanner input = new Scanner(System.in);
		System.out.println("Sekarang Jam Berapa : ");
		time = input.nextInt();
		if (time <= 10) {
			System.out.println("Selamat Pagi");
		}else if (time >= 15) {
			System.out.println("Selamat Sore");
		}else if (time >=18) {
			System.out.println("Selamat Malam");
		}else {
			System.out.println("Selamat Siang");
		}*/
		
		//SWITCH
		/*Scanner input = new Scanner(System.in);
		System.out.println("Menu Makanan");
		System.out.println("1. Makanan Betawi");
		System.out.println("2. Makanan Padang");
		System.out.println("3. Makanan Sunda");
		System.out.println("Pilih Menu Makanan : ");
		int menu=input.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("Soto Betawi");
			System.out.println("Rp. 15.000,-");
			break;
		case 2:
			System.out.println("Rendang");
			System.out.println("Rp. 12.000,-");
			break;
		case 3:
			System.out.println("Sate Kuningan");
			System.out.println("Rp. 20.000,-");
			break;
		default:
			System.out.println("Menu Tidak Ada");
		}*/	
		LogikaPercabangan main = new LogikaPercabangan();
		main.HitungBidang();

		
	}
	
	public static void cekPajak() {
		//CONTOH SOAL PAK DEWA
		String jenKel = "bukan pria dan wanita";
		boolean menikah=true;
		int pajak=0;
		if (jenKel.equalsIgnoreCase("pria")) {
			if (menikah) {
				pajak = 5;
			}else {
				pajak = 10;
			}
		}else if (jenKel.equalsIgnoreCase("wanita")) {
			if (menikah) {
				pajak=4;
			}else {
				pajak = 11;
			}
		}else {
			pajak = 10;
		}
		System.out.println("Pajak anda adalah : "+pajak +"%");
	}
	//CONTOH SOAL SWITCH CASE
	public void cekPajakMulti() {
		String jenKel = "hemaprodit";
		boolean menikah=true;
		int pajak=0;
		
		switch (jenKel) {
		case "female":
		case "male":
		case "intersex":
		case "trans":
			if (menikah) {
				pajak = 5;
			}else {
				pajak = 10;
			}
			
			break;
		case "non_conforming":
		case "personal":
		case "eunuch":
			pajak=10;
			
			break;
		default:
			pajak = 8;
			break;
		}
		System.out.println("Pajak anda adalah : "+pajak +"%");
	}
	
	//CONTOH SOAL KONDISI
	public void HitungBidang() {
		int persegi_panjang = 1;
		int segitiga = 2;
		int panjang, alas, tinggi, lebar;
		int Luas = 1;
		int Keliling = 2;
		int bentukBidang, jenisHitungan;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pilih Bentuk Bidang \n"
				+ "1. Persegi Panjang \n"
				+ "2. Segitiga \n"
				+"\r\n"
				+"\r\n"
				+ "Pilih (1-2) : ");
		bentukBidang = scan.nextInt();
		
		System.out.println("Pilih Hitungan yang akan diterapkan \n"
				+ "1. Luas \r\n"
				+ "2. Keliling \r\n"
				+"\r\n"
				+"\r\n"
				+ "Pilih (1-2) : ");
		jenisHitungan = scan.nextInt();
		
		if (bentukBidang == persegi_panjang) {
			if (jenisHitungan == Luas) {
				
				System.out.println("Masukkan Panjang :");
				panjang = scan.nextInt();
				System.out.println("Masukkan Lebar :");
				lebar = scan.nextInt();
				
				int luas = panjang * lebar;
				System.out.println("Luasnya Adalah :" +luas);
			} else if (jenisHitungan == Keliling) {
				System.out.println("Masukkan Sisi :");
				panjang = scan.nextInt();
				
				int keliling = 4*panjang;
				System.out.println("Kelilingnya Adalah "+keliling);
			}
		}else if (bentukBidang == segitiga) {
			if (jenisHitungan == Luas) {
				System.out.println("Masukkan alas :");
				alas = scan.nextInt();
				System.out.println("Masukkan Tinggi :");
				tinggi = scan.nextInt();
				
				double luas = (0.5 *(alas * tinggi));
				
				System.out.println("Luasnya Adalah "+luas);
			}else if (jenisHitungan == Keliling) {
				System.out.println("Masukkan Sisi :");
				panjang = scan.nextInt();
				int keliling = 3*panjang;
				
				System.out.println("Kelilingnya Adalah " +keliling);
			}
		}
		
	}
	
}
