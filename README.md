# Beden Kitle İndeksi (BMI) Hesaplayıcı

Bu Java programı, kullanıcının kilo ve boy bilgilerini alarak Beden Kitle İndeksi (BMI) hesaplar ve sonucu yorumlar.

## Özellikler

- Kullanıcıdan kilo (kilogram cinsinden) ve boy (metre cinsinden) bilgilerini alır.
- BMI'yi hesaplar.
- Hesaplanan BMI değerine göre kullanıcının durumunu yorumlar (Zayıf, Normal, Fazla Kilolu, Obez).

## Kullanım

1. Programı çalıştırın.
2. İstendiğinde kilonuzu kilogram cinsinden girin.
3. İstendiğinde boyunuzu metre cinsinden girin (örn. 1.75).
4. Program BMI'nizi hesaplayacak ve yorumlayacaktır.

## Gereksinimler

- Java Runtime Environment (JRE)

## Derleme ve Çalıştırma

```bash
javac BMI_Calculator.java
java BMI_Calculator
```

## Metotlar

1. `calculateBMI(double weight, double height)`: BMI'yi hesaplar.
2. `getBMICategory(double bmi)`: Hesaplanan BMI değerine göre kategoriyi belirler.

---

# Body Mass Index (BMI) Calculator

This Java program calculates the Body Mass Index (BMI) by taking the user's weight and height information and interprets the result.

## Features

- Takes weight (in kilograms) and height (in meters) information from the user.
- Calculates the BMI.
- Interprets the user's condition based on the calculated BMI value (Underweight, Normal, Overweight, Obese).

## Usage

1. Run the program.
2. Enter your weight in kilograms when prompted.
3. Enter your height in meters when prompted (e.g., 1.75).
4. The program will calculate your BMI and provide an interpretation.

## Requirements

- Java Runtime Environment (JRE)

## Compilation and Execution

```bash
javac BMI_Calculator.java
java BMI_Calculator
```

## Methods

1. `calculateBMI(double weight, double height)`: Calculates the BMI.
2. `getBMICategory(double bmi)`: Determines the category based on the calculated BMI value.
