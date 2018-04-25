package ordenamientoobjetos;

public class OrdenamientoObjetos {

    public static void main(String[] args) {
        Estudiante[] arrayEstudiantes = new Estudiante[5];
        arrayEstudiantes[0] = new Estudiante("Juan", "Polania", "123", 5, 5.0);
        arrayEstudiantes[1] = new Estudiante("Camilo", "Cortes", "1234", 4, 4.5);
        arrayEstudiantes[2] = new Estudiante("Carlos", "Gutierrez", "12345", 3, 4.8);
        arrayEstudiantes[3] = new Estudiante("Edwin", "Perdomo", "12312", 2, 4.2);
        arrayEstudiantes[4] = new Estudiante("Felipe", "Polanco", "123124", 1, 2.0);
        arrayEstudiantes[5] = new Estudiante("Fernando", "Peralta", "123124", 6, 3.5);
        
    }
    
}
