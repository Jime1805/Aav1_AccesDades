package aav1.acces_dades.model;

public class Student {
    private Long id;
    private String nom;
    private String cognom;
    private int age;
    private String cicle;
    private int anyo;  

    public Student() {
    }

    public Student(Long id, String nom, String cognom, int age, String cicle, int anyo) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.anyo = anyo;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCicle() {
        return cicle;
    }
    public void setCicle(String cicle) {
        this.cicle = cicle;
    }
    public int getAny() {
        return anyo;
    }
    public void setAny(int anyo) {
        this.anyo = anyo;
    }

    
}
