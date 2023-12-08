public class Students {
    private String name;
    private String surname;
    private int password;
    private int id;
    private int noteMath;
    private int noteAlgo;
    private int noteStatistic;
    private int noteData;

    public Students(String name, String surname, int password, int id, int noteMath, int noteAlgo, int noteStatistic, int noteData) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.id = id;
        this.noteMath = noteMath;
        this.noteAlgo = noteAlgo;
        this.noteStatistic = noteStatistic;
        this.noteData = noteData;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNoteMath(int noteMath) {
        this.noteMath = noteMath;
    }

    public void setNoteAlgo(int noteAlgo) {
        this.noteAlgo = noteAlgo;
    }

    public void setNoteStatistic(int noteStatistic) {
        this.noteStatistic = noteStatistic;
    }

    public void setNoteData(int noteData) {
        this.noteData = noteData;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public int getNoteMath() {
        return noteMath;
    }

    public int getNoteAlgo() {
        return noteAlgo;
    }

    public int getNoteStatistic() {
        return noteStatistic;
    }

    public int getNoteData() {
        return noteData;
    }
}
