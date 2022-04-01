# apa itu OOP

OOP (object oriented programming) adalah sebuah paradigma dalam pemrograman yang sekarang semakin populer intinya berbasis Object & Class.

# apa itu Object?

- object adalah data yang berisi **field / properties/ attributes** dan **method / function / behaviour**.

- semua tipe data nonprimitif dalam java berbasis objek kayak Integer, String, Boolean, Character, dll.

# apa itu Class?
- class adalah sebuah blueprint, prototype, atau cetakan untuk membuat objek.

- clas berisi semua **field / properties/ attributes** dan **method / function / behaviour** yang akan dimiliki object.

- setiap object selalu terbuat dari sebuah class

- sebuah class dapat membuat banyak object tanpa batas

# apa itu field?

- **field / properties/ attributes** adalah data yang bisa dsisipkan kedalam sebuah object

- sebelum memasukkan data ke dalam field, data harus dideklarasikan terlebih dahulu data apa saja yang dimiliki object tersebut didalam class pembuat objectnya

- field itu mirip sebuah variabel namun dibuat di dalam block class.

## manipulasi field?

- seperti variabel data field dapat dimanipulasi baik di get, insert, update, delete namun untuk field final (constant variabel) sudah tidak dapat diubah dan hanya bisa di get.

- untuk mengakses field pada sebuah object caranya adalah kata kuci titik (.) setelah nama object diikuti nama fieldnya

# apa itu Method?

- seperti fungsi biasa dalam Java disebut method dan method dapat dimasukkan ke dalam object.

- deklarasikan dulu methodnya ke dalam block class baru dapat dipakai oleh objek

- sama aja kayak bikin method biasa bisa reuturn value, parameter, overloading.

- untuk mengakses method pada sebuah object caranya adalah kata kuci titik (.) setelah nama object diikuti nama methodnya


# Constructor

- kalo buat objek kan kayak panggil method soalnya pake ().

- constructor adalah method yang akan dipanggil pertama kali saat objek dibuat.

- mirip method constructor juga bisa memiliki parameter.

- nama constructor harus sama dengan nama classnya dan tidak perlu kata kunci void atau return value.

## Constructor Overloading

- sama kayakk method constructor juga bisa di overload.

- syarat overloading yaitu jumlah parameter atau tipe data parameter harus berbeda

## memanggil Constructor lain

- constructor bisa memanggil constructor lain ini beguna saat kita butuh untuk menginisialisasi data dengan berbagai kemungkinan

- cara memanggil constructor lain kita hanya perlu memanggilnya seperti memanggil method namun dengan kata kunci this.

> **variable shadowing** = yaitu ketika nama variable sama dalam scope intinya hati hati aja kalo dalam class **jangan sampai** nama field dan parameter method class sama. untuk mengatasi variable shadowing kita dapat menggunakan this **keyword**

## This Keyword

- saat membuat field dalam block class / constructor bisa menggunakan this untuk mengakses objek saat ini

- misal untuk mengakses field yang namanya sama dengan parameter method ini dapat di solved dengan this.

- selain mengakses field saat ini this juga bisa untuk mengakses method.

- intinya this menyelesaikan masalah **variabel shadowing** agar gak kebanyakan nama variabel.

# Inheritance

- Inheritance (pewarisan) adalah kemampuan menurunkan sebuah class ke class lainnya.

- intinya  ada class Parent & class Child

- satu **parent bisa punya banyak child** tapi **satu child cuma boleh punya satu parent.** kalo di Java gini.

- saat sebuah class diturunkan maka semua field dan method Parent akan dimiliki juga oleh Child.

- untuk melakukan inheritance, di class Child, kita harus menggunakan keyword extends lalu diikuti nama class parentnya.

## Method Overriding

- Method Overriding adalah kemampuan mendeklarasikan ulang method di child class yang sudah ada di Parent class.

- saat melakukan Method Overriding secara otomatis saat membuat object dari class child method yang ada di parent sudah tidak bisa diakses lagi.

- jangan sampe ketuker antara method overriding dan method overloading

## Super Keyword

- Super Keyword berfungsi untuk mengakses method parent class yang sudah di override

- tidak hanya method, field milik class parent juga bisa diakses dengan super keyword

## Super Constructor

- super juga bisa buat akses constructor parent

- syarat untuk mengakses parent class constructor yaitu aksesnya harus lewat child class constructor

- jika semua constructor dalam parent memiliki parameter maka child class wajib untuk constructor parent tersebut.

- jadi intinya kalo ada constructor tanpa parameter itu artinya punya default constructor dan child class gak wajib akses parent constructor.

- ya kayak calling other constructor dalam satu class kan pake this nah kalo inheritance antara parent ke class maka gunakan super.

## object class 

- kalo di Java semua class yang dibuat secara otomatis adalah turunan dari object class.

- walaupun tidak secara eksplisit tertulis *extends Object* namun ya ini otomatis dari Java nya.

- bisa dikatakan Object adalah super class dari semua class dalam Java.

## variable hiding

- variable hiding terjadi ketika nama field di class child dan parent sama

- tidak ada yg namanya variable override yang ada itu variable hiding

- untuk mengatasi variable hiding bisa gunakan super keyword

- bedanya variable hiding dan method overriding yaitu ketika object di cast

- saat object di cast method akan tetap mengakses method overriding namun variable/field akan mengakses variable/field yang ada di dalam classnya.

# Polymorphism

- berasal dari bahasa yunani arti dari polmorphism iu banyak bentuk.

- dalam oop polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.

- Polymorphism erat kaitannya dengan inheritance.

- Polymorphism dapat diset dalam parameter sebuah method

# Type check & Cast

- cast juga dapat dilakukan untuk tipe data nonprimitif

- agar aman sebelum casting harus melakukan type check dulu dengan keyword instanceof

- hasil dari operator instanceof adalah boolean bila sama maka true kalo beda false 

# Package

- berfungsi untuk mengelompokkan class - class dalam sebuah folder agar lebih mudah diklasifikasi

- dalam java mendukung nested package cara aksesnya dengan tanda titik di setiap cabang

- saat nyimpen class dalam sebuah package maka wajib menyebutkan nama packagenya di atas file javanya.

# Access modifier

- Access modifier adalah kemampuan untuk membuat class, field, method, dan constructor dapat diakses darimana saja.

## Access Level

1. public = class, package, subclass, world

2. protected = class, package, subclass

3. no modifier = class, package

4. private = class

> dalam satu file hanya bisa bikin satu public class dengan nama class yang sama dengan nama filenya.

# import

- import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda

- syarat class yang digunakan jika berbeda packagenya, class harus bersifat public.

- semua package yang berada dalam java.lang sudah default auto import seperti String, dll.