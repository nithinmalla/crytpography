# Cryptography Lab — Java Version

Java conversions of the Python programs in the original repository. Each `.java` file is standalone and has a `main` method. Use JDK 8 or newer.

## Compile and run
From the relevant assignment folder:

```bash
javac Euclid.java
java Euclid
```

No third-party dependencies are required. `AES.java` uses Java's built-in AES/GCM authenticated encryption; `DES.java` demonstrates DES/CBC/PKCS5Padding for lab purposes only (DES is obsolete and should not be used in real applications).

## Programs
- Assignment 1: Euclid, ModularArithmetic
- Assignment 2: ChineseRemainderTheorem, ChineseRemainderTheoremInverse, EulerTheorem, FermatLittleTheorem, PrimalityTest, DivisionAlgorithm, Totient
- Assignment 3: CaesarCipher, CaesarBruteForce, CaesarEncrypt, CaesarDecrypt, MonoalphabeticCipher, PolyalphabeticCipher
- Assignment 4: HillCipher, PlayfairCipher
- Assignment 5: ColumnarTransposition, RailFenceCipher
- Assignment 6: AES, DES
- Assignment 8: RSA
- Assignment 9: DiffieHellmanKeyExchange
