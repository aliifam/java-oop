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

> **variable shadowing** = yaitu ketika nama variable sama dalam scope intinya hati hati aja kalo dalam class **jangan sampai** nama field dan parameter method class sama